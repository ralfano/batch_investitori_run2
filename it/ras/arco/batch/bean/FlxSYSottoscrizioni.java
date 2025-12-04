/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
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
/*     */ public class FlxSYSottoscrizioni
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String outTipoEvento;
/*     */   private String outTipoProd;
/*     */   private String outCodComparto;
/*     */   private String outCodSottoscr;
/*     */   private String outCliente;
/*     */   private String outCodPromotore;
/*     */   private String outCodRete;
/*     */   private String outCodCompagn;
/*     */   private String outFlag;
/*     */   private String outCodContratto;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   
/*     */   public FlxSYSottoscrizioni(String outTipoEvento, String outTipoProd, String outCodComparto, String outCodSottoscr, String outCliente, String outCodPromotore, String outCodRete, String outCodCompagn, String outFlag, String outCodContratto, String statoElab, String istanza) {
/*  54 */     this.outTipoEvento = outTipoEvento;
/*  55 */     this.outTipoProd = outTipoProd;
/*  56 */     this.outCodComparto = outCodComparto;
/*  57 */     this.outCodSottoscr = outCodSottoscr;
/*  58 */     this.outCliente = outCliente;
/*  59 */     this.outCodPromotore = outCodPromotore;
/*  60 */     this.outCodRete = outCodRete;
/*  61 */     this.outCodCompagn = outCodCompagn;
/*  62 */     this.outFlag = outFlag;
/*  63 */     this.outCodContratto = outCodContratto;
/*  64 */     this.statoElab = statoElab;
/*  65 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxSYSottoscrizioni() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  73 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  77 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getOutTipoEvento() {
/*  81 */     return this.outTipoEvento;
/*     */   }
/*     */   
/*     */   public void setOutTipoEvento(String outTipoEvento) {
/*  85 */     this.outTipoEvento = outTipoEvento;
/*     */   }
/*     */   
/*     */   public String getOutTipoProd() {
/*  89 */     return this.outTipoProd;
/*     */   }
/*     */   
/*     */   public void setOutTipoProd(String outTipoProd) {
/*  93 */     this.outTipoProd = outTipoProd;
/*     */   }
/*     */   
/*     */   public String getOutCodComparto() {
/*  97 */     return this.outCodComparto;
/*     */   }
/*     */   
/*     */   public void setOutCodComparto(String outCodComparto) {
/* 101 */     this.outCodComparto = outCodComparto;
/*     */   }
/*     */   
/*     */   public String getOutCodSottoscr() {
/* 105 */     return this.outCodSottoscr;
/*     */   }
/*     */   
/*     */   public void setOutCodSottoscr(String outCodSottoscr) {
/* 109 */     this.outCodSottoscr = outCodSottoscr;
/*     */   }
/*     */   
/*     */   public String getOutCliente() {
/* 113 */     return this.outCliente;
/*     */   }
/*     */   
/*     */   public void setOutCliente(String outCliente) {
/* 117 */     this.outCliente = outCliente;
/*     */   }
/*     */   
/*     */   public String getOutCodPromotore() {
/* 121 */     return this.outCodPromotore;
/*     */   }
/*     */   
/*     */   public void setOutCodPromotore(String outCodPromotore) {
/* 125 */     this.outCodPromotore = outCodPromotore;
/*     */   }
/*     */   
/*     */   public String getOutCodRete() {
/* 129 */     return this.outCodRete;
/*     */   }
/*     */   
/*     */   public void setOutCodRete(String outCodRete) {
/* 133 */     this.outCodRete = outCodRete;
/*     */   }
/*     */   
/*     */   public String getOutCodCompagn() {
/* 137 */     return this.outCodCompagn;
/*     */   }
/*     */   
/*     */   public void setOutCodCompagn(String outCodCompagn) {
/* 141 */     this.outCodCompagn = outCodCompagn;
/*     */   }
/*     */   
/*     */   public String getOutFlag() {
/* 145 */     return this.outFlag;
/*     */   }
/*     */   
/*     */   public void setOutFlag(String outFlag) {
/* 149 */     this.outFlag = outFlag;
/*     */   }
/*     */   
/*     */   public String getOutCodContratto() {
/* 153 */     return this.outCodContratto;
/*     */   }
/*     */   
/*     */   public void setOutCodContratto(String outCodContratto) {
/* 157 */     this.outCodContratto = outCodContratto;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 161 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 165 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 169 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 173 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 177 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSYSottoscrizioni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */