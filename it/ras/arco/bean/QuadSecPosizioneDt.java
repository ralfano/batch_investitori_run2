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
/*     */ public class QuadSecPosizioneDt
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Integer posizioneId;
/*     */   private Integer contrattoId;
/*     */   private Integer soggettoId;
/*     */   private String sottodossier;
/*     */   private Date quadDataVal;
/*     */   private Date finPosDataVal;
/*     */   private Date dataOrdine;
/*     */   private Double quadCtv;
/*     */   private Double finPosQuadCtv;
/*     */   private Double quadCambioMedio;
/*     */   private Double finPosCambioMedioC;
/*     */   private Double quadQuantita;
/*     */   private Double finPosQuantita;
/*     */   private String stato;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public QuadSecPosizioneDt() {}
/*     */   
/*     */   public QuadSecPosizioneDt(Integer id, Date inserimento, Date ordine, Double medioC, Date val, Double ctv, Double quantita, Integer id2, Integer id3, Double medio, Double ctv2, Date val2, Double quantita2, Integer id4, String sottodossier, String stato, String inserimento2) {
/*  59 */     this.contrattoId = id;
/*  60 */     this.dataInserimento = inserimento;
/*  61 */     this.dataOrdine = ordine;
/*  62 */     this.finPosCambioMedioC = medioC;
/*  63 */     this.finPosDataVal = val;
/*  64 */     this.finPosQuadCtv = ctv;
/*  65 */     this.finPosQuantita = quantita;
/*  66 */     this.flxId = id2;
/*  67 */     this.posizioneId = id3;
/*  68 */     this.quadCambioMedio = medio;
/*  69 */     this.quadCtv = ctv2;
/*  70 */     this.quadDataVal = val2;
/*  71 */     this.quadQuantita = quantita2;
/*  72 */     this.soggettoId = id4;
/*  73 */     this.sottodossier = sottodossier;
/*  74 */     this.stato = stato;
/*  75 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getContrattoId() {
/*  81 */     return this.contrattoId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContrattoId(Integer contrattoId) {
/*  87 */     this.contrattoId = contrattoId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/*  93 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  99 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataOrdine() {
/* 105 */     return this.dataOrdine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataOrdine(Date dataOrdine) {
/* 111 */     this.dataOrdine = dataOrdine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getFinPosCambioMedioC() {
/* 117 */     return this.finPosCambioMedioC;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFinPosCambioMedioC(Double finPosCambioMedioC) {
/* 123 */     this.finPosCambioMedioC = finPosCambioMedioC;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getFinPosDataVal() {
/* 129 */     return this.finPosDataVal;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFinPosDataVal(Date finPosDataVal) {
/* 135 */     this.finPosDataVal = finPosDataVal;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getFinPosQuadCtv() {
/* 141 */     return this.finPosQuadCtv;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFinPosQuadCtv(Double finPosQuadCtv) {
/* 147 */     this.finPosQuadCtv = finPosQuadCtv;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getFinPosQuantita() {
/* 153 */     return this.finPosQuantita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFinPosQuantita(Double finPosQuantita) {
/* 159 */     this.finPosQuantita = finPosQuantita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 165 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 171 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getPosizioneId() {
/* 177 */     return this.posizioneId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPosizioneId(Integer posizioneId) {
/* 183 */     this.posizioneId = posizioneId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getQuadCambioMedio() {
/* 189 */     return this.quadCambioMedio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuadCambioMedio(Double quadCambioMedio) {
/* 195 */     this.quadCambioMedio = quadCambioMedio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getQuadCtv() {
/* 201 */     return this.quadCtv;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuadCtv(Double quadCtv) {
/* 207 */     this.quadCtv = quadCtv;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getQuadDataVal() {
/* 213 */     return this.quadDataVal;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuadDataVal(Date quadDataVal) {
/* 219 */     this.quadDataVal = quadDataVal;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getQuadQuantita() {
/* 225 */     return this.quadQuantita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuadQuantita(Double quadQuantita) {
/* 231 */     this.quadQuantita = quadQuantita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getSoggettoId() {
/* 237 */     return this.soggettoId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSoggettoId(Integer soggettoId) {
/* 243 */     this.soggettoId = soggettoId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSottodossier() {
/* 249 */     return this.sottodossier;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSottodossier(String sottodossier) {
/* 255 */     this.sottodossier = sottodossier;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStato() {
/* 261 */     return this.stato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStato(String stato) {
/* 267 */     this.stato = stato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 273 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 279 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\QuadSecPosizioneDt.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */