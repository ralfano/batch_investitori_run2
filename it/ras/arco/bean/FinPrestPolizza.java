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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinPrestPolizza
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer prestPolizzaId;
/*     */   private Integer polizzaId;
/*     */   private Double prestIni;
/*     */   private Double percRival;
/*     */   private Double prestRendCa;
/*     */   private Double prestRendCu;
/*     */   private Double prestCapitCa;
/*     */   private Double prestCapitCu;
/*     */   private Double prestRendDiff;
/*     */   private Double prestCapDiff;
/*     */   private Double capitMatuInf;
/*     */   private Date dataRifRival;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinPrestPolizza(Double inf, Date inserimento, Date rival, Double rival2, Integer id, Double diff, Double ca, Double cu, Double ini, Integer id2, Double ca2, Double cu2, Double diff2, String inserimento2) {
/*  62 */     this.capitMatuInf = inf;
/*  63 */     this.dataInserimento = inserimento;
/*  64 */     this.dataRifRival = rival;
/*  65 */     this.percRival = rival2;
/*  66 */     this.polizzaId = id;
/*  67 */     this.prestCapDiff = diff;
/*  68 */     this.prestCapitCa = ca;
/*  69 */     this.prestCapitCu = cu;
/*  70 */     this.prestIni = ini;
/*  71 */     this.prestPolizzaId = id2;
/*  72 */     this.prestRendCa = ca2;
/*  73 */     this.prestRendCu = cu2;
/*  74 */     this.prestRendDiff = diff2;
/*  75 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinPrestPolizza() {}
/*     */ 
/*     */   
/*     */   public Integer getPrestPolizzaId() {
/*  83 */     return this.prestPolizzaId;
/*     */   }
/*     */   
/*     */   public void setPrestPolizzaId(Integer prestPolizzaId) {
/*  87 */     this.prestPolizzaId = prestPolizzaId;
/*     */   }
/*     */   
/*     */   public Integer getPolizzaId() {
/*  91 */     return this.polizzaId;
/*     */   }
/*     */   
/*     */   public void setPolizzaId(Integer polizzaId) {
/*  95 */     this.polizzaId = polizzaId;
/*     */   }
/*     */   
/*     */   public Double getPrestIni() {
/*  99 */     return this.prestIni;
/*     */   }
/*     */   
/*     */   public void setPrestIni(Double prestIni) {
/* 103 */     this.prestIni = prestIni;
/*     */   }
/*     */   
/*     */   public Double getPercRival() {
/* 107 */     return this.percRival;
/*     */   }
/*     */   
/*     */   public void setPercRival(Double percRival) {
/* 111 */     this.percRival = percRival;
/*     */   }
/*     */   
/*     */   public Double getPrestRendCa() {
/* 115 */     return this.prestRendCa;
/*     */   }
/*     */   
/*     */   public void setPrestRendCa(Double prestRendCa) {
/* 119 */     this.prestRendCa = prestRendCa;
/*     */   }
/*     */   
/*     */   public Double getPrestRendCu() {
/* 123 */     return this.prestRendCu;
/*     */   }
/*     */   
/*     */   public void setPrestRendCu(Double prestRendCu) {
/* 127 */     this.prestRendCu = prestRendCu;
/*     */   }
/*     */   
/*     */   public Double getPrestCapitCa() {
/* 131 */     return this.prestCapitCa;
/*     */   }
/*     */   
/*     */   public void setPrestCapitCa(Double prestCapitCa) {
/* 135 */     this.prestCapitCa = prestCapitCa;
/*     */   }
/*     */   
/*     */   public Double getPrestCapitCu() {
/* 139 */     return this.prestCapitCu;
/*     */   }
/*     */   
/*     */   public void setPrestCapitCu(Double prestCapitCu) {
/* 143 */     this.prestCapitCu = prestCapitCu;
/*     */   }
/*     */   
/*     */   public Double getPrestRendDiff() {
/* 147 */     return this.prestRendDiff;
/*     */   }
/*     */   
/*     */   public void setPrestRendDiff(Double prestRendDiff) {
/* 151 */     this.prestRendDiff = prestRendDiff;
/*     */   }
/*     */   
/*     */   public Double getPrestCapDiff() {
/* 155 */     return this.prestCapDiff;
/*     */   }
/*     */   
/*     */   public void setPrestCapDiff(Double prestCapDiff) {
/* 159 */     this.prestCapDiff = prestCapDiff;
/*     */   }
/*     */   
/*     */   public Double getCapitMatuInf() {
/* 163 */     return this.capitMatuInf;
/*     */   }
/*     */   
/*     */   public void setCapitMatuInf(Double capitMatuInf) {
/* 167 */     this.capitMatuInf = capitMatuInf;
/*     */   }
/*     */   
/*     */   public Date getDataRifRival() {
/* 171 */     return this.dataRifRival;
/*     */   }
/*     */   
/*     */   public void setDataRifRival(Date dataRifRival) {
/* 175 */     this.dataRifRival = dataRifRival;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 180 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 184 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 188 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 192 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 197 */     return (new ToStringBuilder(this)).append("prestPolizzaId", getPrestPolizzaId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPrestPolizza.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */