package Test_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void BrwoserOpen() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}

	@Test
	public void verify_page1() {
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("@test123");
	}

	@Test
	public void verify_page2() {
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("@test123");
	}

	

	@AfterMethod
	public void Browserclose() {
		driver.close();
		
	}

}
	