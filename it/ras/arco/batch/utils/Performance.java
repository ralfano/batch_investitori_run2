/*     */ package it.ras.arco.batch.utils;
/*     */ 
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ public class Performance {
/*   7 */   private static final Log logger = LogFactory.getLog(Performance.class);
/*     */   
/*     */   public static final char DEBUG_LOG_LEVEL = 'D';
/*     */   
/*     */   public static final char INFO_LOG_LEVEL = 'I';
/*     */   public static final char WARN_LOG_LEVEL = 'W';
/*     */   public static final char ERROR_LOG_LEVEL = 'E';
/*     */   public static final char FATAL_LOG_LEVEL = 'F';
/*     */   public static final char DEFAULT_LOG_LEVEL = 'D';
/*     */   private static final long DEFAULT_FREQUENCY_LOG = 1L;
/*     */   private static final String DEFAULT_PERFORMANCE_ID = "ID";
/*     */   private static final String DEFAULT_SEPARATOR = " ";
/*     */   private static final String TYPE_START = "START";
/*     */   private static final String TYPE_UPDATE = "UPDATE";
/*  21 */   private StringBuffer buff = null;
/*  22 */   private String idPerformance = "ID";
/*  23 */   private char logLevel = 'D';
/*  24 */   private long frequencyLog = 1L;
/*  25 */   private long count = 0L;
/*  26 */   private long min = 10000000000L;
/*  27 */   private long max = -1L;
/*  28 */   private long sum = 0L;
/*  29 */   private long initMillis = 0L;
/*  30 */   private long elapsedMillis = 0L;
/*  31 */   private String key = null;
/*  32 */   private String type = null;
/*     */ 
/*     */   
/*     */   private void ini(String id, long frequencyLogParam, char logLevelParam) {
/*  36 */     if (frequencyLogParam < 0L)
/*  37 */       frequencyLogParam = 0L; 
/*  38 */     if (id != null && !id.equals("")) {
/*  39 */       this.idPerformance = id.replace(' ', '_');
/*     */     }
/*  41 */     this.logLevel = Character.toUpperCase(logLevelParam);
/*  42 */     this.frequencyLog = frequencyLogParam;
/*  43 */     this.count = 0L;
/*  44 */     this.min = 10000000000L;
/*  45 */     this.max = -1L;
/*  46 */     this.sum = 0L;
/*  47 */     this.elapsedMillis = 0L;
/*  48 */     this.initMillis = System.currentTimeMillis();
/*     */     
/*  50 */     writeLog("Delete this row before import to xls\nDATE TIME LEVEL CLASS METHOD IGNORE " + getIdPerformance().replace(' ', '_') + "(" + getFrequencyLog() + ")" + " " + "ACTIVE_THREADS" + " " + "TYPE" + " " + "DESCRIPTION" + " " + "COUNT" + " " + "KEY" + " " + "AVG(msec)" + " " + "ELAPSED(msec)" + " " + "MIN(msec)" + " " + "MAX(msec)" + " " + "SUM(msec)" + " " + "SUM");
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
/*     */   public Performance() {
/*  73 */     ini("ID", 1L, 'D');
/*     */   }
/*     */ 
/*     */   
/*     */   public Performance(String idPerformance) {
/*  78 */     ini(idPerformance, 1L, 'D');
/*     */   }
/*     */ 
/*     */   
/*     */   public Performance(String idPerformance, long frequencyLogParam) {
/*  83 */     ini(idPerformance, frequencyLogParam, 'D');
/*     */   }
/*     */ 
/*     */   
/*     */   public Performance(String idPerformance, long frequencyLogParam, char logLevelParam) {
/*  88 */     ini(idPerformance, frequencyLogParam, logLevelParam);
/*     */   }
/*     */ 
/*     */   
/*     */   public void start() {
/*  93 */     start("-", true, "-");
/*     */   }
/*     */ 
/*     */   
/*     */   public void start(String keyParam) {
/*  98 */     start(keyParam, true, "-");
/*     */   }
/*     */   
/*     */   public void start(String keyParam, boolean logStart) {
/* 102 */     start(keyParam, logStart, "-");
/*     */   }
/*     */ 
/*     */   
/*     */   public void start(String keyParam, Object objDescription) {
/* 107 */     start(keyParam, true, objDescription);
/*     */   }
/*     */ 
/*     */   
/*     */   private void start(String keyParam, boolean logStart, Object objDescription) {
/* 112 */     this.initMillis = System.currentTimeMillis();
/* 113 */     setKey(keyParam);
/* 114 */     setType("START");
/* 115 */     this.count++;
/* 116 */     if (logStart) {
/* 117 */       log(objDescription);
/*     */     }
/*     */   }
/*     */   
/*     */   public void update() {
/* 122 */     this.elapsedMillis = System.currentTimeMillis() - this.initMillis;
/* 123 */     this.sum += this.elapsedMillis;
/* 124 */     if (this.elapsedMillis < this.min)
/* 125 */       this.min = this.elapsedMillis; 
/* 126 */     if (this.elapsedMillis > this.max)
/* 127 */       this.max = this.elapsedMillis; 
/* 128 */     setType("UPDATE");
/*     */   }
/*     */ 
/*     */   
/*     */   public void log() {
/* 133 */     log("-");
/*     */   }
/*     */   
/*     */   public void log(Object obj) {
/* 137 */     if (this.frequencyLog == 0L)
/* 138 */       return;  if (obj == null) { obj = "-"; } else { obj = ((String)obj).replace(' ', '_'); }
/*     */     
/* 140 */     float tempFloat = 0.0F;
/* 141 */     long temp = 0L;
/* 142 */     if (this.count % this.frequencyLog == 0L) {
/*     */       
/* 144 */       this.buff = new StringBuffer(80);
/* 145 */       this.buff.append(getIdPerformance()); this.buff.append("_"); this.buff.append(Thread.currentThread().getName());
/* 146 */       this.buff.append(" ");
/* 147 */       this.buff.append(Thread.activeCount());
/* 148 */       this.buff.append(" ");
/* 149 */       this.buff.append(getType());
/* 150 */       this.buff.append(" ");
/* 151 */       this.buff.append(obj);
/* 152 */       this.buff.append(" ");
/* 153 */       this.buff.append(getCount());
/* 154 */       this.buff.append(" ");
/* 155 */       this.buff.append(getKey());
/* 156 */       this; if (getType().equals("UPDATE")) {
/*     */         
/* 158 */         this.buff.append(" ");
/* 159 */         tempFloat = Float.parseFloat(String.valueOf(getSum())) / (float)getCount(); this.buff.append(tempFloat);
/* 160 */         this.buff.append(" ");
/* 161 */         temp = getElapsedMillis(); this.buff.append(temp);
/* 162 */         this.buff.append(" ");
/* 163 */         temp = getMin(); this.buff.append(temp);
/* 164 */         this.buff.append(" ");
/* 165 */         temp = getMax(); this.buff.append(temp);
/* 166 */         this.buff.append(" ");
/* 167 */         temp = getSum(); this.buff.append(temp);
/* 168 */         this.buff.append(" ");
/* 169 */         temp = getSum() / 3600000L % 24L; this.buff.append(temp);
/* 170 */         this.buff.append(":");
/* 171 */         temp = getSum() / 60000L % 60L; this.buff.append(temp);
/* 172 */         this.buff.append(":");
/* 173 */         temp = getSum() / 1000L % 60L; this.buff.append(temp);
/*     */       } 
/* 175 */       writeLog(this.buff);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void writeLog(Object obj) {
/* 182 */     if (this.frequencyLog == 0L)
/*     */       return; 
/* 184 */     switch (this.logLevel) { case 'D':
/* 185 */         logger.debug(obj); return;
/* 186 */       case 'I': logger.info(obj); return;
/* 187 */       case 'W': logger.warn(obj); return;
/* 188 */       case 'E': logger.error(obj); return;
/* 189 */       case 'F': logger.fatal(obj); return; }
/* 190 */      logger.debug(obj);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void updateAndLog() {
/* 196 */     updateAndLog("-");
/*     */   }
/*     */   
/*     */   public void updateAndLog(Object obj) {
/* 200 */     update();
/* 201 */     log(obj);
/*     */   }
/*     */ 
/*     */   
/*     */   public long getInitMillis() {
/* 206 */     return this.initMillis;
/*     */   }
/*     */ 
/*     */   
/*     */   public long getElapsedMillis() {
/* 211 */     return this.elapsedMillis;
/*     */   }
/*     */   
/*     */   public long getCount() {
/* 215 */     return this.count;
/*     */   }
/*     */   
/*     */   public long getMax() {
/* 219 */     return this.max;
/*     */   }
/*     */   
/*     */   public long getMin() {
/* 223 */     return this.min;
/*     */   }
/*     */   
/*     */   public long getSum() {
/* 227 */     return this.sum;
/*     */   }
/*     */   
/*     */   public String getIdPerformance() {
/* 231 */     return this.idPerformance;
/*     */   }
/*     */   public long getFrequencyLog() {
/* 234 */     return this.frequencyLog;
/*     */   }
/*     */   
/*     */   public char getLogLevel() {
/* 238 */     return this.logLevel;
/*     */   }
/*     */   
/*     */   public void setLogLevel(char logLevel) {
/* 242 */     this.logLevel = logLevel;
/*     */   }
/*     */   
/*     */   public String getKey() {
/* 246 */     return this.key;
/*     */   }
/*     */   
/*     */   private void setKey(String key) {
/* 250 */     this.key = key;
/*     */   }
/*     */   
/*     */   public String getType() {
/* 254 */     return this.type;
/*     */   }
/*     */   
/*     */   private void setType(String type) {
/* 258 */     this.type = type;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batc\\utils\Performance.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */