package xlsbook;

import java.io.File;
import java.io.FileInputStream;
//import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewClassExcel {

	public static void main(String[] args) throws Exception {
		DataFormatter formatter = new DataFormatter();
		File file = new File("C:\\Users\\ankit\\Downloads\\hello.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook Newbook = new XSSFWorkbook(inputStream);
		 Sheet sheet1 = Newbook.getSheetAt(0);	
		 
		Set<String> Newset =new HashSet<String>();
		List<String> Newlist = new ArrayList<String>();
		
		 for (Row row : sheet1) {
			 for (Cell cell : row){
				 CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
				String ref= (cellRef.formatAsString());
				// System.out.print(" - ");
				 if(ref=="$G$1"){
				
				 String text = formatter.formatCellValue(cell);
				// System.out.println(text);
				 Newset.add(text);
				 Newlist.add(text);
				 }
			 } 
		 }
		 System.out.println(Newlist);
		 Newbook.close();
	}
}
