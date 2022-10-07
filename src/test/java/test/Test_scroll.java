package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_scroll {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Scrolling --->pixel
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500)","");
		//js.executeScript("window.scrollBy(0,-500)","");
		
		
		//scrolling with the hwlp of webelement
		
		WebElement link_eng=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		js.executeScript("arguments[0].scrollIntoView()", link_eng);
		
		
		

	}

}
