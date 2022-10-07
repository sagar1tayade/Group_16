package Test_testNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Keywords {
	
	 @BeforeMethod
	 public void BM() {
		System.out.println("Browser open");
	 }
	 @Test(invocationCount=2)
	 public void test_A() {
		 System.out.println("A");
	 }
	 @Test(priority=2)
	 public void test_c() {
		 System.out.println("C");
		 
		Assert.assertTrue(false);
	 }

	 @Test(enabled=false)
	 public void test_D() {
		 System.out.println("D");
	 }
	 @Test(priority=1,dependsOnMethods="test_c")
	 public void test_B() {
		 System.out.println("B");
	 }
	 
	 
	 @AfterMethod
	 public void BC() {
		 System.out.println("Broswer closing");
	 }


}
