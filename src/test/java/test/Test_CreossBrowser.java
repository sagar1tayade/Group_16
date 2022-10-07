package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_CreossBrowser {
	WebDriver driver;
	
	@BeforeMethod
	public void BM() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@AfterMethod
	public void AM() {
		driver.close();
	}

}
