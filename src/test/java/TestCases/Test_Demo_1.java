package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Loginpomm;

public class Test_Demo_1 {
	
	@Test
	public void test1() {
		//Browser open 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//webelement
		
		Loginpomm login=PageFactory.initElements(driver, Loginpomm.class);
		
		login.getemail().sendKeys("hdh");
		login.getpass().sendKeys("123456789");
		
	}

}
