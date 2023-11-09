package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///Users/ashutoshbhalla/Downloads/iframe.html");
		
		//driver.switchTo().frame(0);
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath("//input[contains (@class,'ui-autocomplete-input')]")).sendKeys("Books",Keys.ENTER);
		
	}
	
}
