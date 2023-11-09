package testScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataOrangeHRM {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream fis = new FileInputStream("/Users/ashutoshbhalla/Desktop/Selenium/Data Driven Testing/OrangeHrm.properties");
		
		Properties pobj = new Properties();
		
		pobj.load(fis);
		
		String url = pobj.getProperty("url");
		
		String un = pobj.getProperty("username");
		
		String pwd = pobj.getProperty("password");
		
		
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();
	
	}
	
}
