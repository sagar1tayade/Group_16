package Test_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormyTask {
	
	@Test
	public void Formy() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		
		
		 driver.findElement(By.xpath("(//a[text()='Autocomplete'])[2]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("mku");
		 driver.findElement(By.xpath("//input[@id='street_number']")).sendKeys("gokuldham road");
		 driver.findElement(By.xpath("//input[@id='route']")).sendKeys("1st road");

		 driver.findElement(By.xpath("//input[@id='locality']")).sendKeys(" malkapur");

		 driver.findElement(By.xpath("//input[@id='administrative_area_level_1']")).sendKeys("maharashtra");

		 driver.findElement(By.xpath("//input[@id='postal_code']")).sendKeys("443101");

		 driver.findElement(By.xpath("(//input[@type=\"text\"])[7]")).sendKeys("india");

		 driver.navigate().back();
		 driver.findElement(By.xpath("(//a[text()='Buttons'])[2]")).click();
		 
		 


		 
		 
		
		
		
	}

}
