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
/*     */ public class FinPraticaBozza
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer praticaBozzaId;
/*     */   private String statoOperazione;
/*     */   private String librettoAssegni;
/*     */   private String bancomat;
/*     */   private String emittente;
/*     */   private String circuito;
/*     */   private String cartaAggiuntiva;
/*     */   private String primoIntestatario;
/*     */   private String circuitoCartaAggiuntiva;
/*     */   private FinSoggettoBozza soggettoBozza;
/*     */   private FinPratica pratica;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private Date dataInserimento;
/*     */   
/*     */   public FinPraticaBozza(String bancomat, String aggiuntiva, String circuito, String aggiuntiva2, String emittente, String assegni, Integer id, String intestatario, String operazione) {
/*  49 */     this.bancomat = bancomat;
/*  50 */     this.cartaAggiuntiva = aggiuntiva;
/*  51 */     this.circuito = circuito;
/*  52 */     this.circuitoCartaAggiuntiva = aggiuntiva2;
/*  53 */     this.emittente = emittente;
/*  54 */     this.librettoAssegni = assegni;
/*  55 */     this.praticaBozzaId = id;
/*  56 */     this.primoIntestatario = intestatario;
/*  57 */     this.statoOperazione = operazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getBancomat() {
/*  63 */     return this.bancomat;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBancomat(String bancomat) {
/*  69 */     this.bancomat = bancomat;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCartaAggiuntiva() {
/*  75 */     return this.cartaAggiuntiva;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCartaAggiuntiva(String cartaAggiuntiva) {
/*  81 */     this.cartaAggiuntiva = cartaAggiuntiva;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCircuito() {
/*  87 */     return this.circuito;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCircuito(String circuito) {
/*  93 */     this.circuito = circuito;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCircuitoCartaAggiuntiva() {
/*  99 */     return this.circuitoCartaAggiuntiva;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCircuitoCartaAggiuntiva(String circuitoCartaAggiuntiva) {
/* 105 */     this.circuitoCartaAggiuntiva = circuitoCartaAggiuntiva;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getEmittente() {
/* 111 */     return this.emittente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEmittente(String emittente) {
/* 117 */     this.emittente = emittente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getLibrettoAssegni() {
/* 123 */     return this.librettoAssegni;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLibrettoAssegni(String librettoAssegni) {
/* 129 */     this.librettoAssegni = librettoAssegni;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getPraticaBozzaId() {
/* 135 */     return this.praticaBozzaId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPraticaBozzaId(Integer praticaBozzaId) {
/* 141 */     this.praticaBozzaId = praticaBozzaId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPrimoIntestatario() {
/* 147 */     return this.primoIntestatario;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrimoIntestatario(String primoIntestatario) {
/* 153 */     this.primoIntestatario = primoIntestatario;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoOperazione() {
/* 159 */     return this.statoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoOperazione(String statoOperazione) {
/* 165 */     this.statoOperazione = statoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPraticaBozza() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 179 */     return (new ToStringBuilder(this)).append("praticaBozza", getPraticaBozzaId()).toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/* 184 */     if (!(obj instanceof FinPraticaBozza)) {
/* 185 */       return false;
/*     */     }
/* 187 */     FinPraticaBozza praticabozza = (FinPraticaBozza)obj;
/* 188 */     if (praticabozza.getBancomat().equals(getBancomat()) && praticabozza.getCartaAggiuntiva().equals(getCartaAggiuntiva()) && praticabozza.getCircuito().equals(getCircuito()) && praticabozza.getCircuitoCartaAggiuntiva().equals(getCircuitoCartaAggiuntiva()) && praticabozza.getEmittente().equals(getEmittente()) && praticabozza.getLibrettoAssegni().equals(getLibrettoAssegni()) && praticabozza.getPrimoIntestatario().equals(getPrimoIntestatario()) && praticabozza.getStatoOperazione().equals(getStatoOperazione()))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 198 */       return true;
/*     */     }
/* 200 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPratica getPratica() {
/* 206 */     return this.pratica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPratica(FinPratica pratica) {
/* 212 */     this.pratica = pratica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagEsistenza() {
/* 221 */     return this.flagEsistenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 227 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 233 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 239 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSoggettoBozza getSoggettoBozza() {
/* 245 */     return this.soggettoBozza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSoggettoBozza(FinSoggettoBozza soggettoBozza) {
/* 251 */     this.soggettoBozza = soggettoBozza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 257 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 263 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPraticaBozza.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */