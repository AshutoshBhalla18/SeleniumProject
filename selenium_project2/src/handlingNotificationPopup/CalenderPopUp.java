package handlingNotificationPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//driver.findElement(By.xpath("//a[text()='29']")).click();
		
		
		while(true) {
			
			String month = driver.findElement(By.className("ui-datepicker-month")).getText();
			
			String year = driver.findElement(By.className("ui-datepicker-year")).getText();
			
	
			if(year.equals("2001") && month.equals("December")) {
				
				driver.findElement(By.xpath("//a[text()='4']")).click();
				break;
			}
			else {
				
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
	}
	
}		
	
}
