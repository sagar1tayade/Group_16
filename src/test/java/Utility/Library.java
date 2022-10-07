package Utility;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Library {
	public static void custom_sendkeys(WebElement element,String value) {
		try{
			element.sendKeys(value);
		}
		catch(Exception e) {
		System.out.println(e.getMessage());
		}

		
		}
	public static void HandleDropDown(WebElement element, String text) {
		try{
			Select drp=new Select(element);
		drp.selectByVisibleText(text);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void Custom_DragnDrop(WebDriver driver,WebElement src, WebElement destn) {
	  Actions acts =new Actions(driver);
	  acts.dragAndDrop(src, destn).build().perform();
	  
	}
	
	public static void customHAndledrpDown(WebElement element, String value) {
		Select sel=new Select(element);
	List<WebElement> list=sel.getOptions();
		
		System.out.println(list.size());
		
		//drop Option -Console PRint
		
		for(int i=0;i<=list.size();i++) {
			
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals(value)) {
				list.get(i).click();
				
			}
		}
	}
	
	public static String customHandleAlertText(WebDriver driver) {
		Alert alt=driver.switchTo().alert();
		String txt=alt.getText();
		return txt;
	}
	
	public static void customHandleAlertok(WebDriver driver) {
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	 
	public static void customHandleAlertdismiss(WebDriver driver) {
		Alert alt=driver.switchTo().alert();
		alt.dismiss(); 
	}

	
	
	

	
}

