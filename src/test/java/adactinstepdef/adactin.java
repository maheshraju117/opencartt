package adactinstepdef;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adactin {

WebDriver driver;
@Given("starts {string} browser")
public void starts_browser(String browser) {
   if(browser.equalsIgnoreCase("chrome")) {
	   driver=new ChromeDriver();
   }
   else if(browser.equalsIgnoreCase("edge")) {
	  driver = new EdgeDriver();
   }
}

@Given("open {string} url")
public void open_url(String url) {
   driver.get(url);
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   
}

@When("enter username {string} using id {string}")
public void enter_username_using_id(String user, String id) {
    driver.findElement(By.id(id)).sendKeys(user);
}

@When("enter password {string} using id {string}")
public void enter_password_using_id(String pass, String id) {
	driver.findElement(By.id(id)).sendKeys(pass);
}
@Then("click on login using id {string}")
public void click_on_login_using_id(String loginbtn) {
    driver.findElement(By.id(loginbtn)).click();
}

@When("successful verify title {string}")
public void successful_verify_title(String titlever) {
	String actual = driver.findElement(By.xpath("(//td[@class='welcome_menu'])[1]")).getText();
	Assert.assertEquals(actual, titlever);
	driver.close();
	System.out.println("test passed");
}
	
}
