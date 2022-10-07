package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C_5 {

	public static void main(String[] args) throws InterruptedException {

				WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		//Identifying the webelement
		
		WebElement autosug=driver.findElement(By.xpath("//input[@name='q']"));
		autosug.sendKeys("maven");
		
		Thread.sleep(5000);
		
		List<WebElement> Alloptions=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(Alloptions.size());
		
		for(int i=0;i<=Alloptions.size();i++){
			System.out.println(Alloptions.get(i).getText());
			
			if(Alloptions.get(i).getText().equalsIgnoreCase("maven dependency")){
				Alloptions.get(i).click();
				break;
				
				
			}
		}
		
	}

}
