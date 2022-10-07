package Test_testNG;

import org.testng.annotations.Test;

public class Test_4 {
	
	@Test(groups= {"sanity"})
	public void m1() {
		System.out.println("m1");
	}
	@Test(groups= {"regression"})
	public void m2() {
		System.out.println("m2");
	}

	@Test(groups= {"sanity"})
	public void m3() {
		System.out.println("m3");
	}

	@Test(groups= {"regression"})
	public void m4() {
		System.out.println("m4");
	}

	@Test(groups= {"sanity"})
	public void m5() {
		System.out.println("m5");
	}

}
