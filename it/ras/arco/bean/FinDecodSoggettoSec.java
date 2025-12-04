/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
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
/*     */ public class FinDecodSoggettoSec
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer soggettoSecId;
/*     */   private Integer soggettoId;
/*     */   private Integer ndgSec;
/*     */   private String ndgFabbrica;
/*     */   private String codCsot;
/*     */   private String codiceFabbricaCorr;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private String cointestazione;
/*     */   private String crap;
/*     */   
/*     */   public FinDecodSoggettoSec(Integer soggettoSecId, Integer soggettoId, Integer ndgSec, String ndgFabbrica, String codCsot, String codiceFabbricaCorr, Date dataInserimento, String utenteInserimento, String cointestazione, String crap) {
/*  46 */     this.soggettoSecId = soggettoSecId;
/*  47 */     this.soggettoId = soggettoId;
/*  48 */     this.ndgSec = ndgSec;
/*  49 */     this.ndgFabbrica = ndgFabbrica;
/*  50 */     this.codCsot = codCsot;
/*  51 */     this.codiceFabbricaCorr = codiceFabbricaCorr;
/*  52 */     this.dataInserimento = dataInserimento;
/*  53 */     this.utenteInserimento = utenteInserimento;
/*  54 */     this.cointestazione = cointestazione;
/*  55 */     this.crap = crap;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinDecodSoggettoSec() {}
/*     */ 
/*     */   
/*     */   public String getCodiceFabbricaCorr() {
/*  63 */     return this.codiceFabbricaCorr;
/*     */   }
/*     */   
/*     */   public void setCodiceFabbricaCorr(String codiceFabbricaCorr) {
/*  67 */     this.codiceFabbricaCorr = codiceFabbricaCorr;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/*  73 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  77 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getNdgFabbrica() {
/*  81 */     return this.ndgFabbrica;
/*     */   }
/*     */   
/*     */   public void setNdgFabbrica(String ndgFabbrica) {
/*  85 */     this.ndgFabbrica = ndgFabbrica;
/*     */   }
/*     */   
/*     */   public Integer getNdgSec() {
/*  89 */     return this.ndgSec;
/*     */   }
/*     */   
/*     */   public void setNdgSec(Integer ndgSec) {
/*  93 */     this.ndgSec = ndgSec;
/*     */   }
/*     */   
/*     */   public Integer getSoggettoId() {
/*  97 */     return this.soggettoId;
/*     */   }
/*     */   
/*     */   public void setSoggettoId(Integer soggettoId) {
/* 101 */     this.soggettoId = soggettoId;
/*     */   }
/*     */   
/*     */   public Integer getSoggettoSecId() {
/* 105 */     return this.soggettoSecId;
/*     */   }
/*     */   
/*     */   public void setSoggettoSecId(Integer soggettoSecId) {
/* 109 */     this.soggettoSecId = soggettoSecId;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 113 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 117 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCointestazione() {
/* 123 */     return this.cointestazione;
/*     */   }
/*     */   
/*     */   public void setCointestazione(String cointestazione) {
/* 127 */     this.cointestazione = cointestazione;
/*     */   }
/*     */   
/*     */   public String getCodCsot() {
/* 131 */     return this.codCsot;
/*     */   }
/*     */   
/*     */   public void setCodCsot(String codCsot) {
/* 135 */     this.codCsot = codCsot;
/*     */   }
/*     */   
/*     */   public String getCrap() {
/* 139 */     return this.crap;
/*     */   }
/*     */   
/*     */   public void setCrap(String crap) {
/* 143 */     this.crap = crap;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinDecodSoggettoSec.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */