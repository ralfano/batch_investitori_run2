/*     */ package it.ras.arco.batch.investitori.rules;
/*     */ 
/*     */ import it.ras.arco.bean.FinCointestazione;
/*     */ import it.ras.arco.bean.FinContratto;
/*     */ import it.ras.arco.bean.FinContrattoDecod;
/*     */ import it.ras.arco.bean.FinDecodNdgFabbr;
/*     */ import it.ras.arco.bean.FinDispPagamento;
/*     */ import it.ras.arco.bean.FinOrdine;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.arco.bean.FinSottoscrizione;
/*     */ import it.ras.flag.batch.file.IRasFileRecord;
/*     */ import it.ras.flag.config.rules.AbstractActionRule;
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
/*     */ public class codPartecipanti
/*     */   extends AbstractActionRule
/*     */ {
/*  32 */   FinOrdine ordine = null;
/*  33 */   FinSottoscrizione sottoscrizione = null;
/*  34 */   FinContratto contr = null;
/*  35 */   FinCointestazione c = null;
/*  36 */   FinSoggetto sgg = null;
/*  37 */   String soggettoId = "";
/*  38 */   String ndgArco = "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession, HashMap globalSession) {
/*  49 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String paddingString(String s, int n, char c, boolean paddingLeft) {
/*  54 */     StringBuffer str = new StringBuffer(s);
/*  55 */     int strLength = str.length();
/*  56 */     if (n > 0 && n > strLength) {
/*  57 */       for (int i = 0; i <= n; i++) {
/*  58 */         if (paddingLeft)
/*  59 */         { if (i < n - strLength) str.insert(0, c);
/*     */            }
/*     */         
/*  62 */         else if (i > strLength) { str.append(c); }
/*     */       
/*     */       } 
/*     */     }
/*  66 */     return str.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession, HashMap globalSession) {
/*  72 */     String contratto = localSession.get("CONTRATTOID").toString();
/*  73 */     Object rec = fileRecord.getObj();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  79 */     if (rec instanceof FinOrdine) {
/*  80 */       this.ordine = (FinOrdine)fileRecord.getObj();
/*  81 */       this.sottoscrizione = this.ordine.getSottoscrizione();
/*  82 */       Set pagamento = this.sottoscrizione.getDispPagamento();
/*  83 */       this.sgg = this.sottoscrizione.getSoggettoRichiedente();
/*  84 */       if (!this.sottoscrizione.getTipoOperazione().equals("RSO")) {
/*  85 */         if (this.sgg != null) {
/*  86 */           this.soggettoId = this.sgg.getSoggettoId().toString();
/*  87 */           this.ndgArco = getNdgArco(this.sgg, contratto);
/*     */         } 
/*  89 */       } else if (pagamento != null) {
/*  90 */         Iterator dispid = pagamento.iterator();
/*  91 */         while (dispid.hasNext()) {
/*  92 */           FinDispPagamento decode = dispid.next();
/*  93 */           this.sgg = decode.getSoggetto();
/*  94 */           if (this.sgg != null) {
/*  95 */             this.soggettoId = this.sgg.getSoggettoId().toString();
/*  96 */             this.ndgArco = getNdgArco(this.sgg, contratto);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 103 */       String codFisc = "";
/* 104 */       if (this.sgg != null) {
/* 105 */         codFisc = this.sgg.getTipoSogg().equals("F") ? this.sgg.getCodiceFiscale() : this.sgg.getPartitaIva();
/*     */       }
/* 107 */       localSession.put("CODFISC", codFisc);
/* 108 */     } else if (rec instanceof FinCointestazione) {
/* 109 */       this.sottoscrizione = (FinSottoscrizione)localSession.get("SESSIONSOTTOSCRIZIONE");
/* 110 */       this.c = (FinCointestazione)rec;
/* 111 */       this.sgg = this.c.getSoggetto();
/* 112 */       if (this.sgg != null) {
/* 113 */         this.soggettoId = this.sgg.getSoggettoId().toString();
/* 114 */         this.ndgArco = getNdgArco(this.sgg, contratto);
/*     */       } 
/* 116 */     } else if (rec instanceof FinSottoscrizione) {
/* 117 */       this.sottoscrizione = (FinSottoscrizione)rec;
/* 118 */       this.sgg = this.sottoscrizione.getSoggettoRichiedente();
/* 119 */       if (this.sgg != null) {
/* 120 */         this.soggettoId = this.sgg.getSoggettoId().toString();
/* 121 */         this.ndgArco = getNdgArco(this.sgg, contratto);
/*     */ 
/*     */ 
/*     */         
/* 125 */         String codFisc = "";
/* 126 */         codFisc = this.sgg.getTipoSogg().equals("F") ? this.sgg.getCodiceFiscale() : this.sgg.getPartitaIva();
/* 127 */         localSession.put("CODFISC", codFisc);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     FinSoggetto currSogg = null;
/* 136 */     if (this.sottoscrizione.getPrimoContratto() != null) {
/* 137 */       currSogg = this.sottoscrizione.getPrimoContratto().getSoggetto();
/* 138 */     } else if (localSession.get("SESSIONCONTRATTO") != null) {
/* 139 */       this.contr = (FinContratto)localSession.get("SESSIONCONTRATTO");
/* 140 */       currSogg = this.contr.getSoggetto();
/*     */     } 
/*     */     
/* 143 */     if (this.soggettoId.equals(currSogg.getSoggettoId().toString())) {
/* 144 */       globalSession.put("NDGPRIMOINT", this.ndgArco);
/* 145 */       if (currSogg.getTipoSogg().equals("F")) {
/* 146 */         globalSession.put("CFPRIMOINT", currSogg.getCodiceFiscale());
/*     */       } else {
/* 148 */         globalSession.put("CFPRIMOINT", currSogg.getPartitaIva());
/*     */       } 
/*     */     } 
/* 151 */     return this.ndgArco;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String getNdgArco(FinSoggetto sgg, String contratto) {
/* 162 */     String ndgArco = "";
/* 163 */     String ndgExt = "";
/* 164 */     Set soggetto = sgg.getDecodNdgFabbr();
/* 165 */     if (soggetto != null) {
/* 166 */       ndgArco = sgg.getNdgArco().toString();
/* 167 */       Iterator ndgFabbr = soggetto.iterator();
/* 168 */       boolean foundCumuli = false;
/* 169 */       boolean foundExt = false;
/* 170 */       while (ndgFabbr.hasNext()) {
/* 171 */         FinDecodNdgFabbr FabbrDecode = ndgFabbr.next();
/* 172 */         Set decodcontratto = FabbrDecode.getDecodContrattoNew();
/* 173 */         if (FabbrDecode.getFabbrica().equals("S44")) {
/* 174 */           ndgExt = FabbrDecode.getNdgFab();
/* 175 */           foundExt = true;
/* 176 */           if (decodcontratto != null) {
/* 177 */             Iterator ctrdecod = decodcontratto.iterator();
/* 178 */             while (ctrdecod.hasNext()) {
/* 179 */               FinContrattoDecod contrattoD = ctrdecod.next();
/* 180 */               if (contrattoD.getContrattoId().equals(contratto)) {
/* 181 */                 ndgExt = contrattoD.getDecodNdgFabbrOldId();
/* 182 */                 foundCumuli = true;
/*     */                 
/*     */                 break;
/*     */               } 
/*     */             } 
/*     */           } 
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */       
/* 193 */       if (foundCumuli) {
/* 194 */         if (ndgExt.length() > 18) {
/* 195 */           ndgExt = ndgExt.substring(2);
/*     */         }
/* 197 */         return ndgExt;
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 202 */       if (foundExt) {
/* 203 */         if (ndgExt.length() > 18) {
/* 204 */           ndgExt = ndgExt.substring(2);
/*     */         }
/* 206 */         return ndgExt;
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 211 */       ndgArco = '\001' + paddingString(ndgArco.toString(), 11, '0', true);
/*     */     } 
/*     */     
/* 214 */     return ndgArco;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\rules\codPartecipanti.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */