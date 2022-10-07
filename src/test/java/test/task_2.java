package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task_2 {

 static void main(String[] args) throws InterruptedException   {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		//identifying the elements
		
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
		WebElement drp=driver.findElement(By.xpath("//Select[@name='country']"));
		Select sel=new Select(drp);
		sel.selectByValue("INDIA");
		
		
		//input
		first.sendKeys("sagar");
		last.sendKeys("tayade");
		phone.sendKeys("9876543210");
		email.sendKeys("saggytayade@gmail.com");
		add.sendKeys("buldhana");
		city.sendKeys("malkapur");
		state.sendKeys("maharashtra");
		code.sendKeys("443101");
		username.sendKeys("sagar@123");
		pass.sendKeys("963258741");
		confirm.sendKeys("963258741");
		
		
		
		
		
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		Thread.sleep(3000);
		driver.close();
		
		
		

		
		
		

		
	}

}
