/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinContrattoCcDt
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer contrattoCcDtId;
/*     */   private String tipoRapporto;
/*     */   private String abi;
/*     */   private String cab;
/*     */   private String numRapporto;
/*     */   private Integer filiale;
/*     */   private String descFiliale;
/*     */   private String divisa;
/*     */   private String derogaSegrBanc;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private String convenzione;
/*     */   private String rapportoAssociato;
/*     */   private String cin;
/*     */   private String bban;
/*     */   private String iban;
/*     */   private String userMc;
/*     */   private FinContratto contratto;
/*     */   private String filialeD;
/*     */   private String categoriaD;
/*     */   private String categoria;
/*     */   private String dossier;
/*     */   private String dossierD;
/*     */   
/*     */   public FinContratto getContratto() {
/*  39 */     return this.contratto;
/*     */   }
/*     */   public void setContratto(FinContratto contratto) {
/*  42 */     this.contratto = contratto;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinContrattoCcDt() {}
/*     */   
/*     */   public FinContrattoCcDt(String categoriaD, String categoria, String dossier, String dossierD, String filialeD, FinContratto contratto, String abi, String bban, String cab, String cin, Integer id, String convenzione, Date inserimento, String banc, String descFiliale, String divisa, Integer filiale2, String iban, String rapporto, String associato, String rapporto2, String mc, String inserimento2) {
/*  49 */     this.dossierD = dossierD;
/*  50 */     this.dossier = dossier;
/*  51 */     this.categoria = categoria;
/*  52 */     this.categoriaD = categoriaD;
/*  53 */     this.filialeD = filialeD;
/*  54 */     this.contratto = contratto;
/*  55 */     this.abi = abi;
/*  56 */     this.bban = bban;
/*  57 */     this.cab = cab;
/*  58 */     this.cin = cin;
/*     */     
/*  60 */     this.convenzione = convenzione;
/*  61 */     this.dataInserimento = inserimento;
/*  62 */     this.derogaSegrBanc = banc;
/*  63 */     this.descFiliale = descFiliale;
/*  64 */     this.divisa = divisa;
/*  65 */     this.filiale = filiale2;
/*  66 */     this.iban = iban;
/*  67 */     this.numRapporto = rapporto;
/*  68 */     this.rapportoAssociato = associato;
/*  69 */     this.tipoRapporto = rapporto2;
/*  70 */     this.userMc = mc;
/*  71 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */   public String getAbi() {
/*  74 */     return this.abi;
/*     */   }
/*     */   public void setAbi(String abi) {
/*  77 */     this.abi = abi;
/*     */   }
/*     */   public String getBban() {
/*  80 */     return this.bban;
/*     */   }
/*     */   public void setBban(String bban) {
/*  83 */     this.bban = bban;
/*     */   }
/*     */   public String getCab() {
/*  86 */     return this.cab;
/*     */   }
/*     */   public void setCab(String cab) {
/*  89 */     this.cab = cab;
/*     */   }
/*     */   public String getCin() {
/*  92 */     return this.cin;
/*     */   }
/*     */   public void setCin(String cin) {
/*  95 */     this.cin = cin;
/*     */   }
/*     */   public Integer getContrattoCcDtId() {
/*  98 */     return this.contrattoCcDtId;
/*     */   }
/*     */   public void setContrattoCcDtId(Integer contrattoCcDtId) {
/* 101 */     this.contrattoCcDtId = contrattoCcDtId;
/*     */   }
/*     */   
/*     */   public String getConvenzione() {
/* 105 */     return this.convenzione;
/*     */   }
/*     */   public void setConvenzione(String convenzione) {
/* 108 */     this.convenzione = convenzione;
/*     */   }
/*     */   public String getDerogaSegrBanc() {
/* 111 */     return this.derogaSegrBanc;
/*     */   }
/*     */   public void setDerogaSegrBanc(String derogaSegrBanc) {
/* 114 */     this.derogaSegrBanc = derogaSegrBanc;
/*     */   }
/*     */   public String getDescFiliale() {
/* 117 */     return this.descFiliale;
/*     */   }
/*     */   public void setDescFiliale(String descFiliale) {
/* 120 */     this.descFiliale = descFiliale;
/*     */   }
/*     */   public String getDivisa() {
/* 123 */     return this.divisa;
/*     */   }
/*     */   public void setDivisa(String divisa) {
/* 126 */     this.divisa = divisa;
/*     */   }
/*     */   public Integer getFiliale() {
/* 129 */     return this.filiale;
/*     */   }
/*     */   public void setFiliale(Integer filiale) {
/* 132 */     this.filiale = filiale;
/*     */   }
/*     */   public String getIban() {
/* 135 */     return this.iban;
/*     */   }
/*     */   public void setIban(String iban) {
/* 138 */     this.iban = iban;
/*     */   }
/*     */   public String getNumRapporto() {
/* 141 */     return this.numRapporto;
/*     */   }
/*     */   public void setNumRapporto(String numRapporto) {
/* 144 */     this.numRapporto = numRapporto;
/*     */   }
/*     */   public String getRapportoAssociato() {
/* 147 */     return this.rapportoAssociato;
/*     */   }
/*     */   public void setRapportoAssociato(String rapportoAssociato) {
/* 150 */     this.rapportoAssociato = rapportoAssociato;
/*     */   }
/*     */   public String getTipoRapporto() {
/* 153 */     return this.tipoRapporto;
/*     */   }
/*     */   public void setTipoRapporto(String tipoRapporto) {
/* 156 */     this.tipoRapporto = tipoRapporto;
/*     */   }
/*     */   public String getUserMc() {
/* 159 */     return this.userMc;
/*     */   }
/*     */   public void setUserMc(String userMc) {
/* 162 */     this.userMc = userMc;
/*     */   }
/*     */   public String getUtenteInserimento() {
/* 165 */     return this.utenteInserimento;
/*     */   }
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 168 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   public String getCategoria() {
/* 171 */     return this.categoria;
/*     */   }
/*     */   public void setCategoria(String categoria) {
/* 174 */     this.categoria = categoria;
/*     */   }
/*     */   public String getCategoriaD() {
/* 177 */     return this.categoriaD;
/*     */   }
/*     */   public void setCategoriaD(String categoriaD) {
/* 180 */     this.categoriaD = categoriaD;
/*     */   }
/*     */   public String getDossier() {
/* 183 */     return this.dossier;
/*     */   }
/*     */   public void setDossier(String dossier) {
/* 186 */     this.dossier = dossier;
/*     */   }
/*     */   public String getDossierD() {
/* 189 */     return this.dossierD;
/*     */   }
/*     */   public void setDossierD(String dossierD) {
/* 192 */     this.dossierD = dossierD;
/*     */   }
/*     */   public String getFilialeD() {
/* 195 */     return this.filialeD;
/*     */   }
/*     */   public void setFilialeD(String filialeD) {
/* 198 */     this.filialeD = filialeD;
/*     */   }
/*     */   public Date getDataInserimento() {
/* 201 */     return this.dataInserimento;
/*     */   }
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 204 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinContrattoCcDt.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */