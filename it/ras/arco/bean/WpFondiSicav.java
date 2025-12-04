/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ public class WpFondiSicav
/*    */   extends WpContrattoTerzi
/*    */   implements Serializable
/*    */ {
/*    */   private Integer progressivoFon;
/*    */   private String socDistribuzioneFon;
/*    */   private Double importoPacFon;
/*    */   private String frequenzaPacFon;
/*    */   private String durataPacFon;
/*    */   private String pacAttivoFon;
/*    */   private String noteFon;
/*    */   
/*    */   public WpFondiSicav(String fon, String fon2, Double fon3, String fon4, String fon5, Integer fon6, String fon7) {
/* 20 */     this.durataPacFon = fon;
/* 21 */     this.frequenzaPacFon = fon2;
/* 22 */     this.importoPacFon = fon3;
/* 23 */     this.noteFon = fon4;
/* 24 */     this.pacAttivoFon = fon5;
/* 25 */     this.progressivoFon = fon6;
/* 26 */     this.socDistribuzioneFon = fon7;
/*    */   }
/*    */ 
/*    */   
/*    */   public WpFondiSicav() {}
/*    */ 
/*    */   
/*    */   public WpFondiSicav(Set clientegen, Integer id, Set intermediario, Set prodotto, String tipo) {
/* 34 */     super(clientegen, id, intermediario, prodotto, tipo);
/*    */   }
/*    */   
/*    */   public String getDurataPacFon() {
/* 38 */     return this.durataPacFon;
/*    */   }
/*    */   public void setDurataPacFon(String durataPacFon) {
/* 41 */     this.durataPacFon = durataPacFon;
/*    */   }
/*    */   public String getFrequenzaPacFon() {
/* 44 */     return this.frequenzaPacFon;
/*    */   }
/*    */   public void setFrequenzaPacFon(String frequenzaPacFon) {
/* 47 */     this.frequenzaPacFon = frequenzaPacFon;
/*    */   }
/*    */   public Double getImportoPacFon() {
/* 50 */     return this.importoPacFon;
/*    */   }
/*    */   public void setImportoPacFon(Double importoPacFon) {
/* 53 */     this.importoPacFon = importoPacFon;
/*    */   }
/*    */   public String getNoteFon() {
/* 56 */     return this.noteFon;
/*    */   }
/*    */   public void setNoteFon(String noteFon) {
/* 59 */     this.noteFon = noteFon;
/*    */   }
/*    */   public String getPacAttivoFon() {
/* 62 */     return this.pacAttivoFon;
/*    */   }
/*    */   public void setPacAttivoFon(String pacAttivoFon) {
/* 65 */     this.pacAttivoFon = pacAttivoFon;
/*    */   }
/*    */   public Integer getProgressivoFon() {
/* 68 */     return this.progressivoFon;
/*    */   }
/*    */   public void setProgressivoFon(Integer progressivoFon) {
/* 71 */     this.progressivoFon = progressivoFon;
/*    */   }
/*    */   public String getSocDistribuzioneFon() {
/* 74 */     return this.socDistribuzioneFon;
/*    */   }
/*    */   public void setSocDistribuzioneFon(String socDistribuzioneFon) {
/* 77 */     this.socDistribuzioneFon = socDistribuzioneFon;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpFondiSicav.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */