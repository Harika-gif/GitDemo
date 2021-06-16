package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RedifHomepage;
import objectrepository.RedifLoginPage;
import objectrepository.RedifLoginPagePF;

public class Loginapplication {

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harika\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//if you want to access object u need to create object for that class where ur objects placed
		
		/*RedifLoginPage rd= new RedifLoginPage(driver);
		rd.EmailId().sendKeys("hello");
		rd.Password().sendKeys("1234");
		//rd.submit().click();
		rd.Home().click(); */
		
		RedifLoginPagePF rdpf=new RedifLoginPagePF(driver);
		rdpf.EmailId().sendKeys("hello");
		rdpf.Password().sendKeys("pass");
		//rdpf.submit().click();
		rdpf.home().click();
		
		RedifHomepage rh= new RedifHomepage(driver);
		rh.Search().sendKeys("redif");
		rh.Submit().click();
	}
	
	
}
