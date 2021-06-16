import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2eCompleteCode {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harika\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
			System.out.println("its disabled");
			Assert.assertTrue(true);
		}
		else {
			assertTrue(false);
		}
		
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']/option[5]")).click();		
		Assert.assertEquals(driver.findElement(By.cssSelector("#divpaxinfo")).getText(),"5 Adult");
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		//driver.findElement(By.cssSelector("input[value='Search']"))
		//driver.findElement(By.cssSelector("//input[@value='Search']"))
		
		
		
		
	}

}
