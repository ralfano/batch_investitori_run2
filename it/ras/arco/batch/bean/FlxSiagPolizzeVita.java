/*     */ package it.ras.arco.batch.bean;
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
/*     */ public class FlxSiagPolizzeVita
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   Integer flxId;
/*     */   Date dataElab;
/*     */   String descrErrore;
/*     */   String flgElab;
/*     */   Integer codSoggSiag;
/*     */   Integer codCliePorfCcor;
/*     */   String codFisc;
/*     */   Integer codComp;
/*     */   Integer codNumeCntr;
/*     */   Integer codArchProz;
/*     */   Integer codRamo;
/*     */   Integer codCana;
/*     */   String codTipoCana;
/*     */   Integer codAgenCopt;
/*     */   Integer codSuba;
/*     */   Integer codAcqu;
/*     */   String codProd;
/*     */   Integer numVersProd;
/*     */   String codProm;
/*     */   Integer codCnvz;
/*     */   Integer codFraz;
/*     */   String codTipoOperVita;
/*     */   String codTipoOper;
/*     */   String codPromFina;
/*     */   String flgTipoFondo;
/*     */   String flgTfondElab;
/*     */   Integer codLibe;
/*     */   Date datDecoPoli;
/*     */   Date datTermAggr;
/*     */   Date datSolpCntr;
/*     */   Date datContEmes;
/*     */   String flgPrem;
/*     */   String flgPres;
/*     */   String codCopePrmr;
/*     */   String codCopeSeco;
/*     */   Double impAnnuPremVita;
/*     */   Double impPremVitaUnic;
/*     */   Double impPreVitaAnnCr;
/*     */   Double impPrvVitAnnCr;
/*     */   Double impRiseMate;
/*     */   Double impCaptLiqu;
/*     */   Double impCaptScad;
/*     */   Double impRend;
/*     */   Double impPremAggn;
/*     */   Double impPres;
/*     */   Integer annRifeImpo;
/*     */   String codFondo;
/*     */   String desFondo;
/*     */   String codPercorso;
/*     */   String desPercorso;
/*     */   Double impRataIniz;
/*     */   Double impRataAtt;
/*     */   Double impValattInv;
/*     */   Double numQuoteFondo;
/*     */   Double valQuotaFondo;
/*     */   String codCatProd1;
/*     */   String desCatProd1;
/*     */   String codCatProd2;
/*     */   String desCatProd2;
/*     */   String codCatProd3;
/*     */   String desCatProd3;
/*     */   String codCatProd4;
/*     */   String desCatProd4;
/*     */   Integer codUltiCntrCol;
/*     */   Date datElab;
/*     */   String codReteFina;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   
/*     */   public FlxSiagPolizzeVita(Integer flxId, String flgElab, Integer codSoggSiag, Integer codCliePorfCcor, String codFisc, Integer codComp, Integer codNumeCntr, Integer codArchProz, Integer codRamo, Integer codCana, String codTipoCana, Integer codAgenCopt, Integer codSuba, Integer codAcqu, String codProd, Integer numVersProd, String codProm, Integer codCnvz, Integer codFraz, String codTipoOperVita, String codTipoOper, String codPromFina, String flgTipoFondo, String flgTfondElab, Integer codLibe, Date datDecoPoli, Date datTermAggr, Date datSolpCntr, Date datContEmes, String flgPrem, String flgPres, String codCopePrmr, String codCopeSeco, Double impAnnuPremVita, Double impPremVitaUnic, Double impPreVitaAnnCr, Double impPrvVitAnnCr, Double impRiseMate, Double impCaptLiqu, Double impCaptScad, Double impRend, Double impPremAggn, Double impPres, Integer annRifeImpo, String codFondo, String desFondo, String codPercorso, String desPercorso, Double impRataIniz, Double impRataAtt, Double impValattInv, Double numQuoteFondo, Double valQuotaFondo, String codCatProd1, String desCatProd1, String codCatProd2, String desCatProd2, String codCatProd3, String desCatProd3, String codCatProd4, String desCatProd4, Integer codUltiCntrCol, Date datElab, String codReteFina, String statoElab, String istanza) {
/* 219 */     this.flxId = flxId;
/* 220 */     this.flgElab = flgElab;
/* 221 */     this.codSoggSiag = codSoggSiag;
/* 222 */     this.codCliePorfCcor = codCliePorfCcor;
/* 223 */     this.codFisc = codFisc;
/* 224 */     this.codComp = codComp;
/* 225 */     this.codNumeCntr = codNumeCntr;
/* 226 */     this.codArchProz = codArchProz;
/* 227 */     this.codRamo = codRamo;
/* 228 */     this.codCana = codCana;
/* 229 */     this.codTipoCana = codTipoCana;
/* 230 */     this.codAgenCopt = codAgenCopt;
/* 231 */     this.codSuba = codSuba;
/* 232 */     this.codAcqu = codAcqu;
/* 233 */     this.codProd = codProd;
/* 234 */     this.numVersProd = numVersProd;
/* 235 */     this.codProm = codProm;
/* 236 */     this.codCnvz = codCnvz;
/* 237 */     this.codFraz = codFraz;
/* 238 */     this.codTipoOperVita = codTipoOperVita;
/* 239 */     this.codTipoOper = codTipoOper;
/* 240 */     this.codPromFina = codPromFina;
/* 241 */     this.flgTipoFondo = flgTipoFondo;
/* 242 */     this.flgTfondElab = flgTfondElab;
/* 243 */     this.codLibe = codLibe;
/* 244 */     this.datDecoPoli = datDecoPoli;
/* 245 */     this.datTermAggr = datTermAggr;
/* 246 */     this.datSolpCntr = datSolpCntr;
/* 247 */     this.datContEmes = datContEmes;
/* 248 */     this.flgPrem = flgPrem;
/* 249 */     this.flgPres = flgPres;
/* 250 */     this.codCopePrmr = codCopePrmr;
/* 251 */     this.codCopeSeco = codCopeSeco;
/* 252 */     this.impAnnuPremVita = impAnnuPremVita;
/* 253 */     this.impPremVitaUnic = impPremVitaUnic;
/* 254 */     this.impPreVitaAnnCr = impPreVitaAnnCr;
/* 255 */     this.impPrvVitAnnCr = impPrvVitAnnCr;
/* 256 */     this.impRiseMate = impRiseMate;
/* 257 */     this.impCaptLiqu = impCaptLiqu;
/* 258 */     this.impCaptScad = impCaptScad;
/* 259 */     this.impRend = impRend;
/* 260 */     this.impPremAggn = impPremAggn;
/* 261 */     this.impPres = impPres;
/* 262 */     this.annRifeImpo = annRifeImpo;
/* 263 */     this.codFondo = codFondo;
/* 264 */     this.desFondo = desFondo;
/* 265 */     this.codPercorso = codPercorso;
/* 266 */     this.desPercorso = desPercorso;
/* 267 */     this.impRataIniz = impRataIniz;
/* 268 */     this.impRataAtt = impRataAtt;
/* 269 */     this.impValattInv = impValattInv;
/* 270 */     this.numQuoteFondo = numQuoteFondo;
/* 271 */     this.valQuotaFondo = valQuotaFondo;
/* 272 */     this.codCatProd1 = codCatProd1;
/* 273 */     this.desCatProd1 = desCatProd1;
/* 274 */     this.codCatProd2 = codCatProd2;
/* 275 */     this.desCatProd2 = desCatProd2;
/* 276 */     this.codCatProd3 = codCatProd3;
/* 277 */     this.desCatProd3 = desCatProd3;
/* 278 */     this.codCatProd4 = codCatProd4;
/* 279 */     this.desCatProd4 = desCatProd4;
/* 280 */     this.codUltiCntrCol = codUltiCntrCol;
/* 281 */     this.datElab = datElab;
/* 282 */     this.codReteFina = codReteFina;
/* 283 */     this.statoElab = statoElab;
/* 284 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxSiagPolizzeVita() {}
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 292 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 296 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 300 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 304 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public Integer getFlxId() {
/* 308 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 312 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public Integer getAnnRifeImpo() {
/* 316 */     return this.annRifeImpo;
/*     */   }
/*     */   
/*     */   public void setAnnRifeImpo(Integer annRifeImpo) {
/* 320 */     this.annRifeImpo = annRifeImpo;
/*     */   }
/*     */   
/*     */   public Integer getCodAcqu() {
/* 324 */     return this.codAcqu;
/*     */   }
/*     */   
/*     */   public void setCodAcqu(Integer codAcqu) {
/* 328 */     this.codAcqu = codAcqu;
/*     */   }
/*     */   
/*     */   public Integer getCodAgenCopt() {
/* 332 */     return this.codAgenCopt;
/*     */   }
/*     */   
/*     */   public void setCodAgenCopt(Integer codAgenCopt) {
/* 336 */     this.codAgenCopt = codAgenCopt;
/*     */   }
/*     */   
/*     */   public Integer getCodArchProz() {
/* 340 */     return this.codArchProz;
/*     */   }
/*     */   
/*     */   public void setCodArchProz(Integer codArchProz) {
/* 344 */     this.codArchProz = codArchProz;
/*     */   }
/*     */   
/*     */   public Integer getCodCana() {
/* 348 */     return this.codCana;
/*     */   }
/*     */   
/*     */   public void setCodCana(Integer codCana) {
/* 352 */     this.codCana = codCana;
/*     */   }
/*     */   
/*     */   public String getCodCatProd1() {
/* 356 */     return this.codCatProd1;
/*     */   }
/*     */   
/*     */   public void setCodCatProd1(String codCatProd1) {
/* 360 */     this.codCatProd1 = codCatProd1;
/*     */   }
/*     */   
/*     */   public String getCodCatProd2() {
/* 364 */     return this.codCatProd2;
/*     */   }
/*     */   
/*     */   public void setCodCatProd2(String codCatProd2) {
/* 368 */     this.codCatProd2 = codCatProd2;
/*     */   }
/*     */   
/*     */   public String getCodCatProd3() {
/* 372 */     return this.codCatProd3;
/*     */   }
/*     */   
/*     */   public void setCodCatProd3(String codCatProd3) {
/* 376 */     this.codCatProd3 = codCatProd3;
/*     */   }
/*     */   
/*     */   public String getCodCatProd4() {
/* 380 */     return this.codCatProd4;
/*     */   }
/*     */   
/*     */   public void setCodCatProd4(String codCatProd4) {
/* 384 */     this.codCatProd4 = codCatProd4;
/*     */   }
/*     */   
/*     */   public Integer getCodCliePorfCcor() {
/* 388 */     return this.codCliePorfCcor;
/*     */   }
/*     */   
/*     */   public void setCodCliePorfCcor(Integer codCliePorfCcor) {
/* 392 */     this.codCliePorfCcor = codCliePorfCcor;
/*     */   }
/*     */   
/*     */   public Integer getCodCnvz() {
/* 396 */     return this.codCnvz;
/*     */   }
/*     */   
/*     */   public void setCodCnvz(Integer codCnvz) {
/* 400 */     this.codCnvz = codCnvz;
/*     */   }
/*     */   
/*     */   public Integer getCodComp() {
/* 404 */     return this.codComp;
/*     */   }
/*     */   
/*     */   public void setCodComp(Integer codComp) {
/* 408 */     this.codComp = codComp;
/*     */   }
/*     */   
/*     */   public String getCodCopePrmr() {
/* 412 */     return this.codCopePrmr;
/*     */   }
/*     */   
/*     */   public void setCodCopePrmr(String codCopePrmr) {
/* 416 */     this.codCopePrmr = codCopePrmr;
/*     */   }
/*     */   
/*     */   public String getCodCopeSeco() {
/* 420 */     return this.codCopeSeco;
/*     */   }
/*     */   
/*     */   public void setCodCopeSeco(String codCopeSeco) {
/* 424 */     this.codCopeSeco = codCopeSeco;
/*     */   }
/*     */   
/*     */   public String getCodFisc() {
/* 428 */     return this.codFisc;
/*     */   }
/*     */   
/*     */   public void setCodFisc(String codFisc) {
/* 432 */     this.codFisc = codFisc;
/*     */   }
/*     */   
/*     */   public String getCodFondo() {
/* 436 */     return this.codFondo;
/*     */   }
/*     */   
/*     */   public void setCodFondo(String codFondo) {
/* 440 */     this.codFondo = codFondo;
/*     */   }
/*     */   
/*     */   public Integer getCodFraz() {
/* 444 */     return this.codFraz;
/*     */   }
/*     */   
/*     */   public void setCodFraz(Integer codFraz) {
/* 448 */     this.codFraz = codFraz;
/*     */   }
/*     */   
/*     */   public Integer getCodLibe() {
/* 452 */     return this.codLibe;
/*     */   }
/*     */   
/*     */   public void setCodLibe(Integer codLibe) {
/* 456 */     this.codLibe = codLibe;
/*     */   }
/*     */   
/*     */   public Integer getCodNumeCntr() {
/* 460 */     return this.codNumeCntr;
/*     */   }
/*     */   
/*     */   public void setCodNumeCntr(Integer codNumeCntr) {
/* 464 */     this.codNumeCntr = codNumeCntr;
/*     */   }
/*     */   
/*     */   public String getCodPercorso() {
/* 468 */     return this.codPercorso;
/*     */   }
/*     */   
/*     */   public void setCodPercorso(String codPercorso) {
/* 472 */     this.codPercorso = codPercorso;
/*     */   }
/*     */   
/*     */   public String getCodProd() {
/* 476 */     return this.codProd;
/*     */   }
/*     */   
/*     */   public void setCodProd(String codProd) {
/* 480 */     this.codProd = codProd;
/*     */   }
/*     */   
/*     */   public String getCodProm() {
/* 484 */     return this.codProm;
/*     */   }
/*     */   
/*     */   public void setCodProm(String codProm) {
/* 488 */     this.codProm = codProm;
/*     */   }
/*     */   
/*     */   public String getCodPromFina() {
/* 492 */     return this.codPromFina;
/*     */   }
/*     */   
/*     */   public void setCodPromFina(String codPromFina) {
/* 496 */     this.codPromFina = codPromFina;
/*     */   }
/*     */   
/*     */   public Integer getCodRamo() {
/* 500 */     return this.codRamo;
/*     */   }
/*     */   
/*     */   public void setCodRamo(Integer codRamo) {
/* 504 */     this.codRamo = codRamo;
/*     */   }
/*     */   
/*     */   public String getCodReteFina() {
/* 508 */     return this.codReteFina;
/*     */   }
/*     */   
/*     */   public void setCodReteFina(String codReteFina) {
/* 512 */     this.codReteFina = codReteFina;
/*     */   }
/*     */   
/*     */   public Integer getCodSoggSiag() {
/* 516 */     return this.codSoggSiag;
/*     */   }
/*     */   
/*     */   public void setCodSoggSiag(Integer codSoggSiag) {
/* 520 */     this.codSoggSiag = codSoggSiag;
/*     */   }
/*     */   
/*     */   public Integer getCodSuba() {
/* 524 */     return this.codSuba;
/*     */   }
/*     */   
/*     */   public void setCodSuba(Integer codSuba) {
/* 528 */     this.codSuba = codSuba;
/*     */   }
/*     */   
/*     */   public String getCodTipoCana() {
/* 532 */     return this.codTipoCana;
/*     */   }
/*     */   
/*     */   public void setCodTipoCana(String codTipoCana) {
/* 536 */     this.codTipoCana = codTipoCana;
/*     */   }
/*     */   
/*     */   public String getCodTipoOper() {
/* 540 */     return this.codTipoOper;
/*     */   }
/*     */   
/*     */   public void setCodTipoOper(String codTipoOper) {
/* 544 */     this.codTipoOper = codTipoOper;
/*     */   }
/*     */   
/*     */   public String getCodTipoOperVita() {
/* 548 */     return this.codTipoOperVita;
/*     */   }
/*     */   
/*     */   public void setCodTipoOperVita(String codTipoOperVita) {
/* 552 */     this.codTipoOperVita = codTipoOperVita;
/*     */   }
/*     */   
/*     */   public Integer getCodUltiCntrCol() {
/* 556 */     return this.codUltiCntrCol;
/*     */   }
/*     */   
/*     */   public void setCodUltiCntrCol(Integer codUltiCntrCol) {
/* 560 */     this.codUltiCntrCol = codUltiCntrCol;
/*     */   }
/*     */   
/*     */   public Date getDatContEmes() {
/* 564 */     return this.datContEmes;
/*     */   }
/*     */   
/*     */   public void setDatContEmes(Date datContEmes) {
/* 568 */     this.datContEmes = datContEmes;
/*     */   }
/*     */   
/*     */   public Date getDatDecoPoli() {
/* 572 */     return this.datDecoPoli;
/*     */   }
/*     */   
/*     */   public void setDatDecoPoli(Date datDecoPoli) {
/* 576 */     this.datDecoPoli = datDecoPoli;
/*     */   }
/*     */   
/*     */   public Date getDatElab() {
/* 580 */     return this.datElab;
/*     */   }
/*     */   
/*     */   public void setDatElab(Date datElab) {
/* 584 */     this.datElab = datElab;
/*     */   }
/*     */   
/*     */   public Date getDatSolpCntr() {
/* 588 */     return this.datSolpCntr;
/*     */   }
/*     */   
/*     */   public void setDatSolpCntr(Date datSolpCntr) {
/* 592 */     this.datSolpCntr = datSolpCntr;
/*     */   }
/*     */   
/*     */   public Date getDatTermAggr() {
/* 596 */     return this.datTermAggr;
/*     */   }
/*     */   
/*     */   public void setDatTermAggr(Date datTermAggr) {
/* 600 */     this.datTermAggr = datTermAggr;
/*     */   }
/*     */   
/*     */   public String getDesCatProd1() {
/* 604 */     return this.desCatProd1;
/*     */   }
/*     */   
/*     */   public void setDesCatProd1(String desCatProd1) {
/* 608 */     this.desCatProd1 = desCatProd1;
/*     */   }
/*     */   
/*     */   public String getDesCatProd2() {
/* 612 */     return this.desCatProd2;
/*     */   }
/*     */   
/*     */   public void setDesCatProd2(String desCatProd2) {
/* 616 */     this.desCatProd2 = desCatProd2;
/*     */   }
/*     */   
/*     */   public String getDesCatProd3() {
/* 620 */     return this.desCatProd3;
/*     */   }
/*     */   
/*     */   public void setDesCatProd3(String desCatProd3) {
/* 624 */     this.desCatProd3 = desCatProd3;
/*     */   }
/*     */   
/*     */   public String getDesCatProd4() {
/* 628 */     return this.desCatProd4;
/*     */   }
/*     */   
/*     */   public void setDesCatProd4(String desCatProd4) {
/* 632 */     this.desCatProd4 = desCatProd4;
/*     */   }
/*     */   
/*     */   public String getDesFondo() {
/* 636 */     return this.desFondo;
/*     */   }
/*     */   
/*     */   public void setDesFondo(String desFondo) {
/* 640 */     this.desFondo = desFondo;
/*     */   }
/*     */   
/*     */   public String getDesPercorso() {
/* 644 */     return this.desPercorso;
/*     */   }
/*     */   
/*     */   public void setDesPercorso(String desPercorso) {
/* 648 */     this.desPercorso = desPercorso;
/*     */   }
/*     */   
/*     */   public String getFlgElab() {
/* 652 */     return this.flgElab;
/*     */   }
/*     */   
/*     */   public void setFlgElab(String flgElab) {
/* 656 */     this.flgElab = flgElab;
/*     */   }
/*     */   
/*     */   public String getFlgPrem() {
/* 660 */     return this.flgPrem;
/*     */   }
/*     */   
/*     */   public void setFlgPrem(String flgPrem) {
/* 664 */     this.flgPrem = flgPrem;
/*     */   }
/*     */   
/*     */   public String getFlgPres() {
/* 668 */     return this.flgPres;
/*     */   }
/*     */   
/*     */   public void setFlgPres(String flgPres) {
/* 672 */     this.flgPres = flgPres;
/*     */   }
/*     */   
/*     */   public String getFlgTfondElab() {
/* 676 */     return this.flgTfondElab;
/*     */   }
/*     */   
/*     */   public void setFlgTfondElab(String flgTfondElab) {
/* 680 */     this.flgTfondElab = flgTfondElab;
/*     */   }
/*     */   
/*     */   public String getFlgTipoFondo() {
/* 684 */     return this.flgTipoFondo;
/*     */   }
/*     */   
/*     */   public void setFlgTipoFondo(String flgTipoFondo) {
/* 688 */     this.flgTipoFondo = flgTipoFondo;
/*     */   }
/*     */   
/*     */   public Double getImpAnnuPremVita() {
/* 692 */     return this.impAnnuPremVita;
/*     */   }
/*     */   
/*     */   public void setImpAnnuPremVita(Double impAnnuPremVita) {
/* 696 */     this.impAnnuPremVita = impAnnuPremVita;
/*     */   }
/*     */   
/*     */   public Double getImpCaptLiqu() {
/* 700 */     return this.impCaptLiqu;
/*     */   }
/*     */   
/*     */   public void setImpCaptLiqu(Double impCaptLiqu) {
/* 704 */     this.impCaptLiqu = impCaptLiqu;
/*     */   }
/*     */   
/*     */   public Double getImpCaptScad() {
/* 708 */     return this.impCaptScad;
/*     */   }
/*     */   
/*     */   public void setImpCaptScad(Double impCaptScad) {
/* 712 */     this.impCaptScad = impCaptScad;
/*     */   }
/*     */   
/*     */   public Double getImpPremAggn() {
/* 716 */     return this.impPremAggn;
/*     */   }
/*     */   
/*     */   public void setImpPremAggn(Double impPremAggn) {
/* 720 */     this.impPremAggn = impPremAggn;
/*     */   }
/*     */   
/*     */   public Double getImpPremVitaUnic() {
/* 724 */     return this.impPremVitaUnic;
/*     */   }
/*     */   
/*     */   public void setImpPremVitaUnic(Double impPremVitaUnic) {
/* 728 */     this.impPremVitaUnic = impPremVitaUnic;
/*     */   }
/*     */   
/*     */   public Double getImpPres() {
/* 732 */     return this.impPres;
/*     */   }
/*     */   
/*     */   public void setImpPres(Double impPres) {
/* 736 */     this.impPres = impPres;
/*     */   }
/*     */   
/*     */   public Double getImpPreVitaAnnCr() {
/* 740 */     return this.impPreVitaAnnCr;
/*     */   }
/*     */   
/*     */   public void setImpPreVitaAnnCr(Double impPreVitaAnnCr) {
/* 744 */     this.impPreVitaAnnCr = impPreVitaAnnCr;
/*     */   }
/*     */   
/*     */   public Double getImpPrvVitAnnCr() {
/* 748 */     return this.impPrvVitAnnCr;
/*     */   }
/*     */   
/*     */   public void setImpPrvVitAnnCr(Double impPrvVitAnnCr) {
/* 752 */     this.impPrvVitAnnCr = impPrvVitAnnCr;
/*     */   }
/*     */   
/*     */   public Double getImpRataAtt() {
/* 756 */     return this.impRataAtt;
/*     */   }
/*     */   
/*     */   public void setImpRataAtt(Double impRataAtt) {
/* 760 */     this.impRataAtt = impRataAtt;
/*     */   }
/*     */   
/*     */   public Double getImpRataIniz() {
/* 764 */     return this.impRataIniz;
/*     */   }
/*     */   
/*     */   public void setImpRataIniz(Double impRataIniz) {
/* 768 */     this.impRataIniz = impRataIniz;
/*     */   }
/*     */   
/*     */   public Double getImpRend() {
/* 772 */     return this.impRend;
/*     */   }
/*     */   
/*     */   public void setImpRend(Double impRend) {
/* 776 */     this.impRend = impRend;
/*     */   }
/*     */   
/*     */   public Double getImpRiseMate() {
/* 780 */     return this.impRiseMate;
/*     */   }
/*     */   
/*     */   public void setImpRiseMate(Double impRiseMate) {
/* 784 */     this.impRiseMate = impRiseMate;
/*     */   }
/*     */   
/*     */   public Double getImpValattInv() {
/* 788 */     return this.impValattInv;
/*     */   }
/*     */   
/*     */   public void setImpValattInv(Double impValattInv) {
/* 792 */     this.impValattInv = impValattInv;
/*     */   }
/*     */   
/*     */   public Double getNumQuoteFondo() {
/* 796 */     return this.numQuoteFondo;
/*     */   }
/*     */   
/*     */   public void setNumQuoteFondo(Double numQuoteFondo) {
/* 800 */     this.numQuoteFondo = numQuoteFondo;
/*     */   }
/*     */   
/*     */   public Integer getNumVersProd() {
/* 804 */     return this.numVersProd;
/*     */   }
/*     */   
/*     */   public void setNumVersProd(Integer numVersProd) {
/* 808 */     this.numVersProd = numVersProd;
/*     */   }
/*     */   
/*     */   public Double getValQuotaFondo() {
/* 812 */     return this.valQuotaFondo;
/*     */   }
/*     */   
/*     */   public void setValQuotaFondo(Double valQuotaFondo) {
/* 816 */     this.valQuotaFondo = valQuotaFondo;
/*     */   }
/*     */   
/*     */   public Date getDataElab() {
/* 820 */     return this.dataElab;
/*     */   }
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/* 824 */     this.dataElab = dataElab;
/*     */   }
/*     */   
/*     */   public String getDescrErrore() {
/* 828 */     return this.descrErrore;
/*     */   }
/*     */   
/*     */   public void setDescrErrore(String descrErrore) {
/* 832 */     this.descrErrore = descrErrore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSiagPolizzeVita.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */