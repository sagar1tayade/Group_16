package Test_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
WebDriver driver;
	
	@Parameters({"BrwoswerName"})
	@BeforeMethod
	public void BM(String BrwoswerName) {
		if(BrwoswerName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}
		else if(BrwoswerName.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 
	}
	@AfterMethod
	public void AM() {
		driver.close();
	}

}
