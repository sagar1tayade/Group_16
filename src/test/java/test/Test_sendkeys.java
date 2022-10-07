package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_sendkeys {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').value='seleniumtest'", "");
		
		
		//usingxpath
		
	WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
	js.executeScript("arguments[0].value='test'", pass);
	
	WebElement login=driver.findElement(By.xpath("//button[@value='1']"));
	js.executeScript("arguments[0].click()", login);
		
		
		
		
		
	}

}
