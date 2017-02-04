package xlsbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet;

///import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Newxls {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\ankit\\Downloads\\hello.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook Newbook = new XSSFWorkbook(inputStream);
		Sheet NewSheet = Newbook.getSheetAt(0);
	    int size= NewSheet.getLastRowNum();
	    
	    Set<Integer> set = new HashSet<Integer>();
	    System.out.println(size);
	    
	    for(int i = 0;  i<size;  i++){
	    	int a =(Integer.parseInt((NewSheet.getRow(i).getCell(6).getStringCellValue())));
	    	System.out.println(a);
	    	
	        }
	    
	    System.out.println(set);
	    
	  
	Newbook.close();	
	}

}
