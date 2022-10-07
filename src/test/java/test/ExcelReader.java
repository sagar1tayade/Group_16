package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws Exception {
		
	String path="C:\\Users\\sagar\\eclipse-workspace\\Batch_b13_project\\TestData\\Data.xlsx";
	FileInputStream fis= new FileInputStream(path);
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	
	String data=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
	System.out.println(data);
	
	}

}
