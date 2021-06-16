package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	
	@BeforeClass
	public void beforecls()
	{
		System.out.println("i will execute before any method execute in day 3");
	}
	
	@AfterClass
	public void aftercls()
	{
		System.out.println("I will execute after all methods executed from this class that is day 3");
	}
	
	
	@Parameters({"URL", "APIKey/username"})
	@Test
	public void Weblogincarloan(String urlname, String key) {
		System.out.println("Weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}

	@Test(enabled=false)
	public void Mobilelogincarloan()
	{
		System.out.println("Mobilelogincar");
	}
	
	@BeforeSuite
	public void Beforesuit()
	{
		System.out.println("I am super priority");
	}
	
	
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod
	public void afterevery()
	{
		System.out.println("I will execute after very test method in day 3 class");
	}
	
	@Test
	public void Mobilesignincarloan()
	{
		System.out.println("Mobilesignincar");
		Assert.assertTrue(false);
	}
	
	@Test(dataProvider="getData")
	public void Mobilesignoutcarloan(String username, String password)
	{
		System.out.println("Mobilesignoutcar");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods= {"Weblogincarloan"})
	public void APIcarloan()
	{
		System.out.println("loginapicar");
	}

	@DataProvider
	public Object[][] getData()
	{
		//1st scenario - username password - good credit history row
		//2nd scenario - username password- no credit history
		//3rd scenario - fraud element credit history
		//need multidymantional array
		//here 3 is our test scenarios which are rows and 2 is values need to passed which are columns
		Object[][] data= new Object[3][2];
		
		//1st scenario
		data[0][0]="firstsetusername";
		data[0][1]="password";
		
		//2nd scenario
		data[1][0]="secondsetusername";
		data[1][1]="password2";
		
		//3rd scenario
		data[2][0]="thirdusername";
		data[2][1]="password3";
		
		return data;
	}
	
}
