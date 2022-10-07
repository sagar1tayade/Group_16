package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		 
		//Identify the elements
		 
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("bugspoter classes");
		WebElement search_btn=driver.findElement(By.xpath("(//input[@type='submit'])[3]"));
		search_btn.click();
		
		driver.navigate().to("https://www.flipkart.com/");
		WebElement fsearch=driver.findElement(By.xpath("//input[@type='text']"));
		fsearch.sendKeys("apple 13 pro");
		WebElement fksearch=driver.findElement(By.xpath("//button[@type='submit']"));
		fksearch.click();
		

		
		
	
		 
		
			
		
		
		
		
		
		
		
	}

}
