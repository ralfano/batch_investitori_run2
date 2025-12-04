/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxSecAssegni
/*     */ {
/*     */   private Integer flxId;
/*     */   private String filialeRapporto;
/*     */   private String categoriaRapporto;
/*     */   private String numeroPartita;
/*     */   private String numeroCarnet;
/*     */   private Date dataEmissione;
/*     */   private String statoAssegno1;
/*     */   private String statoAssegno2;
/*     */   private String statoAssegno3;
/*     */   private String statoAssegno4;
/*     */   private String statoAssegno5;
/*     */   private String statoAssegno6;
/*     */   private String statoAssegno7;
/*     */   private String statoAssegno8;
/*     */   private String statoAssegno9;
/*     */   private String statoAssegno10;
/*     */   private String statoAssegno11;
/*     */   private String statoAssegno12;
/*     */   private String statoAssegno13;
/*     */   private String statoAssegno14;
/*     */   private String statoAssegno15;
/*     */   private String statoAssegno16;
/*     */   private String statoAssegno17;
/*     */   private String statoAssegno18;
/*     */   private String statoAssegno19;
/*     */   private String statoAssegno20;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElaborazione;
/*     */   
/*     */   public FlxSecAssegni(String rapporto, Date caricamento, Date elaborazione, Date emissione, String errore, String rapporto2, Integer id, String istanza, String carnet, String partita, String assegno1, String assegno10, String assegno11, String assegno12, String assegno13, String assegno14, String assegno15, String assegno16, String assegno17, String assegno18, String assegno19, String assegno2, String assegno20, String assegno3, String assegno4, String assegno5, String assegno6, String assegno7, String assegno8, String assegno9, String elab) {
/*  44 */     this.categoriaRapporto = rapporto;
/*  45 */     this.dataCaricamento = caricamento;
/*  46 */     this.dataElaborazione = elaborazione;
/*  47 */     this.dataEmissione = emissione;
/*  48 */     this.descrizioneErrore = errore;
/*  49 */     this.filialeRapporto = rapporto2;
/*  50 */     this.flxId = id;
/*  51 */     this.istanza = istanza;
/*  52 */     this.numeroCarnet = carnet;
/*  53 */     this.numeroPartita = partita;
/*  54 */     this.statoAssegno1 = assegno1;
/*  55 */     this.statoAssegno10 = assegno10;
/*  56 */     this.statoAssegno11 = assegno11;
/*  57 */     this.statoAssegno12 = assegno12;
/*  58 */     this.statoAssegno13 = assegno13;
/*  59 */     this.statoAssegno14 = assegno14;
/*  60 */     this.statoAssegno15 = assegno15;
/*  61 */     this.statoAssegno16 = assegno16;
/*  62 */     this.statoAssegno17 = assegno17;
/*  63 */     this.statoAssegno18 = assegno18;
/*  64 */     this.statoAssegno19 = assegno19;
/*  65 */     this.statoAssegno2 = assegno2;
/*  66 */     this.statoAssegno20 = assegno20;
/*  67 */     this.statoAssegno3 = assegno3;
/*  68 */     this.statoAssegno4 = assegno4;
/*  69 */     this.statoAssegno5 = assegno5;
/*  70 */     this.statoAssegno6 = assegno6;
/*  71 */     this.statoAssegno7 = assegno7;
/*  72 */     this.statoAssegno8 = assegno8;
/*  73 */     this.statoAssegno9 = assegno9;
/*  74 */     this.statoElab = elab;
/*     */   }
/*     */   
/*     */   public Date getDataElaborazione() {
/*  78 */     return this.dataElaborazione;
/*     */   }
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/*  82 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  86 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  90 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecAssegni(String rapporto, Date caricamento, Date emissione, String rapporto2, Integer id, String istanza, String carnet, String partita, String assegno1, String assegno10, String assegno11, String assegno12, String assegno13, String assegno14, String assegno15, String assegno16, String assegno17, String assegno18, String assegno19, String assegno2, String assegno20, String assegno3, String assegno4, String assegno5, String assegno6, String assegno7, String assegno8, String assegno9, String elab) {
/*  96 */     this.categoriaRapporto = rapporto;
/*  97 */     this.dataCaricamento = caricamento;
/*  98 */     this.dataEmissione = emissione;
/*  99 */     this.filialeRapporto = rapporto2;
/* 100 */     this.flxId = id;
/* 101 */     this.istanza = istanza;
/* 102 */     this.numeroCarnet = carnet;
/* 103 */     this.numeroPartita = partita;
/* 104 */     this.statoAssegno1 = assegno1;
/* 105 */     this.statoAssegno10 = assegno10;
/* 106 */     this.statoAssegno11 = assegno11;
/* 107 */     this.statoAssegno12 = assegno12;
/* 108 */     this.statoAssegno13 = assegno13;
/* 109 */     this.statoAssegno14 = assegno14;
/* 110 */     this.statoAssegno15 = assegno15;
/* 111 */     this.statoAssegno16 = assegno16;
/* 112 */     this.statoAssegno17 = assegno17;
/* 113 */     this.statoAssegno18 = assegno18;
/* 114 */     this.statoAssegno19 = assegno19;
/* 115 */     this.statoAssegno2 = assegno2;
/* 116 */     this.statoAssegno20 = assegno20;
/* 117 */     this.statoAssegno3 = assegno3;
/* 118 */     this.statoAssegno4 = assegno4;
/* 119 */     this.statoAssegno5 = assegno5;
/* 120 */     this.statoAssegno6 = assegno6;
/* 121 */     this.statoAssegno7 = assegno7;
/* 122 */     this.statoAssegno8 = assegno8;
/* 123 */     this.statoAssegno9 = assegno9;
/* 124 */     this.statoElab = elab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecAssegni() {}
/*     */ 
/*     */   
/*     */   public String getCategoriaRapporto() {
/* 133 */     return this.categoriaRapporto;
/*     */   }
/*     */   
/*     */   public void setCategoriaRapporto(String categoriaRapporto) {
/* 137 */     this.categoriaRapporto = categoriaRapporto;
/*     */   }
/*     */   
/*     */   public Date getDataEmissione() {
/* 141 */     return this.dataEmissione;
/*     */   }
/*     */   
/*     */   public void setDataEmissione(Date dataEmissione) {
/* 145 */     this.dataEmissione = dataEmissione;
/*     */   }
/*     */   
/*     */   public String getFilialeRapporto() {
/* 149 */     return this.filialeRapporto;
/*     */   }
/*     */   
/*     */   public void setFilialeRapporto(String filialeRapporto) {
/* 153 */     this.filialeRapporto = filialeRapporto;
/*     */   }
/*     */   
/*     */   public Integer getFlxId() {
/* 157 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 161 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 165 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 169 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getNumeroCarnet() {
/* 173 */     return this.numeroCarnet;
/*     */   }
/*     */   
/*     */   public void setNumeroCarnet(String numeroCarnet) {
/* 177 */     this.numeroCarnet = numeroCarnet;
/*     */   }
/*     */   
/*     */   public String getNumeroPartita() {
/* 181 */     return this.numeroPartita;
/*     */   }
/*     */   
/*     */   public void setNumeroPartita(String numeroPartita) {
/* 185 */     this.numeroPartita = numeroPartita;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno1() {
/* 189 */     return this.statoAssegno1;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno1(String statoAssegno1) {
/* 193 */     this.statoAssegno1 = statoAssegno1;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno10() {
/* 197 */     return this.statoAssegno10;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno10(String statoAssegno10) {
/* 201 */     this.statoAssegno10 = statoAssegno10;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno11() {
/* 205 */     return this.statoAssegno11;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno11(String statoAssegno11) {
/* 209 */     this.statoAssegno11 = statoAssegno11;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno12() {
/* 213 */     return this.statoAssegno12;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno12(String statoAssegno12) {
/* 217 */     this.statoAssegno12 = statoAssegno12;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno13() {
/* 221 */     return this.statoAssegno13;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno13(String statoAssegno13) {
/* 225 */     this.statoAssegno13 = statoAssegno13;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno14() {
/* 229 */     return this.statoAssegno14;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno14(String statoAssegno14) {
/* 233 */     this.statoAssegno14 = statoAssegno14;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno15() {
/* 237 */     return this.statoAssegno15;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno15(String statoAssegno15) {
/* 241 */     this.statoAssegno15 = statoAssegno15;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno16() {
/* 245 */     return this.statoAssegno16;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno16(String statoAssegno16) {
/* 249 */     this.statoAssegno16 = statoAssegno16;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno17() {
/* 253 */     return this.statoAssegno17;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno17(String statoAssegno17) {
/* 257 */     this.statoAssegno17 = statoAssegno17;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno18() {
/* 261 */     return this.statoAssegno18;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno18(String statoAssegno18) {
/* 265 */     this.statoAssegno18 = statoAssegno18;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno19() {
/* 269 */     return this.statoAssegno19;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno19(String statoAssegno19) {
/* 273 */     this.statoAssegno19 = statoAssegno19;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno2() {
/* 277 */     return this.statoAssegno2;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno2(String statoAssegno2) {
/* 281 */     this.statoAssegno2 = statoAssegno2;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno20() {
/* 285 */     return this.statoAssegno20;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno20(String statoAssegno20) {
/* 289 */     this.statoAssegno20 = statoAssegno20;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno3() {
/* 293 */     return this.statoAssegno3;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno3(String statoAssegno3) {
/* 297 */     this.statoAssegno3 = statoAssegno3;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno4() {
/* 301 */     return this.statoAssegno4;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno4(String statoAssegno4) {
/* 305 */     this.statoAssegno4 = statoAssegno4;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno5() {
/* 309 */     return this.statoAssegno5;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno5(String statoAssegno5) {
/* 313 */     this.statoAssegno5 = statoAssegno5;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno6() {
/* 317 */     return this.statoAssegno6;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno6(String statoAssegno6) {
/* 321 */     this.statoAssegno6 = statoAssegno6;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno7() {
/* 325 */     return this.statoAssegno7;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno7(String statoAssegno7) {
/* 329 */     this.statoAssegno7 = statoAssegno7;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno8() {
/* 333 */     return this.statoAssegno8;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno8(String statoAssegno8) {
/* 337 */     this.statoAssegno8 = statoAssegno8;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno9() {
/* 341 */     return this.statoAssegno9;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno9(String statoAssegno9) {
/* 345 */     this.statoAssegno9 = statoAssegno9;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 349 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 353 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/* 357 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 361 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecAssegni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */