package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato_Scrolling {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.zomato.com/india");
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		executor.executeScript("window.scrollBy(0,4000);");
		
		driver.findElement(By.xpath("//h5[text()='Malaysia']")).click();
		
	}
	
	
}
