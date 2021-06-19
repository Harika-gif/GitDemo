import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\harika\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-middle");
		
		
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]")).getText());
		
		driver.switchTo().defaultContent();*/
		
		String s = "Hi this is Harika";
		System.out.println(s.contains("Harika"));
	}

}
