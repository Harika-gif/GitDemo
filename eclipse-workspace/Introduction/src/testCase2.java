import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harika\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("http://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("own xpath");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		*/
		
		/*driver.get("http://qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).click();*/
	}
}
