import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolldemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harika\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int i,sum=0;
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//to scroll webpage
		js.executeScript("window.scrollBy(0,500)");
		//to scroll in a table or any component
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		//now to sum of all elements in 4th column
		List <WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		
		for(i=0;i<values.size();i++)
		{
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		
		int total=Integer.parseInt(driver.findElement(By.cssSelector("div[class='totalAmount']")).getText().split(":")[1].trim());
		
		Assert.assertEquals(total,sum);
	}

}
