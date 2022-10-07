package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_1 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
//driver.close();     //close current window
//driver.navigate().to("https://appsbuzz.com/apps/google-play-store/");
//Thread.sleep(3000);    //3sec
//driver.navigate().back();
//driver.navigate().forward();
//driver.navigate().refresh();

//Identify WebElemt  Locators Id
WebElement txt_email=driver.findElement(By.id("email"));
WebElement txt_password=driver.findElement(By.id("pass"));
WebElement btn_login=driver.findElement(By.name("login"));
 
//Actions
txt_email.sendKeys("Test@gmail.com");
txt_password.sendKeys("14234567890");
btn_login.click();

//Verify



	}

}
