import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scopedemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harika\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		int i;
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer= driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement columnDriver = footer.findElement(By.xpath("//table/tbody/tr/td/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		
		for(i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			
			
		}
			Set <String> abc=driver.getWindowHandles();
			Iterator <String> it=abc.iterator();
		
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
			}
			
		}
	}


