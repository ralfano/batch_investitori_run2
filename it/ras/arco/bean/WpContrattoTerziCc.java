/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ public class WpContrattoTerziCc
/*     */   extends WpContrattoTerzi
/*     */   implements Serializable
/*     */ {
/*     */   private Integer progressivo;
/*     */   private String banca;
/*     */   private String numeroConto;
/*     */   private String divisa;
/*     */   private String contoPrincipale;
/*     */   private String cartaCredito;
/*     */   private String librettoAssegni;
/*     */   private String bancomat;
/*     */   private String accreditoStipendio;
/*     */   private String accreditoPensione;
/*     */   private String rataMutuo;
/*     */   private String addebitoUtenze;
/*     */   private String abi;
/*     */   private String cab;
/*     */   private String note;
/*     */   private Integer valuta;
/*     */   
/*     */   public WpContrattoTerziCc(Set clientegen, Integer id, Set intermediario, Set prodotto, String tipo, String abi, String pensione, String stipendio, String utenze, String banca, String bancomat, String cab, String credito, String principale, String divisa, String assegni, String note, String conto, Integer progressivo, String mutuo, Integer valuta) {
/*  29 */     super(clientegen, id, intermediario, prodotto, tipo);
/*     */     
/*  31 */     this.abi = abi;
/*  32 */     this.accreditoPensione = pensione;
/*  33 */     this.accreditoStipendio = stipendio;
/*  34 */     this.addebitoUtenze = utenze;
/*  35 */     this.banca = banca;
/*  36 */     this.bancomat = bancomat;
/*  37 */     this.cab = cab;
/*  38 */     this.cartaCredito = credito;
/*  39 */     this.contoPrincipale = principale;
/*  40 */     this.divisa = divisa;
/*  41 */     this.librettoAssegni = assegni;
/*  42 */     this.note = note;
/*  43 */     this.numeroConto = conto;
/*  44 */     this.progressivo = progressivo;
/*  45 */     this.rataMutuo = mutuo;
/*  46 */     this.valuta = valuta;
/*     */   }
/*     */ 
/*     */   
/*     */   public WpContrattoTerziCc() {}
/*     */   
/*     */   public WpContrattoTerziCc(Set clientegen, Integer id, Set intermediario, Set prodotto, String tipo) {
/*  53 */     super(clientegen, id, intermediario, prodotto, tipo);
/*     */   }
/*     */   
/*     */   public String getAbi() {
/*  57 */     return this.abi;
/*     */   }
/*     */   public void setAbi(String abi) {
/*  60 */     this.abi = abi;
/*     */   }
/*     */   public String getAccreditoPensione() {
/*  63 */     return this.accreditoPensione;
/*     */   }
/*     */   public void setAccreditoPensione(String accreditoPensione) {
/*  66 */     this.accreditoPensione = accreditoPensione;
/*     */   }
/*     */   public String getAccreditoStipendio() {
/*  69 */     return this.accreditoStipendio;
/*     */   }
/*     */   public void setAccreditoStipendio(String accreditoStipendio) {
/*  72 */     this.accreditoStipendio = accreditoStipendio;
/*     */   }
/*     */   public String getAddebitoUtenze() {
/*  75 */     return this.addebitoUtenze;
/*     */   }
/*     */   public void setAddebitoUtenze(String addebitoUtenze) {
/*  78 */     this.addebitoUtenze = addebitoUtenze;
/*     */   }
/*     */   public String getBanca() {
/*  81 */     return this.banca;
/*     */   }
/*     */   public void setBanca(String banca) {
/*  84 */     this.banca = banca;
/*     */   }
/*     */   public String getBancomat() {
/*  87 */     return this.bancomat;
/*     */   }
/*     */   public void setBancomat(String bancomat) {
/*  90 */     this.bancomat = bancomat;
/*     */   }
/*     */   public String getCab() {
/*  93 */     return this.cab;
/*     */   }
/*     */   public void setCab(String cab) {
/*  96 */     this.cab = cab;
/*     */   }
/*     */   public String getCartaCredito() {
/*  99 */     return this.cartaCredito;
/*     */   }
/*     */   public void setCartaCredito(String cartaCredito) {
/* 102 */     this.cartaCredito = cartaCredito;
/*     */   }
/*     */   public String getContoPrincipale() {
/* 105 */     return this.contoPrincipale;
/*     */   }
/*     */   public void setContoPrincipale(String contoPrincipale) {
/* 108 */     this.contoPrincipale = contoPrincipale;
/*     */   }
/*     */   public String getDivisa() {
/* 111 */     return this.divisa;
/*     */   }
/*     */   public void setDivisa(String divisa) {
/* 114 */     this.divisa = divisa;
/*     */   }
/*     */   public String getLibrettoAssegni() {
/* 117 */     return this.librettoAssegni;
/*     */   }
/*     */   public void setLibrettoAssegni(String librettoAssegni) {
/* 120 */     this.librettoAssegni = librettoAssegni;
/*     */   }
/*     */   public String getNote() {
/* 123 */     return this.note;
/*     */   }
/*     */   public void setNote(String note) {
/* 126 */     this.note = note;
/*     */   }
/*     */   public String getNumeroConto() {
/* 129 */     return this.numeroConto;
/*     */   }
/*     */   public void setNumeroConto(String numeroConto) {
/* 132 */     this.numeroConto = numeroConto;
/*     */   }
/*     */   public Integer getProgressivo() {
/* 135 */     return this.progressivo;
/*     */   }
/*     */   public void setProgressivo(Integer progressivo) {
/* 138 */     this.progressivo = progressivo;
/*     */   }
/*     */   public String getRataMutuo() {
/* 141 */     return this.rataMutuo;
/*     */   }
/*     */   public void setRataMutuo(String rataMutuo) {
/* 144 */     this.rataMutuo = rataMutuo;
/*     */   }
/*     */   public Integer getValuta() {
/* 147 */     return this.valuta;
/*     */   }
/*     */   public void setValuta(Integer valuta) {
/* 150 */     this.valuta = valuta;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpContrattoTerziCc.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */