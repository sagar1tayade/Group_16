package Test_testNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HAndelingChildWIterator {
	@Test
	public void HandlChildWindow() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
	String parent=	driver.getWindowHandle();
	
	 driver.findElement(By.xpath("//a[text()='Click Here']")).click();

Set<String> Allid=driver.getWindowHandles();
Iterator<String> It=Allid.iterator();
String parentid=It.next();
System.out.println(parentid);
String childid= It.next();
System.out.println(childid);

driver.switchTo().window(childid);


}
}
