/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinSaldoPeriodico
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer saldoPeriodicoId;
/*     */   private Integer contrattoId;
/*     */   private Integer periodo;
/*     */   private String tipoContratto;
/*     */   private Double giacenza;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private Integer annoRif;
/*     */   private Integer meseRif;
/*     */   private Integer giornoRif;
/*     */   private String flagSubagente;
/*     */   private String flagSinergia;
/*     */   private Double delta;
/*     */   private String flagEstinzione;
/*     */   private Double commissioni;
/*     */   private Double spese;
/*     */   private Date datval;
/*     */   private String proswi;
/*     */   private Double pernav;
/*     */   private Double fido;
/*     */   private Double importo;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimento;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private String userUltimaModificaSlave;
/*     */   private String proceduraUltimaModificaSlave;
/*     */   private Date dataUltimaModificaSlave;
/*     */   private String tipoUltimaModificaSlave;
/*     */   
/*     */   public FinSaldoPeriodico() {}
/*     */   
/*     */   public Integer getAnnoRif() {
/*  49 */     return this.annoRif;
/*     */   }
/*     */   
/*     */   public void setAnnoRif(Integer annoRif) {
/*  53 */     this.annoRif = annoRif;
/*     */   }
/*     */   
/*     */   public Double getCommissioni() {
/*  57 */     return this.commissioni;
/*     */   }
/*     */   
/*     */   public void setCommissioni(Double commissioni) {
/*  61 */     this.commissioni = commissioni;
/*     */   }
/*     */   
/*     */   public Integer getContrattoId() {
/*  65 */     return this.contrattoId;
/*     */   }
/*     */   
/*     */   public void setContrattoId(Integer contrattoId) {
/*  69 */     this.contrattoId = contrattoId;
/*     */   }
/*     */   
/*     */   public Date getDataFine() {
/*  73 */     return this.dataFine;
/*     */   }
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/*  77 */     this.dataFine = dataFine;
/*     */   }
/*     */   
/*     */   public Date getDataInizio() {
/*  81 */     return this.dataInizio;
/*     */   }
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/*  85 */     this.dataInizio = dataInizio;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/*  89 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  93 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public Date getDataUltimaModifica() {
/*  97 */     return this.dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/* 101 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public Date getDataUltimaModificaSlave() {
/* 105 */     return this.dataUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaSlave(Date dataUltimaModificaSlave) {
/* 109 */     this.dataUltimaModificaSlave = dataUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public Date getDatval() {
/* 113 */     return this.datval;
/*     */   }
/*     */   
/*     */   public void setDatval(Date datval) {
/* 117 */     this.datval = datval;
/*     */   }
/*     */   
/*     */   public Double getDelta() {
/* 121 */     return this.delta;
/*     */   }
/*     */   
/*     */   public void setDelta(Double delta) {
/* 125 */     this.delta = delta;
/*     */   }
/*     */   
/*     */   public Double getFido() {
/* 129 */     return this.fido;
/*     */   }
/*     */   
/*     */   public void setFido(Double fido) {
/* 133 */     this.fido = fido;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/* 137 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 141 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   
/*     */   public String getFlagEstinzione() {
/* 145 */     return this.flagEstinzione;
/*     */   }
/*     */   
/*     */   public void setFlagEstinzione(String flagEstinzione) {
/* 149 */     this.flagEstinzione = flagEstinzione;
/*     */   }
/*     */   
/*     */   public String getFlagSinergia() {
/* 153 */     return this.flagSinergia;
/*     */   }
/*     */   
/*     */   public void setFlagSinergia(String flagSinergia) {
/* 157 */     this.flagSinergia = flagSinergia;
/*     */   }
/*     */   
/*     */   public String getFlagSubagente() {
/* 161 */     return this.flagSubagente;
/*     */   }
/*     */   
/*     */   public void setFlagSubagente(String flagSubagente) {
/* 165 */     this.flagSubagente = flagSubagente;
/*     */   }
/*     */   
/*     */   public Double getGiacenza() {
/* 169 */     return this.giacenza;
/*     */   }
/*     */   
/*     */   public void setGiacenza(Double giacenza) {
/* 173 */     this.giacenza = giacenza;
/*     */   }
/*     */   
/*     */   public Integer getGiornoRif() {
/* 177 */     return this.giornoRif;
/*     */   }
/*     */   
/*     */   public void setGiornoRif(Integer giornoRif) {
/* 181 */     this.giornoRif = giornoRif;
/*     */   }
/*     */   
/*     */   public Integer getMeseRif() {
/* 185 */     return this.meseRif;
/*     */   }
/*     */   
/*     */   public void setMeseRif(Integer meseRif) {
/* 189 */     this.meseRif = meseRif;
/*     */   }
/*     */   
/*     */   public Integer getPeriodo() {
/* 193 */     return this.periodo;
/*     */   }
/*     */   
/*     */   public void setPeriodo(Integer periodo) {
/* 197 */     this.periodo = periodo;
/*     */   }
/*     */   
/*     */   public Double getPernav() {
/* 201 */     return this.pernav;
/*     */   }
/*     */   
/*     */   public void setPernav(Double pernav) {
/* 205 */     this.pernav = pernav;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/* 209 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 213 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModificaSlave() {
/* 217 */     return this.proceduraUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/* 221 */     this.proceduraUltimaModificaSlave = proceduraUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getProswi() {
/* 225 */     return this.proswi;
/*     */   }
/*     */   
/*     */   public void setProswi(String proswi) {
/* 229 */     this.proswi = proswi;
/*     */   }
/*     */   
/*     */   public Integer getSaldoPeriodicoId() {
/* 233 */     return this.saldoPeriodicoId;
/*     */   }
/*     */   
/*     */   public void setSaldoPeriodicoId(Integer saldoPeriodicoId) {
/* 237 */     this.saldoPeriodicoId = saldoPeriodicoId;
/*     */   }
/*     */   
/*     */   public Double getSpese() {
/* 241 */     return this.spese;
/*     */   }
/*     */   
/*     */   public void setSpese(Double spese) {
/* 245 */     this.spese = spese;
/*     */   }
/*     */   
/*     */   public String getTipoContratto() {
/* 249 */     return this.tipoContratto;
/*     */   }
/*     */   
/*     */   public void setTipoContratto(String tipoContratto) {
/* 253 */     this.tipoContratto = tipoContratto;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 257 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 261 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModificaSlave() {
/* 265 */     return this.tipoUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModificaSlave(String tipoUltimaModificaSlave) {
/* 269 */     this.tipoUltimaModificaSlave = tipoUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 273 */     return this.userUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 277 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModificaSlave() {
/* 281 */     return this.userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/* 285 */     this.userUltimaModificaSlave = userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 289 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 293 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSaldoPeriodico(Integer rif, Double commissioni, Integer id, Date fine, Date inizio, Date inserimento, Date modifica, Date slave, Date datval, Double delta, Double fido, String esistenza, String estinzione, String sinergia, String subagente, Double giacenza, Integer rif2, Integer rif3, Integer periodo, Double pernav, String modifica2, String slave2, String proswi, Integer id2, Double spese, String contratto, String modifica3, String slave3, String modifica4, String slave4, String inserimento2) {
/* 299 */     this.annoRif = rif;
/* 300 */     this.commissioni = commissioni;
/* 301 */     this.contrattoId = id;
/* 302 */     this.dataFine = fine;
/* 303 */     this.dataInizio = inizio;
/* 304 */     this.dataInserimento = inserimento;
/* 305 */     this.dataUltimaModifica = modifica;
/* 306 */     this.dataUltimaModificaSlave = slave;
/* 307 */     this.datval = datval;
/* 308 */     this.delta = delta;
/* 309 */     this.fido = fido;
/* 310 */     this.flagEsistenza = esistenza;
/* 311 */     this.flagEstinzione = estinzione;
/* 312 */     this.flagSinergia = sinergia;
/* 313 */     this.flagSubagente = subagente;
/* 314 */     this.giacenza = giacenza;
/* 315 */     this.giornoRif = rif2;
/* 316 */     this.meseRif = rif3;
/* 317 */     this.periodo = periodo;
/* 318 */     this.pernav = pernav;
/* 319 */     this.proceduraUltimaModifica = modifica2;
/* 320 */     this.proceduraUltimaModificaSlave = slave2;
/* 321 */     this.proswi = proswi;
/* 322 */     this.saldoPeriodicoId = id2;
/* 323 */     this.spese = spese;
/* 324 */     this.tipoContratto = contratto;
/* 325 */     this.tipoUltimaModifica = modifica3;
/* 326 */     this.tipoUltimaModificaSlave = slave3;
/* 327 */     this.userUltimaModifica = modifica4;
/* 328 */     this.userUltimaModificaSlave = slave4;
/* 329 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */   
/*     */   public Double getImporto() {
/* 333 */     return this.importo;
/*     */   }
/*     */   
/*     */   public void setImporto(Double importo) {
/* 337 */     this.importo = importo;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinSaldoPeriodico.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */