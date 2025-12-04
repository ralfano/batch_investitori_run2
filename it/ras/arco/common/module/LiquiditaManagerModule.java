/*     */ package it.ras.arco.common.module;
/*     */ 
/*     */ import it.ras.arco.bean.FinContrattoCC;
/*     */ import it.ras.arco.bean.FinCredenzialiSecOperatoreMiddleOffice;
/*     */ import it.ras.arco.bean.sec.CancellazionePartitaAvvisataPromotoriSP_Request;
/*     */ import it.ras.arco.bean.sec.ChiaveDisposizione;
/*     */ import it.ras.arco.bean.sec.Contratto;
/*     */ import it.ras.arco.bean.sec.CreazionePartitaAvvisataPromotoriSP_Request;
/*     */ import it.ras.arco.bean.sec.CreazionePartitaAvvisataPromotoriSP_Response;
/*     */ import it.ras.arco.bean.sec.Divisa;
/*     */ import it.ras.arco.bean.sec.Funzione;
/*     */ import it.ras.arco.bean.sec.Importo;
/*     */ import it.ras.arco.bean.sec.Istituto;
/*     */ import it.ras.arco.bean.sec.Prodotto;
/*     */ import it.ras.arco.bean.sec.Pwd2Context;
/*     */ import it.ras.arco.bean.sec.SecNew;
/*     */ import it.ras.arco.bean.sec.SecOld;
/*     */ import it.ras.arco.bean.sec.UserContext;
/*     */ import it.ras.arco.bean.sec.pal.ProfiloDiAccesso_Login_Response;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import it.ras.flag.util.TextFormatUtils;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.Calendar;
/*     */ import java.util.Locale;
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
/*     */ public class LiquiditaManagerModule
/*     */   extends AbstractSecServiceModule
/*     */ {
/*     */   public static final String PRENOTAZIONE_PARTITA = "A";
/*     */   public static final String ANNULLAMENTO_PARTITA = "E";
/*     */   public static final String CREDENZIALI_OPERATORE = "CREDENZIALI_OPERATORE";
/*     */   public static final String IMPORTO_PARTITA = "IMPORTO_PARTITA";
/*     */   public static final String CODICE_ESTERNO_PARTITA = "CODICE_ESTERNO_PARTITA";
/*     */   public static final String DISPOSIZIONE_ID_SEC = "DISPOSIZIONE_ID_SEC";
/*     */   public static final String SEC_OLD = "SEC_OLD";
/*     */   private String action;
/*     */   
/*     */   public String getAction() {
/*  61 */     return this.action;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAction(String action) {
/*  69 */     this.action = action;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Object[] prepareInput(MapContainer inputMap) throws RasServiceException {
/*  78 */     ProfiloDiAccesso_Login_Response profilo = (ProfiloDiAccesso_Login_Response)inputMap.getAppl("PROFILO_PROMOTORE_CORRENTE");
/*     */ 
/*     */ 
/*     */     
/*  82 */     String userIdOperatore = (String)inputMap.getAppl("USER_ID_OPERATORE");
/*  83 */     FinContrattoCC contoCorrente = (FinContrattoCC)inputMap.getAppl("CONTO_CORRENTE");
/*     */     
/*  85 */     FinCredenzialiSecOperatoreMiddleOffice credenziali = (FinCredenzialiSecOperatoreMiddleOffice)inputMap.getAppl("CREDENZIALI_OPERATORE");
/*     */     
/*  87 */     Pwd2Context pwd2 = new Pwd2Context();
/*  88 */     String password = credenziali.getPassword2Sec();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  96 */       pwd2 = getRandomPwd2Context(password);
/*  97 */       pwd2.setSecurityMode("operatore");
/*  98 */     } catch (Exception e) {
/*  99 */       pwd2 = new Pwd2Context();
/* 100 */       pwd2.setPassword(password.substring(0, 2));
/* 101 */       pwd2.setFirstDigit(1);
/* 102 */       pwd2.setSecondDigit(2);
/* 103 */       pwd2.setThirdDigit(3);
/* 104 */       pwd2.setSecurityMode("operatore");
/*     */     } 
/* 106 */     Prodotto prodotto = getProdottoFromProfile(profilo, "CSR");
/* 107 */     Istituto istituto = getIstitutoFromProfile(profilo);
/* 108 */     UserContext userContext = getUserContextFromProfile(profilo, userIdOperatore);
/*     */     
/* 110 */     Contratto contratto = getContractFromProfile(profilo);
/* 111 */     SecOld secOld = getSecOldFromProfile(contoCorrente, profilo, "CSR", "FN_INSERIMENTO_PARTITA_AVVISATA_PROMOTORE");
/*     */ 
/*     */     
/* 114 */     Object[] inputArray = new Object[1];
/* 115 */     if ("A".equals(this.action)) {
/* 116 */       CreazionePartitaAvvisataPromotoriSP_Request cpa = new CreazionePartitaAvvisataPromotoriSP_Request();
/*     */ 
/*     */       
/* 119 */       cpa.setProdotto(prodotto);
/* 120 */       cpa.setIstituto(istituto);
/* 121 */       cpa.setUserContext(userContext);
/* 122 */       cpa.setContratto(contratto);
/*     */ 
/*     */       
/* 125 */       cpa.setSecOld(secOld);
/*     */ 
/*     */       
/* 128 */       cpa.setDomain("");
/* 129 */       cpa.setIp("");
/* 130 */       cpa.setFn("FN_INSERIMENTO_PARTITA_AVVISATA_PROMOTORE");
/* 131 */       cpa.setLevel("");
/*     */ 
/*     */       
/* 134 */       cpa.setPwd2Context(pwd2);
/*     */ 
/*     */       
/* 137 */       cpa.setAction("FN_INSERIMENTO_PARTITA_AVVISATA_PROMOTORE");
/* 138 */       cpa.setCodiceMd5(getMd5FromProfile(profilo, "CSR"));
/*     */ 
/*     */       
/* 141 */       Importo importo = new Importo();
/* 142 */       Divisa divisa = new Divisa();
/* 143 */       divisa.setCodice("EUR");
/* 144 */       importo.setDivisa(divisa);
/* 145 */       Double importoPartita = (Double)inputMap.getAppl("IMPORTO_PARTITA");
/*     */       
/* 147 */       BigDecimal totale = new BigDecimal(importoPartita.doubleValue());
/* 148 */       importo.setTotale(totale);
/* 149 */       cpa.setImporto(importo);
/*     */ 
/*     */       
/* 152 */       String dataCreazione = TextFormatUtils.dateToString(Locale.ITALIAN, Calendar.getInstance(Locale.ITALIAN).getTime(), "yyyyMMdd");
/*     */       
/* 154 */       cpa.setDataCreazione(dataCreazione);
/*     */ 
/*     */       
/* 157 */       cpa.setGiorniScadenza(10);
/* 158 */       cpa.setDescrizione("Sottoscrizione Fondi");
/*     */       
/* 160 */       String codicePartita = (String)inputMap.getAppl("CODICE_ESTERNO_PARTITA");
/*     */       
/* 162 */       cpa.setCodiceRiferimento(codicePartita);
/*     */       
/* 164 */       inputArray[0] = cpa;
/* 165 */     } else if ("E".equals(this.action)) {
/* 166 */       CancellazionePartitaAvvisataPromotoriSP_Request cpa = new CancellazionePartitaAvvisataPromotoriSP_Request();
/*     */ 
/*     */       
/* 169 */       cpa.setProdotto(prodotto);
/* 170 */       cpa.setIstituto(istituto);
/* 171 */       cpa.setUserContext(userContext);
/* 172 */       cpa.setContratto(contratto);
/*     */ 
/*     */       
/* 175 */       cpa.setSecOld(secOld);
/*     */ 
/*     */       
/* 178 */       cpa.setDomain("");
/* 179 */       cpa.setIp("");
/* 180 */       cpa.setFn("FN_ANNULLO_PARTITA_AVVISATA_PROMOTORE");
/* 181 */       cpa.setLevel("");
/*     */ 
/*     */       
/* 184 */       cpa.setPwd2Context(pwd2);
/*     */ 
/*     */       
/* 187 */       cpa.setAction("FN_ANNULLO_PARTITA_AVVISATA_PROMOTORE");
/* 188 */       cpa.setCodiceMd5(getMd5FromProfile(profilo, "CSR"));
/*     */ 
/*     */       
/* 191 */       Importo importo = new Importo();
/* 192 */       Divisa divisa = new Divisa();
/* 193 */       divisa.setCodice("EUR");
/* 194 */       importo.setDivisa(divisa);
/* 195 */       Double importoPartita = (Double)inputMap.getAppl("IMPORTO_PARTITA");
/*     */       
/* 197 */       BigDecimal totale = new BigDecimal(importoPartita.doubleValue());
/* 198 */       importo.setTotale(totale);
/* 199 */       cpa.setImporto(importo);
/*     */       
/* 201 */       String codicePartita = (String)inputMap.getAppl("CODICE_ESTERNO_PARTITA");
/*     */       
/* 203 */       String idDisposizioneSec = (String)inputMap.getAppl("DISPOSIZIONE_ID_SEC");
/*     */ 
/*     */ 
/*     */       
/* 207 */       ChiaveDisposizione chiaveDispo = new ChiaveDisposizione();
/* 208 */       Funzione funzione = getFunzioneFromProfile(profilo, "CSR", "FN_ANNULLO_PARTITA_AVVISATA_PROMOTORE");
/*     */       
/* 210 */       SecNew secNew = getSecNewFromProfile(contoCorrente, profilo);
/* 211 */       chiaveDispo.setFunzione(funzione);
/* 212 */       chiaveDispo.setProdotto(prodotto);
/* 213 */       chiaveDispo.setSecNew(secNew);
/* 214 */       chiaveDispo.setIdDisposizione(idDisposizioneSec);
/* 215 */       cpa.setChiaveDisposizione(chiaveDispo);
/* 216 */       cpa.setCodiceRiferimento(codicePartita);
/*     */ 
/*     */       
/* 219 */       String dataCreazione = TextFormatUtils.dateToString(Locale.ITALIAN, Calendar.getInstance(Locale.ITALIAN).getTime(), "yyyyMMdd");
/*     */       
/* 221 */       cpa.setDataCreazione(dataCreazione);
/*     */ 
/*     */ 
/*     */       
/* 225 */       cpa.setDescrizione("Sottoscrizione Fondi");
/*     */       
/* 227 */       inputArray[0] = cpa;
/*     */     } 
/*     */     
/* 230 */     return inputArray;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer prepareOutput(Object object) throws RasServiceException {
/* 238 */     MapContainer outMap = new MapContainer(2);
/* 239 */     if ("A".equals(this.action)) {
/* 240 */       CreazionePartitaAvvisataPromotoriSP_Response response = (CreazionePartitaAvvisataPromotoriSP_Response)object;
/* 241 */       outMap.putAppl("DISPOSIZIONE_ID_SEC", response.getDisposizione().getIdDisposizione());
/*     */     } 
/*     */     
/* 244 */     outMap.putAppl("ESITO", Boolean.TRUE);
/* 245 */     return outMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Pwd2Context getRandomPwd2Context(String pwd) {
/* 254 */     Pwd2Context pwd2 = new Pwd2Context();
/* 255 */     int pwdLength = pwd.length();
/*     */     
/* 257 */     int iterazioni = 0;
/*     */     
/* 259 */     int select = 0;
/* 260 */     String pwdConcat = new String();
/*     */     
/* 262 */     int first = -1;
/* 263 */     int second = -1;
/*     */     
/* 265 */     while (iterazioni < 3) {
/* 266 */       select = (int)Math.round(Math.random() * (pwdLength - 1));
/* 267 */       if (first != select && second != select) {
/*     */         
/* 269 */         String valueChar = pwd.substring(select, select + 1);
/* 270 */         if (iterazioni == 0) {
/* 271 */           pwdConcat = pwdConcat + valueChar;
/* 272 */           pwd2.setFirstDigit(select + 1);
/* 273 */           iterazioni++;
/* 274 */           first = select; continue;
/* 275 */         }  if (iterazioni == 1) {
/* 276 */           pwdConcat = pwdConcat + valueChar;
/* 277 */           pwd2.setSecondDigit(select + 1);
/* 278 */           iterazioni++;
/* 279 */           second = select; continue;
/* 280 */         }  if (iterazioni == 2) {
/* 281 */           pwdConcat = pwdConcat + valueChar;
/* 282 */           pwd2.setThirdDigit(select + 1);
/* 283 */           iterazioni++;
/*     */         } 
/*     */       } 
/*     */     } 
/* 287 */     pwd2.setPassword(pwdConcat);
/*     */     
/* 289 */     return pwd2;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\module\LiquiditaManagerModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */