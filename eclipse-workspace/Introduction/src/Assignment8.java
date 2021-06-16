import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harika\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("ni");
		
		Thread.sleep(3000);
		List <WebElement> text=driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
		
		for(WebElement option: text)
		{
			if(option.getText().equalsIgnoreCase("Nigeria"))
			{
				option.click();
				break;
			}
		}
		
		driver.quit();
	}

}
