/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.util.Date;
/*     */ import java.util.Set;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinParametro
/*     */   extends FinAutoGSTDValuesSettedBean
/*     */ {
/*     */   private Integer parametroID;
/*     */   private String descrizione;
/*     */   private String tipoParametro;
/*     */   private String tipoProdotto;
/*     */   private String tipoOggP;
/*     */   private String tipoValore;
/*     */   private String nomeTabellaS;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private String colonnaIn;
/*     */   private String colonnaOut;
/*     */   private String valoreCheckSel;
/*     */   private String valoreCheckNonSel;
/*     */   private Integer tipoEntitaAss;
/*     */   private Integer cdOrdina;
/*     */   private Integer numCifreIntere;
/*     */   private Integer numCifreDecimali;
/*     */   private Integer colonnaDivisa;
/*     */   private Integer colonnaTargetId;
/*     */   private Integer comboDecodificata;
/*     */   private Integer codice;
/*     */   private String flagElenco;
/*     */   private String flagParametroObbl;
/*     */   private Set entitaParametro;
/*     */   public static final String TIPO_PARAMETRO_REGOLA = "REG";
/*     */   public static final String TIPO_PARAMETRO_ATTRIBUTO = "ATTR";
/*     */   public static final String TIPO_VALORE_INTERO = "INT";
/*     */   public static final String TIPO_VALORE_IMPORTO = "IMP";
/*     */   public static final String TIPO_VALORE_STRINGA = "STR";
/* 114 */   public static final Integer TIPO_ENTITA_ASS_EMITTENTE = new Integer(0);
/* 115 */   public static final Integer TIPO_ENTITA_ASS_PRODOTTO = new Integer(1);
/* 116 */   public static final Integer TIPO_ENTITA_ASS_ATT_FIN = new Integer(2);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinParametro(String descrizione, String tipoParametro, String flagParametroObbl, String tipoProdotto, String tipoOggP, String tipoValore, String nomeTabellaS, Date dataInizio, Date dataFine, String userUltimaModifica, String proceduraUltimaModifica, Date dataUltimaModifica, Date dataInserimento, String flagEsistenza, String utenteInserimento, String tipoUltimaModifica, String colonnaIn, String colonnaOut, String valoreCheckSel, String valoreCheckNonSel, Integer tipoEntitaAss, Set entitaParametro) {
/* 122 */     this.descrizione = descrizione;
/* 123 */     this.tipoParametro = tipoParametro;
/* 124 */     this.tipoProdotto = tipoProdotto;
/* 125 */     this.flagParametroObbl = flagParametroObbl;
/* 126 */     this.tipoValore = tipoValore;
/* 127 */     this.tipoOggP = tipoOggP;
/* 128 */     this.nomeTabellaS = nomeTabellaS;
/* 129 */     this.dataInizio = dataInizio;
/* 130 */     this.dataFine = dataFine;
/* 131 */     this.userUltimaModifica = userUltimaModifica;
/* 132 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/* 133 */     this.dataUltimaModifica = dataUltimaModifica;
/* 134 */     this.dataInserimento = dataInserimento;
/* 135 */     this.flagEsistenza = flagEsistenza;
/* 136 */     this.utenteInserimento = utenteInserimento;
/* 137 */     this.tipoUltimaModifica = tipoUltimaModifica;
/* 138 */     this.colonnaIn = colonnaIn;
/* 139 */     this.colonnaOut = colonnaOut;
/* 140 */     this.valoreCheckSel = valoreCheckSel;
/* 141 */     this.valoreCheckNonSel = valoreCheckNonSel;
/* 142 */     this.tipoEntitaAss = tipoEntitaAss;
/*     */ 
/*     */     
/* 145 */     this.entitaParametro = entitaParametro;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinParametro() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public FinParametro(Set entitaParametro) {
/* 155 */     this.entitaParametro = entitaParametro;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getParametroID() {
/* 160 */     return this.parametroID;
/*     */   }
/*     */   
/*     */   public void setParametroID(Integer parametroID) {
/* 164 */     this.parametroID = parametroID;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTipoParametro() {
/* 169 */     return this.tipoParametro;
/*     */   }
/*     */   
/*     */   public void setTipoParametro(String tipoParametro) {
/* 173 */     this.tipoParametro = tipoParametro;
/*     */   }
/*     */   
/*     */   public String getTipoProdotto() {
/* 177 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 181 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */   
/*     */   public String getTipoOggP() {
/* 185 */     return this.tipoOggP;
/*     */   }
/*     */   
/*     */   public void setTipoOggP(String tipoOggP) {
/* 189 */     this.tipoOggP = tipoOggP;
/*     */   }
/*     */   
/*     */   public String getTipoValore() {
/* 193 */     return this.tipoValore;
/*     */   }
/*     */   
/*     */   public void setTipoValore(String tipoValore) {
/* 197 */     this.tipoValore = tipoValore;
/*     */   }
/*     */   
/*     */   public String getNomeTabellaS() {
/* 201 */     return this.nomeTabellaS;
/*     */   }
/*     */   
/*     */   public void setNomeTabellaS(String nomeTabellaS) {
/* 205 */     this.nomeTabellaS = nomeTabellaS;
/*     */   }
/*     */   
/*     */   public String getDescrizione() {
/* 209 */     return this.descrizione;
/*     */   }
/*     */   
/*     */   public void setDescrizione(String descrizione) {
/* 213 */     this.descrizione = descrizione;
/*     */   }
/*     */   
/*     */   public Date getDataInizio() {
/* 217 */     return this.dataInizio;
/*     */   }
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/* 221 */     this.dataInizio = dataInizio;
/*     */   }
/*     */   
/*     */   public Date getDataFine() {
/* 225 */     return this.dataFine;
/*     */   }
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/* 229 */     this.dataFine = dataFine;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 233 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 237 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 241 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 245 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public Set getEntitaParametro() {
/* 249 */     return this.entitaParametro;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getColonnaIn() {
/* 254 */     return this.colonnaIn;
/*     */   }
/*     */   
/*     */   public void setColonnaIn(String colonnaIn) {
/* 258 */     this.colonnaIn = colonnaIn;
/*     */   }
/*     */   
/*     */   public String getColonnaOut() {
/* 262 */     return this.colonnaOut;
/*     */   }
/*     */   
/*     */   public void setColonnaOut(String colonnaOut) {
/* 266 */     this.colonnaOut = colonnaOut;
/*     */   }
/*     */   
/*     */   public String getValoreCheckSel() {
/* 270 */     return this.valoreCheckSel;
/*     */   }
/*     */   
/*     */   public void setValoreCheckSel(String valoreCheckSel) {
/* 274 */     this.valoreCheckSel = valoreCheckSel;
/*     */   }
/*     */   
/*     */   public String getValoreCheckNonSel() {
/* 278 */     return this.valoreCheckNonSel;
/*     */   }
/*     */   
/*     */   public void setValoreCheckNonSel(String valoreCheckNonSel) {
/* 282 */     this.valoreCheckNonSel = valoreCheckNonSel;
/*     */   }
/*     */   
/*     */   public Integer getTipoEntitaAss() {
/* 286 */     return this.tipoEntitaAss;
/*     */   }
/*     */   
/*     */   public void setTipoEntitaAss(Integer tipoEntitaAss) {
/* 290 */     this.tipoEntitaAss = tipoEntitaAss;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEntitaParametro(Set entitaParametro) {
/* 295 */     this.entitaParametro = entitaParametro;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 300 */     return (new ToStringBuilder(this)).append("parametroID", getParametroID()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCdOrdina() {
/* 310 */     return this.cdOrdina;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCdOrdina(Integer cdOrdina) {
/* 318 */     this.cdOrdina = cdOrdina;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getColonnaDivisa() {
/* 326 */     return this.colonnaDivisa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setColonnaDivisa(Integer colonnaDivisa) {
/* 334 */     this.colonnaDivisa = colonnaDivisa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getColonnaTargetId() {
/* 342 */     return this.colonnaTargetId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setColonnaTargetId(Integer colonnaTargetId) {
/* 350 */     this.colonnaTargetId = colonnaTargetId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getComboDecodificata() {
/* 358 */     return this.comboDecodificata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setComboDecodificata(Integer comboDecodificata) {
/* 366 */     this.comboDecodificata = comboDecodificata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNumCifreDecimali() {
/* 374 */     return this.numCifreDecimali;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumCifreDecimali(Integer numCifreDecimali) {
/* 382 */     this.numCifreDecimali = numCifreDecimali;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNumCifreIntere() {
/* 390 */     return this.numCifreIntere;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumCifreIntere(Integer numCifreIntere) {
/* 398 */     this.numCifreIntere = numCifreIntere;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagElenco() {
/* 409 */     return this.flagElenco;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagElenco(String flagElenco) {
/* 420 */     this.flagElenco = flagElenco;
/*     */   }
/*     */   
/*     */   public String getFlagParametroObbl() {
/* 424 */     return this.flagParametroObbl;
/*     */   }
/*     */   
/*     */   public void setFlagParametroObbl(String flagParametroObbl) {
/* 428 */     this.flagParametroObbl = flagParametroObbl;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCodice() {
/* 436 */     return this.codice;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodice(Integer codice) {
/* 444 */     this.codice = codice;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/* 449 */     if (!(obj instanceof FinParametro))
/*     */     {
/* 451 */       return false;
/*     */     }
/* 453 */     if (obj == null)
/*     */     {
/* 455 */       return false;
/*     */     }
/* 457 */     if (this == obj)
/*     */     {
/* 459 */       return true;
/*     */     }
/*     */     
/* 462 */     FinParametro parametro = (FinParametro)obj;
/* 463 */     return (new EqualsBuilder()).append(this.descrizione, parametro.descrizione).append(this.dataInizio, parametro.dataInizio).append(this.dataFine, parametro.dataFine).append(this.tipoOggP, parametro.tipoOggP).isEquals();
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
/*     */   public int hashCode() {
/* 476 */     return (new HashCodeBuilder(17, 37)).append(this.descrizione).append(this.dataInizio).append(this.dataFine).append(this.tipoOggP).toHashCode();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinParametro.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */