package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RedifLoginPage {

	
	WebDriver driver;
	//create constructor
	//constructor means method with same class name
	//this keyword represent locale driver
	public RedifLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//method 1 to define objects 
	By username=By.xpath("//input[@id='login1']");
	By password=By.name("passwd");
	By go= By.name("proceed");
	By home=By.linkText("rediff.com");
	
	public WebElement EmailId()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(go);
	}
	
	public WebElement Home()
	{
		return driver.findElement(home);
	}
}
