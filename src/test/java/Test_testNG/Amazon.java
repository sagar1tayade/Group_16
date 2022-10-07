package Test_testNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	
	@Test
	public void TAsk() throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//SearchBar nd Send key
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//Scrolling
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement Scroll=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		js.executeScript("arguments[0].scrollIntoView()", Scroll);
		Scroll.click();
		
		Set<String> allid=driver.getWindowHandles();
		List<String> id=new ArrayList(allid);
		String child=id.get(1);
		driver.switchTo().window(child);
		
		
		WebElement title=driver.findElement(By.xpath("//span[@id='productTitle']"));
		String MobileTitle=title.getText();
		System.out.println(MobileTitle);
		
		WebElement price=driver.findElement(By.xpath("(//span[@class='a-offscreen'])[6]"));
		System.out.println(price.getText());
		
		
		//screenshot
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File("C:\\Users\\sagar\\eclipse-workspace\\Batch_b13_project\\ScreenShots\\Test1.png");
		FileUtils.copyFile(src, destn);
		
		// ADd to Cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//a[@class='a-link-normal close-button']")).click();
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//wait.until(ExpectedConditions.elementToBeClickable(Cart)).click();
		
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		
		TakesScreenshot ts1=(TakesScreenshot) driver;
		File src1=ts.getScreenshotAs(OutputType.FILE);
		File destn1=new File("C:\\Users\\sagar\\eclipse-workspace\\Batch_b13_project\\ScreenShots.Test2.png");
		FileUtils.copyFile(src, destn);
		
		//verify
		
	    String expected="Your Amazon Cart is empty.";
	    WebElement verify=driver.findElement(By.xpath("//h1[@class='a-spacing-mini a-spacing-top-base']"));
	    String actual=verify.getText();
	    Assert.assertEquals(actual, expected);
	    
	    System.out.println(actual);
		
				
		

	
		
		
	
		
	}

}
