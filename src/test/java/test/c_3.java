package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class c_3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement drp=driver.findElement(By.xpath("//Select[@name='country']"));
		Library.HandleDropDown(drp,"INDIA");
		
		WebElement first=driver.findElement(By.xpath("//input[@name='firstName']"));
		WebElement last =driver.findElement(By.xpath("//input[@name='lastName']"));
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		WebElement email=driver.findElement(By.xpath("//input[@name='userName']"));
		WebElement add=driver.findElement(By.xpath("//input[@name='address1']"));
		WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
		WebElement code=driver.findElement(By.xpath("//input[@name='postalCode']"));
		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement confirm=driver.findElement(By.xpath("//input[@na	publicme='confirmPassword']"));
			
		
		Library.custom_sendkeys(first,"sagar");
		Library.custom_sendkeys(last,"tayade");
		Library.custom_sendkeys(phone,"9876543210");
		Library.custom_sendkeys(email,"xyz@gamil.com");
		Library.custom_sendkeys(add,"mku");
		Library.custom_sendkeys(city,"malkapur");
		Library.custom_sendkeys(state,"maharastra");
		Library.custom_sendkeys(code,"443101");
		Library.custom_sendkeys(username,"@sagar123");
		Library.custom_sendkeys(pass,"qwerty@");
		Library.custom_sendkeys(confirm,"qwerty@");
	
		
		
	}

}
