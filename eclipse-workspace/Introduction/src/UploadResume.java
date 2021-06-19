import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadResume {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harika\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		String uploadFile= "C:\\Users\\harika\\Desktop\\Certificates Personal\\Resume\\Harika Kotha_Resume.docx";
		driver.get("https://www.naukri.com/mnjuser/profile?id=&orgn=homepage");
		
		Thread.sleep(1000000);
		
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys(uploadFile);

	}

}
