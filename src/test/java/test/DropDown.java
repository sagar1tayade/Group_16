package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		 
		WebElement DrpDown= driver.findElement(By.xpath("//select[@name='country']"));
		Select sel =new Select(DrpDown);
		sel.selectByIndex(6);
		sel.selectByValue("ICELAND");
		sel.selectByVisibleText("INDIA"); 
		
		custom_HandleDropdown(DrpDown,"ICELAND");
		
	}
	
	public static void custom_HandleDropdown(WebElement element, String text) {
		Select Select=new Select(element);
		Select.selectByVisibleText(text);
		
		
	}

}
