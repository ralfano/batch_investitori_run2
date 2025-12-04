/*     */ package it.ras.flag.workflow;
/*     */ 
/*     */ import it.ras.flag.ArchUtils;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileReader;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.StringWriter;
/*     */ import org.apache.tools.ant.BuildException;
/*     */ import org.hibernate.cfg.Configuration;
/*     */ import org.jbpm.ant.DeployProcessTask;
/*     */ import org.jbpm.db.JbpmSession;
/*     */ import org.jbpm.db.JbpmSessionFactory;
/*     */ import org.jbpm.graph.def.ProcessDefinition;
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
/*     */ public class ProcessDeployerAntTask
/*     */   extends DeployProcessTask
/*     */ {
/*  33 */   private String xmlConfigFile = "testprocess.par/processdefinition.xml";
/*  34 */   private String processName = "testprocess";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  39 */   private String newVersion = "1";
/*  40 */   private String versionAutoIncrement = "false";
/*  41 */   private String hibernateCfgFile = "hibernate.cfg.xml";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void execute() throws BuildException {
/*     */     try {
/*  49 */       validate();
/*  50 */       log("Validazone configurazione task superata");
/*     */       
/*  52 */       log("Verifica esistenza file di configurazione '" + getHibernateCfgFile() + "' ...");
/*     */ 
/*     */       
/*  55 */       File fileHibernate = new File(getHibernateCfgFile());
/*  56 */       BufferedReader br = new BufferedReader(new FileReader(fileHibernate));
/*     */       
/*  58 */       br.readLine();
/*  59 */       br.close();
/*     */       
/*  61 */       log("... Caricamento configurazione hibernate dal file '" + getHibernateCfgFile() + "' ...");
/*     */ 
/*     */       
/*  64 */       Configuration configuration = new Configuration();
/*  65 */       configuration.configure(fileHibernate);
/*     */       
/*  67 */       log("... Costruzione session factory ...");
/*     */       
/*  69 */       JbpmSessionFactory jbpmSessionFactory = JbpmSessionFactory.buildJbpmSessionFactory(configuration);
/*     */ 
/*     */       
/*  72 */       log("... Caricamento descrittore di processo: '" + getXmlConfigFile() + "' ...");
/*     */ 
/*     */       
/*  75 */       File fileProcessDef = new File(getXmlConfigFile());
/*  76 */       ProcessDefinition processDefinition = ProcessDefinition.parseXmlInputStream(new FileInputStream(fileProcessDef));
/*     */ 
/*     */       
/*  79 */       log("... Connessione al DB ...");
/*     */ 
/*     */       
/*  82 */       JbpmSession jbpmSession = jbpmSessionFactory.openJbpmSession();
/*     */ 
/*     */       
/*  85 */       jbpmSession.beginTransaction();
/*     */       
/*  87 */       int version = getUserDefinedVersion();
/*  88 */       if (isVersionAutoincrementEnabled()) {
/*     */         try {
/*  90 */           ProcessDefinition oldDefinition = jbpmSession.getGraphSession().findLatestProcessDefinition(getProcessName());
/*     */ 
/*     */ 
/*     */           
/*  94 */           version = oldDefinition.getVersion();
/*  95 */           version++;
/*     */           
/*  97 */           log("Su DB e' gia' presente una definizione per il processo '" + getProcessName() + "' ed e' in versione '" + (version - 1) + "', verra' salvata a DB una nuova versione con numero '" + version + "'");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         }
/* 104 */         catch (Exception e) {
/* 105 */           log("Impossibile individuare l'ultima versione del processo su DB, forse non e' mai stato deployato. Proseguo ...");
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/* 110 */       processDefinition.setVersion(version);
/*     */       
/* 112 */       log("... Deploy del processo: Nome '" + getProcessName() + "', Versione '" + version + "'  in corso ...");
/*     */ 
/*     */ 
/*     */       
/* 116 */       jbpmSession.getGraphSession().saveProcessDefinition(processDefinition);
/*     */ 
/*     */ 
/*     */       
/* 120 */       jbpmSession.commitTransaction();
/*     */ 
/*     */       
/* 123 */       jbpmSession.close();
/*     */       
/* 125 */       log("... Processo correttamente deployato");
/* 126 */     } catch (Exception e) {
/* 127 */       StringWriter sw = new StringWriter();
/* 128 */       e.printStackTrace(new PrintWriter(sw));
/*     */       
/* 130 */       throw new BuildException("[ERRORE]: " + e.getClass().getName() + " - " + e.getMessage() + " STACKTRACE:\n" + sw.getBuffer().toString(), e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isVersionAutoincrementEnabled() {
/* 139 */     return "true".equals(getVersionAutoIncrement());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int getUserDefinedVersion() {
/*     */     try {
/* 147 */       return Integer.parseInt(getNewVersion());
/* 148 */     } catch (Exception e) {
/*     */ 
/*     */       
/* 151 */       return 1;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void validate() throws BuildException {
/* 158 */     if (!ArchUtils.isValid(getXmlConfigFile())) {
/* 159 */       throw new BuildException("Property 'xmlConfigFile' is mandatory.");
/*     */     }
/*     */     
/* 162 */     if (!ArchUtils.isValid(getProcessName())) {
/* 163 */       throw new BuildException("Property 'processName' is mandatory.");
/*     */     }
/*     */     
/* 166 */     if (ArchUtils.isValid(getNewVersion())) {
/*     */       try {
/* 168 */         int i = Integer.parseInt(getNewVersion());
/* 169 */         if (i < 1) {
/* 170 */           throw new BuildException("Property 'newVersion' must be set to a value greater than 0.");
/*     */         }
/*     */       }
/* 173 */       catch (Exception e) {
/* 174 */         throw new BuildException("Property 'newVersion' must be set to an integer value.");
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXmlConfigFile() {
/* 184 */     return this.xmlConfigFile;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setXmlConfigFile(String xmlConfigFile) {
/* 192 */     this.xmlConfigFile = xmlConfigFile;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNewVersion() {
/* 199 */     return this.newVersion;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNewVersion(String newVersion) {
/* 207 */     this.newVersion = newVersion;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProcessName() {
/* 214 */     return this.processName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProcessName(String processName) {
/* 222 */     this.processName = processName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVersionAutoIncrement() {
/* 229 */     return (this.versionAutoIncrement == null) ? "false" : this.versionAutoIncrement;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVersionAutoIncrement(String versionAutoIncrement) {
/* 239 */     this.versionAutoIncrement = versionAutoIncrement;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getHibernateCfgFile() {
/* 246 */     return this.hibernateCfgFile;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHibernateCfgFile(String hibernateCfgFile) {
/* 254 */     if (ArchUtils.isValid(hibernateCfgFile))
/* 255 */       this.hibernateCfgFile = hibernateCfgFile; 
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\workflow\ProcessDeployerAntTask.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */