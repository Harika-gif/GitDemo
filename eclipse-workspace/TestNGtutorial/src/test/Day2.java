package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	
	@Test(groups= {"Smoke"})
	public void something()
	{
		System.out.println("hii");
	}

	@BeforeTest
	public void prerequest()
	{
		System.out.println("i will receive first");
	}
	
}
