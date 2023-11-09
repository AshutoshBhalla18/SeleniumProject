package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame1 {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///Users/ashutoshbhalla/Downloads/iframe.html");
		
		//driver.switchTo().frame(1);
		
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.className("menu-toggle")).click();
		
	}
	
}
