package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchbrowser {

	public static void main(String[] args) throws Exception {
//Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://onlinesbi.sbi/");
		driver.manage().window().maximize();
		//driver.close(); //close the current window
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);

		
		driver.navigate().to("https://appsbuzz.com/apps/google-play-store/");
		Thread.sleep(3000);   //3 sec
		driver.navigate().back();
		Thread.sleep(3000);   //3 sec

		driver.navigate().forward(); 
		Thread.sleep(3000);   //3 sec

		driver.navigate().refresh();
		driver.close(); //close the current window
		
		  
		
	}

}
