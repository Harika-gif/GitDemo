import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harika\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//create object for actions class
	    Actions a= new Actions(driver);
	    
	    //mousehover on object
	    WebElement move=driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
	    a.moveToElement(move).build().perform();
	    
	    a.moveToElement(driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']"))).click().build().perform();
	    
	    //contextClick will right click on the element
	    //a.moveToElement(move).contextClick().build().perform();
	    
	    //enter something in uppercase
	    //a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	    
	    //select entire entered text
	    //a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().perform();
	    
		
	    

	}

}
