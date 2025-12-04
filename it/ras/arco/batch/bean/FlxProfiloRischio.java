/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
/*     */ 
/*     */ 
/*     */ public class FlxProfiloRischio
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codSoggettoSiag;
/*     */   private String cognome;
/*     */   private String nome;
/*     */   private Date dataNascita;
/*     */   private String codFiscale;
/*     */   private String tpSoggetto;
/*     */   private String codReteFinanziaria;
/*     */   private String codPromotore;
/*     */   private String flgPromotoreRif;
/*     */   private String provenienzaInfo;
/*     */   private String flgConsensoCli;
/*     */   private String classeRischioMan;
/*     */   private String classeRischioAut;
/*     */   private String esperienza;
/*     */   private String sitFinanziaria;
/*     */   private String obiettivi;
/*     */   private String propensioneRischio;
/*     */   private Date dataInizioValidita;
/*     */   private Date dataFineValidita;
/*     */   private Date dataRegistrazione;
/*     */   private String codUtente;
/*     */   private String codSocieta;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   private String sesso;
/*     */   
/*     */   public FlxProfiloRischio(Integer flxId, String codSoggettoSiag, String cognome, String nome, Date dataNascita, String codFiscale, String tpSoggetto, String codReteFinanziaria, String codPromotore, String flgPromotoreRif, String provenienzaInfo, String flgConsensoCli, String classeRischioMan, String classeRischioAut, String esperienza, String sitFinanziaria, String obiettivi, String propensioneRischio, Date dataInizioValidita, Date dataFineValidita, Date dataRegistrazione, String codUtente, String codSocieta, String statoElab, String istanza, Date dataCaricamento, String descrizioneErrore, Date dataErrore, String sesso) {
/*  44 */     this.classeRischioAut = classeRischioAut;
/*  45 */     this.classeRischioMan = classeRischioMan;
/*  46 */     this.codFiscale = codFiscale;
/*  47 */     this.codPromotore = codPromotore;
/*  48 */     this.codReteFinanziaria = codReteFinanziaria;
/*  49 */     this.codSocieta = codSocieta;
/*  50 */     this.codSoggettoSiag = codSoggettoSiag;
/*  51 */     this.codUtente = codUtente;
/*  52 */     this.cognome = cognome;
/*  53 */     this.dataCaricamento = dataCaricamento;
/*  54 */     this.dataFineValidita = dataFineValidita;
/*  55 */     this.dataInizioValidita = dataInizioValidita;
/*  56 */     this.dataNascita = dataNascita;
/*  57 */     this.dataRegistrazione = dataRegistrazione;
/*  58 */     this.esperienza = esperienza;
/*  59 */     this.flgConsensoCli = flgConsensoCli;
/*  60 */     this.flgPromotoreRif = flgPromotoreRif;
/*  61 */     this.flxId = flxId;
/*  62 */     this.istanza = istanza;
/*  63 */     this.nome = nome;
/*  64 */     this.obiettivi = obiettivi;
/*  65 */     this.propensioneRischio = propensioneRischio;
/*  66 */     this.provenienzaInfo = provenienzaInfo;
/*  67 */     this.sitFinanziaria = sitFinanziaria;
/*  68 */     this.statoElab = statoElab;
/*  69 */     this.tpSoggetto = tpSoggetto;
/*  70 */     this.descrizioneErrore = descrizioneErrore;
/*  71 */     this.dataErrore = dataErrore;
/*  72 */     this.sesso = sesso;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxProfiloRischio() {}
/*     */ 
/*     */   
/*     */   public String getClasseRischioAut() {
/*  80 */     return this.classeRischioAut;
/*     */   }
/*     */   public void setClasseRischioAut(String classeRischioAut) {
/*  83 */     this.classeRischioAut = classeRischioAut;
/*     */   }
/*     */   public String getClasseRischioMan() {
/*  86 */     return this.classeRischioMan;
/*     */   }
/*     */   public void setClasseRischioMan(String classeRischioMan) {
/*  89 */     this.classeRischioMan = classeRischioMan;
/*     */   }
/*     */   public String getCodFiscale() {
/*  92 */     return this.codFiscale;
/*     */   }
/*     */   public void setCodFiscale(String codFiscale) {
/*  95 */     this.codFiscale = codFiscale;
/*     */   }
/*     */   public String getCodPromotore() {
/*  98 */     return this.codPromotore;
/*     */   }
/*     */   public void setCodPromotore(String codPromotore) {
/* 101 */     this.codPromotore = codPromotore;
/*     */   }
/*     */   public String getCodReteFinanziaria() {
/* 104 */     return this.codReteFinanziaria;
/*     */   }
/*     */   public void setCodReteFinanziaria(String codReteFinanziaria) {
/* 107 */     this.codReteFinanziaria = codReteFinanziaria;
/*     */   }
/*     */   public String getCodSocieta() {
/* 110 */     return this.codSocieta;
/*     */   }
/*     */   public void setCodSocieta(String codSocieta) {
/* 113 */     this.codSocieta = codSocieta;
/*     */   }
/*     */   public String getCodSoggettoSiag() {
/* 116 */     return this.codSoggettoSiag;
/*     */   }
/*     */   public void setCodSoggettoSiag(String codSoggettoSiag) {
/* 119 */     this.codSoggettoSiag = codSoggettoSiag;
/*     */   }
/*     */   public String getCodUtente() {
/* 122 */     return this.codUtente;
/*     */   }
/*     */   public void setCodUtente(String codUtente) {
/* 125 */     this.codUtente = codUtente;
/*     */   }
/*     */   public String getCognome() {
/* 128 */     return this.cognome;
/*     */   }
/*     */   public void setCognome(String cognome) {
/* 131 */     this.cognome = cognome;
/*     */   }
/*     */   public Date getDataCaricamento() {
/* 134 */     return this.dataCaricamento;
/*     */   }
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 137 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   public Date getDataFineValidita() {
/* 140 */     return this.dataFineValidita;
/*     */   }
/*     */   public void setDataFineValidita(Date dataFineValidita) {
/* 143 */     this.dataFineValidita = dataFineValidita;
/*     */   }
/*     */   public Date getDataInizioValidita() {
/* 146 */     return this.dataInizioValidita;
/*     */   }
/*     */   public void setDataInizioValidita(Date dataInizioValidita) {
/* 149 */     this.dataInizioValidita = dataInizioValidita;
/*     */   }
/*     */   public Date getDataNascita() {
/* 152 */     return this.dataNascita;
/*     */   }
/*     */   public void setDataNascita(Date dataNascita) {
/* 155 */     this.dataNascita = dataNascita;
/*     */   }
/*     */   public Date getDataRegistrazione() {
/* 158 */     return this.dataRegistrazione;
/*     */   }
/*     */   public void setDataRegistrazione(Date dataRegistrazione) {
/* 161 */     this.dataRegistrazione = dataRegistrazione;
/*     */   }
/*     */   public String getEsperienza() {
/* 164 */     return this.esperienza;
/*     */   }
/*     */   public void setEsperienza(String esperienza) {
/* 167 */     this.esperienza = esperienza;
/*     */   }
/*     */   public String getFlgConsensoCli() {
/* 170 */     return this.flgConsensoCli;
/*     */   }
/*     */   public void setFlgConsensoCli(String flgConsensoCli) {
/* 173 */     this.flgConsensoCli = flgConsensoCli;
/*     */   }
/*     */   public String getFlgPromotoreRif() {
/* 176 */     return this.flgPromotoreRif;
/*     */   }
/*     */   public void setFlgPromotoreRif(String flgPromotoreRif) {
/* 179 */     this.flgPromotoreRif = flgPromotoreRif;
/*     */   }
/*     */   public Integer getFlxId() {
/* 182 */     return this.flxId;
/*     */   }
/*     */   public void setFlxId(Integer flxId) {
/* 185 */     this.flxId = flxId;
/*     */   }
/*     */   public String getIstanza() {
/* 188 */     return this.istanza;
/*     */   }
/*     */   public void setIstanza(String istanza) {
/* 191 */     this.istanza = istanza;
/*     */   }
/*     */   public String getNome() {
/* 194 */     return this.nome;
/*     */   }
/*     */   public void setNome(String nome) {
/* 197 */     this.nome = nome;
/*     */   }
/*     */   public String getObiettivi() {
/* 200 */     return this.obiettivi;
/*     */   }
/*     */   public void setObiettivi(String obiettivi) {
/* 203 */     this.obiettivi = obiettivi;
/*     */   }
/*     */   public String getPropensioneRischio() {
/* 206 */     return this.propensioneRischio;
/*     */   }
/*     */   public void setPropensioneRischio(String propensioneRischio) {
/* 209 */     this.propensioneRischio = propensioneRischio;
/*     */   }
/*     */   public String getProvenienzaInfo() {
/* 212 */     return this.provenienzaInfo;
/*     */   }
/*     */   public void setProvenienzaInfo(String provenienzaInfo) {
/* 215 */     this.provenienzaInfo = provenienzaInfo;
/*     */   }
/*     */   public String getSitFinanziaria() {
/* 218 */     return this.sitFinanziaria;
/*     */   }
/*     */   public void setSitFinanziaria(String sitFinanziaria) {
/* 221 */     this.sitFinanziaria = sitFinanziaria;
/*     */   }
/*     */   public String getStatoElab() {
/* 224 */     return this.statoElab;
/*     */   }
/*     */   public void setStatoElab(String statoElab) {
/* 227 */     this.statoElab = statoElab;
/*     */   }
/*     */   public String getTpSoggetto() {
/* 230 */     return this.tpSoggetto;
/*     */   }
/*     */   public void setTpSoggetto(String tpSoggetto) {
/* 233 */     this.tpSoggetto = tpSoggetto;
/*     */   }
/*     */   public Date getDataErrore() {
/* 236 */     return this.dataErrore;
/*     */   }
/*     */   public void setDataErrore(Date dataErrore) {
/* 239 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   public String getDescrizioneErrore() {
/* 242 */     return this.descrizioneErrore;
/*     */   }
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 245 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */   public String toString() {
/* 248 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSesso() {
/* 254 */     return this.sesso;
/*     */   }
/*     */   
/*     */   public void setSesso(String sesso) {
/* 258 */     this.sesso = sesso;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxProfiloRischio.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */