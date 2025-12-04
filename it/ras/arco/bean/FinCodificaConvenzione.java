/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import it.ras.flag.bean.RasORMBean;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ public class FinCodificaConvenzione
/*    */   extends RasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer recordId;
/*    */   private Integer tipoRecord;
/*    */   private String tipoTabella;
/*    */   private String codice;
/*    */   private String descrizione;
/*    */   private String flagAmm;
/*    */   private Double percentuale;
/*    */   
/*    */   public FinCodificaConvenzione() {}
/*    */   
/*    */   public String getCodice() {
/* 22 */     return this.codice;
/*    */   }
/*    */   public void setCodice(String codice) {
/* 25 */     this.codice = codice;
/*    */   }
/*    */   public String getDescrizione() {
/* 28 */     return this.descrizione;
/*    */   }
/*    */   public void setDescrizione(String descrizione) {
/* 31 */     this.descrizione = descrizione;
/*    */   }
/*    */   public String getFlagAmm() {
/* 34 */     return this.flagAmm;
/*    */   }
/*    */   public void setFlagAmm(String flagAmm) {
/* 37 */     this.flagAmm = flagAmm;
/*    */   }
/*    */   public Double getPercentuale() {
/* 40 */     return this.percentuale;
/*    */   }
/*    */   public void setPercentuale(Double percentuale) {
/* 43 */     this.percentuale = percentuale;
/*    */   }
/*    */   public Integer getRecordId() {
/* 46 */     return this.recordId;
/*    */   }
/*    */   public void setRecordId(Integer recordId) {
/* 49 */     this.recordId = recordId;
/*    */   }
/*    */   public Integer getTipoRecord() {
/* 52 */     return this.tipoRecord;
/*    */   }
/*    */   public void setTipoRecord(Integer tipoRecord) {
/* 55 */     this.tipoRecord = tipoRecord;
/*    */   }
/*    */   public String getTipoTabella() {
/* 58 */     return this.tipoTabella;
/*    */   }
/*    */   public void setTipoTabella(String tipoTabella) {
/* 61 */     this.tipoTabella = tipoTabella;
/*    */   }
/*    */ 
/*    */   
/*    */   public FinCodificaConvenzione(String codice, String descrizione, String amm, Double percentuale, Integer id, Integer record, String tabella) {
/* 66 */     this.codice = codice;
/* 67 */     this.descrizione = descrizione;
/* 68 */     this.flagAmm = amm;
/* 69 */     this.percentuale = percentuale;
/* 70 */     this.recordId = id;
/* 71 */     this.tipoRecord = record;
/* 72 */     this.tipoTabella = tabella;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinCodificaConvenzione.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */