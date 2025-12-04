/*      */ package it.ras.arco.bean;
/*      */ 
/*      */ import it.ras.flag.bean.RasORMBean;
/*      */ import java.io.Serializable;
/*      */ import java.util.Date;
/*      */ import java.util.Set;
/*      */ import org.apache.commons.lang.builder.ToStringBuilder;
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
/*      */ public class FinSoggetto
/*      */   extends RasORMBean
/*      */   implements Serializable
/*      */ {
/*      */   public static final String PERSONA_FISICA = "F";
/*      */   public static final String PERSONA_GIURIDICA = "G";
/*      */   public static final String COINTESTAZIONE = "C";
/*      */   public static final String CITTADINANZA = "086";
/*      */   public static final String SESSO_F = "F";
/*      */   public static final String SESSO_M = "M";
/*      */   private Boolean isDominant;
/*      */   private Integer soggettoId;
/*      */   private Integer ndgArco;
/*      */   private Date dataInsCli;
/*      */   private String cognome;
/*      */   private String nome;
/*      */   private String tipoSogg;
/*      */   private String condPartSogg;
/*      */   private String sesso;
/*      */   private String codiceFiscale;
/*      */   private String partitaIva;
/*      */   private Date dataNascita;
/*      */   private String comuneNascita;
/*      */   private String provNascita;
/*      */   private String nazNascita;
/*      */   private String denominazione;
/*      */   private String cittadinanza;
/*      */   private String attivita;
/*      */   private String settore;
/*      */   private String note;
/*      */   private String tipoSocieta;
/*      */   private String verbalePoteri;
/*      */   private String dataCCIAA;
/*      */   private String statoCivile;
/*      */   private String titoloStudioBatch;
/*      */   private String attEcoPrisma;
/*      */   private String antiriciclaggio;
/*      */   private Set serviziAggiuntivi;
/*      */   private Set estrazioni;
/*      */   private String capNascita;
/*      */   private String statoCensim;
/*      */   private String provDatiAnag;
/*      */   private String datiSupl;
/*      */   private Date dataInserimento;
/*      */   private String utenteInserimento;
/*      */   private String statoCliente;
/*      */   private String regoleProm;
/*      */   private String sogMinore;
/*      */   private String sogInterdetto;
/*      */   private String borsa;
/*      */   private String attoCostit;
/*      */   private String statoOper;
/*      */   private String capitaleSoc;
/*      */   private String capitaleVer;
/*      */   private Date dataFondaz;
/*      */   private Date dataSciogli;
/*      */   private Date dataIscrRea;
/*      */   private String fotocopiaDoc;
/*      */   private String fasciaCli;
/*      */   private String numCCIAA;
/*      */   private String numREA;
/*      */   private String pattiChiari;
/*      */   private String provREA;
/*      */   private String socEstera;
/*      */   private String statuto;
/*      */   private String sedeTribunale;
/*      */   private String patrimonioTot;
/*      */   private String certifVigenza;
/*      */   private String verbaleNomina;
/*      */   private String citta;
/*      */   private String copiaCodFisc;
/*      */   private String copiaCocLeg;
/*      */   private String copiaRegTrib;
/*      */   private Integer numeroRappresentantiLegali;
/*      */   private String tipoCliente;
/*      */   private String codUserMc;
/*      */   private String statoRapportoMc;
/*      */   private Set documenti;
/*      */   private Set recapito;
/*      */   private Set recapitoAbitazione;
/*      */   private Set recapitoUfficio;
/*      */   private Set recapitoCellulare;
/*      */   private Set recapitoFax;
/*      */   private Set recapitoEmail;
/*      */   private Set cointestazione;
/*      */   private Set cointestazioneSoggCoin;
/*      */   private Set indirizzo;
/*      */   private Set indirizzoRam;
/*      */   private Set indirizzoDomicilio;
/*      */   private Set indirizzoResidenza;
/*      */   private Set indirizzoFiscale;
/*      */   private Set indirizzoEletto;
/*      */   private Set decodNdgFabbr;
/*      */   private FinDecodSoggettoXP decodSoggettoXP;
/*      */   private FinPromotore promotore;
/*      */   private Set promotori;
/*      */   private Set soggScheda;
/*      */   private Set soggUltInfo;
/*      */   private Set soggFascia;
/*      */   private FinSoggettoPrivacy soggettoPrivacy;
/*      */   private FinAltriProdotti altriProdotti;
/*      */   private NormSoggettoMC soggettoMC;
/*      */   private Set sottoscrizioni;
/*      */   private Set ruoliComeRappresentante;
/*      */   private Set ruoliComeRappresentato;
/*      */   private Boolean isAnt;
/*      */   private Set soggBozza;
/*      */   private Set soggBozzaOriginali;
/*      */   private Set bonificiOrdinati;
/*      */   private Set titoliOrdinati;
/*      */   private int hashCode;
/*      */   
/*      */   public Set getBonificiOrdinati() {
/*  321 */     return this.bonificiOrdinati;
/*      */   }
/*      */   
/*      */   public void setBonificiOrdinati(Set bonificiOrdinati) {
/*  325 */     this.bonificiOrdinati = bonificiOrdinati;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getSoggBozzaOriginali() {
/*  332 */     return this.soggBozzaOriginali;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSoggBozzaOriginali(Set soggBozzaOld) {
/*  339 */     this.soggBozzaOriginali = soggBozzaOld;
/*      */   }
/*      */   
/*      */   public Set getSoggBozza() {
/*  343 */     return this.soggBozza;
/*      */   }
/*      */   
/*      */   public void setSoggBozza(Set soggBozza) {
/*  347 */     this.soggBozza = soggBozza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getNumeroRappresentantiLegali() {
/*  354 */     return this.numeroRappresentantiLegali;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNumeroRappresentantiLegali(Integer numeroRappresentantiLegali) {
/*  361 */     this.numeroRappresentantiLegali = numeroRappresentantiLegali;
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
/*      */   public FinSoggetto(String attivita, String costit, String borsa, String soc, String ver, String nascita, String vigenza, String citta, String cittadinanza, String fiscale, String cognome, Set cointestazione, Set coin, String nascita2, String sogg, String leg, String fisc, String trib, Date fondaz, Date inserimento, Date rea, Date nascita3, Date sciogli, String supl, FinDecodSoggettoXP soggettoXP, String denominazione, Set documenti, String cli, String doc, int code, Set domicilio, Set eletto, Set residenza, Boolean dominant, String nascita4, Integer arco, String nome, String note, String numcciaa, String numrea, String iva, String tot, String chiari, Set promotori, String anag, String nascita5, String provrea, Set recapito, Set abitazione, Set cellulare, Set email, Set fax, Set ufficio, String prom, String tribunale, String sesso, String settore, String estera, Integer id, NormSoggettoMC soggettomc, FinSoggettoPrivacy privacy, Set scheda, Set ultInfo, String interdetto, String minore, String censim, String cliente, String oper, String statuto, String societa, String sogg2, String inserimento2, String nomina, Date dataInsCli, Set serviziAggiuntivi, String tipoCliente, Boolean ant, Set soggBozza)
/*      */   {
/* 1185 */     this.hashCode = Integer.MIN_VALUE; this.attivita = attivita; this.soggBozza = soggBozza; this.attoCostit = costit; this.borsa = borsa; this.capitaleSoc = soc; this.capitaleVer = ver; this.capNascita = nascita; this.certifVigenza = vigenza; this.citta = citta; this.cittadinanza = cittadinanza; this.codiceFiscale = fiscale; this.cognome = cognome; this.cointestazione = cointestazione; this.cointestazioneSoggCoin = coin; this.comuneNascita = nascita2; this.condPartSogg = sogg; this.copiaCocLeg = leg; this.copiaCodFisc = fisc; this.copiaRegTrib = trib; this.dataFondaz = fondaz; this.dataInserimento = inserimento; this.dataIscrRea = rea; this.dataNascita = nascita3; this.dataSciogli = sciogli; this.datiSupl = supl; this.decodSoggettoXP = soggettoXP; this.denominazione = denominazione; this.documenti = documenti; this.fasciaCli = cli; this.fotocopiaDoc = doc; this.hashCode = code; this.indirizzoDomicilio = domicilio; this.indirizzoEletto = eletto; this.indirizzoResidenza = residenza; this.isDominant = dominant; this.nazNascita = nascita4; this.ndgArco = arco; this.dataInsCli = dataInsCli; this.nome = nome; this.note = note; this.numCCIAA = numcciaa; this.numREA = numrea; this.partitaIva = iva; this.patrimonioTot = tot; this.pattiChiari = chiari; this.promotori = promotori; this.provDatiAnag = anag; this.provNascita = nascita5; this.provREA = provrea; this.recapito = recapito; this.recapitoAbitazione = abitazione; this.recapitoCellulare = cellulare; this.recapitoEmail = email; this.recapitoFax = fax; this.recapitoUfficio = ufficio; this.regoleProm = prom; this.sedeTribunale = tribunale; this.sesso = sesso; this.settore = settore; this.socEstera = estera; this.soggettoId = id; this.soggettoMC = soggettomc; this.soggettoPrivacy = privacy; this.soggScheda = scheda; this.soggUltInfo = ultInfo; this.sogInterdetto = interdetto; this.sogMinore = minore; this.statoCensim = censim; this.statoCliente = cliente; this.statoOper = oper; this.statuto = statuto; this.tipoSocieta = societa; this.tipoSogg = sogg2; this.utenteInserimento = inserimento2; this.verbaleNomina = nomina; this.serviziAggiuntivi = serviziAggiuntivi; this.tipoCliente = tipoCliente; this.isAnt = ant; } public NormSoggettoMC getSoggettoMC() { return this.soggettoMC; } public void setSoggettoMC(NormSoggettoMC soggettoMC) { this.soggettoMC = soggettoMC; } public FinSoggetto() { this.hashCode = Integer.MIN_VALUE; } public Integer getSoggettoId() { return this.soggettoId; } public void setSoggettoId(Integer soggettoId) { this.soggettoId = soggettoId; } public Integer getNdgArco() { return this.ndgArco; } public Date getDataInsCli() { return this.dataInsCli; } public void setDataInsCli(Date dataInsCli) { this.dataInsCli = dataInsCli; } public void setNdgArco(Integer ndgArco) { this.ndgArco = ndgArco; } public String getCognome() { return this.cognome; } public void setCognome(String cognome) { this.cognome = cognome; } public String getNome() { return this.nome; } public void setNome(String nome) { this.nome = nome; } public String getTipoSogg() { return this.tipoSogg; } public void setTipoSogg(String tipoSogg) { this.tipoSogg = tipoSogg; } public String getCondPartSogg() { return this.condPartSogg; } public void setCondPartSogg(String condPartSogg) { this.condPartSogg = condPartSogg; } public String getSesso() { return this.sesso; } public void setSesso(String sesso) { this.sesso = sesso; } public String getCodiceFiscale() { return this.codiceFiscale; } public void setCodiceFiscale(String codiceFiscale) { this.codiceFiscale = codiceFiscale; } public String getPartitaIva() { return this.partitaIva; } public void setPartitaIva(String partitaIva) { this.partitaIva = partitaIva; } public Date getDataNascita() { return this.dataNascita; } public void setDataNascita(Date dataNascita) { this.dataNascita = dataNascita; } public String getComuneNascita() { return this.comuneNascita; } public void setComuneNascita(String comuneNascita) { this.comuneNascita = comuneNascita; } public String getProvNascita() { return this.provNascita; } public void setProvNascita(String provNascita) { this.provNascita = provNascita; } public String getNazNascita() { return this.nazNascita; } public void setNazNascita(String nazNascita) { this.nazNascita = nazNascita; } public String getDenominazione() { return this.denominazione; } public void setDenominazione(String denominazione) { this.denominazione = denominazione; } public String getCittadinanza() { return this.cittadinanza; } public void setCittadinanza(String cittadinanza) { this.cittadinanza = cittadinanza; } public String getTipoSocieta() { return this.tipoSocieta; } public void setTipoSocieta(String tipoSocieta) { this.tipoSocieta = tipoSocieta; } public FinSoggetto(Set documenti, Set recapito, Set cointestazione, Set cointestazioneSoggCoin, Set indirizzo, Set decodNdgFabbr) { this.hashCode = Integer.MIN_VALUE; this.documenti = documenti; this.recapito = recapito; this.cointestazione = cointestazione; this.cointestazioneSoggCoin = cointestazioneSoggCoin; this.indirizzo = indirizzo; this.decodNdgFabbr = decodNdgFabbr; }
/*      */   public String getStatoCensim() { return this.statoCensim; }
/*      */   public void setStatoCensim(String statoCensim) { this.statoCensim = statoCensim; }
/* 1188 */   public String getProvDatiAnag() { return this.provDatiAnag; } public void setProvDatiAnag(String provDatiAnag) { this.provDatiAnag = provDatiAnag; } public String getDatiSupl() { return this.datiSupl; } public void setDatiSupl(String datiSupl) { this.datiSupl = datiSupl; } public Date getDataInserimento() { return this.dataInserimento; } public void setDataInserimento(Date dataInserimento) { this.dataInserimento = dataInserimento; } public String getUtenteInserimento() { return this.utenteInserimento; } public void setUtenteInserimento(String utenteInserimento) { this.utenteInserimento = utenteInserimento; } public Set getDocumenti() { return this.documenti; } public void setDocumenti(Set documenti) { this.documenti = documenti; } public Set getRecapito() { return this.recapito; } public void setRecapito(Set recapito) { this.recapito = recapito; } public Set getCointestazione() { return this.cointestazione; } public void setCointestazione(Set cointestazione) { this.cointestazione = cointestazione; } public Set getCointestazioneSoggCoin() { return this.cointestazioneSoggCoin; } public void setCointestazioneSoggCoin(Set cointestazioneSoggCoin) { this.cointestazioneSoggCoin = cointestazioneSoggCoin; } public Set getDecodNdgFabbr() { return this.decodNdgFabbr; } public void setDecodNdgFabbr(Set decodNdgFabbr) { this.decodNdgFabbr = decodNdgFabbr; } public Set getIndirizzo() { return this.indirizzo; } public void setIndirizzo(Set indirizzo) { this.indirizzo = indirizzo; } public Set getSoggScheda() { return this.soggScheda; } public void setSoggScheda(Set soggScheda) { this.soggScheda = soggScheda; } public String toHtml() { String returnValue = null; if (this.tipoSogg.equals("F")) { returnValue = "<BR>Cognome: " + this.cognome + "<BR>Nome: " + this.nome + "<BR>Codice Fiscale: " + this.codiceFiscale; } else if (this.tipoSogg.equals("G")) { returnValue = "<BR>Denominazione: " + this.denominazione + "<BR>Partita IVA: " + this.partitaIva; } else { returnValue = "<BR>Soggetto Id: " + this.soggettoId; }  return returnValue; } public Set getPromotori() { return this.promotori; } public void setPromotori(Set promotori) { this.promotori = promotori; } public FinPromotore getPromotore() { return this.promotore; } public void setPromotore(FinPromotore promotore) { this.promotore = promotore; } public Set getIndirizzoDomicilio() { return this.indirizzoDomicilio; } public void setIndirizzoDomicilio(Set indirizzoDomicilio) { this.indirizzoDomicilio = indirizzoDomicilio; } public Set getIndirizzoResidenza() { return this.indirizzoResidenza; } public void setIndirizzoResidenza(Set indirizzoResidenza) { this.indirizzoResidenza = indirizzoResidenza; } public boolean equals(Object obj) { if (null == obj) return false; 
/* 1189 */     if (!(obj instanceof FinSoggetto)) return false;
/*      */     
/* 1191 */     FinSoggetto mObj = (FinSoggetto)obj;
/* 1192 */     if (null == getSoggettoId() || null == mObj.getSoggettoId()) return false; 
/* 1193 */     return getSoggettoId().equals(mObj.getSoggettoId()); } public FinSoggettoPrivacy getSoggettoPrivacy() { return this.soggettoPrivacy; } public void setSoggettoPrivacy(FinSoggettoPrivacy soggettoPrivacy) { this.soggettoPrivacy = soggettoPrivacy; } public String getAttoCostit() { return this.attoCostit; } public void setAttoCostit(String attoCostit) { this.attoCostit = attoCostit; } public String getBorsa() { return this.borsa; } public void setBorsa(String borsa) { this.borsa = borsa; } public String getCapitaleSoc() { return this.capitaleSoc; } public void setCapitaleSoc(String capitaleSoc) { this.capitaleSoc = capitaleSoc; } public String getCapitaleVer() { return this.capitaleVer; } public void setCapitaleVer(String capitaleVer) { this.capitaleVer = capitaleVer; } public String getCapNascita() { return this.capNascita; } public void setCapNascita(String capNascita) { this.capNascita = capNascita; } public String getCertifVigenza() { return this.certifVigenza; } public void setCertifVigenza(String certifVigenza) { this.certifVigenza = certifVigenza; } public String getCitta() { return this.citta; } public void setCitta(String citta) { this.citta = citta; } public String getCopiaCocLeg() { return this.copiaCocLeg; } public void setCopiaCocLeg(String copiaCocLeg) { this.copiaCocLeg = copiaCocLeg; } public String getCopiaCodFisc() { return this.copiaCodFisc; } public void setCopiaCodFisc(String copiaCodFisc) { this.copiaCodFisc = copiaCodFisc; } public String getCopiaRegTrib() { return this.copiaRegTrib; } public void setCopiaRegTrib(String copiaRegTrib) { this.copiaRegTrib = copiaRegTrib; } public Date getDataFondaz() { return this.dataFondaz; } public void setDataFondaz(Date dataFondaz) { this.dataFondaz = dataFondaz; } public Date getDataIscrRea() { return this.dataIscrRea; } public void setDataIscrRea(Date dataIscrRea) { this.dataIscrRea = dataIscrRea; } public Date getDataSciogli() { return this.dataSciogli; } public void setDataSciogli(Date dataSciogli) { this.dataSciogli = dataSciogli; } public String getFasciaCli() { return this.fasciaCli; } public void setFasciaCli(String fasciaCli) { this.fasciaCli = fasciaCli; } public String getFotocopiaDoc() { return this.fotocopiaDoc; } public void setFotocopiaDoc(String fotocopiaDoc) { this.fotocopiaDoc = fotocopiaDoc; } public String getNumCCIAA() { return this.numCCIAA; } public void setNumCCIAA(String numCCIAA) { this.numCCIAA = numCCIAA; } public String getNumREA() { return this.numREA; } public void setNumREA(String numREA) { this.numREA = numREA; } public String getPatrimonioTot() { return this.patrimonioTot; } public void setPatrimonioTot(String patrimonioTot) { this.patrimonioTot = patrimonioTot; } public String getPattiChiari() { return this.pattiChiari; } public void setPattiChiari(String pattiChiari) { this.pattiChiari = pattiChiari; } public String getProvREA() { return this.provREA; } public void setProvREA(String provREA) { this.provREA = provREA; } public String getRegoleProm() { return this.regoleProm; } public void setRegoleProm(String regoleProm) { this.regoleProm = regoleProm; } public String getSedeTribunale() { return this.sedeTribunale; } public void setSedeTribunale(String sedeTribunale) { this.sedeTribunale = sedeTribunale; } public String getSocEstera() { return this.socEstera; } public void setSocEstera(String socEstera) { this.socEstera = socEstera; } public String getSogInterdetto() { return this.sogInterdetto; } public void setSogInterdetto(String sogInterdetto) { this.sogInterdetto = sogInterdetto; } public String getSogMinore() { return this.sogMinore; } public void setSogMinore(String sogMinore) { this.sogMinore = sogMinore; } public String getStatoCliente() { return this.statoCliente; } public void setStatoCliente(String statoCliente) { this.statoCliente = statoCliente; } public String getStatoOper() { return this.statoOper; } public void setStatoOper(String statoOper) { this.statoOper = statoOper; } public String getStatuto() { return this.statuto; } public void setStatuto(String statuto) { this.statuto = statuto; } public String getVerbaleNomina() { return this.verbaleNomina; }
/*      */   public void setVerbaleNomina(String verbaleNomina) { this.verbaleNomina = verbaleNomina; }
/*      */   public String getAttivita() { return this.attivita; }
/*      */   public void setAttivita(String attivita) { this.attivita = attivita; }
/*      */   public String getSettore() { return this.settore; }
/*      */   public void setSettore(String settore) { this.settore = settore; }
/*      */   public String getNote() { return this.note; }
/*      */   public void setNote(String note) { this.note = note; }
/*      */   public FinAltriProdotti getaltriProdotti() { return this.altriProdotti; }
/*      */   public void setaltriProdotti(FinAltriProdotti altriProdotti) { this.altriProdotti = altriProdotti; }
/* 1203 */   public FinSoggetto copyFields(FinSoggetto soggetto) { this.cognome = soggetto.getCognome();
/* 1204 */     this.nome = soggetto.getNome();
/* 1205 */     this.tipoSogg = soggetto.getTipoSogg();
/* 1206 */     this.condPartSogg = soggetto.getCondPartSogg();
/* 1207 */     this.sesso = soggetto.getSesso();
/* 1208 */     this.codiceFiscale = soggetto.getCodiceFiscale();
/* 1209 */     this.partitaIva = soggetto.getPartitaIva();
/* 1210 */     this.dataNascita = soggetto.getDataNascita();
/* 1211 */     this.comuneNascita = soggetto.getComuneNascita();
/* 1212 */     this.provNascita = soggetto.getProvNascita();
/* 1213 */     this.nazNascita = soggetto.getNazNascita();
/* 1214 */     this.denominazione = soggetto.getDenominazione();
/* 1215 */     this.cittadinanza = soggetto.getCittadinanza();
/* 1216 */     this.tipoSocieta = soggetto.getTipoSocieta();
/* 1217 */     this.statoCensim = soggetto.getStatoCensim();
/* 1218 */     this.provDatiAnag = soggetto.getProvDatiAnag();
/* 1219 */     this.datiSupl = soggetto.getDatiSupl();
/* 1220 */     this.statoCliente = soggetto.getStatoCliente();
/* 1221 */     this.regoleProm = soggetto.getRegoleProm();
/* 1222 */     this.sogMinore = soggetto.getSogMinore();
/* 1223 */     this.sogInterdetto = soggetto.getSogInterdetto();
/* 1224 */     this.borsa = soggetto.getBorsa();
/* 1225 */     this.attoCostit = soggetto.getAttoCostit();
/* 1226 */     this.statoOper = soggetto.getStatoOper();
/* 1227 */     this.capitaleSoc = soggetto.getCapitaleSoc();
/* 1228 */     this.capitaleVer = soggetto.getCapitaleVer();
/* 1229 */     this.dataFondaz = soggetto.getDataFondaz();
/* 1230 */     this.dataIscrRea = soggetto.getDataIscrRea();
/* 1231 */     this.fotocopiaDoc = soggetto.getFotocopiaDoc();
/* 1232 */     this.fasciaCli = soggetto.getFasciaCli();
/* 1233 */     this.numCCIAA = soggetto.getNumCCIAA();
/* 1234 */     this.numREA = soggetto.getNumREA();
/* 1235 */     this.pattiChiari = soggetto.getPattiChiari();
/* 1236 */     this.provREA = soggetto.getProvREA();
/* 1237 */     this.socEstera = soggetto.getSocEstera();
/* 1238 */     this.statuto = soggetto.getStatuto();
/* 1239 */     this.sedeTribunale = soggetto.getSedeTribunale();
/* 1240 */     this.patrimonioTot = soggetto.getPatrimonioTot();
/* 1241 */     this.certifVigenza = soggetto.getCertifVigenza();
/* 1242 */     this.verbaleNomina = soggetto.getVerbaleNomina();
/* 1243 */     this.citta = soggetto.getCitta();
/* 1244 */     this.copiaCodFisc = soggetto.getCopiaCodFisc();
/* 1245 */     this.copiaCocLeg = soggetto.getCopiaCocLeg();
/* 1246 */     this.copiaRegTrib = soggetto.getCopiaRegTrib();
/* 1247 */     this.attivita = soggetto.getAttivita();
/* 1248 */     this.settore = soggetto.getSettore();
/* 1249 */     this.note = soggetto.getNote();
/* 1250 */     this.codUserMc = soggetto.getCodUserMc();
/* 1251 */     this.statoRapportoMc = soggetto.getStatoRapportoMc();
/* 1252 */     this.dataUltimaModificaSlave = new Date();
/* 1253 */     this.flagEsistenza = "S";
/* 1254 */     this.proceduraUltimaModificaSlave = soggetto.getProceduraUltimaModificaSlave();
/* 1255 */     this.tipoUltimaModificaSlave = "U";
/* 1256 */     this.userUltimaModificaSlave = soggetto.getUserUltimaModificaSlave();
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
/* 1267 */     return this; }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static FinSoggetto copyFieldsNew(FinSoggetto soggetto) {
/* 1275 */     FinSoggetto subject = new FinSoggetto();
/*      */     
/* 1277 */     subject.soggettoId = soggetto.getSoggettoId();
/* 1278 */     subject.cognome = soggetto.getCognome();
/* 1279 */     subject.nome = soggetto.getNome();
/* 1280 */     subject.tipoSogg = soggetto.getTipoSogg();
/* 1281 */     subject.condPartSogg = soggetto.getCondPartSogg();
/* 1282 */     subject.sesso = soggetto.getSesso();
/* 1283 */     subject.codiceFiscale = soggetto.getCodiceFiscale();
/* 1284 */     subject.partitaIva = soggetto.getPartitaIva();
/* 1285 */     subject.dataNascita = soggetto.getDataNascita();
/* 1286 */     subject.comuneNascita = soggetto.getComuneNascita();
/* 1287 */     subject.provNascita = soggetto.getProvNascita();
/* 1288 */     subject.nazNascita = soggetto.getNazNascita();
/* 1289 */     subject.denominazione = soggetto.getDenominazione();
/* 1290 */     subject.cittadinanza = soggetto.getCittadinanza();
/* 1291 */     subject.tipoSocieta = soggetto.getTipoSocieta();
/* 1292 */     subject.statoCensim = soggetto.getStatoCensim();
/* 1293 */     subject.provDatiAnag = soggetto.getProvDatiAnag();
/* 1294 */     subject.datiSupl = soggetto.getDatiSupl();
/* 1295 */     subject.statoCliente = soggetto.getStatoCliente();
/* 1296 */     subject.regoleProm = soggetto.getRegoleProm();
/* 1297 */     subject.sogMinore = soggetto.getSogMinore();
/* 1298 */     subject.sogInterdetto = soggetto.getSogInterdetto();
/* 1299 */     subject.borsa = soggetto.getBorsa();
/* 1300 */     subject.attoCostit = soggetto.getAttoCostit();
/* 1301 */     subject.statoOper = soggetto.getStatoOper();
/* 1302 */     subject.capitaleSoc = soggetto.getCapitaleSoc();
/* 1303 */     subject.capitaleVer = soggetto.getCapitaleVer();
/* 1304 */     subject.dataFondaz = soggetto.getDataFondaz();
/* 1305 */     subject.dataIscrRea = soggetto.getDataIscrRea();
/* 1306 */     subject.fotocopiaDoc = soggetto.getFotocopiaDoc();
/* 1307 */     subject.fasciaCli = soggetto.getFasciaCli();
/* 1308 */     subject.numCCIAA = soggetto.getNumCCIAA();
/* 1309 */     subject.numREA = soggetto.getNumREA();
/* 1310 */     subject.pattiChiari = soggetto.getPattiChiari();
/* 1311 */     subject.provREA = soggetto.getProvREA();
/* 1312 */     subject.socEstera = soggetto.getSocEstera();
/* 1313 */     subject.statuto = soggetto.getStatuto();
/* 1314 */     subject.sedeTribunale = soggetto.getSedeTribunale();
/* 1315 */     subject.patrimonioTot = soggetto.getPatrimonioTot();
/* 1316 */     subject.certifVigenza = soggetto.getCertifVigenza();
/* 1317 */     subject.verbaleNomina = soggetto.getVerbaleNomina();
/* 1318 */     subject.citta = soggetto.getCitta();
/* 1319 */     subject.copiaCodFisc = soggetto.getCopiaCodFisc();
/* 1320 */     subject.copiaCocLeg = soggetto.getCopiaCocLeg();
/* 1321 */     subject.copiaRegTrib = soggetto.getCopiaRegTrib();
/* 1322 */     subject.attivita = soggetto.getAttivita();
/* 1323 */     subject.settore = soggetto.getSettore();
/* 1324 */     subject.note = soggetto.getNote();
/* 1325 */     subject.dataUltimaModificaSlave = new Date();
/* 1326 */     subject.flagEsistenza = "S";
/* 1327 */     subject.proceduraUltimaModificaSlave = soggetto.getProceduraUltimaModificaSlave();
/* 1328 */     subject.tipoUltimaModificaSlave = "U";
/* 1329 */     subject.userUltimaModificaSlave = soggetto.getUserUltimaModificaSlave();
/* 1330 */     subject.documenti = soggetto.getDocumenti();
/* 1331 */     subject.recapito = soggetto.getRecapito();
/* 1332 */     subject.cointestazione = soggetto.getCointestazione();
/* 1333 */     subject.cointestazioneSoggCoin = soggetto.getCointestazioneSoggCoin();
/* 1334 */     subject.indirizzo = soggetto.getIndirizzo();
/* 1335 */     subject.indirizzoDomicilio = soggetto.getIndirizzoDomicilio();
/* 1336 */     subject.indirizzoResidenza = soggetto.getIndirizzoResidenza();
/* 1337 */     subject.decodNdgFabbr = soggetto.getDecodNdgFabbr();
/* 1338 */     subject.promotori = soggetto.getPromotori();
/* 1339 */     subject.soggScheda = soggetto.getSoggScheda();
/* 1340 */     subject.soggUltInfo = soggetto.getSoggUltInfo();
/* 1341 */     return subject;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int hashCode() {
/* 1347 */     if (Integer.MIN_VALUE == this.hashCode) {
/* 1348 */       if (null == getSoggettoId()) return super.hashCode();
/*      */       
/* 1350 */       String hashStr = getClass().getName() + ":" + getSoggettoId().hashCode();
/* 1351 */       this.hashCode = hashStr.hashCode();
/*      */     } 
/*      */     
/* 1354 */     return this.hashCode;
/*      */   }
/*      */   
/*      */   public Set getRecapitoAbitazione() {
/* 1358 */     return this.recapitoAbitazione;
/*      */   }
/*      */   
/*      */   public void setRecapitoAbitazione(Set recapitoAbitazione) {
/* 1362 */     this.recapitoAbitazione = recapitoAbitazione;
/*      */   }
/*      */   
/*      */   public Set getRecapitoCellulare() {
/* 1366 */     return this.recapitoCellulare;
/*      */   }
/*      */   
/*      */   public void setRecapitoCellulare(Set recapitoCellulare) {
/* 1370 */     this.recapitoCellulare = recapitoCellulare;
/*      */   }
/*      */   
/*      */   public Set getRecapitoFax() {
/* 1374 */     return this.recapitoFax;
/*      */   }
/*      */   
/*      */   public void setRecapitoFax(Set recapitoFax) {
/* 1378 */     this.recapitoFax = recapitoFax;
/*      */   }
/*      */   
/*      */   public Set getRecapitoUfficio() {
/* 1382 */     return this.recapitoUfficio;
/*      */   }
/*      */   
/*      */   public void setRecapitoUfficio(Set recapitoUfficio) {
/* 1386 */     this.recapitoUfficio = recapitoUfficio;
/*      */   }
/*      */   
/*      */   public Set getRecapitoEmail() {
/* 1390 */     return this.recapitoEmail;
/*      */   }
/*      */   
/*      */   public void setRecapitoEmail(Set recapitoEmail) {
/* 1394 */     this.recapitoEmail = recapitoEmail;
/*      */   }
/*      */   
/*      */   public Set getIndirizzoEletto() {
/* 1398 */     return this.indirizzoEletto;
/*      */   }
/*      */   
/*      */   public void setIndirizzoEletto(Set indirizzoEletto) {
/* 1402 */     this.indirizzoEletto = indirizzoEletto;
/*      */   }
/*      */   
/*      */   public String getStatoCivile() {
/* 1406 */     return this.statoCivile;
/*      */   }
/*      */   
/*      */   public void setStatoCivile(String statoCivile) {
/* 1410 */     this.statoCivile = statoCivile;
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
/*      */   public int getHashCode() {
/* 1434 */     return this.hashCode;
/*      */   }
/*      */   
/*      */   public void setHashCode(int hashCode) {
/* 1438 */     this.hashCode = hashCode;
/*      */   }
/*      */   
/*      */   public Boolean getIsDominant() {
/* 1442 */     return this.isDominant;
/*      */   }
/*      */   
/*      */   public void setIsDominant(Boolean isDominant) {
/* 1446 */     this.isDominant = isDominant;
/*      */   }
/*      */   
/*      */   public FinDecodSoggettoXP getDecodSoggettoXP() {
/* 1450 */     return this.decodSoggettoXP;
/*      */   }
/*      */   
/*      */   public void setDecodSoggettoXP(FinDecodSoggettoXP decodSoggettoXP) {
/* 1454 */     this.decodSoggettoXP = decodSoggettoXP;
/*      */   }
/*      */   
/*      */   public Set getSoggFascia() {
/* 1458 */     return this.soggFascia;
/*      */   }
/*      */   
/*      */   public void setSoggFascia(Set soggFascia) {
/* 1462 */     this.soggFascia = soggFascia;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDataCCIAA() {
/* 1469 */     return this.dataCCIAA;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataCCIAA(String dataCCIAA) {
/* 1475 */     this.dataCCIAA = dataCCIAA;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getVerbalePoteri() {
/* 1481 */     return this.verbalePoteri;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setVerbalePoteri(String verbalePoteri) {
/* 1487 */     this.verbalePoteri = verbalePoteri;
/*      */   }
/*      */   
/*      */   public String getTitoloStudioBatch() {
/* 1491 */     return this.titoloStudioBatch;
/*      */   }
/*      */   
/*      */   public void setTitoloStudioBatch(String titoloStudioBatch) {
/* 1495 */     this.titoloStudioBatch = titoloStudioBatch;
/*      */   }
/*      */   
/*      */   public String toString() {
/* 1499 */     return (new ToStringBuilder(this)).append("soggettoId", this.soggettoId).append("nome", this.nome).append("cognome", this.cognome).toString();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getAttEcoPrisma() {
/* 1507 */     return this.attEcoPrisma;
/*      */   }
/*      */   
/*      */   public void setAttEcoPrisma(String attEcoPrisma) {
/* 1511 */     this.attEcoPrisma = attEcoPrisma;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getIndirizzoFiscale() {
/* 1518 */     return this.indirizzoFiscale;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setIndirizzoFiscale(Set indirizzoFiscale) {
/* 1525 */     this.indirizzoFiscale = indirizzoFiscale;
/*      */   }
/*      */   
/*      */   public String getAntiriciclaggio() {
/* 1529 */     return this.antiriciclaggio;
/*      */   }
/*      */   
/*      */   public void setAntiriciclaggio(String antiriciclaggio) {
/* 1533 */     this.antiriciclaggio = antiriciclaggio;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getSottoscrizioni() {
/* 1540 */     return this.sottoscrizioni;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSottoscrizioni(Set sottoscrizioni) {
/* 1547 */     this.sottoscrizioni = sottoscrizioni;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getIndirizzoRam() {
/* 1554 */     return this.indirizzoRam;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setIndirizzoRam(Set indirizzoRam) {
/* 1560 */     this.indirizzoRam = indirizzoRam;
/*      */   }
/*      */   
/*      */   public Set getServiziAggiuntivi() {
/* 1564 */     return this.serviziAggiuntivi;
/*      */   }
/*      */   
/*      */   public void setServiziAggiuntivi(Set serviziAggiuntivi) {
/* 1568 */     this.serviziAggiuntivi = serviziAggiuntivi;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTipoCliente() {
/* 1575 */     return this.tipoCliente;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTipoCliente(String tipoCliente) {
/* 1582 */     this.tipoCliente = tipoCliente;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodUserMc() {
/* 1589 */     return this.codUserMc;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCodUserMc(String codUserMc) {
/* 1596 */     this.codUserMc = codUserMc;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getStatoRapportoMc() {
/* 1603 */     return this.statoRapportoMc;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setStatoRapportoMc(String statoRapportoMc) {
/* 1610 */     this.statoRapportoMc = statoRapportoMc;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getRuoliComeRappresentante() {
/* 1617 */     return this.ruoliComeRappresentante;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setRuoliComeRappresentante(Set ruoliComeRappresentante) {
/* 1624 */     this.ruoliComeRappresentante = ruoliComeRappresentante;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getRuoliComeRappresentato() {
/* 1631 */     return this.ruoliComeRappresentato;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setRuoliComeRappresentato(Set ruoliComerappresentato) {
/* 1638 */     this.ruoliComeRappresentato = ruoliComerappresentato;
/*      */   }
/*      */   
/*      */   public Boolean getIsAnt() {
/* 1642 */     return this.isAnt;
/*      */   }
/*      */   
/*      */   public void setIsAnt(Boolean isAnt) {
/* 1646 */     this.isAnt = isAnt;
/*      */   }
/*      */   
/*      */   public Set getEstrazioni() {
/* 1650 */     return this.estrazioni;
/*      */   }
/*      */   
/*      */   public void setEstrazioni(Set estrazioni) {
/* 1654 */     this.estrazioni = estrazioni;
/*      */   }
/*      */   
/*      */   public Set getTitoliOrdinati() {
/* 1658 */     return this.titoliOrdinati;
/*      */   }
/*      */   
/*      */   public void setTitoliOrdinati(Set titoliOrdinati) {
/* 1662 */     this.titoliOrdinati = titoliOrdinati;
/*      */   }
/*      */   
/*      */   public Set getSoggUltInfo() {
/* 1666 */     return this.soggUltInfo;
/*      */   }
/*      */   
/*      */   public void setSoggUltInfo(Set soggUltInfo) {
/* 1670 */     this.soggUltInfo = soggUltInfo;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinSoggetto.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */