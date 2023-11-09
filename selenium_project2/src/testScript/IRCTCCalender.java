package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTCCalender {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8')]")).sendKeys("Chandigarh");
		
		driver.findElement(By.xpath("//span[text()=' CHANDIGARH - CDG ']")).click();
		
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9')]")).sendKeys("Delhi");
		
		driver.findElement(By.xpath("//span[text()=' DELHI - DLI ']")).click();
		
		
		driver.findElement(By.xpath("//span[contains(@class,'ui-calendar')]	")).click();
		
		while(true) {
			
			String year =driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-year')]")).getText();
				
			String month=driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-month')]")).getText();
			
			if(year.equals("2023") && month.equals("December")) {
				
				driver.findElement(By.xpath("//a[text()='4']")).click();
				break;
			}
			
			else {
				
				driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-next-icon')]")).click();
			}
				
			}

			
		driver.findElement(By.xpath("(//span[contains(@class,'ng-tns-c65-11')])[1]")).click();
		
		driver.findElement(By.xpath("//span[text()='Sleeper (SL)']")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'ng-tns-c65-12')])[3]")).click();
		
		driver.findElement(By.xpath("//span[text()='LADIES']")).click();
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
	}
	
	
}
