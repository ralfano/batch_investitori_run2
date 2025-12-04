/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinAnagraficaBanca
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer anagraficaBancaId;
/*     */   private String abi;
/*     */   private String cab;
/*     */   private String swift;
/*     */   private String bic;
/*     */   private String filialeAgenzia;
/*     */   private String descrizioneAgenzia;
/*     */   private String tipoVia;
/*     */   private String indirizzoAgenzia;
/*     */   private String capAgenzia;
/*     */   private String cittaAgenzia;
/*     */   private String provinciaAgenzia;
/*     */   private String nazioneAgenzia;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private String codiceComune;
/*     */   private String tipoBanca;
/*     */   private Set contrattoCC;
/*     */   
/*     */   public FinAnagraficaBanca() {}
/*     */   
/*     */   public String getAbi() {
/*  38 */     return this.abi;
/*     */   }
/*     */   
/*     */   public void setAbi(String abi) {
/*  42 */     this.abi = abi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getAnagraficaBancaId() {
/*  48 */     return this.anagraficaBancaId;
/*     */   }
/*     */   
/*     */   public void setAnagraficaBancaId(Integer anagraficaBancaId) {
/*  52 */     this.anagraficaBancaId = anagraficaBancaId;
/*     */   }
/*     */   
/*     */   public String getBic() {
/*  56 */     return this.bic;
/*     */   }
/*     */   
/*     */   public void setBic(String bic) {
/*  60 */     this.bic = bic;
/*     */   }
/*     */   
/*     */   public String getCab() {
/*  64 */     return this.cab;
/*     */   }
/*     */   
/*     */   public void setCab(String cab) {
/*  68 */     this.cab = cab;
/*     */   }
/*     */   
/*     */   public String getCapAgenzia() {
/*  72 */     return this.capAgenzia;
/*     */   }
/*     */   
/*     */   public void setCapAgenzia(String capAgenzia) {
/*  76 */     this.capAgenzia = capAgenzia;
/*     */   }
/*     */   
/*     */   public String getCittaAgenzia() {
/*  80 */     return this.cittaAgenzia;
/*     */   }
/*     */   
/*     */   public void setCittaAgenzia(String cittaAgenzia) {
/*  84 */     this.cittaAgenzia = cittaAgenzia;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/*  88 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  92 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getDescrizioneAgenzia() {
/*  96 */     return this.descrizioneAgenzia;
/*     */   }
/*     */   
/*     */   public void setDescrizioneAgenzia(String descrizioneAgenzia) {
/* 100 */     this.descrizioneAgenzia = descrizioneAgenzia;
/*     */   }
/*     */   
/*     */   public String getFilialeAgenzia() {
/* 104 */     return this.filialeAgenzia;
/*     */   }
/*     */   
/*     */   public void setFilialeAgenzia(String filiale) {
/* 108 */     this.filialeAgenzia = filiale;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getIndirizzoAgenzia() {
/* 113 */     return this.indirizzoAgenzia;
/*     */   }
/*     */   
/*     */   public void setIndirizzoAgenzia(String indirizzoAgenzia) {
/* 117 */     this.indirizzoAgenzia = indirizzoAgenzia;
/*     */   }
/*     */   
/*     */   public String getNazioneAgenzia() {
/* 121 */     return this.nazioneAgenzia;
/*     */   }
/*     */   
/*     */   public void setNazioneAgenzia(String nazioneAgenzia) {
/* 125 */     this.nazioneAgenzia = nazioneAgenzia;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getProvinciaAgenzia() {
/* 130 */     return this.provinciaAgenzia;
/*     */   }
/*     */   
/*     */   public void setProvinciaAgenzia(String provinciaAgenzia) {
/* 134 */     this.provinciaAgenzia = provinciaAgenzia;
/*     */   }
/*     */   
/*     */   public String getSwift() {
/* 138 */     return this.swift;
/*     */   }
/*     */   
/*     */   public void setSwift(String swift) {
/* 142 */     this.swift = swift;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTipoVia() {
/* 147 */     return this.tipoVia;
/*     */   }
/*     */   
/*     */   public void setTipoVia(String tipoVia) {
/* 151 */     this.tipoVia = tipoVia;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 156 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 160 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinAnagraficaBanca(String abi, String agenzia, Integer id, String bic, String cab, String agenzia2, String agenzia3, Date inserimento, String agenzia4, String filiale, String agenzia5, String agenzia6, String agenzia7, String swift, String via, String inserimento2) {
/* 166 */     this.abi = abi;
/*     */     
/* 168 */     this.anagraficaBancaId = id;
/* 169 */     this.bic = bic;
/* 170 */     this.cab = cab;
/* 171 */     this.capAgenzia = agenzia2;
/* 172 */     this.cittaAgenzia = agenzia3;
/* 173 */     this.dataInserimento = inserimento;
/* 174 */     this.descrizioneAgenzia = agenzia4;
/* 175 */     this.filialeAgenzia = filiale;
/* 176 */     this.indirizzoAgenzia = agenzia5;
/* 177 */     this.nazioneAgenzia = agenzia6;
/* 178 */     this.provinciaAgenzia = agenzia7;
/* 179 */     this.swift = swift;
/* 180 */     this.tipoVia = via;
/* 181 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */   
/*     */   public Set getContrattoCC() {
/* 185 */     return this.contrattoCC;
/*     */   }
/*     */   
/*     */   public void setContrattoCC(Set contrattoCC) {
/* 189 */     this.contrattoCC = contrattoCC;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceComune() {
/* 196 */     return this.codiceComune;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceComune(String codiceComune) {
/* 203 */     this.codiceComune = codiceComune;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoBanca() {
/* 211 */     return this.tipoBanca;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoBanca(String tipoBanca) {
/* 218 */     this.tipoBanca = tipoBanca;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAnagraficaBanca.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */