package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

//we can use base class methods in this class by Inheritance base class by extends keyword
public class HomePage extends base{
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password, String text) 
	{
		
		driver.get(prop.getProperty("url"));
		
		//to access methods of another class we have 2 methods
		//one is inheritance by extends keyword
		//second is to create object for that class 
		
		LandingPage l= new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		log.info(text);
		lp.getLogin().click();
		ForgotPassword fp= lp.forgotPassword();
		fp.email().sendKeys("dkjf");
		fp.sendMeInstructions().click();
		
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	//data provider annotation to check same flow with multiple parameter/values
	@DataProvider
	public Object[][] getData()
	{
		//first[] is Row stands for hom many different data types test should run
		//second[] is column stands for how many values per each test
		//here check same test flow with 2 user and 3 values
		//but index will start with 0
		Object[][] data= new Object[2][3];
	    //0th row
		data[0][0]="nonrestricteduser@qw.com";
	    data[0][1]="12345";
	    data[0][2]="Non Restricted user";
	    //1st row
	    data[1][0]="restricteduser@qw.com";
	    data[1][1]="45678";
	    data[1][2]="Restricted user";
		
		return data;
		
	}
}
