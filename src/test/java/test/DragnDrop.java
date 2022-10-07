package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragnDrop {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		 
		//Drag and drop
		
		Actions acts=new Actions(driver);
		
		WebElement src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));	
		WebElement destn1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement Src2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement destn2=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement Src3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement destn3=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement Src4=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement destn4=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Library.Custom_DragnDrop(driver, src1, destn1);
		Library.Custom_DragnDrop(driver, Src2, destn2);
		Library.Custom_DragnDrop(driver, Src3, destn3);
		Library.Custom_DragnDrop(driver, Src4, destn4);
	}

}
