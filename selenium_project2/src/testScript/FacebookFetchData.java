package testScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookFetchData {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream fis = new FileInputStream("/Users/ashutoshbhalla/Desktop/Selenium/Data Driven Testing/FacebookData.properties");
		
		Properties pobj = new Properties();
		
		pobj.load(fis);
		
		String url = pobj.getProperty("url");
		
		String fname = pobj.getProperty("firstname");
		
		String sname = pobj.getProperty("surname");
		
		String email = pobj.getProperty("email");
		
		String email2 = pobj.getProperty("email2");
		
		String pwd = pobj.getProperty("password");
		
		String day = pobj.getProperty("day");
		
		String month = pobj.getProperty("month");
		
		String year = pobj.getProperty("year");
		
		
		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname,Keys.TAB,sname,Keys.TAB,email,Keys.TAB,pwd);
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(email2);
		
		WebElement bday = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(bday);
		
		s.selectByVisibleText(day);
		
		WebElement bdaymonth = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s1 = new Select(bdaymonth);
		
		s1.selectByVisibleText(month);
		
		WebElement bdayyear = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s2 = new Select(bdayyear);
		
		s2.selectByVisibleText(year);
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		
	}
	
	
}
