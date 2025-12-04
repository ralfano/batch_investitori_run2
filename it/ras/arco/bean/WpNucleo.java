/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ public class WpNucleo
/*    */   extends ArcoRasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer nucleoId;
/*    */   private Integer cliGenIdPrinc;
/*    */   private Integer cliGenIdFam;
/*    */   private String tipoRelazione;
/*    */   private String flagACarico;
/*    */   private Set clientegenprinc;
/*    */   private Set clientegenfam;
/*    */   
/*    */   public WpNucleo(Set clientegenfam, Set clientegenprinc, Integer fam, Integer princ, String carico, Integer id, String relazione) {
/* 20 */     this.clientegenfam = clientegenfam;
/* 21 */     this.clientegenprinc = clientegenprinc;
/* 22 */     this.cliGenIdFam = fam;
/* 23 */     this.cliGenIdPrinc = princ;
/* 24 */     this.flagACarico = carico;
/* 25 */     this.nucleoId = id;
/* 26 */     this.tipoRelazione = relazione;
/*    */   }
/*    */ 
/*    */   
/*    */   public WpNucleo() {}
/*    */   
/*    */   public Set getClientegenfam() {
/* 33 */     return this.clientegenfam;
/*    */   }
/*    */   public void setClientegenfam(Set clientegenfam) {
/* 36 */     this.clientegenfam = clientegenfam;
/*    */   }
/*    */   public Set getClientegenprinc() {
/* 39 */     return this.clientegenprinc;
/*    */   }
/*    */   public void setClientegenprinc(Set clientegenprinc) {
/* 42 */     this.clientegenprinc = clientegenprinc;
/*    */   }
/*    */   public Integer getCliGenIdFam() {
/* 45 */     return this.cliGenIdFam;
/*    */   }
/*    */   public void setCliGenIdFam(Integer cliGenIdFam) {
/* 48 */     this.cliGenIdFam = cliGenIdFam;
/*    */   }
/*    */   public Integer getCliGenIdPrinc() {
/* 51 */     return this.cliGenIdPrinc;
/*    */   }
/*    */   public void setCliGenIdPrinc(Integer cliGenIdPrinc) {
/* 54 */     this.cliGenIdPrinc = cliGenIdPrinc;
/*    */   }
/*    */   public String getFlagACarico() {
/* 57 */     return this.flagACarico;
/*    */   }
/*    */   public void setFlagACarico(String flagACarico) {
/* 60 */     this.flagACarico = flagACarico;
/*    */   }
/*    */   public Integer getNucleoId() {
/* 63 */     return this.nucleoId;
/*    */   }
/*    */   public void setNucleoId(Integer nucleoId) {
/* 66 */     this.nucleoId = nucleoId;
/*    */   }
/*    */   public String getTipoRelazione() {
/* 69 */     return this.tipoRelazione;
/*    */   }
/*    */   public void setTipoRelazione(String tipoRelazione) {
/* 72 */     this.tipoRelazione = tipoRelazione;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpNucleo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */