package Test_testNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindow {
	@Test
	public void HandlChildWindow() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();		
		System.out.println(parent);  //8D65C43B25B37240288FE5EE2630A0BB
		 driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		  
		Set<String> allId= driver.getWindowHandles();
System.out.println(allId);

	List<String> id=new ArrayList(allId);
	String parentid=id.get(0);
	String childid=id.get(1);
	System.out.println(childid);
	
	
}
}
