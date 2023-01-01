package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage extends basepage{

	public homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//span[text()='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement regbutton;
	
	public void myaccount() {
		myaccount.click();
	}
	public void registerbutton(){
		regbutton.click();
	}
	
	
	
	
	
}
