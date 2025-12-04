/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class WpTitoli
/*     */   extends WpContrattoTerzi
/*     */   implements Serializable
/*     */ {
/*     */   private Integer progressivoTit;
/*     */   private String noteTit;
/*     */   private String bancaTit;
/*     */   private String nomeTit;
/*     */   private String prevedeCedola;
/*     */   private Integer tassoCedola;
/*     */   private String frequenza;
/*     */   private Date dataEstinTitolo;
/*     */   private String societaDistr;
/*     */   private Integer matriceTransUtenteIdTit;
/*     */   
/*     */   public WpTitoli(String tit, Date titolo, String frequenza, Integer tit2, String tit3, String tit4, String cedola, Integer tit5, String distr, Integer cedola2) {
/*  23 */     this.bancaTit = tit;
/*  24 */     this.dataEstinTitolo = titolo;
/*  25 */     this.frequenza = frequenza;
/*  26 */     this.matriceTransUtenteIdTit = tit2;
/*  27 */     this.nomeTit = tit3;
/*  28 */     this.noteTit = tit4;
/*  29 */     this.prevedeCedola = cedola;
/*  30 */     this.progressivoTit = tit5;
/*  31 */     this.societaDistr = distr;
/*  32 */     this.tassoCedola = cedola2;
/*     */   }
/*     */ 
/*     */   
/*     */   public WpTitoli() {}
/*     */ 
/*     */   
/*     */   public WpTitoli(Set clientegen, Integer id, Set intermediario, Set prodotto, String tipo) {
/*  40 */     super(clientegen, id, intermediario, prodotto, tipo);
/*     */   }
/*     */   
/*     */   public String getBancaTit() {
/*  44 */     return this.bancaTit;
/*     */   }
/*     */   public void setBancaTit(String bancaTit) {
/*  47 */     this.bancaTit = bancaTit;
/*     */   }
/*     */   public Date getDataEstinTitolo() {
/*  50 */     return this.dataEstinTitolo;
/*     */   }
/*     */   public void setDataEstinTitolo(Date dataEstinTitolo) {
/*  53 */     this.dataEstinTitolo = dataEstinTitolo;
/*     */   }
/*     */   public String getFrequenza() {
/*  56 */     return this.frequenza;
/*     */   }
/*     */   public void setFrequenza(String frequenza) {
/*  59 */     this.frequenza = frequenza;
/*     */   }
/*     */   public Integer getMatriceTransUtenteIdTit() {
/*  62 */     return this.matriceTransUtenteIdTit;
/*     */   }
/*     */   public void setMatriceTransUtenteIdTit(Integer matriceTransUtenteIdTit) {
/*  65 */     this.matriceTransUtenteIdTit = matriceTransUtenteIdTit;
/*     */   }
/*     */   public String getNomeTit() {
/*  68 */     return this.nomeTit;
/*     */   }
/*     */   public void setNomeTit(String nomeTit) {
/*  71 */     this.nomeTit = nomeTit;
/*     */   }
/*     */   public String getNoteTit() {
/*  74 */     return this.noteTit;
/*     */   }
/*     */   public void setNoteTit(String noteTit) {
/*  77 */     this.noteTit = noteTit;
/*     */   }
/*     */   public String getPrevedeCedola() {
/*  80 */     return this.prevedeCedola;
/*     */   }
/*     */   public void setPrevedeCedola(String prevedeCedola) {
/*  83 */     this.prevedeCedola = prevedeCedola;
/*     */   }
/*     */   public Integer getProgressivoTit() {
/*  86 */     return this.progressivoTit;
/*     */   }
/*     */   public void setProgressivoTit(Integer progressivoTit) {
/*  89 */     this.progressivoTit = progressivoTit;
/*     */   }
/*     */   public String getSocietaDistr() {
/*  92 */     return this.societaDistr;
/*     */   }
/*     */   public void setSocietaDistr(String societaDistr) {
/*  95 */     this.societaDistr = societaDistr;
/*     */   }
/*     */   public Integer getTassoCedola() {
/*  98 */     return this.tassoCedola;
/*     */   }
/*     */   public void setTassoCedola(Integer tassoCedola) {
/* 101 */     this.tassoCedola = tassoCedola;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpTitoli.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */