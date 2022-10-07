package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C_4 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		//Identifying the WebElement
		
		WebElement drp=driver.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(drp);
		
		//Drop ByDEfaultValue verify
		
		System.out.println(sel.getFirstSelectedOption().getText());
		
		
		
		List<WebElement> list=sel.getOptions();
		
		System.out.println(list.size());
		
		//drop Option -Console PRint
		
		for(int i=0;i<=list.size();i++) {
			
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("NIGERIA")) {
				list.get(i).click();
				
			}
		}
		
		
		
		
	}

}
