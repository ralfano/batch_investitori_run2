/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ public class FlxSecSaldiMediAnnuali
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codAgeProm;
/*     */   private String codRete;
/*     */   private String codCompagnia;
/*     */   private String conto;
/*     */   private Double giacenza;
/*     */   private Double fido;
/*     */   private Date dataRiferimento;
/*     */   private String flagSubagente;
/*     */   private String flagSinergia;
/*     */   private Double delta;
/*     */   private String flagEstinzione;
/*     */   private String filiale;
/*     */   private String codProd;
/*     */   private String convenzione;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElaborazione;
/*     */   
/*     */   public FlxSecSaldiMediAnnuali(String prom, String compagnia, String prod, String rete, String conto, String convenzione, Date caricamento, Date elaborazione, Date riferimento, Double delta, String errore, Double fido, String filiale, String estinzione, String sinergia, String subagente, Integer id, Double giacenza, String istanza, String elab) {
/*  34 */     this.codAgeProm = prom;
/*  35 */     this.codCompagnia = compagnia;
/*  36 */     this.codProd = prod;
/*  37 */     this.codRete = rete;
/*  38 */     this.conto = conto;
/*  39 */     this.convenzione = convenzione;
/*  40 */     this.dataCaricamento = caricamento;
/*  41 */     this.dataElaborazione = elaborazione;
/*  42 */     this.dataRiferimento = riferimento;
/*  43 */     this.delta = delta;
/*  44 */     this.descrizioneErrore = errore;
/*  45 */     this.fido = fido;
/*  46 */     this.filiale = filiale;
/*  47 */     this.flagEstinzione = estinzione;
/*  48 */     this.flagSinergia = sinergia;
/*  49 */     this.flagSubagente = subagente;
/*  50 */     this.flxId = id;
/*  51 */     this.giacenza = giacenza;
/*  52 */     this.istanza = istanza;
/*  53 */     this.statoElab = elab;
/*     */   }
/*     */   
/*     */   public Date getDataElaborazione() {
/*  57 */     return this.dataElaborazione;
/*     */   }
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/*  61 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  65 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  69 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxSecSaldiMediAnnuali() {}
/*     */ 
/*     */   
/*     */   public String getCodAgeProm() {
/*  77 */     return this.codAgeProm;
/*     */   }
/*     */   
/*     */   public void setCodAgeProm(String codAgeProm) {
/*  81 */     this.codAgeProm = codAgeProm;
/*     */   }
/*     */   
/*     */   public String getCodCompagnia() {
/*  85 */     return this.codCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodCompagnia(String codCompagnia) {
/*  89 */     this.codCompagnia = codCompagnia;
/*     */   }
/*     */   
/*     */   public String getCodProd() {
/*  93 */     return this.codProd;
/*     */   }
/*     */   
/*     */   public void setCodProd(String codProd) {
/*  97 */     this.codProd = codProd;
/*     */   }
/*     */   
/*     */   public String getCodRete() {
/* 101 */     return this.codRete;
/*     */   }
/*     */   
/*     */   public void setCodRete(String codRete) {
/* 105 */     this.codRete = codRete;
/*     */   }
/*     */   
/*     */   public String getConto() {
/* 109 */     return this.conto;
/*     */   }
/*     */   
/*     */   public void setConto(String conto) {
/* 113 */     this.conto = conto;
/*     */   }
/*     */   
/*     */   public String getConvenzione() {
/* 117 */     return this.convenzione;
/*     */   }
/*     */   
/*     */   public void setConvenzione(String convenzione) {
/* 121 */     this.convenzione = convenzione;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/* 125 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 129 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   
/*     */   public Date getDataRiferimento() {
/* 133 */     return this.dataRiferimento;
/*     */   }
/*     */   
/*     */   public void setDataRiferimento(Date dataRiferimento) {
/* 137 */     this.dataRiferimento = dataRiferimento;
/*     */   }
/*     */   
/*     */   public Double getDelta() {
/* 141 */     return this.delta;
/*     */   }
/*     */   
/*     */   public void setDelta(Double delta) {
/* 145 */     this.delta = delta;
/*     */   }
/*     */   
/*     */   public Double getFido() {
/* 149 */     return this.fido;
/*     */   }
/*     */   
/*     */   public void setFido(Double fido) {
/* 153 */     this.fido = fido;
/*     */   }
/*     */   
/*     */   public String getFiliale() {
/* 157 */     return this.filiale;
/*     */   }
/*     */   
/*     */   public void setFiliale(String filiale) {
/* 161 */     this.filiale = filiale;
/*     */   }
/*     */   
/*     */   public String getFlagEstinzione() {
/* 165 */     return this.flagEstinzione;
/*     */   }
/*     */   
/*     */   public void setFlagEstinzione(String flagEstinzione) {
/* 169 */     this.flagEstinzione = flagEstinzione;
/*     */   }
/*     */   
/*     */   public String getFlagSinergia() {
/* 173 */     return this.flagSinergia;
/*     */   }
/*     */   
/*     */   public void setFlagSinergia(String flagSinergia) {
/* 177 */     this.flagSinergia = flagSinergia;
/*     */   }
/*     */   
/*     */   public String getFlagSubagente() {
/* 181 */     return this.flagSubagente;
/*     */   }
/*     */   
/*     */   public void setFlagSubagente(String flagSubagente) {
/* 185 */     this.flagSubagente = flagSubagente;
/*     */   }
/*     */   
/*     */   public Integer getFlxId() {
/* 189 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 193 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public Double getGiacenza() {
/* 197 */     return this.giacenza;
/*     */   }
/*     */   
/*     */   public void setGiacenza(Double giacenza) {
/* 201 */     this.giacenza = giacenza;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 205 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 209 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 213 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 217 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecSaldiMediAnnuali(String prom, String compagnia, String prod, String rete, String conto, String convenzione, Date caricamento, Date riferimento, Double delta, Double fido, String filiale, String estinzione, String sinergia, String subagente, Integer id, Double giacenza, String istanza, String elab) {
/* 223 */     this.codAgeProm = prom;
/* 224 */     this.codCompagnia = compagnia;
/* 225 */     this.codProd = prod;
/* 226 */     this.codRete = rete;
/* 227 */     this.conto = conto;
/* 228 */     this.convenzione = convenzione;
/* 229 */     this.dataCaricamento = caricamento;
/* 230 */     this.dataRiferimento = riferimento;
/* 231 */     this.delta = delta;
/* 232 */     this.fido = fido;
/* 233 */     this.filiale = filiale;
/* 234 */     this.flagEstinzione = estinzione;
/* 235 */     this.flagSinergia = sinergia;
/* 236 */     this.flagSubagente = subagente;
/* 237 */     this.flxId = id;
/* 238 */     this.giacenza = giacenza;
/* 239 */     this.istanza = istanza;
/* 240 */     this.statoElab = elab;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecSaldiMediAnnuali.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */