import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create Driver object for chrome Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harika\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		////tagname[@attribute='value'] --- xpath
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("my own xpath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pass");
		driver.findElement(By.xpath("//button[@name='login']")).click();	*/
		
		//tagname[attribute='value'] ---- css 
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("my own xpath");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("pass");
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
