package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registerpage extends basepage{

	public registerpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="input-firstname")
	WebElement firstname;
	
	@FindBy(id="input-lastname")
	WebElement lastname;
	
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(id="input-newsletter-yes")
	WebElement newsletter;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement privacypolicy;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	
	public void fname(String fname) {
		firstname.sendKeys(fname);
	}
	
	public void lname(String lname) {
		lastname.sendKeys(lname);
	}
	
	public void emil(String emil) {
		email.sendKeys(emil);
	}
	
	public void pwd(String pass) {
		password.sendKeys(pass);
	}

	public void newltr() {
		newsletter.click();
	}
	
	public void privacy() {
		privacypolicy.click();
	}
	
	public void contne() {
		submit.click();
	}
	
	
	
	
	
	
}
