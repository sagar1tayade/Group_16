package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Key_Action {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		///Actions 
		Actions act=new Actions(driver);
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		act.keyDown(email, Keys.SHIFT).sendKeys("bugspotter").keyDown(Keys.SHIFT).build().perform();
		
		
		//copy andd paste task 
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.click();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

		

		
		
	}

}
