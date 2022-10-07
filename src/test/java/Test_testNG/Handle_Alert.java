package Test_testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Alert {
	
	@Test
	public void Handlealert() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		
		//WebElement
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		Alert alt=driver.switchTo().alert();
		
		String text=alt.getText();
		System.out.println(text);
		
		
		//click on cancel btn 
		//alt.dismiss();
		alt.accept();
		
		String text2=alt.getText();
		System.out.println(text2);
		
		alt.accept();
		
		
	}

}

