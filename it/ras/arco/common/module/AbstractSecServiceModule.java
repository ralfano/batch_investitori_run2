/*     */ package it.ras.arco.common.module;
/*     */ 
/*     */ import it.ras.arco.bean.FinContrattoCC;
/*     */ import it.ras.arco.bean.sec.Contratto;
/*     */ import it.ras.arco.bean.sec.Funzione;
/*     */ import it.ras.arco.bean.sec.Istituto;
/*     */ import it.ras.arco.bean.sec.Ndg;
/*     */ import it.ras.arco.bean.sec.OperatorId;
/*     */ import it.ras.arco.bean.sec.Prodotto;
/*     */ import it.ras.arco.bean.sec.SecNew;
/*     */ import it.ras.arco.bean.sec.SecOld;
/*     */ import it.ras.arco.bean.sec.UserContext;
/*     */ import it.ras.arco.bean.sec.UserId;
/*     */ import it.ras.arco.bean.sec.pal.Funzione;
/*     */ import it.ras.arco.bean.sec.pal.Prodotto;
/*     */ import it.ras.arco.bean.sec.pal.ProfiloDiAccesso_Login_Response;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.Enumeration;
/*     */ import org.apache.commons.httpclient.Header;
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
/*     */ 
/*     */ public abstract class AbstractSecServiceModule
/*     */   extends AbstractRasCastorJmcModule
/*     */ {
/*     */   public static final String CONTO_CORRENTE = "CONTO_CORRENTE";
/*     */   public static final String NUMERO_CONTO_CORRENTE = "NUMERO_CONTO_CORRENTE";
/*     */   public static final String IDENTIFICATIVO_CONTO_CORRENTE = "IDENTIFICATIVO_CONTO_CORRENTE";
/*     */   public static final String FILIALE_CONTO_CORRENTE = "FILIALE_CONTO_CORRENTE";
/*     */   public static final String PROFILO_PROMOTORE_CORRENTE = "PROFILO_PROMOTORE_CORRENTE";
/*     */   public static final String PROFILO_OPERATORE_CORRENTE = "PROFILO_OPERATORE_CORRENTE";
/*     */   public static final String SALDO_CONTO_CORRENTE = "SALDO_CONTO_CORRENTE";
/*     */   public static final String PRODOTTO_BANKING = "CSR";
/*     */   public static final String SERVIZIO = "006";
/*     */   public static final String FUNZIONE_SALDO_CC = "FN_SALDO_PROMOTORE";
/*     */   public static final String FUNZIONE_PRENOTA_PARTITA = "FN_INSERIMENTO_PARTITA_AVVISATA_PROMOTORE";
/*     */   public static final String FUNZIONE_ANNULLA_PARTITA = "FN_ANNULLO_PARTITA_AVVISATA_PROMOTORE";
/*     */   public static final String SECURITY_MODE = "operatore";
/*     */   public static final String SESSION_HANDLE = "AE_";
/*     */   
/*     */   protected Header[] getRequestCookies(MapContainer inputMap) throws RasServiceException {
/*  69 */     Header header = (Header)inputMap.getAppl("JSESSIONID");
/*  70 */     Header[] headers = null;
/*  71 */     if (header != null) {
/*  72 */       headers = new Header[] { header };
/*     */     }
/*  74 */     return headers;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void processResponseCookies(Header[] responseHeaders, MapContainer outMap) throws RasServiceException {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Prodotto getProdottoFromProfile(ProfiloDiAccesso_Login_Response profile, String prodotto) {
/*  88 */     Prodotto p = new Prodotto();
/*     */     
/*  90 */     Enumeration prodotti = profile.getProdotti().enumerateProdotto();
/*  91 */     while (prodotti.hasMoreElements()) {
/*     */ 
/*     */       
/*  94 */       Prodotto curr = prodotti.nextElement();
/*     */       
/*  96 */       if (curr != null && prodotto.equals(curr.getNome())) {
/*  97 */         p.setCategoria(curr.getJMCCodiceContratto());
/*  98 */         p.setTipo(curr.getJMCTipoContratto());
/*  99 */         p.setNumero(Long.parseLong(curr.getJMCNumeroProdotto()));
/* 100 */         p.setProgressivo(0);
/*     */         break;
/*     */       } 
/*     */     } 
/* 104 */     return p;
/*     */   }
/*     */ 
/*     */   
/*     */   protected String getMd5FromProfile(ProfiloDiAccesso_Login_Response profile, String prodotto) {
/* 109 */     String md5 = null;
/*     */     
/* 111 */     Enumeration prodotti = profile.getProdotti().enumerateProdotto();
/* 112 */     while (prodotti.hasMoreElements()) {
/*     */ 
/*     */       
/* 115 */       Prodotto curr = prodotti.nextElement();
/*     */       
/* 117 */       if (curr != null && prodotto.equals(curr.getNome())) {
/* 118 */         md5 = curr.getJMCSec();
/*     */         break;
/*     */       } 
/*     */     } 
/* 122 */     return md5;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Istituto getIstitutoFromProfile(ProfiloDiAccesso_Login_Response profile) {
/* 127 */     Istituto i = new Istituto();
/* 128 */     i.setCodice(profile.getJMCCodiceIstituto());
/* 129 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected UserContext getUserContextFromProfile(ProfiloDiAccesso_Login_Response profile, String userIdOperatore) {
/* 134 */     UserContext uc = new UserContext();
/* 135 */     uc.setCanale(profile.getJMCCanale());
/* 136 */     uc.setCodiceLingua(profile.getJMCUtenteLingua());
/* 137 */     Ndg ndg = new Ndg();
/* 138 */     ndg.setValore(Integer.parseInt(profile.getUtente().getNdg()));
/* 139 */     uc.setNdg(ndg);
/* 140 */     UserId userId = new UserId();
/* 141 */     userId.setCodice(profile.getUserID());
/* 142 */     OperatorId operatorId = new OperatorId();
/* 143 */     operatorId.setCodice(userIdOperatore);
/* 144 */     uc.setOperatorId(operatorId);
/* 145 */     uc.setSessionHandle(profile.getJMCSessionHandle());
/* 146 */     uc.setUserId(userId);
/* 147 */     return uc;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Contratto getContractFromProfile(ProfiloDiAccesso_Login_Response profile) {
/* 152 */     Contratto c = new Contratto();
/* 153 */     c.setCategoria(profile.getJMCUtenteCodiceContratto());
/* 154 */     c.setNumero(Long.parseLong(profile.getJMCUtenteNumeroContratto()));
/* 155 */     c.setProgressivo(Integer.parseInt(profile.getJMCUtenteProgContratto()));
/* 156 */     c.setTipo(profile.getJMCUtenteTipoContratto());
/* 157 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected SecOld getSecOldFromProfile(FinContrattoCC contoCorrente, ProfiloDiAccesso_Login_Response profile, String prodotto, String funzione) {
/* 163 */     SecOld secOld = new SecOld();
/* 164 */     secOld.setCategoria(contoCorrente.getCategoriaRapporto().substring(1));
/* 165 */     secOld.setEnte(contoCorrente.getFilialeRapporto());
/* 166 */     secOld.setNumero(Integer.parseInt(contoCorrente.getNumeroRapporto()));
/* 167 */     secOld.setServizio("006");
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
/* 184 */     return secOld;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SecNew getSecNewFromProfile(FinContrattoCC contoCorrente, ProfiloDiAccesso_Login_Response profile) {
/* 189 */     SecNew secNew = new SecNew();
/* 190 */     secNew.setNumero(Integer.parseInt(contoCorrente.getNumeroRapporto()));
/* 191 */     secNew.setTipo("00");
/* 192 */     secNew.setIstituto(getIstitutoFromProfile(profile));
/* 193 */     return secNew;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected Funzione getFunzioneFromProfile(ProfiloDiAccesso_Login_Response profile, String prodotto, String funzione) {
/* 199 */     Funzione retFunct = new Funzione();
/*     */     
/* 201 */     Enumeration prodotti = profile.getProdotti().enumerateProdotto();
/* 202 */     while (prodotti.hasMoreElements()) {
/*     */ 
/*     */       
/* 205 */       Prodotto curr = prodotti.nextElement();
/*     */       
/* 207 */       if (curr != null && prodotto.equals(curr.getNome())) {
/* 208 */         Enumeration funzioni = curr.getFunzioni().enumerateFunzione();
/* 209 */         while (funzioni.hasMoreElements()) {
/* 210 */           Funzione fz = funzioni.nextElement();
/*     */           
/* 212 */           if (fz != null && funzione.equals(fz.getNome())) {
/* 213 */             retFunct.setArea(fz.getJMCAreaFunzione());
/* 214 */             retFunct.setCodice(Integer.parseInt(fz.getJMCCodiceFunzione()));
/*     */             
/* 216 */             retFunct.setServizio(fz.getJMCServizioFunzione());
/*     */             break;
/*     */           } 
/*     */         } 
/*     */         break;
/*     */       } 
/*     */     } 
/* 223 */     return retFunct;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\module\AbstractSecServiceModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */