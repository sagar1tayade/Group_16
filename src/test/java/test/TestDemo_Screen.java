package test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo_Screen {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		ts.getScreenshotAs(OutputType.FILE);
		File destn=new File("C:\Users\sagar\eclipse-workspace\Batch_b13_project\ScreenShot\\Test.png");
		
		FileUtils.copyFile(src, destn);
		
		
	}

}
