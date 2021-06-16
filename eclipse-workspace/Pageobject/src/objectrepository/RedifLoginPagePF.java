package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedifLoginPagePF {

	
	WebDriver driver;
	//create constructor
	//constructor means method with same class name
	//this keyword represent locale driver
	public RedifLoginPagePF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//method 2 to define objects ----Page object factory style
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement go;
	
	@FindBy(linkText="rediff.com")
	WebElement home;
	
	public WebElement EmailId()
	{
		return username;
	}
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement submit()
	{
		return go;
	}
	
	public WebElement home()
	{
		return home;
	}
	
}
