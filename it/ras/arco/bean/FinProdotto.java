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
/*     */ public class FinProdotto
/*     */   extends FinAbstractParametrizedBean
/*     */ {
/*     */   private Integer prodottoID;
/*     */   private FinAccorpamento accorpamento;
/*     */   private String tipo;
/*     */   private String areaMO;
/*     */   private String area;
/*     */   private String sottoareaT;
/*     */   private String descrizioneS;
/*     */   private String codiceProdottoExt;
/*     */   private String visibilitaCP;
/*     */   private String gestioneArco;
/*     */   private FinEmittente emittente;
/*     */   private Date dataInserimento;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private String utenteInserimento;
/*     */   private String ricercaSingola;
/*     */   private String parametroFep;
/*     */   private Set attFin;
/*     */   private Set contrattoTerzi;
/*     */   
/*     */   public Set getContrattoTerzi() {
/*  72 */     return this.contrattoTerzi;
/*     */   }
/*     */   
/*     */   public void setContrattoTerzi(Set contrattoTerzi) {
/*  76 */     this.contrattoTerzi = contrattoTerzi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinProdotto(String area, String areamo, Set fin, String ext, Set terzi, Date fine, Date inizio, Date inserimento, String descriziones, FinEmittente emittente, String arco, String fep, Integer prodottoid, String singola, String sottoareat, String tipo, String inserimento2, String visibilitacp) {
/*  82 */     this.area = area;
/*  83 */     this.areaMO = areamo;
/*  84 */     this.attFin = fin;
/*  85 */     this.codiceProdottoExt = ext;
/*  86 */     this.contrattoTerzi = terzi;
/*  87 */     this.dataFine = fine;
/*  88 */     this.dataInizio = inizio;
/*  89 */     this.dataInserimento = inserimento;
/*  90 */     this.descrizioneS = descriziones;
/*  91 */     this.emittente = emittente;
/*  92 */     this.gestioneArco = arco;
/*  93 */     this.parametroFep = fep;
/*  94 */     this.prodottoID = prodottoid;
/*  95 */     this.ricercaSingola = singola;
/*  96 */     this.sottoareaT = sottoareat;
/*  97 */     this.tipo = tipo;
/*  98 */     this.utenteInserimento = inserimento2;
/*  99 */     this.visibilitaCP = visibilitacp;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinProdotto(String ricercaSingola, String area, Set fin, String ext, Date fine, Date inizio, Date inserimento, String descriziones, FinEmittente emittente, Integer prodottoid, String sottoareat, String tipo, String inserimento2, String visibilitacp) {
/* 108 */     this.area = area;
/* 109 */     this.attFin = fin;
/* 110 */     this.codiceProdottoExt = ext;
/* 111 */     this.dataFine = fine;
/* 112 */     this.dataInizio = inizio;
/* 113 */     this.dataInserimento = inserimento;
/* 114 */     this.descrizioneS = descriziones;
/* 115 */     this.emittente = emittente;
/* 116 */     this.prodottoID = prodottoid;
/* 117 */     this.sottoareaT = sottoareat;
/* 118 */     this.tipo = tipo;
/* 119 */     this.utenteInserimento = inserimento2;
/* 120 */     this.visibilitaCP = visibilitacp;
/* 121 */     this.ricercaSingola = ricercaSingola;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinProdotto() {}
/*     */ 
/*     */   
/*     */   public FinProdotto(Set attFin) {
/* 130 */     this.attFin = attFin;
/*     */   }
/*     */   
/*     */   public Integer getProdottoID() {
/* 134 */     return this.prodottoID;
/*     */   }
/*     */   
/*     */   public void setProdottoID(Integer prodottoID) {
/* 138 */     this.prodottoID = prodottoID;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipo() {
/* 149 */     return this.tipo;
/*     */   }
/*     */   
/*     */   public void setTipo(String tipo) {
/* 153 */     this.tipo = tipo;
/*     */   }
/*     */   
/*     */   public String getArea() {
/* 157 */     return this.area;
/*     */   }
/*     */   
/*     */   public void setArea(String area) {
/* 161 */     this.area = area;
/*     */   }
/*     */   
/*     */   public String getSottoareaT() {
/* 165 */     return this.sottoareaT;
/*     */   }
/*     */   
/*     */   public void setSottoareaT(String sottoareaT) {
/* 169 */     this.sottoareaT = sottoareaT;
/*     */   }
/*     */   
/*     */   public String getDescrizioneS() {
/* 173 */     return this.descrizioneS;
/*     */   }
/*     */   
/*     */   public void setDescrizioneS(String descrizioneS) {
/* 177 */     this.descrizioneS = descrizioneS;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 181 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 185 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 189 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 193 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 197 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 201 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/* 205 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 209 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   
/*     */   public FinEmittente getEmittente() {
/* 213 */     return this.emittente;
/*     */   }
/*     */   
/*     */   public void setEmittente(FinEmittente emittente) {
/* 217 */     this.emittente = emittente;
/*     */   }
/*     */   
/*     */   public Set getAttFin() {
/* 221 */     return this.attFin;
/*     */   }
/*     */   
/*     */   public void setAttFin(Set attFin) {
/* 225 */     this.attFin = attFin;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 229 */     return (new ToStringBuilder(this)).append("prodottoID", getProdottoID()).toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataFine() {
/* 234 */     return this.dataFine;
/*     */   }
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/* 238 */     this.dataFine = dataFine;
/*     */   }
/*     */   
/*     */   public Date getDataInizio() {
/* 242 */     return this.dataInizio;
/*     */   }
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/* 246 */     this.dataInizio = dataInizio;
/*     */   }
/*     */   
/*     */   public String getVisibilitaCP() {
/* 250 */     return this.visibilitaCP;
/*     */   }
/*     */   
/*     */   public void setVisibilitaCP(String visibilitaCP) {
/* 254 */     this.visibilitaCP = visibilitaCP;
/*     */   }
/*     */   
/*     */   public String getCodiceProdottoExt() {
/* 258 */     return this.codiceProdottoExt;
/*     */   }
/*     */   
/*     */   public void setCodiceProdottoExt(String codiceProdottoExt) {
/* 262 */     this.codiceProdottoExt = codiceProdottoExt;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/* 268 */     if (!(obj instanceof FinProdotto)) {
/* 269 */       return false;
/*     */     }
/* 271 */     if (obj == null) {
/* 272 */       return false;
/*     */     }
/* 274 */     if (this == obj) {
/* 275 */       return true;
/*     */     }
/*     */     
/* 278 */     FinProdotto prodotto = (FinProdotto)obj;
/* 279 */     return (new EqualsBuilder()).append(this.emittente.getEmittenteId(), prodotto.emittente.getEmittenteId()).append(this.area, prodotto.area).append(this.sottoareaT, prodotto.sottoareaT).append(this.descrizioneS, prodotto.descrizioneS).isEquals();
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 302 */     HashCodeBuilder hash = (new HashCodeBuilder(11, 41)).append(this.area).append(this.sottoareaT).append(this.descrizioneS);
/*     */     
/* 304 */     if (this.emittente != null) {
/* 305 */       hash.append(this.emittente.getEmittenteId());
/*     */     }
/*     */     
/* 308 */     return hash.toHashCode();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void accept(IGSTDInitVisitor visitor) {
/* 318 */     super.accept(visitor);
/*     */     
/*     */     try {
/* 321 */       if (getAttFin() != null && getAttFin().size() > 0) {
/* 322 */         for (Iterator iter = getAttFin().iterator(); iter.hasNext(); ) {
/* 323 */           FinProdottoLinea element = iter.next();
/* 324 */           element.accept(visitor);
/*     */         } 
/*     */       }
/* 327 */     } catch (Exception e) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRicercaSingola() {
/* 336 */     return this.ricercaSingola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRicercaSingola(String ricercaSingola) {
/* 344 */     this.ricercaSingola = ricercaSingola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGestioneArco() {
/* 351 */     return this.gestioneArco;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGestioneArco(String gestioneArco) {
/* 359 */     this.gestioneArco = gestioneArco;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAreaMO() {
/* 366 */     return this.areaMO;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAreaMO(String areaMO) {
/* 374 */     this.areaMO = areaMO;
/*     */   }
/*     */   
/*     */   public String getParametroFep() {
/* 378 */     return this.parametroFep;
/*     */   }
/*     */   
/*     */   public void setParametroFep(String parametroFep) {
/* 382 */     this.parametroFep = parametroFep;
/*     */   }
/*     */   
/*     */   public FinAccorpamento getAccorpamento() {
/* 386 */     return this.accorpamento;
/*     */   }
/*     */   
/*     */   public void setAccorpamento(FinAccorpamento accorpamento) {
/* 390 */     this.accorpamento = accorpamento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinProdotto.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */