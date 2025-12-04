/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.EqualsBuilder;
/*     */ import org.apache.commons.lang.builder.HashCodeBuilder;
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
/*     */ public class FinProdottoLinea
/*     */   extends FinAutoGSTDValuesSettedBean
/*     */ {
/*     */   private Integer prodottoLineaId;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private FinProdotto prodotto;
/*     */   private FinAttivitaFinanziaria attFin;
/*     */   
/*     */   public FinProdottoLinea(FinAttivitaFinanziaria fin, Date fine, Date inizio, Date inserimento, FinProdotto prodotto, String inserimento2, Integer id) {
/*  43 */     this.attFin = fin;
/*  44 */     this.dataFine = fine;
/*  45 */     this.dataInizio = inizio;
/*  46 */     this.dataInserimento = inserimento;
/*  47 */     this.prodotto = prodotto;
/*  48 */     this.utenteInserimento = inserimento2;
/*  49 */     this.prodottoLineaId = id;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinProdottoLinea() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public FinProdottoLinea(FinAttivitaFinanziaria attFin) {
/*  60 */     this.attFin = attFin;
/*     */   }
/*     */   
/*     */   public Date getDataInizio() {
/*  64 */     return this.dataInizio;
/*     */   }
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/*  68 */     this.dataInizio = dataInizio;
/*     */   }
/*     */   
/*     */   public Date getDataFine() {
/*  72 */     return this.dataFine;
/*     */   }
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/*  76 */     this.dataFine = dataFine;
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinProdotto getProdotto() {
/* 120 */     return this.prodotto;
/*     */   }
/*     */   
/*     */   public void setProdotto(FinProdotto prodotto) {
/* 124 */     this.prodotto = prodotto;
/*     */   }
/*     */   
/*     */   public FinAttivitaFinanziaria getAttFin() {
/* 128 */     return this.attFin;
/*     */   }
/*     */   
/*     */   public void setAttFin(FinAttivitaFinanziaria attFin) {
/* 132 */     this.attFin = attFin;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 136 */     return (new ToStringBuilder(this)).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/* 143 */     if (!(obj instanceof FinProdottoLinea))
/*     */     {
/* 145 */       return false;
/*     */     }
/* 147 */     if (this == obj)
/*     */     {
/* 149 */       return true;
/*     */     }
/*     */     
/* 152 */     FinProdottoLinea prodLinea = (FinProdottoLinea)obj;
/* 153 */     EqualsBuilder comparator = new EqualsBuilder();
/*     */     
/* 155 */     if (this.attFin != null) {
/* 156 */       comparator.append(this.attFin, prodLinea.attFin);
/*     */     }
/* 158 */     if (this.prodotto != null) {
/* 159 */       comparator.append(this.prodotto, prodLinea.prodotto);
/*     */     }
/* 161 */     return comparator.isEquals();
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 166 */     HashCodeBuilder hBuilder = new HashCodeBuilder(1, 3);
/*     */     
/* 168 */     if (this.attFin != null) {
/* 169 */       hBuilder.append(this.attFin.hashCode());
/*     */     }
/* 171 */     if (this.prodotto != null) {
/* 172 */       hBuilder.append(this.prodotto.hashCode());
/*     */     }
/* 174 */     return hBuilder.toHashCode();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void accept(IGSTDInitVisitor visitor) {
/* 183 */     super.accept(visitor);
/*     */     
/* 185 */     if (getAttFin() != null) {
/*     */       
/* 187 */       FinAttivitaFinanziaria element = getAttFin();
/* 188 */       element.accept(visitor);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getProdottoLineaId() {
/* 197 */     return this.prodottoLineaId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProdottoLineaId(Integer prodottoLineaId) {
/* 205 */     this.prodottoLineaId = prodottoLineaId;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinProdottoLinea.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */