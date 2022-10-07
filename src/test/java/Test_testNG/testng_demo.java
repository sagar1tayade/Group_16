package Test_testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng_demo {
	
	@BeforeMethod
	public void BrowserOPening() {
		
		System.out.println("Browser open");
	}
	
	@Test
	 public void Test1() {
		System.out.println("TEst1");
	}
	@Test
	 public void Test2() {
		System.out.println("TEst2");
		
	}
	@Test
	 public void Test3() {
		System.out.println("TEst3");
	}
	
	@AfterMethod 
	public void BrowswerClosing() {
		System.out.println("BrowswerClosing");
		
	}
	
}
