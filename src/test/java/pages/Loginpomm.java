package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpomm {
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	WebElement pass;
		
	public WebElement getemail() {
		return email;
	}
	public WebElement getpass() {
		return pass;
	}

}
