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
/*     */ public class FinRuolo
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   public static final String RAPPRESENTANTE_LEGALE = "RPL";
/*     */   public static final String DELEGATO = "DLG";
/*     */   public static final String TUTORE = "TUT";
/*     */   public static final String TIPO_ASSOCIATO_CONSORZIATO = "AC";
/*     */   public static final String TIPO_ALTRE_CONTROPARTI_INTERESSANTI = "ACI";
/*     */   public static final String TIPO_ALTRI_FRUITORI_PLURIMO = "AFP";
/*     */   public static final String TIPO_ALTRI_PARTECIPANTI_AL_POOL = "APP";
/*     */   public static final String TIPO_BENEFICIARIO = "B";
/*     */   public static final String TIPO_BANCA_CAPOFILA = "BC";
/*     */   public static final String TIPO_CURATORE = "C";
/*     */   public static final String TIPO_CURATORE_FALLIMENTARE = "CF";
/*     */   public static final String TIPO_DELEGATO = "D";
/*     */   public static final String TIPO_DELEGATO_DI_SPORTELLO = "DS";
/*     */   public static final String TIPO_DELEGATO_VIRTUALE = "DV";
/*     */   public static final String TIPO_GARANTE = "G";
/*     */   public static final String TIPO_LEGALE_RAPPRESENTANTE = "LR";
/*     */   public static final String TIPO_NDG_CUMULATO = "NC";
/*     */   public static final String TIPO_NDG_DEL_SETTORE = "NS";
/*     */   public static final String TIPO_RAPPRESENTATO_DA = "RD";
/*     */   public static final String TIPO_SETTORE_DI_COMPETENZA = "SC";
/*     */   public static final String TIPO_SOCIO_ILLIM_REPONSABILE = "SIR";
/*     */   public static final String TIPO_TUTORE = "T";
/*     */   public static final String TIPO_TITOLARE_DITTA_INDIVIDUALE = "TDI";
/*     */   public static final String TIPO_USUFRUTTUARIO = "U";
/*     */   public static final String TIPO_PROCURATORE = "P";
/*     */   private Integer ruoloId;
/*     */   private FinContratto contratto;
/*     */   private String ruolo;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private FinSoggetto soggettoCollegato;
/*     */   private FinSoggetto soggetto;
/*     */   
/*     */   public FinRuolo(Integer id, Date fine, Date inizio, Date inserimento, String ruolo, Integer id2, Integer collegamento, String inserimento2) {
/*  74 */     this.dataFine = fine;
/*  75 */     this.dataInizio = inizio;
/*  76 */     this.dataInserimento = inserimento;
/*  77 */     this.ruolo = ruolo;
/*  78 */     this.ruoloId = id2;
/*     */ 
/*     */     
/*  81 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinRuolo() {}
/*     */ 
/*     */   
/*     */   public Integer getRuoloId() {
/*  89 */     return this.ruoloId;
/*     */   }
/*     */   
/*     */   public void setRuoloId(Integer ruoloId) {
/*  93 */     this.ruoloId = ruoloId;
/*     */   }
/*     */   
/*     */   public String getRuolo() {
/*  97 */     return this.ruolo;
/*     */   }
/*     */   
/*     */   public void setRuolo(String ruolo) {
/* 101 */     this.ruolo = ruolo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 109 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 113 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 119 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 123 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 129 */     return (new ToStringBuilder(this)).append("ruoloId", getRuoloId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataFine() {
/* 135 */     return this.dataFine;
/*     */   }
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/* 139 */     this.dataFine = dataFine;
/*     */   }
/*     */   
/*     */   public Date getDataInizio() {
/* 143 */     return this.dataInizio;
/*     */   }
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/* 147 */     this.dataInizio = dataInizio;
/*     */   }
/*     */   
/*     */   public FinSoggetto getSoggetto() {
/* 151 */     return this.soggetto;
/*     */   }
/*     */   
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/* 155 */     this.soggetto = soggetto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinContratto getContratto() {
/* 162 */     return this.contratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContratto(FinContratto contratto) {
/* 169 */     this.contratto = contratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSoggetto getSoggettoCollegato() {
/* 176 */     return this.soggettoCollegato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSoggettoCollegato(FinSoggetto soggettoCollegato) {
/* 183 */     this.soggettoCollegato = soggettoCollegato;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinRuolo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */