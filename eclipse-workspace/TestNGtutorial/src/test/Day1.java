package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	@AfterTest
	public void Lastexecution()
	{
		System.out.println("i will execute last");
	}
	
	
@Test(groups= {"Smoke"})
	public void Demo()
	{
		System.out.println("Hello");
	}

@AfterSuite
public void aftersuite()
{
	System.out.println("I am super last");
}



@Test
public void Secondtest()
{
	System.out.println("Bye");

}

public interface IRetryAnalyzer
{
	
	}
}
