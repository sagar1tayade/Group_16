package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginPom;

public class TestDemo1 {
	
	@Test
	public void Test2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		loginPom login=PageFactory.initElements(driver, loginPom.class);
		login.getemail().sendKeys("bhhj");
		login.getpass().sendKeys("123456789");
		
		
	}

}
