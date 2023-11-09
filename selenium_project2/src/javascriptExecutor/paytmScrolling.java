package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paytmScrolling {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://paytm.com/");
		
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		
		executor.executeScript("window.scrollBy(0,1100);");
		
		driver.findElement(By.xpath("//div[text()='Flight']")).click();
		
		
	}
	
	
}
