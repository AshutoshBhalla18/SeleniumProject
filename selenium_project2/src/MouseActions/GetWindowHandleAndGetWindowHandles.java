package MouseActions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleAndGetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
	
	driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 14 (Blue, 128 GB)']")).click();
	
	String window_id = driver.getWindowHandle();
	
	Set<String> all_id = driver.getWindowHandles();
	
	
	for(String id: all_id) {
		
		driver.switchTo().window(id);
		
		if(driver.getTitle().contains("APPLE iPhone 14")){
			
			break;
			
		}
		
	}
	
	driver.findElement(By.xpath("//button[text() ='Add to cart']")).click();
	
	driver.switchTo().window(window_id);
	
	driver.findElement(By.xpath("//span[text() ='Cart']")).click();
	
	}
	
	
}
