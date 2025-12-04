/*     */ package it.ras.arco.bean.replica;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ public class ScpTotali
/*     */   extends RasORMBean
/*     */   implements Serializable {
/*     */   private ScpElenco elenco;
/*     */   private Integer scpNumber;
/*     */   private Integer totaliId;
/*     */   private Integer squadraId;
/*     */   private String tipoTotaleS;
/*     */   private String tipoProdottoT;
/*     */   private String areaProdottoT;
/*     */   private String sottoAreaProdottoT;
/*     */   private String areaTerzoLiv;
/*     */   private String tipologiaProdottoT;
/*     */   private Double totale;
/*     */   private String statoElaborazione;
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
/*     */   private Date dataEstrazione;
/*     */   private String flagDas;
/*     */   
/*     */   public String getAreaProdottoT() {
/*  37 */     return this.areaProdottoT;
/*     */   }
/*     */   public void setAreaProdottoT(String areaProdottoT) {
/*  40 */     this.areaProdottoT = areaProdottoT;
/*     */   }
/*     */   public String getAreaTerzoLiv() {
/*  43 */     return this.areaTerzoLiv;
/*     */   }
/*     */   public void setAreaTerzoLiv(String areaTerzoLiv) {
/*  46 */     this.areaTerzoLiv = areaTerzoLiv;
/*     */   }
/*     */   public Date getDataEstrazione() {
/*  49 */     return this.dataEstrazione;
/*     */   }
/*     */   public void setDataEstrazione(Date dataEstrazione) {
/*  52 */     this.dataEstrazione = dataEstrazione;
/*     */   }
/*     */   public Date getDataInserimento() {
/*  55 */     return this.dataInserimento;
/*     */   }
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  58 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   public Date getDataUltimaModifica() {
/*  61 */     return this.dataUltimaModifica;
/*     */   }
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/*  64 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   public Date getDataUltimaModificaSlave() {
/*  67 */     return this.dataUltimaModificaSlave;
/*     */   }
/*     */   public void setDataUltimaModificaSlave(Date dataUltimaModificaSlave) {
/*  70 */     this.dataUltimaModificaSlave = dataUltimaModificaSlave;
/*     */   }
/*     */   public ScpElenco getElenco() {
/*  73 */     return this.elenco;
/*     */   }
/*     */   public void setElenco(ScpElenco elenco) {
/*  76 */     this.elenco = elenco;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/*  80 */     return this.flagEsistenza;
/*     */   }
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/*  83 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   public String getProceduraUltimaModifica() {
/*  86 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/*  89 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   public String getProceduraUltimaModificaSlave() {
/*  92 */     return this.proceduraUltimaModificaSlave;
/*     */   }
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/*  95 */     this.proceduraUltimaModificaSlave = proceduraUltimaModificaSlave;
/*     */   }
/*     */   public Integer getScpNumber() {
/*  98 */     return this.scpNumber;
/*     */   }
/*     */   public void setScpNumber(Integer scpNumber) {
/* 101 */     this.scpNumber = scpNumber;
/*     */   }
/*     */   public String getSottoAreaProdottoT() {
/* 104 */     return this.sottoAreaProdottoT;
/*     */   }
/*     */   public void setSottoAreaProdottoT(String sottoAreaProdottoT) {
/* 107 */     this.sottoAreaProdottoT = sottoAreaProdottoT;
/*     */   }
/*     */   public Integer getSquadraId() {
/* 110 */     return this.squadraId;
/*     */   }
/*     */   public void setSquadraId(Integer squadraId) {
/* 113 */     this.squadraId = squadraId;
/*     */   }
/*     */   public String getStatoElaborazione() {
/* 116 */     return this.statoElaborazione;
/*     */   }
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 119 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   public String getTipologiaProdottoT() {
/* 122 */     return this.tipologiaProdottoT;
/*     */   }
/*     */   public void setTipologiaProdottoT(String tipologiaProdottoT) {
/* 125 */     this.tipologiaProdottoT = tipologiaProdottoT;
/*     */   }
/*     */   public String getTipoProdottoT() {
/* 128 */     return this.tipoProdottoT;
/*     */   }
/*     */   public void setTipoProdottoT(String tipoProdottoT) {
/* 131 */     this.tipoProdottoT = tipoProdottoT;
/*     */   }
/*     */   public String getTipoTotaleS() {
/* 134 */     return this.tipoTotaleS;
/*     */   }
/*     */   public void setTipoTotaleS(String tipoTotaleS) {
/* 137 */     this.tipoTotaleS = tipoTotaleS;
/*     */   }
/*     */   public String getTipoUltimaModifica() {
/* 140 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 143 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   public String getTipoUltimaModificaSlave() {
/* 146 */     return this.tipoUltimaModificaSlave;
/*     */   }
/*     */   public void setTipoUltimaModificaSlave(String tipoUltimaModificaSlave) {
/* 149 */     this.tipoUltimaModificaSlave = tipoUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 153 */     return this.userUltimaModifica;
/*     */   }
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 156 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   public String getUserUltimaModificaSlave() {
/* 159 */     return this.userUltimaModificaSlave;
/*     */   }
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/* 162 */     this.userUltimaModificaSlave = userUltimaModificaSlave;
/*     */   }
/*     */   public String getUtenteInserimento() {
/* 165 */     return this.utenteInserimento;
/*     */   }
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 168 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   public Integer getTotaliId() {
/* 171 */     return this.totaliId;
/*     */   }
/*     */   public void setTotaliId(Integer totaliId) {
/* 174 */     this.totaliId = totaliId;
/*     */   }
/*     */   public String getFlagDas() {
/* 177 */     return this.flagDas;
/*     */   }
/*     */   public void setFlagDas(String flagDas) {
/* 180 */     this.flagDas = flagDas;
/*     */   }
/*     */   public Double getTotale() {
/* 183 */     return this.totale;
/*     */   }
/*     */   public void setTotale(Double totale) {
/* 186 */     this.totale = totale;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\replica\ScpTotali.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */