import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harika\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/");

		WebElement adults = driver.findElement(By.id("Adults"));
		Select s = new Select(adults);
		s.selectByValue("5");

		WebElement children = driver.findElement(By.id("Childrens"));
		Select s1 = new Select(children);
		s1.selectByValue("0");

		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		driver.findElement(By.cssSelector("input[id='AirlineAutocomplete']")).sendKeys("indigo");
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='homeErrorMessage']")).getText());
	}

}
