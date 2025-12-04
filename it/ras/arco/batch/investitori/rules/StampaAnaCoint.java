/*     */ package it.ras.arco.batch.investitori.rules;
/*     */ 
/*     */ import it.ras.arco.bean.FinCointestazione;
/*     */ import it.ras.arco.bean.FinDocumento;
/*     */ import it.ras.arco.bean.FinIndirizzo;
/*     */ import it.ras.arco.bean.FinOrdine;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.arco.bean.FinSoggettoIndir;
/*     */ import it.ras.arco.bean.FinSoggettoPrivacy;
/*     */ import it.ras.flag.batch.file.IRasFileRecord;
/*     */ import it.ras.flag.config.rules.AbstractValidationRule;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.Set;
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
/*     */ public class StampaAnaCoint
/*     */   extends AbstractValidationRule
/*     */ {
/*     */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession, HashMap globalSession) {
/*  46 */     String tipoOperazione = localSession.get("TIPOOPERAZIONE").toString();
/*  47 */     String nuovePosizioni = localSession.get("NUOVEPOSIZIONI").toString();
/*     */     
/*  49 */     if (fileRecord.getObj() instanceof FinCointestazione) {
/*  50 */       if (tipoOperazione.equals("SOT") && nuovePosizioni.equals("S")) {
/*     */         
/*  52 */         FinCointestazione sot = (FinCointestazione)fileRecord.getObj();
/*  53 */         if (sot.getTipo().equals("S")) {
/*  54 */           return false;
/*     */         }
/*     */         
/*  57 */         if (globalSession.get("RECORD_COUNT") != null) {
/*  58 */           int recordCount = ((Integer)globalSession.get("RECORD_COUNT")).intValue();
/*  59 */           globalSession.put("RECORD_COUNT", new Integer(++recordCount));
/*     */         } else {
/*  61 */           globalSession.put("RECORD_COUNT", new Integer(3));
/*     */         } 
/*     */         
/*  64 */         FinOrdine ordine = (FinOrdine)localSession.get("SESSIONORDINE");
/*  65 */         localSession.put("ATTFINID", ordine.getAttivitaFin().getAttivitaFinId().toString());
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  70 */         String tipoVia = "";
/*  71 */         String via = "";
/*  72 */         String numCiv = "";
/*  73 */         String cap = "";
/*  74 */         String citta = "";
/*  75 */         String provincia = "";
/*  76 */         String stato = "";
/*     */         
/*  78 */         FinSoggetto soggetto = sot.getSoggetto();
/*  79 */         localSession.put("NAZIONALITA", soggetto.getNazNascita());
/*  80 */         Set sogInd = soggetto.getIndirizzoResidenza();
/*     */         
/*  82 */         if (sogInd != null) {
/*  83 */           Iterator i = sogInd.iterator();
/*  84 */           if (i.hasNext()) {
/*  85 */             FinSoggettoIndir si = i.next();
/*  86 */             FinIndirizzo indirizzo = si.getIndirizzo();
/*  87 */             tipoVia = indirizzo.getDesToponimo();
/*  88 */             via = indirizzo.getIndirizzo();
/*  89 */             numCiv = indirizzo.getNumeroCivico();
/*  90 */             cap = indirizzo.getCap();
/*  91 */             citta = indirizzo.getComune();
/*  92 */             provincia = indirizzo.getProv();
/*  93 */             stato = indirizzo.getNazione();
/*     */           } 
/*     */         } 
/*     */         
/*  97 */         localSession.put("TIPOVIA", tipoVia);
/*  98 */         localSession.put("VIA", via);
/*  99 */         localSession.put("NUMCIV", numCiv);
/* 100 */         localSession.put("CAP", cap);
/* 101 */         localSession.put("CITTA", citta);
/* 102 */         localSession.put("PROVINCIA", provincia);
/* 103 */         localSession.put("STATO", stato);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 109 */         Date dataRilascio = null;
/* 110 */         String numeroDoc = "";
/* 111 */         String luogoRil = "";
/* 112 */         String tipoDoc = "";
/* 113 */         String data = "";
/* 114 */         Set documenti = soggetto.getDocumenti();
/* 115 */         if (documenti != null) {
/* 116 */           Iterator doc = documenti.iterator();
/* 117 */           if (doc.hasNext()) {
/* 118 */             FinDocumento documento = doc.next();
/* 119 */             dataRilascio = documento.getDataRilascio();
/* 120 */             numeroDoc = documento.getNumeroDoc();
/* 121 */             luogoRil = documento.getLuogoRilascio();
/* 122 */             tipoDoc = documento.getTipoDoc();
/*     */           } 
/*     */         } 
/* 125 */         localSession.put("DATA_RILASCIO", dataRilascio);
/* 126 */         localSession.put("NUMERO_DOC", numeroDoc);
/* 127 */         localSession.put("LUOGO_RILASCIO", luogoRil);
/* 128 */         localSession.put("TIPO_DOC", tipoDoc);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 133 */         String privacy = "N";
/* 134 */         FinSoggettoPrivacy sp = soggetto.getSoggettoPrivacy();
/* 135 */         if (sp != null && 
/* 136 */           sp.getConsPrivacy1() != null) {
/* 137 */           privacy = sp.getConsPrivacy1().toUpperCase();
/*     */         }
/*     */         
/* 140 */         localSession.put("PRIVACY", privacy);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 145 */         String cognome = "";
/* 146 */         String nome = "";
/* 147 */         String titolo = "";
/* 148 */         if (soggetto.getTipoSogg().equals("G")) {
/* 149 */           localSession.put("CF", soggetto.getPartitaIva());
/* 150 */           String ragioneSociale = soggetto.getDenominazione();
/* 151 */           if (ragioneSociale.length() > 50) {
/* 152 */             cognome = ragioneSociale.substring(0, 50);
/* 153 */             nome = ragioneSociale.substring(50);
/*     */           } else {
/* 155 */             cognome = ragioneSociale;
/*     */           } 
/* 157 */           localSession.put("DATA_NASCITA", "00000000");
/* 158 */           titolo = "SP";
/*     */         } else {
/*     */           
/* 161 */           nome = soggetto.getNome();
/* 162 */           cognome = soggetto.getCognome();
/* 163 */           localSession.put("CF", soggetto.getCodiceFiscale());
/* 164 */           localSession.put("DATA_NASCITA", soggetto.getDataNascita());
/*     */         } 
/* 166 */         localSession.put("NOME", nome);
/* 167 */         localSession.put("COGNOME", cognome);
/* 168 */         localSession.put("TITOLO", titolo);
/*     */         
/* 170 */         return true;
/*     */       } 
/* 172 */       return false;
/*     */     } 
/*     */     
/* 175 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\rules\StampaAnaCoint.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */