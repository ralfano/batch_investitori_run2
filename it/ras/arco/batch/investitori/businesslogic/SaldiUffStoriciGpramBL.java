/*     */ package it.ras.arco.batch.investitori.businesslogic;
/*     */ 
/*     */ import it.ras.arco.batch.bean.FlxInvestitoriSaldiUff;
/*     */ import it.ras.arco.bean.FinGP;
/*     */ import it.ras.arco.bean.FinInterfaccia;
/*     */ import it.ras.arco.bean.FinPosizione;
/*     */ import it.ras.arco.bean.FinStoricoSaldo;
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.batch.skeleton.BusinessLogicObject;
/*     */ import it.ras.flag.config.CodesTableManager;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SaldiUffStoriciGpramBL
/*     */   extends BusinessLogicObject
/*     */ {
/*     */   private static final String conNotFound = "CONTRATTO NON TROVATO";
/*     */   private static final String posNotFound = "POSIZIONE NON TROVATA";
/*  53 */   private FinPosizione posizione = null;
/*     */   
/*  55 */   private FinStoricoSaldo storico = null;
/*     */   
/*  57 */   private FlxInvestitoriSaldiUff cursorRow = null;
/*     */   
/*  59 */   Log logger = LogFactory.getLog(getClass());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private CodesTableManager codesTableManager;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void doOneStep(Object row) throws RasServiceException {
/*  85 */     MapContainer param = new MapContainer();
/*  86 */     MapContainer result = null;
/*     */     
/*  88 */     Log logger = LogFactory.getLog(getClass());
/*     */ 
/*     */     
/*  91 */     this.cursorRow = (FlxInvestitoriSaldiUff)row;
/*     */ 
/*     */     
/*  94 */     FinGP contratto = new FinGP();
/*  95 */     FinInterfaccia interfaccia = new FinInterfaccia();
/*  96 */     interfaccia.setInterfaccia("RAM");
/*  97 */     contratto.setNumContratto(this.cursorRow.getNumeroRapporto());
/*  98 */     param.putAppl("DETTAGLIO", contratto);
/*  99 */     param.putAppl("INTERFACCIA", interfaccia);
/*     */     
/* 101 */     result = executeService("GetContrattoByNumContrattoCodInterfacciaSRV", param);
/*     */     
/* 103 */     if (!result.getAppl("RESULT").equals("FOUND")) {
/*     */       
/* 105 */       this.cursorRow.setDataElab(new Date());
/* 106 */       this.cursorRow.setDescrizioneErrore("CONTRATTO NON TROVATO");
/* 107 */       if (logger.isErrorEnabled())
/* 108 */         logger.error("Contratto non presente" + this.cursorRow.getNumeroRapporto()); 
/* 109 */       setResponse("WARNING");
/*     */       return;
/*     */     } 
/* 112 */     contratto = (FinGP)result.getAppl("CONTRATTO");
/*     */ 
/*     */ 
/*     */     
/* 116 */     Set posSet = contratto.getPosizione();
/*     */     
/* 118 */     Iterator posIte = posSet.iterator();
/*     */     
/* 120 */     this.posizione = posIte.next();
/*     */     
/* 122 */     if (this.posizione == null) {
/*     */       
/* 124 */       this.cursorRow.setDataElab(new Date());
/* 125 */       this.cursorRow.setDescrizioneErrore("POSIZIONE NON TROVATA");
/* 126 */       setResponse("WARNING");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 163 */     param.putAppl("CONTRATTO", contratto);
/* 164 */     this.storico = new FinStoricoSaldo();
/*     */     
/* 166 */     this.storico.setPosizione(this.posizione);
/* 167 */     this.storico.setValoreSaldo(this.cursorRow.getSaldoProdotto());
/* 168 */     this.storico.setNumContratto(this.cursorRow.getNumeroRapporto());
/* 169 */     this.storico.setDataInizio(this.cursorRow.getDataValorizzazione());
/* 170 */     this.storico.setUtenteInserimento("BatchGpramStoricoSaldi");
/* 171 */     this.storico.setDataInserimento(new Date());
/* 172 */     Calendar cal = Calendar.getInstance();
/* 173 */     cal.set(9999, 11, 31);
/* 174 */     this.storico.setDataFine(cal.getTime());
/* 175 */     param.putAppl("STORICO", this.storico);
/* 176 */     this.storico.setUfficiale("S");
/* 177 */     param.putAppl("ALLOW_MULTIPLE_ROWS", new Boolean("true"));
/* 178 */     result = executeService("GetSaldoStoricoByNumContrattoSRV", param);
/* 179 */     if (result.getAppl("RESULT").equals("NOT_FOUND")) {
/*     */       
/* 181 */       ArchUtils.setStdFields(this.storico, "I", "BatchGpramStoricoSaldi");
/*     */       
/* 183 */       param.removeAppl("STORICO");
/* 184 */       param.putAppl("STORICO", this.storico);
/* 185 */       executeService("InsertSaldoStoricoSRV", param);
/*     */     }
/*     */     else {
/*     */       
/* 189 */       List storicoList = (List)result.getAppl("STORICO");
/*     */       
/* 191 */       Iterator storicoIt = storicoList.iterator();
/* 192 */       while (storicoIt.hasNext()) {
/*     */ 
/*     */         
/* 195 */         this.storico = storicoIt.next();
/*     */         
/* 197 */         Calendar dataFine = Calendar.getInstance();
/* 198 */         dataFine.setTime(this.storico.getDataFine());
/*     */         
/* 200 */         int year = dataFine.get(1);
/* 201 */         int month = dataFine.get(2);
/* 202 */         int date = dataFine.get(5);
/*     */         
/* 204 */         if (year == 9999 && month == 11 && date == 31) {
/*     */           
/* 206 */           ArchUtils.setStdFields(this.storico, "U", "BatchGpramStoricoSaldi");
/*     */           
/* 208 */           this.storico.setDataFine(this.cursorRow.getDataValorizzazione());
/*     */           
/* 210 */           param.removeAppl("STORICO");
/* 211 */           param.putAppl("STORICO", this.storico);
/* 212 */           executeService("UpdateSaldoStoricoSRV", param);
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 217 */       FinStoricoSaldo storicoNew = new FinStoricoSaldo();
/* 218 */       storicoNew.setPosizione(this.posizione);
/* 219 */       storicoNew.setValoreSaldo(this.cursorRow.getSaldoProdotto());
/* 220 */       storicoNew.setNumContratto(this.cursorRow.getNumeroRapporto());
/* 221 */       storicoNew.setDataInizio(this.cursorRow.getDataValorizzazione());
/* 222 */       storicoNew.setUtenteInserimento("BatchGpramStoricoSaldi");
/* 223 */       storicoNew.setDataInserimento(new Date());
/* 224 */       cal = Calendar.getInstance();
/* 225 */       cal.set(9999, 11, 31);
/* 226 */       storicoNew.setDataFine(cal.getTime());
/* 227 */       storicoNew.setUfficiale("S");
/* 228 */       ArchUtils.setStdFields(storicoNew, "I", "BatchGpramStoricoSaldi");
/*     */ 
/*     */       
/* 231 */       param.removeAppl("STORICO");
/* 232 */       param.putAppl("STORICO", storicoNew);
/* 233 */       executeService("InsertSaldoStoricoSRV", param);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 239 */     this.cursorRow.setDataElab(new Date());
/* 240 */     setResponse("OK");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodesTableManager(CodesTableManager codesTableManager) {
/* 256 */     this.codesTableManager = codesTableManager;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CodesTableManager getCodesTableManager() {
/* 266 */     return this.codesTableManager;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\businesslogic\SaldiUffStoriciGpramBL.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */