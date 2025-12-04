/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import it.ras.flag.bean.RasORMBean;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DecodTitoliSecIsin
/*    */   extends RasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer flxId;
/*    */   private String titoloSec;
/*    */   private String isin;
/*    */   private String descrTitolo;
/*    */   
/*    */   public String getDescrTitolo() {
/* 18 */     return this.descrTitolo;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setDescrTitolo(String descrTitolo) {
/* 24 */     this.descrTitolo = descrTitolo;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public DecodTitoliSecIsin(String titolo, String isin, String sec) {
/* 33 */     this.descrTitolo = titolo;
/* 34 */     this.isin = isin;
/* 35 */     this.titoloSec = sec;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Integer getFlxId() {
/* 41 */     return this.flxId;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setFlxId(Integer flxId) {
/* 47 */     this.flxId = flxId;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String getIsin() {
/* 53 */     return this.isin;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setIsin(String isin) {
/* 59 */     this.isin = isin;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String getTitoloSec() {
/* 65 */     return this.titoloSec;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setTitoloSec(String titoloSec) {
/* 71 */     this.titoloSec = titoloSec;
/*    */   }
/*    */   
/*    */   public DecodTitoliSecIsin() {}
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\DecodTitoliSecIsin.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */