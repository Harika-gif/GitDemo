package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RedifHomepage {

	
	WebDriver driver;
	//create constructor
	//constructor means method with same class name
	//this keyword represent locale driver
	public RedifHomepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search=By.id("srchword");
	By submit = By.className("newsrchbtn");
	
	public WebElement Search()
	{
		return driver.findElement(search);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(submit);
	}
	
}
