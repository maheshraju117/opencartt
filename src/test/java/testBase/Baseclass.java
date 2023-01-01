package testBase;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
public static WebDriver driver;
public Logger logger;
public ResourceBundle rb;
	@BeforeTest
	@Parameters("browser")
	public void start(String browser) {
		rb = ResourceBundle.getBundle("config");
		logger = LogManager.getLogger(this.getClass());
		if(browser.equals("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.get(rb.getString("url"));
		driver.manage().window().maximize();
		
	}
	@AfterTest
	public void close() {
		driver.quit();
	}
	
	public String alpha() {	
	String alp = RandomStringUtils.randomAlphabetic(5);
	return alp;	
	}
	
	public String numeric() {
		String num = RandomStringUtils.randomNumeric(3);
		return num;
	}
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;

	}
	
	
}
