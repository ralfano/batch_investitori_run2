/*      */ package it.ras.arco.bean;
/*      */ 
/*      */ import java.io.Serializable;
/*      */ import java.lang.reflect.Array;
/*      */ import java.text.SimpleDateFormat;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collections;
/*      */ import java.util.Date;
/*      */ import java.util.List;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class FinSoggettoEsteso
/*      */   extends FinSoggetto
/*      */   implements Serializable
/*      */ {
/*      */   public static final String kTipoPersFisica = "F";
/*      */   public static final String kTipoPersGiuridica = "G";
/*      */   public static final String kSessoMaschio = "M";
/*      */   public static final String kSessoFemmina = "F";
/*      */   public static final String kCodMatchCodeCFiscNullo = "*";
/*      */   private boolean bValidita_COD_STRI_RIC1 = false;
/*      */   private boolean bValidita_COD_STRI_RIC2 = false;
/*      */   private boolean bValidita_COD_STRI_RIC3 = false;
/*      */   private boolean bValidita_COD_STRI_RIC3_Like = false;
/*      */   private boolean bValidita_COD_MATC_CODE_NOM1 = false;
/*      */   private boolean bValidita_COD_MATC_CODE_NOM2 = false;
/*      */   private boolean bValidita_COD_MATC_CODE_DNAS = false;
/*      */   private boolean bValidita_COD_MATC_CODE_CFIS = false;
/*      */   private boolean bValidita_PIVASPECIALE = false;
/*   48 */   private String sCOD_STRI_RIC1 = "";
/*   49 */   private String sCOD_STRI_RIC2 = "";
/*   50 */   private String sCOD_STRI_RIC3 = "";
/*   51 */   private String sCOD_STRI_RIC3_Like = "";
/*      */   
/*   53 */   private String sCOD_MATC_CODE_NOM1 = "";
/*   54 */   private String sCOD_MATC_CODE_NOM2 = "";
/*   55 */   private String sCOD_MATC_CODE_DNAS = "";
/*   56 */   private String sCOD_MATC_CODE_CFIS = "";
/*      */   
/*      */   private boolean bPIVASPECIALE = false;
/*      */   
/*      */   private boolean bValidita_PIVA_CORRETTA = false;
/*      */   
/*      */   private boolean bPIVA_CORRETTA = false;
/*      */   
/*      */   private boolean bValidita_CF_CORRETTO = false;
/*      */   private boolean bCF_CORRETTO = false;
/*      */   private boolean bValidita_CF_CONGRUENTE = false;
/*      */   private boolean bCF_CONGRUENTE = false;
/*   68 */   private String sCF_CONGRUENTE_log = "";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FinSoggettoEsteso(FinSoggetto soggetto) {
/*   83 */     super.setTipoSogg(soggetto.getTipoSogg());
/*   84 */     setSesso(soggetto.getSesso());
/*   85 */     super.setCognome((soggetto.getCognome() == null) ? "" : soggetto.getCognome().toUpperCase());
/*   86 */     super.setNome((soggetto.getNome() == null) ? "" : soggetto.getNome().toUpperCase());
/*   87 */     super.setDenominazione((soggetto.getDenominazione() == null) ? "" : soggetto.getDenominazione().toUpperCase());
/*      */     
/*   89 */     super.setCodiceFiscale((soggetto.getCodiceFiscale() == null) ? null : soggetto.getCodiceFiscale().toUpperCase());
/*   90 */     super.setDataNascita(soggetto.getDataNascita());
/*   91 */     super.setPartitaIva(soggetto.getPartitaIva());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FinSoggettoEsteso() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPartitaIva(String partitaIva) {
/*  145 */     if (!partitaIva.equals(getPartitaIva())) {
/*      */       
/*  147 */       this.bValidita_PIVASPECIALE = false;
/*  148 */       this.bValidita_PIVA_CORRETTA = false;
/*      */       
/*  150 */       this.bValidita_COD_MATC_CODE_CFIS = false;
/*      */     } 
/*      */ 
/*      */     
/*  154 */     super.setPartitaIva(partitaIva);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setNome(String nome) {
/*  159 */     if (!nome.equals(getNome())) {
/*      */       
/*  161 */       this.bValidita_COD_STRI_RIC1 = false;
/*  162 */       this.bValidita_COD_STRI_RIC2 = false;
/*  163 */       this.bValidita_COD_STRI_RIC3 = false;
/*  164 */       this.bValidita_COD_STRI_RIC3_Like = false;
/*      */       
/*  166 */       this.bValidita_COD_MATC_CODE_NOM2 = false;
/*  167 */       this.bValidita_CF_CONGRUENTE = false;
/*      */     } 
/*      */     
/*  170 */     super.setNome(nome);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCognome(String cognome) {
/*  175 */     if (!cognome.equals(getCognome())) {
/*      */       
/*  177 */       this.bValidita_COD_STRI_RIC1 = false;
/*  178 */       this.bValidita_COD_STRI_RIC2 = false;
/*  179 */       this.bValidita_COD_STRI_RIC3 = false;
/*  180 */       this.bValidita_COD_STRI_RIC3_Like = false;
/*  181 */       this.bValidita_COD_MATC_CODE_NOM1 = false;
/*      */       
/*  183 */       this.bValidita_CF_CONGRUENTE = false;
/*      */     } 
/*      */     
/*  186 */     super.setCognome(cognome);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDenominazione(String denominazione) {
/*  191 */     if (!denominazione.equals(getDenominazione())) {
/*      */       
/*  193 */       this.bValidita_COD_STRI_RIC1 = false;
/*  194 */       this.bValidita_COD_STRI_RIC2 = false;
/*  195 */       this.bValidita_COD_STRI_RIC3 = false;
/*  196 */       this.bValidita_COD_STRI_RIC3_Like = false;
/*  197 */       this.bValidita_COD_MATC_CODE_NOM1 = false;
/*  198 */       this.bValidita_COD_MATC_CODE_NOM2 = false;
/*      */     } 
/*      */     
/*  201 */     super.setDenominazione(denominazione);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDataNascita(Date dataNascita) {
/*  206 */     if (!dataNascita.equals(getDataNascita())) {
/*      */       
/*  208 */       this.bValidita_COD_MATC_CODE_DNAS = false;
/*  209 */       this.bValidita_CF_CONGRUENTE = false;
/*      */     } 
/*      */     
/*  212 */     super.setDataNascita(dataNascita);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodiceFiscale(String codiceFiscale) {
/*  217 */     if (!codiceFiscale.equals(getCodiceFiscale())) {
/*      */       
/*  219 */       this.bValidita_COD_MATC_CODE_CFIS = false;
/*  220 */       this.bValidita_CF_CORRETTO = false;
/*  221 */       this.bValidita_CF_CONGRUENTE = false;
/*      */     } 
/*      */     
/*  224 */     super.setCodiceFiscale(codiceFiscale);
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTipoSogg(String tipoSogg) {
/*  229 */     if (!tipoSogg.equals(getTipoSogg())) {
/*      */       
/*  231 */       this.bValidita_COD_STRI_RIC1 = false;
/*  232 */       this.bValidita_COD_STRI_RIC2 = false;
/*  233 */       this.bValidita_COD_STRI_RIC3 = false;
/*  234 */       this.bValidita_COD_STRI_RIC3_Like = false;
/*      */       
/*  236 */       this.bValidita_COD_MATC_CODE_NOM1 = false;
/*  237 */       this.bValidita_COD_MATC_CODE_NOM2 = false;
/*      */ 
/*      */       
/*  240 */       this.bValidita_COD_MATC_CODE_CFIS = false;
/*      */       
/*  242 */       this.bValidita_CF_CONGRUENTE = false;
/*      */     } 
/*      */     
/*  245 */     super.setTipoSogg(tipoSogg);
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCOD_STRI_RIC1() {
/*  250 */     if (!this.bValidita_COD_STRI_RIC1)
/*      */     {
/*  252 */       myCalcolaSTRI_RIC12();
/*      */     }
/*  254 */     return this.sCOD_STRI_RIC1;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCOD_STRI_RIC2() {
/*  259 */     if (!this.bValidita_COD_STRI_RIC2)
/*      */     {
/*  261 */       myCalcolaSTRI_RIC12();
/*      */     }
/*  263 */     return this.sCOD_STRI_RIC2;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCOD_STRI_RIC3() {
/*  269 */     if (!this.bValidita_COD_STRI_RIC3) {
/*      */       String sTmp;
/*  271 */       if (getTipoSogg().equals("F")) {
/*      */         
/*  273 */         sTmp = getCognome() + " " + getNome();
/*      */       }
/*      */       else {
/*      */         
/*  277 */         sTmp = getDenominazione();
/*      */       } 
/*      */       
/*  280 */       this.sCOD_STRI_RIC3 = calcolaStringheRicercaAnagrafica3(sTmp);
/*      */       
/*  282 */       this.bValidita_COD_STRI_RIC3 = true;
/*      */     } 
/*      */     
/*  285 */     return this.sCOD_STRI_RIC3;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCOD_STRI_RIC3_Like() {
/*  291 */     if (!this.bValidita_COD_STRI_RIC3_Like) {
/*      */       String sTmp;
/*  293 */       if (getTipoSogg().equals("F")) {
/*      */         
/*  295 */         sTmp = getCognome() + " " + getNome();
/*      */       }
/*      */       else {
/*      */         
/*  299 */         sTmp = getDenominazione();
/*      */       } 
/*      */       
/*  302 */       this.sCOD_STRI_RIC3_Like = calcolaStringheRicercaAnagrafica3Like(sTmp, '*');
/*      */       
/*  304 */       this.bValidita_COD_STRI_RIC3_Like = true;
/*      */     } 
/*      */     
/*  307 */     return this.sCOD_STRI_RIC3_Like;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCOD_MATC_CODE_NOM1() {
/*  313 */     if (!this.bValidita_COD_MATC_CODE_NOM1) {
/*      */       
/*  315 */       if (getTipoSogg().equals("F")) {
/*      */ 
/*      */         
/*  318 */         this.sCOD_MATC_CODE_NOM1 = calcolaMachCode1(getCognome());
/*      */       
/*      */       }
/*      */       else {
/*      */         
/*  323 */         this.sCOD_MATC_CODE_NOM1 = calcolaMachCode1Giuridica(getDenominazione());
/*      */       } 
/*      */       
/*  326 */       this.bValidita_COD_MATC_CODE_NOM1 = true;
/*      */     } 
/*      */     
/*  329 */     return this.sCOD_MATC_CODE_NOM1;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCOD_MATC_CODE_NOM2() {
/*  334 */     if (!this.bValidita_COD_MATC_CODE_NOM2) {
/*      */       
/*  336 */       if (getTipoSogg().equals("F")) {
/*      */         
/*  338 */         this.sCOD_MATC_CODE_NOM2 = calcolaMachCode2(getNome());
/*      */       
/*      */       }
/*      */       else {
/*      */         
/*  343 */         this.sCOD_MATC_CODE_NOM2 = calcolaMachCode2Giuridica(getDenominazione());
/*      */       } 
/*      */       
/*  346 */       this.bValidita_COD_MATC_CODE_NOM2 = true;
/*      */     } 
/*      */     
/*  349 */     return this.sCOD_MATC_CODE_NOM2;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCOD_MATC_CODE_DNAS() {
/*  354 */     if (!this.bValidita_COD_MATC_CODE_DNAS) {
/*      */       
/*  356 */       this.sCOD_MATC_CODE_DNAS = calcolaMachCode3(getDataNascita());
/*      */       
/*  358 */       this.bValidita_COD_MATC_CODE_DNAS = true;
/*      */     } 
/*  360 */     return this.sCOD_MATC_CODE_DNAS;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCOD_MATC_CODE_CFIS() {
/*  365 */     if (!this.bValidita_COD_MATC_CODE_CFIS) {
/*      */       
/*  367 */       if (getTipoSogg().equals("F")) {
/*      */         
/*  369 */         this.sCOD_MATC_CODE_CFIS = calcolaMachCode4(getCodiceFiscale());
/*      */       
/*      */       }
/*      */       else {
/*      */         
/*  374 */         this.sCOD_MATC_CODE_CFIS = calcolaMachCode4Giuridica(getPartitaIva());
/*      */       } 
/*      */       
/*  377 */       this.bValidita_COD_MATC_CODE_CFIS = true;
/*      */     } 
/*  379 */     return this.sCOD_MATC_CODE_CFIS;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean getPIVA_SPECIALE() {
/*  384 */     if (!this.bValidita_PIVASPECIALE)
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  391 */       this.bValidita_PIVASPECIALE = false;
/*      */     }
/*  393 */     return this.bPIVASPECIALE;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean getPIVA_CORRETTA() {
/*  398 */     if (!this.bValidita_PIVA_CORRETTA) {
/*      */       
/*  400 */       this.bPIVA_CORRETTA = test_PIvaFormalmenteCorretta(getPartitaIva());
/*      */       
/*  402 */       this.bValidita_PIVA_CORRETTA = true;
/*      */     } 
/*  404 */     return this.bPIVA_CORRETTA;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getCF_CORRETTO() {
/*  410 */     if (!this.bValidita_CF_CORRETTO) {
/*      */       
/*  412 */       this.bCF_CORRETTO = test_CFFormalmenteCorretto(getCodiceFiscale());
/*      */       
/*  414 */       this.bValidita_CF_CORRETTO = true;
/*      */     } 
/*  416 */     return this.bCF_CORRETTO;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getCF_CONGRUENTE() {
/*  422 */     if (!this.bValidita_CF_CONGRUENTE) {
/*      */       
/*  424 */       esegui_CFCongruente();
/*      */       
/*  426 */       this.bValidita_CF_CONGRUENTE = true;
/*      */     } 
/*  428 */     return this.bCF_CONGRUENTE;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCF_CONGRUENTE_log() {
/*  434 */     if (!this.bValidita_CF_CONGRUENTE) {
/*      */ 
/*      */       
/*  437 */       esegui_CFCongruente();
/*      */       
/*  439 */       this.bValidita_CF_CONGRUENTE = true;
/*      */     } 
/*  441 */     return this.sCF_CONGRUENTE_log;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void myCalcolaSTRI_RIC12() {
/*  448 */     String sTmp = "";
/*  449 */     String[] sRis = { "", "" };
/*      */     
/*  451 */     if (getTipoSogg().equals("F")) {
/*      */       
/*  453 */       sTmp = getCognome() + "  " + getNome();
/*      */     }
/*      */     else {
/*      */       
/*  457 */       sTmp = getDenominazione();
/*      */     } 
/*      */     
/*  460 */     sRis = calcolaStringheRicercaAnagrafica12(sTmp);
/*      */     
/*  462 */     this.sCOD_STRI_RIC1 = sRis[0];
/*  463 */     this.sCOD_STRI_RIC2 = sRis[1];
/*      */     
/*  465 */     this.bValidita_COD_STRI_RIC1 = true;
/*  466 */     this.bValidita_COD_STRI_RIC2 = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String calcolaMachCode1(String cognome) {
/*  474 */     String sOut = "";
/*      */     
/*  476 */     String strCognomePulito = eliminaSpaziESpeciali(cognome);
/*      */     
/*  478 */     if (strCognomePulito.length() <= 8) {
/*      */       
/*  480 */       sOut = strCognomePulito;
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */       
/*  486 */       String strCognomePulitoFinale = strCognomePulito.substring(6);
/*      */ 
/*      */       
/*  489 */       sOut = strCognomePulito.substring(0, 6) + prendiConsonanti(strCognomePulitoFinale) + prendiVocali(strCognomePulitoFinale);
/*      */ 
/*      */ 
/*      */       
/*  493 */       if (sOut.length() > 8)
/*      */       {
/*      */         
/*  496 */         sOut = sOut.substring(0, 8);
/*      */       }
/*      */     } 
/*      */     
/*  500 */     return sOut;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String calcolaMachCode2(String nome) {
/*  510 */     if (nome == null) {
/*  511 */       return "";
/*      */     }
/*  513 */     String sOut = "";
/*      */     
/*  515 */     int iSpazio = nome.indexOf(' ');
/*      */     
/*  517 */     if (iSpazio > -1) {
/*      */       
/*  519 */       sPrimoNome = nome.substring(0, iSpazio);
/*      */     }
/*      */     else {
/*      */       
/*  523 */       sPrimoNome = nome;
/*      */     } 
/*      */     
/*  526 */     String sPrimoNome = eliminaSpaziESpeciali(sPrimoNome);
/*      */ 
/*      */ 
/*      */     
/*  530 */     if (sPrimoNome.length() <= 4) {
/*      */ 
/*      */       
/*  533 */       sOut = sPrimoNome;
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */ 
/*      */       
/*  542 */       String sPrimoNomePulitoFinale = sPrimoNome.substring(3);
/*      */ 
/*      */       
/*  545 */       sOut = sPrimoNome.substring(0, 3) + prendiConsonanti(sPrimoNomePulitoFinale) + prendiVocali(sPrimoNomePulitoFinale);
/*      */ 
/*      */ 
/*      */       
/*  549 */       if (sOut.length() > 4)
/*      */       {
/*      */         
/*  552 */         sOut = sOut.substring(0, 4);
/*      */       }
/*      */     } 
/*      */     
/*  556 */     return sOut;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String calcolaMachCode3(Date dNascita) {
/*  565 */     if (dNascita == null)
/*      */     {
/*  567 */       return "";
/*      */     }
/*      */     
/*  570 */     SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
/*      */     
/*  572 */     return formatter.format(dNascita);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String calcolaMachCode4(String CodiceFiscale) {
/*  581 */     String sOut = "";
/*      */     
/*  583 */     if (CodiceFiscale != null) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  591 */       String sCF = CodiceFiscale + "                ";
/*      */       
/*  593 */       sOut = sCF.substring(0, 6) + sCF.substring(11, 15);
/*      */     } 
/*      */ 
/*      */     
/*  597 */     return sOut;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static String calcolaMachCode4Giuridica(String Piva) {
/*  603 */     String sOut = "00000000000";
/*  604 */     if (Piva != null) {
/*  605 */       sOut = sOut + Piva.trim();
/*      */     }
/*  607 */     sOut = sOut.substring(0, sOut.length() - 1);
/*  608 */     sOut = sOut.substring(sOut.length() - 10);
/*  609 */     return sOut;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String calcolaMachCode1Giuridica(String denominazione) {
/*  617 */     String sOut = "";
/*      */     
/*  619 */     sOut = eliminaSpaziESpeciali(denominazione);
/*      */     
/*  621 */     if (sOut.length() > 8)
/*      */     {
/*      */       
/*  624 */       sOut = sOut.substring(0, 8);
/*      */     }
/*      */     
/*  627 */     return sOut;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String calcolaMachCode2Giuridica(String denominazione) {
/*  635 */     String sOut = "";
/*      */     
/*  637 */     String sDenominazionePulita = eliminaSpaziESpeciali(denominazione);
/*      */     
/*  639 */     if (sDenominazionePulita.length() > 8) {
/*      */ 
/*      */       
/*  642 */       String sDenominazionePulitaFinale = sDenominazionePulita.substring(8);
/*      */       
/*  644 */       sOut = prendiConsonanti(sDenominazionePulitaFinale) + prendiVocali(sDenominazionePulitaFinale);
/*      */ 
/*      */       
/*  647 */       if (sOut.length() > 4)
/*      */       {
/*      */         
/*  650 */         sOut = sOut.substring(0, 4);
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*  655 */     if (sOut.length() > 8)
/*      */     {
/*      */       
/*  658 */       sOut = sOut.substring(0, 8);
/*      */     }
/*      */     
/*  661 */     return sOut;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String prendiConsonanti(String sIn) {
/*  669 */     return sIn.replaceAll("[AEIOU]", "");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String prendiVocali(String sIn) {
/*  676 */     return sIn.replaceAll("[^AEIOU]", "");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String replaceLettereAccentate(String sIn) {
/*  686 */     sIn = sIn.replaceAll("[ÀÁÂÃÄ]", "A");
/*  687 */     sIn = sIn.replaceAll("[âãä]", "a");
/*  688 */     sIn = sIn.replaceAll("[àá]", "a'");
/*      */     
/*  690 */     sIn = sIn.replaceAll("[ÈÉÊË]", "E");
/*  691 */     sIn = sIn.replaceAll("[êë]", "e");
/*  692 */     sIn = sIn.replaceAll("[èé]", "e'");
/*      */     
/*  694 */     sIn = sIn.replaceAll("[ÌÍÎÏ]", "I");
/*  695 */     sIn = sIn.replaceAll("[îï]", "i");
/*  696 */     sIn = sIn.replaceAll("[ìí]", "i'");
/*      */     
/*  698 */     sIn = sIn.replaceAll("[ÒÓÔÕÖ]", "O");
/*  699 */     sIn = sIn.replaceAll("[ôõö]", "o");
/*  700 */     sIn = sIn.replaceAll("[òó]", "o'");
/*      */ 
/*      */     
/*  703 */     sIn = sIn.replaceAll("[ÙÚÛÜ]", "U");
/*  704 */     sIn = sIn.replaceAll("[ûü]", "u");
/*  705 */     sIn = sIn.replaceAll("[ùú]", "u'");
/*      */     
/*  707 */     sIn = sIn.replaceAll("Ý", "Y");
/*  708 */     sIn = sIn.replaceAll("ý", "y");
/*      */     
/*  710 */     sIn = sIn.replaceAll("Ñ", "N");
/*  711 */     sIn = sIn.replaceAll("ñ", "n");
/*      */ 
/*      */     
/*  714 */     return sIn;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String eliminaSpaziESpeciali(String sIn) {
/*  724 */     if (sIn == null) {
/*  725 */       return "";
/*      */     }
/*  727 */     int na = 97;
/*  728 */     int nz = 122;
/*  729 */     int nA = 65;
/*  730 */     int nZ = 90;
/*  731 */     int n0 = 48;
/*  732 */     int n9 = 57;
/*  733 */     int nblank = 32;
/*  734 */     int nToUpper = -32;
/*      */     
/*  736 */     String sOut = "";
/*      */ 
/*      */ 
/*      */     
/*  740 */     for (int i = 0; i < sIn.length(); i++) {
/*      */       
/*  742 */       char cIn = sIn.charAt(i);
/*  743 */       int nIn = cIn;
/*      */       
/*  745 */       if (nIn != 32)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  751 */         if ((65 <= nIn && nIn <= 90) || (48 <= nIn && nIn <= 57)) {
/*      */ 
/*      */           
/*  754 */           sOut = sOut + cIn;
/*      */ 
/*      */         
/*      */         }
/*  758 */         else if (97 <= nIn && nIn <= 122) {
/*      */           
/*  760 */           sOut = sOut + (char)(nIn + -32);
/*      */         
/*      */         }
/*      */         else {
/*      */           
/*  765 */           switch (cIn) { case 'À': case 'Á': case 'Â': case 'Ã': case 'Ä': case 'à':
/*      */             case 'á':
/*      */             case 'â':
/*      */             case 'ã':
/*      */             case 'ä':
/*  770 */               sOut = sOut + 'A'; break;
/*      */             case 'È': case 'É': case 'Ê': case 'Ë':
/*      */             case 'è':
/*      */             case 'é':
/*      */             case 'ê':
/*      */             case 'ë':
/*  776 */               sOut = sOut + 'E'; break;
/*      */             case 'Ì': case 'Í': case 'Î': case 'Ï':
/*      */             case 'ì':
/*      */             case 'í':
/*      */             case 'î':
/*      */             case 'ï':
/*  782 */               sOut = sOut + 'I'; break;
/*      */             case 'Ò': case 'Ó': case 'Ô': case 'Õ': case 'Ö': case 'ò':
/*      */             case 'ó':
/*      */             case 'ô':
/*      */             case 'õ':
/*      */             case 'ö':
/*  788 */               sOut = sOut + 'O'; break;
/*      */             case 'Ù': case 'Ú': case 'Û': case 'Ü':
/*      */             case 'ù':
/*      */             case 'ú':
/*      */             case 'û':
/*      */             case 'ü':
/*  794 */               sOut = sOut + 'U';
/*      */               break;
/*      */             case 'Ý':
/*      */             case 'ý':
/*  798 */               sOut = sOut + 'Y';
/*      */               break;
/*      */             case 'Ñ':
/*      */             case 'ñ':
/*  802 */               sOut = sOut + 'N';
/*      */               break; }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         } 
/*      */       }
/*      */     } 
/*  816 */     return sOut;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String eliminaSpaziESpecialiSlow(String sIn) {
/*  826 */     sIn = replaceLettereAccentate(sIn);
/*  827 */     sIn = sIn.replaceAll("[^a-zA-Z0-9]", "");
/*  828 */     sIn = sIn.toUpperCase();
/*      */     
/*  830 */     return sIn;
/*      */   }
/*      */ 
/*      */   
/*      */   public static String[] calcolaStringheRicercaAnagrafica12(String sIn) {
/*  835 */     String[] sOut = { "", "" };
/*      */     
/*  837 */     if (sIn == null) {
/*  838 */       return sOut;
/*      */     }
/*  840 */     char cNull = '#';
/*      */ 
/*      */     
/*  843 */     String[] aParole = { "" };
/*  844 */     int iParole = 0;
/*      */     
/*  846 */     char cTmpV = ' ';
/*  847 */     char cTmp = ' ';
/*      */     
/*  849 */     sIn = sIn.toUpperCase();
/*      */     
/*  851 */     for (int i = 0; i < sIn.length(); i++) {
/*      */       
/*  853 */       cTmp = sIn.charAt(i);
/*  854 */       if (Character.isLetterOrDigit(cTmp) || cTmp == ' ') {
/*      */ 
/*      */         
/*  857 */         switch (cTmp) {
/*      */           
/*      */           case 'H':
/*  860 */             if (cTmpV == ' ') {
/*      */               
/*  862 */               cTmp = 'H';
/*      */               
/*      */               break;
/*      */             } 
/*  866 */             cTmp = '#';
/*      */             break;
/*      */ 
/*      */           
/*      */           case 'K':
/*  871 */             cTmp = 'C';
/*      */             break;
/*      */           
/*      */           case 'J':
/*      */           case 'Y':
/*  876 */             cTmp = 'I';
/*      */             break;
/*      */           
/*      */           case 'W':
/*  880 */             cTmp = 'V';
/*      */             break;
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  889 */         if (cTmp != cTmpV)
/*      */         {
/*  891 */           if (cTmp != ' ') {
/*      */ 
/*      */             
/*  894 */             if (cTmp != '#')
/*      */             {
/*  896 */               sOut[0] = sOut[0] + cTmp;
/*  897 */               aParole[iParole] = aParole[iParole] + cTmp;
/*      */             }
/*      */           
/*      */           } else {
/*      */             
/*  902 */             iParole++;
/*  903 */             aParole = (String[])resizeArray(aParole, iParole + 1);
/*  904 */             aParole[iParole] = "";
/*      */           } 
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  912 */       cTmpV = cTmp;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  923 */     List listParole = Arrays.asList(aParole);
/*  924 */     Collections.sort(listParole);
/*      */     
/*  926 */     aParole = (String[])listParole.toArray();
/*      */     
/*  928 */     for (int j = 0; j <= iParole; j++)
/*      */     {
/*  930 */       sOut[1] = sOut[1] + aParole[j];
/*      */     }
/*  932 */     return sOut;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static String calcolaStringheRicercaAnagrafica3(String sIn) {
/*  938 */     return calcolaStringheRicercaAnagrafica3Like(sIn, ' ');
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static String calcolaStringheRicercaAnagrafica3Like(String sIn, char cLike) {
/*  944 */     if (sIn == null) {
/*  945 */       return "";
/*      */     }
/*  947 */     int lMinimaLike = 6;
/*      */     
/*  949 */     char cNull = '#';
/*  950 */     if (cLike == cNull) {
/*  951 */       cNull = '~';
/*      */     }
/*  953 */     String sOut = "";
/*  954 */     char cTmp = ' ';
/*  955 */     char cTmpV = ' ';
/*      */     
/*  957 */     boolean bUltimoPuntoTrovato = false;
/*  958 */     sIn = sIn.toUpperCase();
/*  959 */     for (int i = sIn.length() - 1; i >= 0; i--) {
/*      */       
/*  961 */       cTmp = sIn.charAt(i);
/*  962 */       if (!Character.isLetterOrDigit(cTmp) && cTmp != ' ' && cTmp != cLike)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  968 */         if (cTmp == '.') {
/*      */           
/*  970 */           if (!bUltimoPuntoTrovato)
/*      */           {
/*  972 */             bUltimoPuntoTrovato = true;
/*  973 */             cTmp = ' ';
/*      */           
/*      */           }
/*      */           else
/*      */           {
/*  978 */             cTmp = cNull;
/*      */           }
/*      */         
/*      */         }
/*      */         else {
/*      */           
/*  984 */           cTmp = ' ';
/*      */         } 
/*      */       }
/*      */ 
/*      */       
/*  989 */       if (cTmp != ' ' || cTmpV != ' ')
/*      */       {
/*  991 */         if (cTmp != cNull)
/*      */         {
/*  993 */           sOut = cTmp + sOut;
/*      */         }
/*      */       }
/*      */ 
/*      */       
/*  998 */       if (cTmp != cNull)
/*      */       {
/* 1000 */         cTmpV = cTmp;
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1006 */     if (cTmp == ' ')
/*      */     {
/*      */       
/* 1009 */       if (sOut != null)
/*      */       {
/* 1011 */         if (sOut.length() > 1) {
/* 1012 */           sOut = sOut.substring(1);
/*      */         } else {
/* 1014 */           sOut = "";
/*      */         } 
/*      */       }
/*      */     }
/*      */ 
/*      */     
/* 1020 */     if (cLike != ' ')
/*      */     {
/* 1022 */       if (sOut.indexOf(cLike) >= 5) {
/* 1023 */         sOut = sOut.replaceAll("[" + cLike + "]", "%");
/*      */       } else {
/* 1025 */         sOut = sOut.replaceAll("[" + cLike + "]", "");
/*      */       } 
/*      */     }
/* 1028 */     return sOut;
/*      */   }
/*      */ 
/*      */   
/*      */   private static Object resizeArray(Object oldArray, int newSize) {
/* 1033 */     int oldSize = Array.getLength(oldArray);
/* 1034 */     Class elementType = oldArray.getClass().getComponentType();
/* 1035 */     Object newArray = Array.newInstance(elementType, newSize);
/*      */     
/* 1037 */     int preserveLength = Math.min(oldSize, newSize);
/*      */     
/* 1039 */     if (preserveLength > 0) {
/* 1040 */       System.arraycopy(oldArray, 0, newArray, 0, preserveLength);
/*      */     }
/* 1042 */     return newArray;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static boolean test_CFFormalmenteCorretto(String sInCF) {
/* 1048 */     if (sInCF == null) {
/* 1049 */       return false;
/*      */     }
/* 1051 */     if (sInCF.trim().length() != 16) {
/* 1052 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 1056 */     sInCF = sInCF.toUpperCase();
/*      */     
/* 1058 */     String sTmp = sInCF.substring(0, 6).replaceAll("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]", "#");
/* 1059 */     if (!sTmp.equals("######")) {
/* 1060 */       return false;
/*      */     }
/* 1062 */     sTmp = sInCF.substring(8, 9).replaceAll("[ABCDEHLMPRST]", "#");
/* 1063 */     if (!sTmp.equals("#")) {
/* 1064 */       return false;
/*      */     }
/* 1066 */     int iA = 65;
/* 1067 */     int iZ = 90;
/* 1068 */     int i0 = 48;
/* 1069 */     int i9 = 57;
/*      */ 
/*      */     
/* 1072 */     char[] ca = "BAFHJNPRTVCESULDGIMOQKWZYX".toCharArray();
/*      */ 
/*      */     
/* 1075 */     int nCK = 0;
/*      */     
/* 1077 */     for (int i = 0; i < 15; i++) {
/*      */       
/* 1079 */       int iTmp = sInCF.charAt(i);
/*      */ 
/*      */       
/* 1082 */       if (48 <= iTmp && iTmp <= 57)
/*      */       {
/* 1084 */         iTmp = iTmp - 48 + 65;
/*      */       }
/*      */ 
/*      */       
/* 1088 */       if (65 <= iTmp && iTmp <= 90) {
/*      */         
/* 1090 */         if (i % 2 == 0)
/*      */         {
/* 1092 */           iTmp = ca[iTmp - 65];
/*      */         }
/*      */         
/* 1095 */         iTmp -= 65;
/*      */       }
/*      */       else {
/*      */         
/* 1099 */         return false;
/*      */       } 
/*      */       
/* 1102 */       nCK += iTmp;
/*      */     } 
/*      */     
/* 1105 */     char cCK = (char)(nCK % 26 + 65);
/*      */     
/* 1107 */     if (cCK != sInCF.charAt(15)) {
/* 1108 */       return false;
/*      */     }
/* 1110 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static boolean test_PIvaFormalmenteCorretta(String sInPartitaIva) {
/* 1122 */     if (sInPartitaIva == null) {
/* 1123 */       return true;
/*      */     }
/*      */     
/* 1126 */     String sPartitaIva = sInPartitaIva.replaceAll("[^0123456789]", "");
/*      */     
/* 1128 */     if (!sInPartitaIva.equals(sPartitaIva)) {
/* 1129 */       return false;
/*      */     }
/* 1131 */     if (sPartitaIva.length() > 11) {
/* 1132 */       return false;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1137 */     int nStart = 11 - sPartitaIva.length();
/*      */     
/* 1139 */     if (nStart >= 7) {
/* 1140 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 1144 */     int iCamCom = Integer.valueOf(sPartitaIva.substring(7 - nStart, sPartitaIva.length() - 1)).intValue();
/*      */ 
/*      */     
/* 1147 */     if (iCamCom > 200) {
/* 1148 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 1152 */     int iCk = 0;
/* 1153 */     int i0 = 48;
/* 1154 */     int[] ListaPari = { 0, 2, 4, 6, 8, 1, 3, 5, 7, 9 };
/*      */     
/* 1156 */     for (int i = nStart; i < 11; i++) {
/*      */ 
/*      */       
/* 1159 */       int iTmp = sPartitaIva.charAt(i) - 48;
/*      */       
/* 1161 */       if (i % 2 == 0) {
/*      */         
/* 1163 */         iCk += iTmp;
/*      */       
/*      */       }
/*      */       else {
/*      */         
/* 1168 */         iCk += ListaPari[iTmp];
/*      */       } 
/*      */     } 
/* 1171 */     if (iCk % 10 != 0) {
/* 1172 */       return false;
/*      */     }
/*      */     
/* 1175 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   private void esegui_CFCongruente() {
/* 1180 */     String sOut = "";
/*      */     
/* 1182 */     if (!getCF_CORRETTO()) {
/*      */       
/* 1184 */       sOut = sOut + " -Codice Fiscale Formalmente Scorretto.";
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1189 */       String sConsonantiCognome = "";
/* 1190 */       String sVocaliCognome = "";
/* 1191 */       String sCognome = "";
/* 1192 */       String sCP_1 = "";
/*      */ 
/*      */       
/* 1195 */       if (getCognome() != null) {
/*      */         
/* 1197 */         sCognome = eliminaSpaziESpeciali(getCognome());
/* 1198 */         if (sCognome.length() > 0) {
/*      */           
/* 1200 */           sConsonantiCognome = prendiConsonanti(sCognome);
/* 1201 */           sVocaliCognome = prendiVocali(sCognome);
/*      */           
/* 1203 */           sCP_1 = (sConsonantiCognome + sVocaliCognome + "XXX").substring(0, 3);
/*      */           
/* 1205 */           if (!getCodiceFiscale().substring(0, 3).equals(sCP_1))
/*      */           {
/* 1207 */             sOut = sOut + "' -Cognome e CF Non Compatibili.";
/*      */           }
/*      */         }
/*      */         else {
/*      */           
/* 1212 */           sOut = sOut + "' -Cognome Non Valido.";
/*      */         } 
/*      */       } 
/*      */       
/* 1216 */       String sConsonantiNome = "";
/* 1217 */       String sVocaliNome = "";
/* 1218 */       String sNome = "";
/* 1219 */       String sCP_2 = "";
/*      */ 
/*      */       
/* 1222 */       if (getNome() != null) {
/*      */         
/* 1224 */         sNome = eliminaSpaziESpeciali(getNome());
/* 1225 */         if (sCognome.length() > 0) {
/*      */           
/* 1227 */           sConsonantiNome = prendiConsonanti(sNome);
/* 1228 */           sVocaliNome = prendiVocali(sNome);
/*      */           
/* 1230 */           if (sConsonantiNome.length() <= 3) {
/*      */             
/* 1232 */             sCP_2 = (sConsonantiNome + sVocaliNome + "XXX").substring(0, 3);
/*      */           }
/*      */           else {
/*      */             
/* 1236 */             sCP_2 = (sConsonantiNome.substring(0, 1) + sConsonantiNome.substring(2, 4) + sVocaliNome + "XXX").substring(0, 3);
/*      */           } 
/*      */           
/* 1239 */           if (!getCodiceFiscale().substring(3, 6).equals(sCP_2))
/*      */           {
/*      */ 
/*      */             
/* 1243 */             if (sConsonantiNome.length() > 0) {
/*      */               
/* 1245 */               if (!getCodiceFiscale().substring(3, 4).equals(sConsonantiNome.substring(0, 1)))
/*      */               {
/* 1247 */                 sOut = sOut + " -Nome e CF Non Compatibili.";
/*      */               }
/*      */               else
/*      */               {
/* 1251 */                 sOut = sOut + " -Nome e CF Non Compatibili (poss. 2o nome).";
/*      */               }
/*      */             
/*      */             } else {
/*      */               
/* 1256 */               sOut = sOut + " -Nome e CF Non Compatibili (poss. 2o nome).";
/*      */             }
/*      */           
/*      */           }
/*      */         } else {
/*      */           
/* 1262 */           sOut = sOut + "' -Nome Non Valido.";
/*      */         } 
/*      */       } 
/*      */       
/* 1266 */       String sAnnoNascita = "";
/* 1267 */       String sMeseNascita = "";
/* 1268 */       String sGiornoNascita = "";
/*      */ 
/*      */       
/* 1271 */       if (getDataNascita() != null) {
/*      */ 
/*      */         
/* 1274 */         String sTmp = getCOD_MATC_CODE_DNAS();
/*      */         
/* 1276 */         sAnnoNascita = sTmp.substring(2, 4);
/* 1277 */         sMeseNascita = sTmp.substring(4, 6);
/* 1278 */         sGiornoNascita = sTmp.substring(6, 8);
/*      */ 
/*      */         
/* 1281 */         if (Character.isDigit(getCodiceFiscale().charAt(6)))
/*      */         {
/* 1283 */           if (getCodiceFiscale().charAt(6) != sAnnoNascita.charAt(0))
/*      */           {
/* 1285 */             sOut = sOut + " -Anno di Nascita(d) e CF Non Compatibili.";
/*      */           }
/*      */         }
/*      */ 
/*      */         
/* 1290 */         if (Character.isDigit(getCodiceFiscale().charAt(7)))
/*      */         {
/* 1292 */           if (getCodiceFiscale().charAt(7) != sAnnoNascita.charAt(1))
/*      */           {
/* 1294 */             sOut = sOut + " -Anno di Nascita(u) e CF Non Compatibili.";
/*      */           }
/*      */         }
/*      */ 
/*      */         
/* 1299 */         if (getCodiceFiscale().substring(8, 9).replaceAll("[ABCDEHLMPRST]", "#").equals("#")) {
/*      */           
/* 1301 */           int iA = 65;
/* 1302 */           char[] ca = "ABCDE--F---GH--I-JKL------".toCharArray();
/*      */           
/* 1304 */           int iTmp = ca[getCodiceFiscale().charAt(8) - 65] - 65 + 1;
/*      */           
/* 1306 */           if (iTmp != Integer.parseInt(sMeseNascita))
/*      */           {
/* 1308 */             sOut = sOut + " -Mese di Nascita e CF Non Compatibili.";
/*      */           }
/*      */         }
/*      */         else {
/*      */           
/* 1313 */           sOut = sOut + " -CF Formalemente Errato (Mese Nascita).";
/*      */         } 
/*      */ 
/*      */         
/* 1317 */         if (Character.isDigit(getCodiceFiscale().charAt(9)))
/*      */         {
/* 1319 */           if (Integer.parseInt(getCodiceFiscale().substring(9, 10)) % 4 != Integer.parseInt(sGiornoNascita.substring(0, 1)))
/*      */           {
/* 1321 */             sOut = sOut + " -Giorno di Nascita(d) e CF Non Compatibili.";
/*      */           }
/*      */         }
/*      */ 
/*      */         
/* 1326 */         if (Character.isDigit(getCodiceFiscale().charAt(10)))
/*      */         {
/* 1328 */           if (getCodiceFiscale().charAt(10) != sGiornoNascita.charAt(1))
/*      */           {
/* 1330 */             sOut = sOut + "  -Giorno di Nascita(u) e CF Non Compatibili.";
/*      */           }
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1340 */       if (getSesso() != null)
/*      */       {
/* 1342 */         if (Character.isDigit(getCodiceFiscale().charAt(9)))
/*      */         {
/* 1344 */           if (Integer.parseInt(getCodiceFiscale().substring(9, 10)) <= 3) {
/*      */             
/* 1346 */             if (!getSesso().equals("M")) {
/* 1347 */               sOut = sOut + "-Sesso e CF Non Compatibili.";
/*      */             }
/* 1349 */           } else if (Integer.parseInt(getCodiceFiscale().substring(9, 10)) <= 7) {
/*      */             
/* 1351 */             if (!getSesso().equals("F")) {
/* 1352 */               sOut = sOut + "-Sesso e CF Non Compatibili.";
/*      */             }
/*      */           } else {
/*      */             
/* 1356 */             sOut = sOut + " -Codice Fiscale Formalmente Scorretto (sesso).";
/*      */           } 
/*      */         }
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 1363 */     String sOk = "OK";
/*      */     
/* 1365 */     if (sOut.length() > 0) {
/*      */       
/* 1367 */       sOut = "KO: " + sOut;
/*      */     }
/*      */     else {
/*      */       
/* 1371 */       sOut = "OK";
/*      */     } 
/*      */     
/* 1374 */     this.sCF_CONGRUENTE_log = sOut;
/* 1375 */     this.bCF_CONGRUENTE = sOut.equals("OK");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public NormSoggettoMC toSoggettoMC() {
/* 1381 */     NormSoggettoMC nSE = new NormSoggettoMC(getCOD_MATC_CODE_CFIS(), getCOD_MATC_CODE_DNAS(), getCOD_MATC_CODE_NOM1(), getCOD_MATC_CODE_NOM2(), getCOD_STRI_RIC1(), getCOD_STRI_RIC2(), getCOD_STRI_RIC3(), getDataInserimento(), "N", getTipoSogg(), getUtenteInserimento());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1404 */     if (nSE.getCodMatchCodeCFis() == null)
/*      */     {
/* 1406 */       nSE.setCodMatchCodeCFis("*");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1430 */     return nSE;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public NormSoggettoMC toSoggettoMC(NormSoggettoMC nSE) {
/* 1444 */     nSE.setCodMatchCodeDNas(getCOD_MATC_CODE_DNAS());
/* 1445 */     nSE.setCodMatchCodeNom1(getCOD_MATC_CODE_NOM1());
/* 1446 */     nSE.setCodMatchCodeNom2(getCOD_MATC_CODE_NOM2());
/* 1447 */     nSE.setCodStriRic1(getCOD_STRI_RIC1());
/* 1448 */     nSE.setCodStriRic2(getCOD_STRI_RIC2());
/* 1449 */     nSE.setCodStriRic3(getCOD_STRI_RIC3());
/* 1450 */     nSE.setTipoSogg(getTipoSogg());
/* 1451 */     nSE.setFlgInco("N");
/*      */     
/* 1453 */     if (nSE.getCodMatchCodeCFis() != null) {
/*      */       
/* 1455 */       nSE.setCodMatchCodeCFis(getCOD_MATC_CODE_CFIS());
/*      */     } else {
/*      */       
/* 1458 */       nSE.setCodMatchCodeCFis("*");
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1482 */     return nSE;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinSoggettoEsteso.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */