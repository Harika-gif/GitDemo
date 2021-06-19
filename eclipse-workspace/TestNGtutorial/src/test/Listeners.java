package test;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

//ITestListener interface which implements testng listerners

public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult resutl) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I successfully executed listners pass code");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		//to know which test is failed use result variable which will keep all the data of testcase 
		System.out.println("I got failed listners fail code" +result.getName());
		
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	@Override
	public void onStart(ITestContext context) {
		
	}
	
	
	
	
	
}
