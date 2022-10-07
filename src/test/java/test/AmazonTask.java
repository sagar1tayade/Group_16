package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTask {

	public static void main(String[] args) throws IOException {
		
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
		
		WebElement title=driver.findElement(By.xpath("//span[@id='productTitle']"));
		String MobileTitle=title.getText();
		System.out.println(MobileTitle);
		
		WebElement price=driver.findElement(By.xpath("((//span[@class='a-offscreen'])[6]"));
		String MobilePrice=price.getText();
		System.out.println(MobilePrice);
		
		//screenshot
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File("C:\\Users\\sagar\\eclipse-workspace\\Batch_b13_project\\ScreenShot.Test.png");
		FileUtils.copyFile(src, destn);
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

	
		
		
		
	}

}
