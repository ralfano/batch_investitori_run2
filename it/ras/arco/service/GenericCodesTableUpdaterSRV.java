/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import it.ras.flag.bean.TblColonneDecodifiche;
/*     */ import it.ras.flag.bean.TblDecodifiche;
/*     */ import it.ras.flag.bean.TblFiltroDecodifiche;
/*     */ import it.ras.flag.bean.TblLegameDecodifiche;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Calendar;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import org.apache.commons.beanutils.PropertyUtils;
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
/*     */ public class GenericCodesTableUpdaterSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String NOME_TABELLA_DECODIFICA_MC_KEY = "NOME_TABELLA_DECODIFICA";
/*     */   public static final String NOME_COLONNA_IN_MC_KEY = "NOME_COLONNA_IN";
/*     */   public static final String VALORE_COLONNA_IN_MC_KEY = "VALORE_COLONNA_IN";
/*     */   public static final String NOME_COLONNA_OUT_MC_KEY = "NOME_COLONNA_OUT";
/*     */   public static final String VALORE_COLONNA_OUT_MC_KEY = "VALORE_COLONNA_OUT";
/*     */   public static final String RISULTATO_RICERCA_CODES_TABLE_MC_KEY = "RISULTATO_RICERCA";
/*     */   public static final String CODES_TABLE_DA_INSERIRE_MC_KEY = "ENTITA_DA_INSERIRE";
/*     */   public static final String ELEMENTI_CODES_TABLE_DA_INSERIRE_MC_KEY = "COLLECTION_DA_INSERIRE";
/*     */   public static final String VALORE_FILTRO_MC_KEY = "VALORE_FILTRO_MC_KEY";
/*     */   private static final String RECORD_ID_GRP_DECOD_MC_KEY = "RECORD_ID_GRP_DECOD_MC_KEY";
/*     */   private static final String TABELLA_ID_GRP_DECOD_MC_KEY = "TABELLA_ID_GRP_DECOD_MC_KEY";
/*     */   private static final String VALORE_GRP_DECOD_MC_KEY = "VALORE_GRP_DECOD_MC_KEY";
/*  58 */   private String moduloCaricamentoCodesTable = null;
/*     */   
/*  60 */   private String moduloCaricamentoFiltroEsistente = null;
/*     */   
/*  62 */   private String moduloEstrazioneMaxRecordId = null;
/*     */   
/*  64 */   private String moduloEstrazioneDecodificaEsistente = null;
/*     */   
/*  66 */   private String moduloSingleEntity = null;
/*     */   
/*  68 */   private String moduloEntityList = null;
/*     */   
/*  70 */   private Log log = LogFactory.getLog(getClass());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer mc) throws RasServiceException {
/*  77 */     String nomeTabellaDecodifica = (String)mc.getAppl("NOME_TABELLA_DECODIFICA");
/*     */ 
/*     */     
/*  80 */     TblDecodifiche decod = null;
/*  81 */     int recordIdMax = 0;
/*     */     
/*     */     try {
/*  84 */       if (this.log.isDebugEnabled()) {
/*  85 */         this.log.debug("Caricamento tabella di decodifica.");
/*     */       }
/*     */       
/*  88 */       MapContainer mc2 = getModuleManager().execModule(getModuloCaricamentoCodesTable(), mc);
/*     */ 
/*     */       
/*  91 */       List listaTblDecodifiche = (List)mc2.getAppl("RISULTATO_RICERCA");
/*     */ 
/*     */       
/*  94 */       if (listaTblDecodifiche == null || listaTblDecodifiche.size() <= 0) {
/*  95 */         if (this.log.isWarnEnabled()) {
/*  96 */           this.log.warn("Impossibile caricare la tabella, la creo.");
/*     */         }
/*     */         
/*  99 */         decod = new TblDecodifiche();
/* 100 */         decod.setNomeTabella(nomeTabellaDecodifica);
/* 101 */         recordIdMax = 1;
/*     */         
/* 103 */         inizializzaCampiStandard((RasORMBean)decod, "I", "MiddleOffice - CP");
/*     */ 
/*     */ 
/*     */         
/* 107 */         mc2.putAppl("ENTITA_DA_INSERIRE", decod);
/* 108 */         getModuleManager().execModule(getModuloSingleEntity(), mc2);
/*     */       } else {
/* 110 */         if (listaTblDecodifiche.size() > 1) {
/* 111 */           String str = "Troppe codes table (" + listaTblDecodifiche.size() + ") per '" + nomeTabellaDecodifica + "'";
/*     */ 
/*     */           
/* 114 */           if (this.log.isErrorEnabled()) {
/* 115 */             this.log.error(str);
/*     */           }
/*     */         } 
/*     */         
/* 119 */         decod = listaTblDecodifiche.get(0);
/*     */ 
/*     */         
/* 122 */         recordIdMax = recuperaMassimoIncrementale(decod);
/*     */       } 
/* 124 */     } catch (Exception e1) {
/* 125 */       if (this.log.isWarnEnabled()) {
/* 126 */         this.log.warn("Impossibile caricare la tabella, la creo.");
/*     */       }
/*     */       
/* 129 */       decod = new TblDecodifiche();
/* 130 */       decod.setNomeTabella(nomeTabellaDecodifica);
/*     */       
/* 132 */       inizializzaCampiStandard((RasORMBean)decod, "I", "MiddleOffice - CP");
/*     */ 
/*     */ 
/*     */       
/* 136 */       MapContainer mc2 = new MapContainer();
/* 137 */       mc2.putAppl("ENTITA_DA_INSERIRE", decod);
/* 138 */       getModuleManager().execModule(getModuloSingleEntity(), mc2);
/*     */       
/* 140 */       recordIdMax = 1;
/*     */     } 
/*     */     
/* 143 */     recordIdMax++;
/*     */     
/* 145 */     Collection decodificaAttuale = null;
/*     */     
/* 147 */     decodificaAttuale = recuperaDecodificaAttuale(nomeTabellaDecodifica, (String)mc.getAppl("NOME_COLONNA_IN"), (String)mc.getAppl("VALORE_COLONNA_IN"), mc);
/*     */ 
/*     */ 
/*     */     
/* 151 */     decodificaAttuale = revisionaRisultato(decodificaAttuale);
/*     */     
/* 153 */     boolean decodificaAggiornata = false;
/* 154 */     boolean rigaPresente = false;
/*     */     
/* 156 */     if (decodificaAttuale != null && decodificaAttuale.size() > 0) {
/* 157 */       rigaPresente = true;
/* 158 */       for (Iterator iter = decodificaAttuale.iterator(); iter.hasNext(); ) {
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
/* 174 */         TblLegameDecodifiche legame = iter.next();
/*     */ 
/*     */         
/* 177 */         recordIdMax = legame.getRecordId().intValue();
/*     */         
/* 179 */         if (legame.getColonna().getNomeColonna().equals(mc.getAppl("NOME_COLONNA_OUT"))) {
/*     */           
/* 181 */           legame.getColonna().setValoreColonna((String)mc.getAppl("VALORE_COLONNA_OUT"));
/*     */           
/* 183 */           decodificaAggiornata = true;
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/* 189 */     if (!decodificaAggiornata) {
/* 190 */       if (this.log.isDebugEnabled()) {
/* 191 */         this.log.debug("Caricamento decodifica...");
/*     */       }
/*     */       
/* 194 */       TblColonneDecodifiche col1 = new TblColonneDecodifiche();
/* 195 */       col1.setNomeColonna((String)mc.getAppl("NOME_COLONNA_IN"));
/* 196 */       col1.setValoreColonna((String)mc.getAppl("VALORE_COLONNA_IN"));
/*     */ 
/*     */       
/* 199 */       inizializzaCampiStandard((RasORMBean)col1, "I", "MiddleOffice - CP");
/*     */ 
/*     */ 
/*     */       
/* 203 */       TblColonneDecodifiche col2 = new TblColonneDecodifiche();
/* 204 */       col2.setNomeColonna((String)mc.getAppl("NOME_COLONNA_OUT"));
/* 205 */       col2.setValoreColonna((String)mc.getAppl("VALORE_COLONNA_OUT"));
/*     */       
/* 207 */       inizializzaCampiStandard((RasORMBean)col2, "I", "MiddleOffice - CP");
/*     */ 
/*     */ 
/*     */       
/* 211 */       TblLegameDecodifiche leg1 = new TblLegameDecodifiche();
/* 212 */       leg1.setColonna(col1);
/* 213 */       leg1.setTabella(decod);
/* 214 */       leg1.setRecordId(new Integer(recordIdMax));
/* 215 */       inizializzaCampiStandard((RasORMBean)leg1, "I", "MiddleOffice - CP");
/*     */ 
/*     */ 
/*     */       
/* 219 */       TblLegameDecodifiche leg2 = new TblLegameDecodifiche();
/* 220 */       leg2.setColonna(col2);
/* 221 */       leg2.setTabella(decod);
/* 222 */       leg2.setRecordId(new Integer(recordIdMax));
/* 223 */       inizializzaCampiStandard((RasORMBean)leg2, "I", "MiddleOffice - CP");
/*     */ 
/*     */ 
/*     */       
/* 227 */       ArrayList lista = new ArrayList();
/*     */       
/* 229 */       if (!rigaPresente) {
/* 230 */         lista.add(col1);
/* 231 */         lista.add(leg1);
/*     */       } 
/*     */       
/* 234 */       lista.add(col2);
/* 235 */       lista.add(leg2);
/*     */ 
/*     */ 
/*     */       
/* 239 */       if (mc.containsKeyAppl("VALORE_FILTRO_MC_KEY") && ArchUtils.isValid((String)mc.getAppl("VALORE_FILTRO_MC_KEY"))) {
/*     */ 
/*     */ 
/*     */         
/* 243 */         String valoreFiltro = (String)mc.getAppl("VALORE_FILTRO_MC_KEY");
/*     */         
/* 245 */         TblFiltroDecodifiche filtro = null;
/*     */         try {
/* 247 */           filtro = caricaFiltroEsistente(recordIdMax, decod.getTabellaId(), valoreFiltro, mc);
/*     */         }
/* 249 */         catch (Exception e) {
/* 250 */           if (this.log.isErrorEnabled()) {
/* 251 */             this.log.error("Errore nel caricamento del filtro esistente: " + e.getClass().getName() + " - " + e.getMessage() + ".");
/*     */           }
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 259 */         if (filtro == null) {
/* 260 */           if (this.log.isDebugEnabled()) {
/* 261 */             this.log.debug("Filtro non trovato, creazione del filtro <recordId='" + recordIdMax + "', tabellaId='" + decod.getTabellaId() + "', valore='" + valoreFiltro + "'>.");
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 270 */           filtro = new TblFiltroDecodifiche();
/*     */           
/* 272 */           filtro.setRecordId(new Integer(recordIdMax));
/* 273 */           filtro.setTabellaId(decod.getTabellaId());
/* 274 */           filtro.setValore(valoreFiltro);
/* 275 */           inizializzaCampiStandard((RasORMBean)filtro, "I", "MiddleOffice - CP");
/*     */ 
/*     */ 
/*     */           
/* 279 */           lista.add(filtro);
/*     */         }
/* 281 */         else if (this.log.isDebugEnabled()) {
/* 282 */           this.log.debug("Filtro esistente, nessuna operazione necessaria.");
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 288 */       if (this.log.isDebugEnabled()) {
/* 289 */         this.log.debug("Salvataggio modifiche...");
/*     */       }
/*     */       
/* 292 */       mc.putAppl("COLLECTION_DA_INSERIRE", lista);
/* 293 */       getModuleManager().execModule(getModuloEntityList(), mc);
/*     */     } 
/*     */     
/* 296 */     return mc;
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
/*     */   private TblFiltroDecodifiche caricaFiltroEsistente(int recordIdMax, Integer tabellaId, String valoreFiltro, MapContainer mc) throws RasServiceException {
/* 310 */     mc.putAppl("RECORD_ID_GRP_DECOD_MC_KEY", new Integer(recordIdMax));
/* 311 */     mc.putAppl("TABELLA_ID_GRP_DECOD_MC_KEY", tabellaId);
/* 312 */     mc.putAppl("VALORE_GRP_DECOD_MC_KEY", valoreFiltro);
/*     */     
/* 314 */     MapContainer mc2 = getModuleManager().execModule(getModuloCaricamentoFiltroEsistente(), mc);
/*     */ 
/*     */     
/* 317 */     List listaTblDecodifiche = (List)mc2.getAppl("RISULTATO_RICERCA");
/*     */ 
/*     */     
/*     */     try {
/* 321 */       if (listaTblDecodifiche.size() > 1 && this.log.isWarnEnabled()) {
/* 322 */         this.log.warn("Ci sono " + listaTblDecodifiche.size() + " record di gruppo per <recordId='" + recordIdMax + "', tabellaId='" + tabellaId + "', valore='" + valoreFiltro + "'> (strano!!) ritorno il primo.");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 328 */       return listaTblDecodifiche.iterator().next();
/* 329 */     } catch (Exception e) {
/*     */ 
/*     */       
/* 332 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Collection revisionaRisultato(Collection decodificaAttuale) {
/* 340 */     return decodificaAttuale;
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
/*     */   private Collection recuperaDecodificaAttuale(String nomeTabellaDecodifica, String nome, String valore, MapContainer mc) throws RasServiceException {
/* 357 */     mc.putAppl("NOME_TABELLA_DECODIFICA", nomeTabellaDecodifica);
/* 358 */     mc.putAppl("NOME_COLONNA_IN", nome);
/* 359 */     mc.putAppl("VALORE_COLONNA_IN", valore);
/*     */     
/* 361 */     MapContainer cOut = getModuleManager().execModule(getModuloEstrazioneDecodificaEsistente(), mc);
/*     */ 
/*     */     
/* 364 */     return (Collection)cOut.getAppl("RISULTATO_RICERCA");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int recuperaMassimoIncrementale(TblDecodifiche decod) {
/* 371 */     int recordIdMax = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 381 */     if (decod != null) {
/* 382 */       MapContainer mc = new MapContainer();
/* 383 */       mc.putAppl("NOME_TABELLA_DECODIFICA", decod.getNomeTabella());
/*     */       
/* 385 */       MapContainer mc2 = null;
/*     */       try {
/* 387 */         mc2 = getModuleManager().execModule(getModuloEstrazioneMaxRecordId(), mc);
/*     */         
/* 389 */         Integer i = ((List)mc2.getAppl("RISULTATO_RICERCA")).get(0);
/*     */         
/* 391 */         recordIdMax = i.intValue();
/* 392 */       } catch (RasServiceException e) {}
/*     */     } 
/*     */ 
/*     */     
/* 396 */     return recordIdMax;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void inizializzaCampiStandard(RasORMBean entityBean, String tipoModifica, String action) {
/*     */     try {
/* 407 */       if ("D".equals(tipoModifica)) {
/* 408 */         PropertyUtils.setProperty(entityBean, "flagEsistenza", "N");
/*     */       }
/*     */       else {
/*     */         
/* 412 */         PropertyUtils.setProperty(entityBean, "flagEsistenza", "S");
/*     */       } 
/*     */ 
/*     */       
/* 416 */       PropertyUtils.setProperty(entityBean, "dataUltimaModifica", Calendar.getInstance().getTime());
/*     */ 
/*     */       
/* 419 */       PropertyUtils.setProperty(entityBean, "tipoUltimaModifica", tipoModifica);
/*     */       
/* 421 */       String value = (action != null && action.length() > 40) ? action.substring(0, 40) : action;
/*     */       
/* 423 */       PropertyUtils.setProperty(entityBean, "userUltimaModifica", value);
/*     */       
/* 425 */       PropertyUtils.setProperty(entityBean, "proceduraUltimaModifica", value);
/*     */     }
/* 427 */     catch (Exception e) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getModuloCaricamentoCodesTable() {
/* 435 */     return this.moduloCaricamentoCodesTable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setModuloCaricamentoCodesTable(String moduloCaricamentoCodesTable) {
/* 444 */     this.moduloCaricamentoCodesTable = moduloCaricamentoCodesTable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getModuloSingleEntity() {
/* 451 */     return this.moduloSingleEntity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setModuloSingleEntity(String moduloSingleEntity) {
/* 459 */     this.moduloSingleEntity = moduloSingleEntity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getModuloEntityList() {
/* 466 */     return this.moduloEntityList;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setModuloEntityList(String moduloEntityList) {
/* 474 */     this.moduloEntityList = moduloEntityList;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getModuloEstrazioneMaxRecordId() {
/* 481 */     return this.moduloEstrazioneMaxRecordId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setModuloEstrazioneMaxRecordId(String moduloEstrazioneMaxRecordId) {
/* 490 */     this.moduloEstrazioneMaxRecordId = moduloEstrazioneMaxRecordId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getModuloEstrazioneDecodificaEsistente() {
/* 497 */     return this.moduloEstrazioneDecodificaEsistente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setModuloEstrazioneDecodificaEsistente(String moduloEstrazioneDecodificaEsistente) {
/* 506 */     this.moduloEstrazioneDecodificaEsistente = moduloEstrazioneDecodificaEsistente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getModuloCaricamentoFiltroEsistente() {
/* 513 */     return this.moduloCaricamentoFiltroEsistente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setModuloCaricamentoFiltroEsistente(String moduloCaricamentoFiltroEsistente) {
/* 522 */     this.moduloCaricamentoFiltroEsistente = moduloCaricamentoFiltroEsistente;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\GenericCodesTableUpdaterSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */