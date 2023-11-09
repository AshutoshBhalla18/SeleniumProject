package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("file:///Users/ashutoshbhalla/Downloads/iframe.html");
		
		WebElement wb = driver.findElement(By.xpath("//iframe[@src ='https://demowebshop.tricentis.com']"));
		
		driver.switchTo().frame(wb);
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("car",Keys.ENTER);
		
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		
	}
	
	
}
