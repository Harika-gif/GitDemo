import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harika\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int i;
		int rows=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr")).size();
		int colums=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[1]/th")).size();
				
		System.out.println("no. of rows =" + rows);
		System.out.println("no. of columns=" + colums);
		
		List <WebElement> rowData=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[3]"));
		for(i=0;i<rowData.size();i++)
		{
			System.out.println(rowData.get(i).getText());
			
		}
		
		driver.quit();
	}

}
