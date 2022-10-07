package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.gurupage;

public class guruTestDemo2 {
	
	@Test
	public void test2() {
		//Browser opening
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		gurupage verify	=PageFactory.initElements(driver, gurupage.class);
		verify.getfirst().sendKeys("sagar");
		verify.getlast().sendKeys("tayade");
		verify.getphone().sendKeys("987654321");
		verify.getemail().sendKeys("Test@113");
		verify.getadd().sendKeys("mku");
		verify.getstate().sendKeys("maharashtra");	
		verify.getcode().sendKeys("443101");
		verify.getusername().sendKeys("Sagar@123");
		verify.getpass().sendKeys("qwerty123");
		verify.getconfirm().sendKeys("qwerty123");
		verify.getcity().sendKeys("mku");
		Library.HandleDropDown(verify.getdrp(),"INDIA");
		
		
		
		
		
	}

}
