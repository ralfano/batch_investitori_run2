/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.util.Date;
/*     */ import java.util.Iterator;
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
/*     */ public class FinEmittente
/*     */   extends FinAbstractParametrizedBean
/*     */ {
/*     */   private Integer emittenteId;
/*     */   private String descrizione;
/*     */   private String flgInterna;
/*     */   private String tipoSocieta;
/*     */   private String codEmittExt;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private Set prodotto;
/*     */   private Set interfaccia;
/*     */   private Set sottoscrEmittenti;
/*     */   private Set evidenze;
/*     */   private Set disposizioniPagamento;
/*     */   private String visibilita;
/*     */   private String gestioneArco;
/*     */   public static final String VISIBILITA_REALE = "R";
/*     */   public static final String VISIBILITA_FITTIZIA = "F";
/*     */   
/*     */   public FinEmittente(String descrizione, String flgInterna, String tipoSocieta, String codEmittExt, Date dataInserimento, String utenteInserimento, Set prodotto, Set interfaccia, Set listaParametri, Set sottoscrizioni) {
/*  69 */     this.descrizione = descrizione;
/*  70 */     this.flgInterna = flgInterna;
/*  71 */     this.tipoSocieta = tipoSocieta;
/*  72 */     this.codEmittExt = codEmittExt;
/*  73 */     this.dataInserimento = dataInserimento;
/*  74 */     this.utenteInserimento = utenteInserimento;
/*  75 */     this.prodotto = prodotto;
/*  76 */     this.interfaccia = interfaccia;
/*  77 */     setListaParametri(listaParametri);
/*  78 */     this.sottoscrEmittenti = sottoscrizioni;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinEmittente() {}
/*     */ 
/*     */   
/*     */   public FinEmittente(Set prodotto) {
/*  87 */     this.prodotto = prodotto;
/*     */   }
/*     */   
/*     */   public Integer getEmittenteId() {
/*  91 */     return this.emittenteId;
/*     */   }
/*     */   
/*     */   public void setEmittenteId(Integer emittenteId) {
/*  95 */     this.emittenteId = emittenteId;
/*     */   }
/*     */   
/*     */   public String getDescrizione() {
/*  99 */     return this.descrizione;
/*     */   }
/*     */   
/*     */   public void setDescrizione(String descrizione) {
/* 103 */     this.descrizione = descrizione;
/*     */   }
/*     */   
/*     */   public String getFlgInterna() {
/* 107 */     return this.flgInterna;
/*     */   }
/*     */   
/*     */   public void setFlgInterna(String flgInterna) {
/* 111 */     this.flgInterna = flgInterna;
/*     */   }
/*     */   
/*     */   public String getTipoSocieta() {
/* 115 */     return this.tipoSocieta;
/*     */   }
/*     */   
/*     */   public void setTipoSocieta(String tipoSocieta) {
/* 119 */     this.tipoSocieta = tipoSocieta;
/*     */   }
/*     */   
/*     */   public String getCodEmittExt() {
/* 123 */     return this.codEmittExt;
/*     */   }
/*     */   
/*     */   public void setCodEmittExt(String codEmittExt) {
/* 127 */     this.codEmittExt = codEmittExt;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 131 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 135 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 139 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 143 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public Set getProdotto() {
/* 147 */     return this.prodotto;
/*     */   }
/*     */   
/*     */   public void setProdotto(Set prodotto) {
/* 151 */     this.prodotto = prodotto;
/*     */   }
/*     */   
/*     */   public Set getInterfaccia() {
/* 155 */     return this.interfaccia;
/*     */   }
/*     */   
/*     */   public void setInterfaccia(Set interfaccia) {
/* 159 */     this.interfaccia = interfaccia;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 163 */     return (new ToStringBuilder(this)).append("emittenteId", getEmittenteId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/* 172 */     if (!(obj instanceof FinEmittente))
/*     */     {
/* 174 */       return false;
/*     */     }
/* 176 */     if (obj == null)
/*     */     {
/* 178 */       return false;
/*     */     }
/* 180 */     if (this == obj)
/*     */     {
/* 182 */       return true;
/*     */     }
/*     */     
/* 185 */     FinEmittente emittente = (FinEmittente)obj;
/* 186 */     return (new EqualsBuilder()).append(this.descrizione, emittente.descrizione).append(this.flgInterna, emittente.flgInterna).isEquals();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 205 */     return (new HashCodeBuilder(11, 37)).append(this.descrizione).append(this.flgInterna).toHashCode();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void accept(IGSTDInitVisitor visitor) {
/* 216 */     super.accept(visitor);
/*     */ 
/*     */     
/*     */     try {
/* 220 */       if (getProdotto() != null && getProdotto().size() > 0)
/*     */       {
/* 222 */         for (Iterator iter = getProdotto().iterator(); iter.hasNext(); )
/*     */         {
/* 224 */           FinProdotto element = iter.next();
/* 225 */           element.accept(visitor);
/*     */         }
/*     */       
/*     */       }
/* 229 */     } catch (Exception e) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getEvidenze() {
/* 240 */     return this.evidenze;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEvidenze(Set evidenze) {
/* 247 */     this.evidenze = evidenze;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getSottoscrEmittenti() {
/* 255 */     return this.sottoscrEmittenti;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSottoscrEmittenti(Set sottoscrEmittenti) {
/* 263 */     this.sottoscrEmittenti = sottoscrEmittenti;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVisibilita() {
/* 271 */     return this.visibilita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVisibilita(String visibilita) {
/* 279 */     this.visibilita = visibilita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getDisposizioniPagamento() {
/* 286 */     return this.disposizioniPagamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDisposizioniPagamento(Set disposizioniPagamento) {
/* 293 */     this.disposizioniPagamento = disposizioniPagamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGestioneArco() {
/* 301 */     return this.gestioneArco;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGestioneArco(String gestioneArco) {
/* 307 */     this.gestioneArco = gestioneArco;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinEmittente.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */