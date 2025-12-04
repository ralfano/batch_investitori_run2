/*     */ package it.ras.arco.batch.investitori.businesslogic;
/*     */ 
/*     */ import it.ras.arco.batch.bean.FlxInvestitoriSaldi;
/*     */ import it.ras.arco.bean.FinContratto;
/*     */ import it.ras.arco.bean.FinGP;
/*     */ import it.ras.arco.bean.FinInterfaccia;
/*     */ import it.ras.arco.bean.FinNazioniUic;
/*     */ import it.ras.arco.bean.FinPortafoglioGP;
/*     */ import it.ras.arco.bean.FinValuteUic;
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.batch.skeleton.BusinessLogicObject;
/*     */ import it.ras.flag.config.CodesTableManager;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.Date;
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
/*     */ public class GetFlxSaldiFondiBL
/*     */   extends BusinessLogicObject
/*     */ {
/*  43 */   private FlxInvestitoriSaldi cursorRow = null;
/*     */   private FinNazioniUic nazioniUic;
/*     */   private FinValuteUic valuteUic;
/*  46 */   private FinGP contratto = null;
/*  47 */   private FinPortafoglioGP portafoglio = null;
/*  48 */   private FinInterfaccia interfaccia = null;
/*     */ 
/*     */   
/*     */   private static final String cambio = "IL CAMBIO HA VALORE 0 o NULL";
/*     */ 
/*     */   
/*     */   private static final String dati = "INIZIALIZZAZIONE FALLITA";
/*     */ 
/*     */   
/*     */   private static final String UicNotFound = "CODICE UIC NON TROVATO";
/*     */ 
/*     */   
/*     */   private static final String conNotFound = "CONTRATTO NON TROVATO";
/*     */ 
/*     */   
/*     */   private static final String conTooMany = "CONTRATTO  PRESENTE PIU VOLTE";
/*     */ 
/*     */   
/*     */   private static final String porNotIn = "PORTAFOGLIO NON INSERITO";
/*     */   
/*     */   private static final String Uic = "UIC NON TROVATO";
/*     */   
/*     */   private CodesTableManager codesTableManager;
/*     */ 
/*     */   
/*     */   public void setCodesTableManager(CodesTableManager codesTableManager) {
/*  74 */     this.codesTableManager = codesTableManager;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CodesTableManager getCodesTableManager() {
/*  84 */     return this.codesTableManager;
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
/*     */   public boolean setPortafoglio(Object row) {
/*  97 */     this.cursorRow = (FlxInvestitoriSaldi)row;
/*  98 */     this.portafoglio = new FinPortafoglioGP();
/*  99 */     this.portafoglio.setCambio(this.cursorRow.getCambio());
/* 100 */     this.portafoglio.setCategoria(this.cursorRow.getCategoria());
/* 101 */     this.portafoglio.setCmcTitolo(this.cursorRow.getCambioMedio());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 109 */     this.portafoglio.setCtvDivisa(this.cursorRow.getControvaloreDivisa());
/*     */     
/* 111 */     String catTitolo = "";
/* 112 */     if (ArchUtils.isValid(this.cursorRow.getCategoriaTitolo())) {
/* 113 */       catTitolo = (String)this.codesTableManager.decodeValue("CATEGORIA_INV", "CODICE_AR", "CODICE_ARCO", this.cursorRow.getCategoriaTitolo());
/*     */     } else {
/*     */       
/* 116 */       catTitolo = "Z";
/*     */     } 
/* 118 */     this.portafoglio.setCategoriaTitolo(catTitolo);
/*     */ 
/*     */     
/* 121 */     this.portafoglio.setCtvEuro(this.cursorRow.getControvalore());
/* 122 */     this.portafoglio.setDataUltPrezzo(new Date());
/* 123 */     this.portafoglio.setDescTitolo(this.cursorRow.getDescrizioneTitolo());
/* 124 */     this.portafoglio.setIsin(this.cursorRow.getCodiceIsin());
/* 125 */     this.portafoglio.setPmcTitolo(this.cursorRow.getPrezzoMedio());
/* 126 */     this.portafoglio.setPrezzo(this.cursorRow.getPrezzo());
/* 127 */     this.portafoglio.setQuantita(this.cursorRow.getQuantitaDisponibile());
/* 128 */     this.portafoglio.setRateo(this.cursorRow.getRateo());
/* 129 */     this.portafoglio.setUltPrezzo(this.cursorRow.getPrezzo());
/* 130 */     this.portafoglio.setUtenteInserimento("BatchSaldiFondi");
/* 131 */     this.portafoglio.setDataInserimento(new Date());
/*     */     
/* 133 */     ArchUtils.setStdFields(this.portafoglio, "I", "BatchSaldiFondi");
/* 134 */     return true;
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
/*     */   public boolean setContratto(Object row) {
/* 149 */     this.cursorRow = (FlxInvestitoriSaldi)row;
/* 150 */     this.contratto = new FinGP();
/* 151 */     this.contratto.setNumContratto(this.cursorRow.getNumeroRapporto());
/* 152 */     ArchUtils.setStdFields(this.contratto, "I", "BatchSaldiFondi");
/* 153 */     return true;
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
/*     */   public boolean setInterfaccia(Object row) {
/* 166 */     this.interfaccia = new FinInterfaccia();
/* 167 */     this.interfaccia.setInterfaccia("RAM");
/* 168 */     ArchUtils.setStdFields(this.contratto, "I", "BatchSaldiFondi");
/* 169 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean isCodeUICChecked(String code) throws RasServiceException {
/* 174 */     MapContainer incode = new MapContainer();
/* 175 */     MapContainer outcode = new MapContainer();
/* 176 */     this.nazioniUic = new FinNazioniUic();
/* 177 */     this.nazioniUic.setCodiceUic(code);
/* 178 */     incode.putAppl("NAZIONE", this.nazioniUic);
/* 179 */     outcode = executeService("CheckCodeUicNazioniSRV", incode);
/* 180 */     if (((String)outcode.getAppl("RESULT")).equals("FOUND")) {
/* 181 */       return true;
/*     */     }
/* 183 */     return false;
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
/*     */   
/*     */   public void doOneStep(Object row) throws RasServiceException {
/* 200 */     MapContainer param = new MapContainer();
/*     */ 
/*     */     
/* 203 */     MapContainer result = null;
/* 204 */     String resultMsg = null;
/*     */     
/* 206 */     Log logger = LogFactory.getLog(getClass());
/*     */ 
/*     */     
/* 209 */     this.cursorRow = (FlxInvestitoriSaldi)row;
/*     */     
/* 211 */     if (this.cursorRow.getCambio().doubleValue() == 0.0D) {
/*     */       
/* 213 */       this.cursorRow.setDataElab(new Date());
/* 214 */       this.cursorRow.setDescrizioneErrore("IL CAMBIO HA VALORE 0 o NULL");
/* 215 */       setResponse("WARNING");
/*     */       return;
/*     */     } 
/*     */     try {
/* 219 */       setPortafoglio(row);
/* 220 */       setContratto(row);
/* 221 */       setInterfaccia(row);
/*     */     }
/* 223 */     catch (Exception e) {
/* 224 */       if (logger.isErrorEnabled())
/* 225 */         logger.error(e.getMessage()); 
/* 226 */       this.cursorRow.setDataElab(new Date());
/* 227 */       this.cursorRow.setDescrizioneErrore("INIZIALIZZAZIONE FALLITA");
/* 228 */       throw new RasServiceException("do1step:inizializzazione dati");
/*     */     } 
/*     */     
/* 231 */     this.valuteUic = new FinValuteUic();
/*     */     
/* 233 */     if (this.cursorRow.getDivisa() != null) {
/*     */       
/* 235 */       this.valuteUic.setCodiceIso(this.cursorRow.getDivisa());
/*     */       
/* 237 */       MapContainer output = new MapContainer();
/*     */       
/* 239 */       param.putAppl("VALUTA", this.valuteUic);
/*     */ 
/*     */       
/* 242 */       output = executeService("GetValutaByCodIsoSRV", param);
/*     */       
/* 244 */       String risultato = (String)output.getAppl("RESULT");
/* 245 */       if (!risultato.equals("FOUND")) {
/*     */         
/* 247 */         this.cursorRow.setDataElab(new Date());
/* 248 */         this.cursorRow.setDescrizioneErrore("UIC NON TROVATO");
/*     */       }
/*     */       else {
/*     */         
/* 252 */         this.valuteUic = (FinValuteUic)output.getAppl("VALUTA");
/* 253 */         this.portafoglio.setDivisa(this.valuteUic.getCodiceUic());
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 258 */     if (this.cursorRow.getPaeseDiEmissione() != null && isCodeUICChecked(this.cursorRow.getPaeseDiEmissione())) {
/* 259 */       this.portafoglio.setPaeseEmissione(this.cursorRow.getPaeseDiEmissione());
/*     */     } else {
/*     */       
/* 262 */       if (logger.isWarnEnabled())
/* 263 */         logger.warn("Il codice " + this.cursorRow.getPaeseDiEmissione() + " non è presente nella tabella FIN_NAZIONI_UIC"); 
/* 264 */       this.cursorRow.setDataElab(new Date());
/* 265 */       this.cursorRow.setDescrizioneErrore("CODICE UIC NON TROVATO");
/*     */     } 
/*     */     
/* 268 */     param.putAppl("DETTAGLIO", this.contratto);
/* 269 */     param.putAppl("INTERFACCIA", this.interfaccia);
/* 270 */     result = executeService("GetContrattoByNumContrattoCodInterfacciaSRV", param);
/* 271 */     resultMsg = (String)result.getAppl("RESULT");
/*     */     
/* 273 */     if (resultMsg.equals("NOT_FOUND")) {
/* 274 */       this.cursorRow.setDataElab(new Date());
/* 275 */       this.cursorRow.setDescrizioneErrore("CONTRATTO NON TROVATO");
/* 276 */       setResponse("WARNING");
/*     */       return;
/*     */     } 
/* 279 */     if (resultMsg.equals("TOO_MANY_ROWS")) {
/*     */       
/* 281 */       this.cursorRow.setDataElab(new Date());
/* 282 */       this.cursorRow.setDescrizioneErrore("CONTRATTO  PRESENTE PIU VOLTE");
/* 283 */       setResponse("WARNING");
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 288 */     this.portafoglio.setContratto((FinContratto)result.getAppl("CONTRATTO"));
/* 289 */     param.putAppl("PORTAFOGLIO_GP", this.portafoglio);
/* 290 */     param.putAppl("ACTION", "INSERT");
/* 291 */     result = executeService("InsertPortafoglioGPSRV", param);
/* 292 */     resultMsg = (String)result.getAppl("RESULT");
/*     */ 
/*     */     
/* 295 */     if (!resultMsg.equals("INSERTED")) {
/* 296 */       this.cursorRow.setDataElab(new Date());
/* 297 */       this.cursorRow.setDescrizioneErrore("PORTAFOGLIO NON INSERITO");
/* 298 */       setResponse("WARNING");
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 303 */     this.cursorRow.setDataElab(new Date());
/* 304 */     setResponse("OK");
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\businesslogic\GetFlxSaldiFondiBL.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */