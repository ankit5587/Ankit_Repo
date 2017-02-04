package xlsbook;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
public class JavaBook {

	public static void main(String[] args) throws Exception {
			  
		 File file =    new File("C:\\Users\\ankit\\Downloads\\Dummy_Sample_data.xls");
		 
		 FileInputStream inputStream = new FileInputStream(file);
		 
		 Workbook Newbook = new HSSFWorkbook(inputStream);
		 
		 Sheet NewSheet = Newbook.getSheet("Sheet1");
		 
		 int rowCount = NewSheet.getLastRowNum()-NewSheet.getFirstRowNum();
		 
		 //DataFormatter formatter = new DataFormatter(Locale.US);
 
		 for (int i = 0; i < rowCount+1; i++) {
		 	Row row = NewSheet.getRow(i);
		 	
		 	for (int j = 0; j < row.getLastCellNum(); j++) {
		 		
		 	System.out.println(row.getCell(j).getStringCellValue());
           

		  //  
			 
				 //	System.out.println(formatter.formatCellValue(row.getCell(0)));
				// System.out.println(formatter.formatCellValue(row.getCell(1)));
	           
	        //   System.out.println(j_username);
	         //  System.out.println(j_password);
	           
			
			//	 System.out.print(row.getCell(j).getStringCellValue()+"|| ");
			 }
		 }
		 Newbook.close();
	}
	
}

	/*public void readExcel(String filePath,String sheetName) throws Exception{
		
		
		 File file =    new File(filePath);
		 
		 FileInputStream inputStream = new FileInputStream(file);
		 
		 Workbook Newbook = new HSSFWorkbook(inputStream);
		 
		 Sheet NewSheet = Newbook.getSheet(sheetName);
		 
		 int rowCount = NewSheet.getLastRowNum()-NewSheet.getFirstRowNum();
		 
		 
		 for (int i = 0; i < rowCount+1; i++) {
		 	
			 Row row = NewSheet.getRow(i);
			 
			 for (int j = 0; j < row.getLastCellNum(); j++) {
				 System.out.print(row.getCell(j).getStringCellValue()+"|| ");
			 }
		 }
	
	}
}

*/