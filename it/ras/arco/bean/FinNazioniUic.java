/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinNazioniUic
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer nazioneId;
/*     */   private String codiceIso;
/*     */   private String descrizione;
/*     */   private String codiceUic;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public String getCodiceIso() {
/*  25 */     return this.codiceIso;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceIso(String codiceIso) {
/*  31 */     this.codiceIso = codiceIso;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceUic() {
/*  37 */     return this.codiceUic;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceUic(String codiceUic) {
/*  43 */     this.codiceUic = codiceUic;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/*  49 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  55 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizione() {
/*  61 */     return this.descrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizione(String descrizione) {
/*  67 */     this.descrizione = descrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNazioneId() {
/*  73 */     return this.nazioneId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNazioneId(Integer nazioneId) {
/*  79 */     this.nazioneId = nazioneId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/*  85 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/*  91 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinNazioniUic(String iso, String uic, Date inserimento, String descrizione, String inserimento2) {
/* 102 */     this.codiceIso = iso;
/* 103 */     this.codiceUic = uic;
/* 104 */     this.dataInserimento = inserimento;
/* 105 */     this.descrizione = descrizione;
/* 106 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */   
/*     */   public FinNazioniUic() {}
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinNazioniUic.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */