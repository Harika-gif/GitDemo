package Academy;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.LandingPage;
import resources.base;

//we can use base class methods in this class by Inheritance base class by extends keyword
public class validateTitle extends base{
	public WebDriver driver;
public static Logger log=LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home page");
	}
	
	@Test
	public void validateAppTitle() 
	{
		
		
		//to access methods of another class we have 2 methods
		//one is inheritance by extends keyword
		//second is to create object for that class 
		
		LandingPage l= new LandingPage(driver);
		
		
	Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES123");
	log.info("Successfully validated Text message");
	}
		
		@AfterTest
		public void teardown()
		{
			driver.close();
		}
		
	
}
