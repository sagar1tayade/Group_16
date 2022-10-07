package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class gurupage {
	
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	WebElement first;

	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	WebElement last;

	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	WebElement phone;

	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement email ;

	@FindBy(how=How.XPATH,using="//input[@name='address1']")
	WebElement add;

	@FindBy(how=How.XPATH,using="//input[@name='city']")
	WebElement city ;

	@FindBy(how=How.XPATH,using="//input[@name='state']")
	WebElement state;

	@FindBy(how=How.XPATH,using="//input[@name='postalCode']")
	WebElement code ;

	@FindBy(how=How.XPATH,using="//input[@name='email']")
	WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement pass ;
	
	@FindBy(how=How.XPATH,using="//input[@name='confirmPassword']")
	WebElement confirm ;
	
	@FindBy(how=How.XPATH,using="//select[@name='country']")
	WebElement drp;
	
	public WebElement getfirst() {
		return first;
		
	}
	public WebElement getlast() {
		return last;
		
	}
	public WebElement getphone() {
		return phone;
		
	}
	public WebElement getemail() {
		return email;
		
	}
	public WebElement getadd() {
		return add;
		
	}
	public WebElement getcity() {
		return city;
		
	}
	public WebElement getstate() {
		return state;
		
	}
	public WebElement getcode() {
		return code;
		
	}
	public WebElement getpass() {
		return pass;
		
	}
	public WebElement getconfirm() {
		return confirm;
		
	}
	public WebElement getdrp() {
		return drp;
		
	}
	public WebElement getusername() {
		return username;
		
	}
	

}
