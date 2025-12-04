/*     */ package it.ras.arco.batch.investitori.rules;
/*     */ 
/*     */ import it.ras.arco.bean.FinContratto;
/*     */ import it.ras.arco.bean.FinContrattoPromotore;
/*     */ import it.ras.arco.bean.FinDispPagamento;
/*     */ import it.ras.arco.bean.FinOrdine;
/*     */ import it.ras.arco.bean.FinPosizione;
/*     */ import it.ras.arco.bean.FinSottoscrizione;
/*     */ import it.ras.flag.batch.file.IRasFileRecord;
/*     */ import it.ras.flag.config.rules.AbstractValidationRule;
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
/*     */ public class StampaAccordo
/*     */   extends AbstractValidationRule
/*     */ {
/*     */   public static final String INVIATO = "I";
/*     */   public static final String flag_attuale = "S";
/*     */   public static final String flag_split = "N";
/*  35 */   FinContrattoPromotore contratto_promottore = null;
/*  36 */   FinContratto contratto = null;
/*  37 */   FinOrdine ordine = null;
/*  38 */   FinPosizione posizione = null;
/*     */   
/*  40 */   String mod_pagamento = "";
/*  41 */   String tipoOperazione = "";
/*  42 */   String nuovePosizioni = "";
/*  43 */   String codiceLinea = "";
/*  44 */   String cod_agente = "";
/*  45 */   String cod_rete = "";
/*  46 */   String codiceSconto = "";
/*  47 */   String abi = "";
/*  48 */   String cab = "";
/*  49 */   String cc = "";
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
/*     */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession, HashMap globalSession) {
/*  61 */     this.tipoOperazione = localSession.get("TIPOOPERAZIONE").toString();
/*  62 */     this.nuovePosizioni = localSession.get("NUOVEPOSIZIONI").toString();
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  67 */       if (fileRecord.getObj() instanceof FinSottoscrizione) {
/*  68 */         FinSottoscrizione finAcc = (FinSottoscrizione)fileRecord.getObj();
/*  69 */         if (finAcc != null) {
/*     */           
/*  71 */           if (this.tipoOperazione.equals("SOT") && this.nuovePosizioni.equals("S")) {
/*  72 */             if (globalSession.get("RECORD_COUNT") != null) {
/*  73 */               int recordCount = ((Integer)globalSession.get("RECORD_COUNT")).intValue();
/*  74 */               globalSession.put("RECORD_COUNT", new Integer(++recordCount));
/*     */             } else {
/*  76 */               globalSession.put("RECORD_COUNT", new Integer(3));
/*     */             } 
/*     */             
/*  79 */             this.ordine = (FinOrdine)localSession.get("SESSIONORDINE");
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  84 */             this.codiceLinea = this.ordine.getAttivitaFin().getCodAttFinExt();
/*  85 */             localSession.put("CODICE_LINEA", this.codiceLinea);
/*     */             
/*  87 */             this.posizione = this.ordine.getPosizione();
/*  88 */             this.codiceSconto = this.posizione.getCodiceSconto();
/*  89 */             localSession.put("CODICE_SCONTO", this.codiceSconto);
/*  90 */             this.contratto = finAcc.getPrimoContratto();
/*     */             
/*  92 */             Set fin_contratto_promotore = this.contratto.getAssegnazione();
/*  93 */             Iterator ifin_contratto_promotore = fin_contratto_promotore.iterator();
/*     */             
/*  95 */             while (ifin_contratto_promotore.hasNext()) {
/*  96 */               this.contratto_promottore = ifin_contratto_promotore.next();
/*  97 */               if (this.contratto_promottore != null && this.contratto_promottore.getFlagAttuale().equals("S") && this.contratto_promottore.getFlagSplit().equals("N")) {
/*     */ 
/*     */ 
/*     */                 
/* 101 */                 this.cod_agente = this.contratto_promottore.getPromotore().getCodPromotore();
/* 102 */                 this.cod_rete = formatCodRete(this.contratto_promottore.getPromotore().getCodRete());
/*     */               } 
/*     */             } 
/*     */ 
/*     */             
/* 107 */             localSession.put("COD_AGENTE", this.cod_agente);
/* 108 */             localSession.put("COD_RETE", this.cod_rete);
/*     */             
/* 110 */             String key = "ATTFINID";
/* 111 */             if (this.contratto.getTipoProdotto().startsWith("GP")) {
/* 112 */               key = "LINEA";
/*     */             }
/*     */ 
/*     */             
/* 116 */             Set disPagamenti = finAcc.getDispPagamento();
/* 117 */             Iterator iDisPagamenti = disPagamenti.iterator();
/*     */             
/* 119 */             while (iDisPagamenti.hasNext()) {
/* 120 */               FinDispPagamento currDisPagamento = iDisPagamenti.next();
/* 121 */               this.abi = currDisPagamento.getAbi();
/* 122 */               this.cab = currDisPagamento.getCab();
/* 123 */               this.cc = currDisPagamento.getNumCc();
/* 124 */               this.mod_pagamento = currDisPagamento.getMezzoPagamento();
/*     */             } 
/*     */             
/* 127 */             localSession.put("ABI", this.abi);
/* 128 */             localSession.put("CAB", this.cab);
/* 129 */             localSession.put("CC", this.cc);
/* 130 */             localSession.put("MOD_PAGAMENTO", this.mod_pagamento);
/*     */             
/* 132 */             String attFinId = this.ordine.getAttivitaFin().getAttivitaFinId().toString();
/* 133 */             localSession.put(key, attFinId);
/* 134 */             globalSession.put("GLOBALATTFINID", attFinId);
/*     */             
/* 136 */             if (localSession.containsKey("FLAG_ALL")) {
/* 137 */               this.ordine.setStato("I");
/* 138 */               finAcc.setStato("I");
/*     */             } 
/* 140 */             return true;
/*     */           } 
/*     */ 
/*     */ 
/*     */           
/* 145 */           return false;
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 150 */         return false;
/*     */       } 
/*     */ 
/*     */       
/* 154 */       return false;
/*     */ 
/*     */     
/*     */     }
/* 158 */     catch (Exception e) {
/*     */       
/* 160 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String formatCodRete(String cod_rete) {
/* 167 */     String result = cod_rete;
/* 168 */     for (int i = cod_rete.length(); i < 3; i++)
/*     */     {
/* 170 */       result = " " + result;
/*     */     }
/* 172 */     return result;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\rules\StampaAccordo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */