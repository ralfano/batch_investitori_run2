/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
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
/*     */ public class NormSoggettoMC
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer soggettoId;
/*     */   private String codMatchCodeNom1;
/*     */   private String codMatchCodeNom2;
/*     */   private String codMatchCodeDNas;
/*     */   private String codMatchCodeCFis;
/*     */   private String tipoSogg;
/*     */   private String codStriRic1;
/*     */   private String codStriRic2;
/*     */   private String codStriRic3;
/*     */   private String flgInco;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private FinSoggetto soggetto;
/*     */   
/*     */   public NormSoggettoMC(String fis, String nas, String nom1, String nom2, String ric1, String ric2, String ric3, Date inserimento, String inco, String sogg, String inserimento2) {
/*  54 */     this.codMatchCodeCFis = fis;
/*  55 */     this.codMatchCodeDNas = nas;
/*  56 */     this.codMatchCodeNom1 = nom1;
/*  57 */     this.codMatchCodeNom2 = nom2;
/*  58 */     this.codStriRic1 = ric1;
/*  59 */     this.codStriRic2 = ric2;
/*  60 */     this.codStriRic3 = ric3;
/*  61 */     this.dataInserimento = inserimento;
/*  62 */     this.flgInco = inco;
/*  63 */     this.tipoSogg = sogg;
/*  64 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */   
/*     */   public NormSoggettoMC() {}
/*     */ 
/*     */   
/*     */   public Integer getSoggettoId() {
/*  72 */     return this.soggettoId;
/*     */   }
/*     */   
/*     */   public void setSoggettoId(Integer soggettoId) {
/*  76 */     this.soggettoId = soggettoId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodMatchCodeCFis() {
/*  82 */     return this.codMatchCodeCFis;
/*     */   }
/*     */   
/*     */   public void setCodMatchCodeCFis(String codMatchCodeCFis) {
/*  86 */     this.codMatchCodeCFis = codMatchCodeCFis;
/*     */   }
/*     */   
/*     */   public String getCodMatchCodeDNas() {
/*  90 */     return this.codMatchCodeDNas;
/*     */   }
/*     */   
/*     */   public void setCodMatchCodeDNas(String codMatchCodeDNas) {
/*  94 */     this.codMatchCodeDNas = codMatchCodeDNas;
/*     */   }
/*     */   
/*     */   public String getCodMatchCodeNom1() {
/*  98 */     return this.codMatchCodeNom1;
/*     */   }
/*     */   
/*     */   public void setCodMatchCodeNom1(String codMatchCodeNom1) {
/* 102 */     this.codMatchCodeNom1 = codMatchCodeNom1;
/*     */   }
/*     */   
/*     */   public String getCodMatchCodeNom2() {
/* 106 */     return this.codMatchCodeNom2;
/*     */   }
/*     */   
/*     */   public void setCodMatchCodeNom2(String codMatchCodeNom2) {
/* 110 */     this.codMatchCodeNom2 = codMatchCodeNom2;
/*     */   }
/*     */   
/*     */   public String getCodStriRic1() {
/* 114 */     return this.codStriRic1;
/*     */   }
/*     */   
/*     */   public void setCodStriRic1(String codStriRic1) {
/* 118 */     this.codStriRic1 = codStriRic1;
/*     */   }
/*     */   
/*     */   public String getCodStriRic2() {
/* 122 */     return this.codStriRic2;
/*     */   }
/*     */   
/*     */   public void setCodStriRic2(String codStriRic2) {
/* 126 */     this.codStriRic2 = codStriRic2;
/*     */   }
/*     */   
/*     */   public String getCodStriRic3() {
/* 130 */     return this.codStriRic3;
/*     */   }
/*     */   
/*     */   public void setCodStriRic3(String codStriRic3) {
/* 134 */     this.codStriRic3 = codStriRic3;
/*     */   }
/*     */   
/*     */   public String getFlgInco() {
/* 138 */     return this.flgInco;
/*     */   }
/*     */   
/*     */   public void setFlgInco(String flgInco) {
/* 142 */     this.flgInco = flgInco;
/*     */   }
/*     */   
/*     */   public String getTipoSogg() {
/* 146 */     return this.tipoSogg;
/*     */   }
/*     */   
/*     */   public void setTipoSogg(String tipoSogg) {
/* 150 */     this.tipoSogg = tipoSogg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 156 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 160 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 166 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 170 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 176 */     return (new ToStringBuilder(this)).append("soggettoId", getSoggettoId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSoggetto getSoggetto() {
/* 182 */     return this.soggetto;
/*     */   }
/*     */   
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/* 186 */     this.soggetto = soggetto;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\NormSoggettoMC.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */