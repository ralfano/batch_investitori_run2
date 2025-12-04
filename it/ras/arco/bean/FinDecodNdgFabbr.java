/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Arrays;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
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
/*     */ public class FinDecodNdgFabbr
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   public static final String CODICE_FABBRICA_BNP = "BNP";
/*     */   public static final String CODICE_FABBRICA_BPU = "BPU";
/*     */   public static final String CODICE_FABBRICA_CITCO = "CIT";
/*     */   public static final String CODICE_FABBRICA_ANIMA = "ANM";
/*     */   public static final String CODICE_FABBRICA_RASBANK = "RBK";
/*     */   public static final String CODICE_FABBRICA_RAM = "RAM";
/*     */   public static final String CODICE_FABBRICA_SEC = "SEC";
/*     */   public static final int NDG_FABBR_SIZE = 20;
/*     */   public static final char FILLER_CHAR = '0';
/*     */   private Integer decodNdgFabbricaId;
/*     */   private String fabbrica;
/*     */   private String ndgFab;
/*     */   private Integer ultiPromoId;
/*     */   private String datiSupl;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private String tipo;
/*     */   private FinSoggetto soggetto;
/*     */   private Set decodContrattoNew;
/*     */   private Set decodContrattoOld;
/*     */   
/*     */   public FinDecodNdgFabbr(Integer cointestazioneId, String fabbrica, Integer soggettoId, String ndgFab, Integer ultiPromoId, String datiSupl, Date dataInserimento, String utenteInserimento, FinSoggetto soggetto) {
/*  63 */     this.fabbrica = fabbrica;
/*  64 */     this.ndgFab = ndgFab;
/*  65 */     this.ultiPromoId = ultiPromoId;
/*  66 */     this.datiSupl = datiSupl;
/*  67 */     this.dataInserimento = dataInserimento;
/*  68 */     this.utenteInserimento = utenteInserimento;
/*  69 */     this.soggetto = soggetto;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinDecodNdgFabbr() {}
/*     */ 
/*     */   
/*     */   public Integer getDecodNdgFabbricaId() {
/*  77 */     return this.decodNdgFabbricaId;
/*     */   }
/*     */   
/*     */   public void setDecodNdgFabbricaId(Integer decodNdgFabbricaId) {
/*  81 */     this.decodNdgFabbricaId = decodNdgFabbricaId;
/*     */   }
/*     */   
/*     */   public String getFabbrica() {
/*  85 */     return this.fabbrica;
/*     */   }
/*     */   
/*     */   public void setFabbrica(String fabbrica) {
/*  89 */     this.fabbrica = fabbrica;
/*     */   }
/*     */   
/*     */   public String getNdgFab() {
/*  93 */     return this.ndgFab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNdgFab(String ndgFab) {
/* 104 */     if (ndgFab == null) {
/* 105 */       ndgFab = "";
/*     */     }
/* 107 */     int size = 20 - ndgFab.length();
/* 108 */     if (size > 0) {
/* 109 */       char[] filler = new char[size];
/* 110 */       Arrays.fill(filler, '0');
/* 111 */       ndgFab = String.valueOf(filler) + ndgFab;
/*     */     } 
/* 113 */     this.ndgFab = ndgFab;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getUltiPromoId() {
/* 118 */     return this.ultiPromoId;
/*     */   }
/*     */   
/*     */   public void setUltiPromoId(Integer ultiPromoId) {
/* 122 */     this.ultiPromoId = ultiPromoId;
/*     */   }
/*     */   
/*     */   public String getDatiSupl() {
/* 126 */     return this.datiSupl;
/*     */   }
/*     */   
/*     */   public void setDatiSupl(String datiSupl) {
/* 130 */     this.datiSupl = datiSupl;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 134 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 138 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 142 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 146 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public FinSoggetto getSoggetto() {
/* 150 */     return this.soggetto;
/*     */   }
/*     */   
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/* 154 */     this.soggetto = soggetto;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 158 */     return (new ToStringBuilder(this)).append("decodNdgFabbricaId", getDecodNdgFabbricaId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipo() {
/* 167 */     return this.tipo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipo(String tipo) {
/* 174 */     this.tipo = tipo;
/*     */   }
/*     */   
/*     */   public Set getDecodContrattoNew() {
/* 178 */     return this.decodContrattoNew;
/*     */   }
/*     */   
/*     */   public void setDecodContrattoNew(Set decodContrattoNew) {
/* 182 */     this.decodContrattoNew = decodContrattoNew;
/*     */   }
/*     */   public Set getDecodContrattoOld() {
/* 185 */     return this.decodContrattoOld;
/*     */   }
/*     */   
/*     */   public void setDecodContrattoOld(Set decodContrattoOld) {
/* 189 */     this.decodContrattoOld = decodContrattoOld;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinDecodNdgFabbr.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */