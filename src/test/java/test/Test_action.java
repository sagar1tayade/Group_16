package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_action {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		
		//Mousehover 
		 
		Actions act=new Actions(driver);
		WebElement selenium=driver.findElement(By.xpath("//a[text()='Selenium']"));
		 act.moveToElement(selenium).click().build().perform();
		 
		 
		
		
		
		
		
	}

}
