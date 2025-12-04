/*     */ package it.ras.flag.query;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ public class NormalizzatoreContainer
/*     */   implements Serializable
/*     */ {
/*     */   private String denominazione;
/*     */   private String cognome;
/*     */   private String nome;
/*     */   private String tiposogg;
/*     */   private Date datanascita;
/*     */   private String luogodinascita;
/*     */   private String provinciadinascita;
/*     */   private String codicefiscale;
/*     */   private String partitaiva;
/*     */   private String sesso;
/*     */   private String msg;
/*     */   private String codToponimo;
/*     */   private String desToponimo;
/*     */   private String indirizzo;
/*     */   private String numCivico;
/*     */   private String cap;
/*     */   private String localita;
/*     */   private String comune;
/*     */   private String prov;
/*     */   private String nazione;
/*     */   private String presso;
/*     */   private String cab;
/*     */   private String flag_normalizzato;
/*     */   private String indi_separato;
/*     */   private String error;
/*     */   private String error_des;
/*     */   private String error_name;
/*     */   private String error_name_des;
/*     */   private String error_cf;
/*     */   private String error_cf_des;
/*     */   private String error_piva;
/*     */   private String error_piva_des;
/*     */   private String error_sex;
/*     */   private String error_sex_des;
/*     */   private String error_loca;
/*     */   private String error_loca_des;
/*     */   private String error_via;
/*     */   private String error_via_des;
/*     */   
/*     */   public String getDenominazione() {
/*  50 */     return this.denominazione;
/*     */   }
/*     */   public void setDenominazione(String denominazione) {
/*  53 */     this.denominazione = denominazione;
/*     */   }
/*     */   public String getCognome() {
/*  56 */     return this.cognome;
/*     */   }
/*     */   public void setCognome(String cognome) {
/*  59 */     this.cognome = cognome;
/*     */   }
/*     */   public String getNome() {
/*  62 */     return this.nome;
/*     */   }
/*     */   public void setNome(String nome) {
/*  65 */     this.nome = nome;
/*     */   }
/*     */   public String getTiposogg() {
/*  68 */     return this.tiposogg;
/*     */   }
/*     */   public void setTiposogg(String tiposogg) {
/*  71 */     this.tiposogg = tiposogg;
/*     */   }
/*     */   public Date getDatanascita() {
/*  74 */     return this.datanascita;
/*     */   }
/*     */   public void setDatanascita(Date datanascita) {
/*  77 */     this.datanascita = datanascita;
/*     */   }
/*     */   public String getLuogodinascita() {
/*  80 */     return this.luogodinascita;
/*     */   }
/*     */   public void setLuogodinascita(String luogodinascita) {
/*  83 */     this.luogodinascita = luogodinascita;
/*     */   }
/*     */   public String getProvinciadinascita() {
/*  86 */     return this.provinciadinascita;
/*     */   }
/*     */   public void setProvinciadinascita(String provinciadinascita) {
/*  89 */     this.provinciadinascita = provinciadinascita;
/*     */   }
/*     */   public String getCodicefiscale() {
/*  92 */     return this.codicefiscale;
/*     */   }
/*     */   public void setCodicefiscale(String codicefiscale) {
/*  95 */     this.codicefiscale = codicefiscale;
/*     */   }
/*     */   public String getPartitaiva() {
/*  98 */     return this.partitaiva;
/*     */   }
/*     */   public void setPartitaiva(String partitaiva) {
/* 101 */     this.partitaiva = partitaiva;
/*     */   }
/*     */   public String getMsg() {
/* 104 */     return this.msg;
/*     */   }
/*     */   public void setMsg(String msg) {
/* 107 */     this.msg = msg;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSesso() {
/* 112 */     return this.sesso;
/*     */   }
/*     */   public void setSesso(String sesso) {
/* 115 */     this.sesso = sesso;
/*     */   }
/*     */   public String getError() {
/* 118 */     return this.error;
/*     */   }
/*     */   public void setError(String error) {
/* 121 */     this.error = error;
/*     */   }
/*     */   public String getError_des() {
/* 124 */     return this.error_des;
/*     */   }
/*     */   public void setError_des(String error_des) {
/* 127 */     this.error_des = error_des;
/*     */   }
/*     */   public String getError_name() {
/* 130 */     return this.error_name;
/*     */   }
/*     */   public void setError_name(String error_name) {
/* 133 */     this.error_name = error_name;
/*     */   }
/*     */   public String getError_name_des() {
/* 136 */     return this.error_name_des;
/*     */   }
/*     */   public void setError_name_des(String error_name_des) {
/* 139 */     this.error_name_des = error_name_des;
/*     */   }
/*     */   public String getError_cf() {
/* 142 */     return this.error_cf;
/*     */   }
/*     */   public void setError_cf(String error_cf) {
/* 145 */     this.error_cf = error_cf;
/*     */   }
/*     */   public String getError_cf_des() {
/* 148 */     return this.error_cf_des;
/*     */   }
/*     */   public void setError_cf_des(String error_cf_des) {
/* 151 */     this.error_cf_des = error_cf_des;
/*     */   }
/*     */   public String getError_piva() {
/* 154 */     return this.error_piva;
/*     */   }
/*     */   public void setError_piva(String error_piva) {
/* 157 */     this.error_piva = error_piva;
/*     */   }
/*     */   public String getError_piva_des() {
/* 160 */     return this.error_piva_des;
/*     */   }
/*     */   public void setError_piva_des(String error_piva_des) {
/* 163 */     this.error_piva_des = error_piva_des;
/*     */   }
/*     */   public String getError_sex() {
/* 166 */     return this.error_sex;
/*     */   }
/*     */   public void setError_sex(String error_sex) {
/* 169 */     this.error_sex = error_sex;
/*     */   }
/*     */   public String getError_sex_des() {
/* 172 */     return this.error_sex_des;
/*     */   }
/*     */   public void setError_sex_des(String error_sex_des) {
/* 175 */     this.error_sex_des = error_sex_des;
/*     */   }
/*     */   public String getCodToponimo() {
/* 178 */     return this.codToponimo;
/*     */   }
/*     */   public void setCodToponimo(String codToponimo) {
/* 181 */     this.codToponimo = codToponimo;
/*     */   }
/*     */   public String getDesToponimo() {
/* 184 */     return this.desToponimo;
/*     */   }
/*     */   public void setDesToponimo(String desToponimo) {
/* 187 */     this.desToponimo = desToponimo;
/*     */   }
/*     */   public String getIndirizzo() {
/* 190 */     return this.indirizzo;
/*     */   }
/*     */   public void setIndirizzo(String indirizzo) {
/* 193 */     this.indirizzo = indirizzo;
/*     */   }
/*     */   public String getNumCivico() {
/* 196 */     return this.numCivico;
/*     */   }
/*     */   public void setNumCivico(String numCivico) {
/* 199 */     this.numCivico = numCivico;
/*     */   }
/*     */   public String getCap() {
/* 202 */     return this.cap;
/*     */   }
/*     */   public void setCap(String cap) {
/* 205 */     this.cap = cap;
/*     */   }
/*     */   public String getLocalita() {
/* 208 */     return this.localita;
/*     */   }
/*     */   public void setLocalita(String localita) {
/* 211 */     this.localita = localita;
/*     */   }
/*     */   public String getComune() {
/* 214 */     return this.comune;
/*     */   }
/*     */   public void setComune(String comune) {
/* 217 */     this.comune = comune;
/*     */   }
/*     */   public String getProv() {
/* 220 */     return this.prov;
/*     */   }
/*     */   public void setProv(String prov) {
/* 223 */     this.prov = prov;
/*     */   }
/*     */   public String getNazione() {
/* 226 */     return this.nazione;
/*     */   }
/*     */   public void setNazione(String nazione) {
/* 229 */     this.nazione = nazione;
/*     */   }
/*     */   public String getPresso() {
/* 232 */     return this.presso;
/*     */   }
/*     */   public void setPresso(String presso) {
/* 235 */     this.presso = presso;
/*     */   }
/*     */   public String getCab() {
/* 238 */     return this.cab;
/*     */   }
/*     */   public void setCab(String cab) {
/* 241 */     this.cab = cab;
/*     */   }
/*     */   public String getFlag_normalizzato() {
/* 244 */     return this.flag_normalizzato;
/*     */   }
/*     */   public void setFlag_normalizzato(String flagNormalizzato) {
/* 247 */     this.flag_normalizzato = flagNormalizzato;
/*     */   }
/*     */   public String getIndi_separato() {
/* 250 */     return this.indi_separato;
/*     */   }
/*     */   public void setIndi_separato(String indiSeparato) {
/* 253 */     this.indi_separato = indiSeparato;
/*     */   }
/*     */   public String getError_loca() {
/* 256 */     return this.error_loca;
/*     */   }
/*     */   public void setError_loca(String errorLoca) {
/* 259 */     this.error_loca = errorLoca;
/*     */   }
/*     */   public String getError_loca_des() {
/* 262 */     return this.error_loca_des;
/*     */   }
/*     */   public void setError_loca_des(String errorLocaDes) {
/* 265 */     this.error_loca_des = errorLocaDes;
/*     */   }
/*     */   public String getError_via() {
/* 268 */     return this.error_via;
/*     */   }
/*     */   public void setError_via(String errorVia) {
/* 271 */     this.error_via = errorVia;
/*     */   }
/*     */   public String getError_via_des() {
/* 274 */     return this.error_via_des;
/*     */   }
/*     */   public void setError_via_des(String errorViaDes) {
/* 277 */     this.error_via_des = errorViaDes;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\query\NormalizzatoreContainer.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */