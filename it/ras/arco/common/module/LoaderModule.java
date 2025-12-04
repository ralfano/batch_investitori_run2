/*     */ package it.ras.arco.common.module;
/*     */ 
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.module.AbstractRasDbModule;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.io.Serializable;
/*     */ import org.apache.commons.logging.LogFactory;
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
/*     */ public class LoaderModule
/*     */   extends AbstractRasDbModule
/*     */ {
/*  21 */   private String classeEntitaDaCaricareMapContainerKey = null;
/*  22 */   private String entitaCaricataMapContainerKey = null;
/*  23 */   private String idEntitaDaCaricareMapContainerKey = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MapContainer service(MapContainer mc) throws RasServiceException {
/*  31 */     Object oggettoCaricato = null;
/*     */     
/*  33 */     Class classeDaCaricare = (Class)mc.getAppl(getClasseEntitaDaCaricareMapContainerKey());
/*  34 */     Serializable idOggettoDaCaricare = (Serializable)mc.getAppl(getIdEntitaDaCaricareMapContainerKey());
/*     */ 
/*     */     
/*     */     try {
/*  38 */       oggettoCaricato = getDao().loadEntity(classeDaCaricare, idOggettoDaCaricare);
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  43 */     catch (Exception e) {
/*     */       
/*  45 */       throw new RasServiceException(e);
/*     */     } 
/*     */ 
/*     */     
/*  49 */     LogFactory.getLog(getClass()).debug("Caricato: " + oggettoCaricato);
/*     */     
/*  51 */     mc.putAppl(getEntitaCaricataMapContainerKey(), oggettoCaricato);
/*  52 */     return mc;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getClasseEntitaDaCaricareMapContainerKey() {
/*  60 */     return this.classeEntitaDaCaricareMapContainerKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setClasseEntitaDaCaricareMapContainerKey(String classeEntitaDaCaricareMapContainerKey) {
/*  69 */     this.classeEntitaDaCaricareMapContainerKey = classeEntitaDaCaricareMapContainerKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getEntitaCaricataMapContainerKey() {
/*  77 */     return this.entitaCaricataMapContainerKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEntitaCaricataMapContainerKey(String entitaCaricataMapContainerKey) {
/*  86 */     this.entitaCaricataMapContainerKey = entitaCaricataMapContainerKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIdEntitaDaCaricareMapContainerKey() {
/*  94 */     return this.idEntitaDaCaricareMapContainerKey;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIdEntitaDaCaricareMapContainerKey(String idEntitaDaCaricareMapContainerKey) {
/* 103 */     this.idEntitaDaCaricareMapContainerKey = idEntitaDaCaricareMapContainerKey;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\module\LoaderModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */