/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class FlxSecMovimentiCC
/*     */ {
/*     */   private Integer flxID;
/*     */   private String filialeRapporto;
/*     */   private String catRapporto;
/*     */   private String numRapporto;
/*     */   private Date dataContabile;
/*     */   private Date dataValuta;
/*     */   private String divisa;
/*     */   private Double importo;
/*     */   private String causale;
/*     */   private String descrizioneOperazione;
/*     */   private String descrizioneMovimento;
/*     */   private String numOper;
/*     */   private Date dataOperazione;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElaborazione;
/*     */   private Date dataCaricamento;
/*     */   private String estero;
/*     */   private String sottocodiceRapporto;
/*     */   private Date dataRegolamento;
/*     */   
/*     */   public Date getDataRegolamento() {
/*  30 */     return this.dataRegolamento;
/*     */   }
/*     */   
/*     */   public void setDataRegolamento(Date dataRegolamento) {
/*  34 */     this.dataRegolamento = dataRegolamento;
/*     */   }
/*     */   
/*     */   public String getEstero() {
/*  38 */     return this.estero;
/*     */   }
/*     */   
/*     */   public void setEstero(String estero) {
/*  42 */     this.estero = estero;
/*     */   }
/*     */   
/*     */   public String getSottocodiceRapporto() {
/*  46 */     return this.sottocodiceRapporto;
/*     */   }
/*     */   
/*     */   public void setSottocodiceRapporto(String sottocodiceRapporto) {
/*  50 */     this.sottocodiceRapporto = sottocodiceRapporto;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/*  54 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/*  58 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecMovimentiCC(Date dataReg, String sottoRapporto, String estero1, String rapporto, String causale, Date contabile, Date elaborazione, Date operazione, Date valuta, String descrizione, String errore, String divisa, String rapporto2, Integer flxid, Double importo, String istanza, String oper, String rapporto3, String elab) {
/*  64 */     this.dataRegolamento = dataReg;
/*  65 */     this.sottocodiceRapporto = sottoRapporto;
/*  66 */     this.estero = estero1;
/*  67 */     this.catRapporto = rapporto;
/*  68 */     this.causale = causale;
/*  69 */     this.dataContabile = contabile;
/*  70 */     this.dataElaborazione = elaborazione;
/*  71 */     this.dataOperazione = operazione;
/*  72 */     this.dataValuta = valuta;
/*  73 */     this.descrizioneOperazione = descrizione;
/*  74 */     this.descrizioneErrore = errore;
/*  75 */     this.divisa = divisa;
/*  76 */     this.filialeRapporto = rapporto2;
/*  77 */     this.flxID = flxid;
/*  78 */     this.importo = importo;
/*  79 */     this.istanza = istanza;
/*  80 */     this.numOper = oper;
/*  81 */     this.numRapporto = rapporto3;
/*  82 */     this.statoElab = elab;
/*     */   }
/*     */   
/*     */   public Date getDataElaborazione() {
/*  86 */     return this.dataElaborazione;
/*     */   }
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/*  90 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  94 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  98 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecMovimentiCC() {}
/*     */ 
/*     */   
/*     */   public String getCatRapporto() {
/* 107 */     return this.catRapporto;
/*     */   }
/*     */   
/*     */   public void setCatRapporto(String catRapporto) {
/* 111 */     this.catRapporto = catRapporto;
/*     */   }
/*     */   
/*     */   public String getCausale() {
/* 115 */     return this.causale;
/*     */   }
/*     */   
/*     */   public void setCausale(String causale) {
/* 119 */     this.causale = causale;
/*     */   }
/*     */   
/*     */   public Date getDataContabile() {
/* 123 */     return this.dataContabile;
/*     */   }
/*     */   
/*     */   public void setDataContabile(Date dataContabile) {
/* 127 */     this.dataContabile = dataContabile;
/*     */   }
/*     */   
/*     */   public Date getDataOperazione() {
/* 131 */     return this.dataOperazione;
/*     */   }
/*     */   
/*     */   public void setDataOperazione(Date dataOperazione) {
/* 135 */     this.dataOperazione = dataOperazione;
/*     */   }
/*     */   
/*     */   public Date getDataValuta() {
/* 139 */     return this.dataValuta;
/*     */   }
/*     */   
/*     */   public void setDataValuta(Date dataValuta) {
/* 143 */     this.dataValuta = dataValuta;
/*     */   }
/*     */   
/*     */   public String getDescrizioneOperazione() {
/* 147 */     return this.descrizioneOperazione;
/*     */   }
/*     */   
/*     */   public void setDescrizioneOperazione(String descrizione) {
/* 151 */     this.descrizioneOperazione = descrizione;
/*     */   }
/*     */   
/*     */   public String getDivisa() {
/* 155 */     return this.divisa;
/*     */   }
/*     */   
/*     */   public void setDivisa(String divisa) {
/* 159 */     this.divisa = divisa;
/*     */   }
/*     */   
/*     */   public String getFilialeRapporto() {
/* 163 */     return this.filialeRapporto;
/*     */   }
/*     */   
/*     */   public void setFilialeRapporto(String filialeRapporto) {
/* 167 */     this.filialeRapporto = filialeRapporto;
/*     */   }
/*     */   
/*     */   public Integer getFlxID() {
/* 171 */     return this.flxID;
/*     */   }
/*     */   
/*     */   public void setFlxID(Integer flxID) {
/* 175 */     this.flxID = flxID;
/*     */   }
/*     */   
/*     */   public Double getImporto() {
/* 179 */     return this.importo;
/*     */   }
/*     */   
/*     */   public void setImporto(Double importo) {
/* 183 */     this.importo = importo;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 187 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 191 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getNumOper() {
/* 195 */     return this.numOper;
/*     */   }
/*     */   
/*     */   public void setNumOper(String numOper) {
/* 199 */     this.numOper = numOper;
/*     */   }
/*     */   
/*     */   public String getNumRapporto() {
/* 203 */     return this.numRapporto;
/*     */   }
/*     */   
/*     */   public void setNumRapporto(String numRapporto) {
/* 207 */     this.numRapporto = numRapporto;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 211 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 215 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecMovimentiCC(String rapporto, String causale, Date contabile, Date operazione, Date valuta, String descrizione, String divisa, String rapporto2, Integer flxid, Double importo, String istanza, String oper, String rapporto3, String elab) {
/* 221 */     this.catRapporto = rapporto;
/* 222 */     this.causale = causale;
/* 223 */     this.dataContabile = contabile;
/* 224 */     this.dataOperazione = operazione;
/* 225 */     this.dataValuta = valuta;
/* 226 */     this.descrizioneOperazione = descrizione;
/* 227 */     this.divisa = divisa;
/* 228 */     this.filialeRapporto = rapporto2;
/* 229 */     this.flxID = flxid;
/* 230 */     this.importo = importo;
/* 231 */     this.istanza = istanza;
/* 232 */     this.numOper = oper;
/* 233 */     this.numRapporto = rapporto3;
/* 234 */     this.statoElab = elab;
/*     */   }
/*     */   
/*     */   public String getDescrizioneMovimento() {
/* 238 */     return this.descrizioneMovimento;
/*     */   }
/*     */   
/*     */   public void setDescrizioneMovimento(String descrizioneMovimento) {
/* 242 */     this.descrizioneMovimento = descrizioneMovimento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecMovimentiCC.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */