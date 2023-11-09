package testScript;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com_section1.TakeScreenshot;

public class ActiTimeAssignment {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
		
		driver.findElement(By.className("popup_menu_button_settings")).click();
		
		driver.findElement(By.xpath("//a[text() ='Types of Work']")).click();
		
		driver.findElement(By.xpath("//span[text() ='Create Type of Work']")).click();
		
		driver.findElement(By.xpath("//input[@name ='name']")).sendKeys("Ashutosh",Keys.TAB,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER, 
				Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);
		
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
		
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text() ='Create Type of Work']"))));
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Screenshot/image3.Png");
				
		FileHandler.copy(src, dest);
		
	}
	
}
