package testCases;


import org.testng.annotations.Test;

import PageObjects.homepage;
import PageObjects.registerpage;
import testBase.Baseclass;

public class TC_001_registerpage extends Baseclass{
	
	@Test
	public  void registering_account(){
		try {
		logger.info("Test execution started");
		homepage obj = new homepage(driver);
		obj.myaccount();
		obj.registerbutton();
		String alpha =alpha();
		String numeric = numeric();
		String emil = (alpha+numeric+"@gmail.com");
		registerpage obj1 = new registerpage(driver);
		logger.info("input values entered");
		obj1.fname("mahesh");
		obj1.lname("rudraraju");
		obj1.emil(emil);
		obj1.pwd("qwerty@123");
		logger.info("actions started");
		obj1.newltr();
		obj1.privacy();
		obj1.contne();
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}	
}
