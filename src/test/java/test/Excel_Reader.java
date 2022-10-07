package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel_Reader {

	public static void main(String[] args) throws Exception {

		String path="C:\\Users\\sagar\\eclipse-workspace\\Batch_b13_project\\TestData\\Data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		
		String data=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String pass=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();

		String url=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();		

		System.out.println(data);
		
		//Browser opening
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		//Identify the Web Element
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(data);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
	}

}
