package qaclickacademy.ExtendReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportDemo {
	//create globally to access into other methods
	ExtentReports extent;
	
	@BeforeTest
	public void config()
	{
		//this class will create path for html report
		//report file name and html name can be anything
		
		String path= System.getProperty("user.dir")+"\\youcancheckreportshere\\report.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		//by using methods we can manipulate html report
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Harika Kotha");
	}
	
	
	
	
	
	@Test
	public void initialDemo()
	{
		
		ExtentTest test=extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harika\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
		test.fail("Result do not match");
		
		
		extent.flush();
	}

	
	
}
