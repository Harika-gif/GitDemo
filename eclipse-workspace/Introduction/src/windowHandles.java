import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harika\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
        
		//now to handle windows parent and child
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		
		//System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		String emailId= driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split(" ")[4].trim();
		
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(emailId);
	}

}
