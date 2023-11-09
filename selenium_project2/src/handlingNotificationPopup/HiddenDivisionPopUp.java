package handlingNotificationPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		
		driver.findElement(By.xpath("(//div[@class='img'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[text()='Delete'])[1]")).click();
		
		//Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='You are about to delete 68 tasks']"))));
		
		WebElement text = driver.findElement(By.xpath("//div[contains (text(),'You are about to delete')]"));
		
		System.out.println(text.getText());
		 
		
	}
	
	
	
}
