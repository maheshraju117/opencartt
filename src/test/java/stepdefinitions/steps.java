package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import testBase.Baseclass;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {

	WebDriver driver;
    

    List<HashMap<String, String>> datamap; //Data driven

    Logger logger; //for logging
    ResourceBundle rb; // for reading properties file
    String br; //to store browser name
	@Before
    public void setup()    //Junit hook - executes once before starting
    {
        //for logging
        logger= LogManager.getLogger(this.getClass());
        //Reading config.properties (for browser)
        rb=ResourceBundle.getBundle("config");
        br=rb.getString("browser");
     
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Scenario status ======>"+scenario.getStatus());
        if(scenario.isFailed()) {
        	
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
        	            
        }
       driver.quit();
    }
	@Given("launch {string} browser")
	public void launch_browser(String string) {
	 driver=new ChromeDriver();
	 
	}

	@Given("enter {string}")
	public void enter(String url) {
	    driver.get(url);
	    driver.manage().window().maximize();
	}
	

	@Given("click on enter")
	public void click_on_enter() {
		System.out.println("hii");
	    
	}

	
	
}
