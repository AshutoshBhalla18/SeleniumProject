package dataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingData {

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
		
		
		System.out.println(url);
		
		System.out.println(un);
		
		System.out.println(pwd);
		
	}
	
}
