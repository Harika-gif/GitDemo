import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harika\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[1]/th[2]")).getText().contains("May");
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[1]/th[2]")).getText().contains("August"))
		{
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}
		// List <WebElement> number= driver.findElements(By.cssSelector(".day"));

		int count = driver.findElements(By.cssSelector(".day")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if (text.equalsIgnoreCase("10")) {
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}
	}
}