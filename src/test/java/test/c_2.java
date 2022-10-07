package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class c_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 
		//identifying the elements using xpath by attribute----> Relative xpath
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		txt_email.sendKeys("test");
	 	WebElement txt_pass=driver.findElement(By.xpath("//input[@name='pass']"));
		txt_pass.sendKeys("1234567890");
		
		WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
		btn_login.click();
		 
		WebElement forgot_btn=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgot_btn.click();
		
		
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
