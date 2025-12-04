/*    */ package it.ras.arco.batch.investitori.main;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.BufferedWriter;
/*    */ import java.io.FileReader;
/*    */ import java.io.FileWriter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CreateRecords
/*    */ {
/*    */   public static void main(String[] args) {
/* 27 */     String fileInput = "c:\\Test\\Test.txt";
/* 28 */     String fileOutput = "c:\\Test\\Final.txt";
/* 29 */     String recordType = "01";
/*    */     try {
/*    */       String line;
/* 32 */       BufferedReader reader = new BufferedReader(new FileReader(fileInput));
/* 33 */       BufferedWriter writer = new BufferedWriter(new FileWriter(fileOutput));
/*    */       do {
/* 35 */         line = reader.readLine();
/*    */       }
/* 37 */       while (line != null);
/*    */     
/*    */     }
/* 40 */     catch (Exception e) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\main\CreateRecords.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */