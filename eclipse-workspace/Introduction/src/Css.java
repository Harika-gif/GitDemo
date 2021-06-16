import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\harika\\eclipse-workspace\\selenium-for-beginners\\src\\main\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		/*driver.get("http://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("own xpath");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		*/
		
		/*driver.get("http://qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).click();*/
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("hi");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("12345");
		driver.findElement(By.cssSelector("[id='Login']")).click();
		
		
	}
}
