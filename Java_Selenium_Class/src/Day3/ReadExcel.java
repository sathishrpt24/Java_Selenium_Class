package Day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\acer\\Desktop\\demo.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
	
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sh = workbook.getSheetAt(0);
		
		int rownum = sh.getLastRowNum();
		
		for(int i =0; i<=rownum;i++) {
			
			int colnum = sh.getRow(i).getLastCellNum();
			
			for(int j=0; j<colnum;j++) {
				
				String CellValue = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(CellValue+"\t");
	}
			System.out.println();
		
			
		}
		
				
 }

}
