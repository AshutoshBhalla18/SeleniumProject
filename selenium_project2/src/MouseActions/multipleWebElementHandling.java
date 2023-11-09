package MouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWebElementHandling {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
	
			
	List<WebElement> iphone = driver.findElements(By.xpath("//div[contains (@class,'_4rR')]"));
	
	
	/*for(WebElement opt:iphone) {
		
		System.out.println(opt.getText());
	}*/
	
	List<WebElement> price = driver.findElements(By.xpath("//div[contains(@class,'jeq')]"));
			
	for(WebElement opt:price) {
				
	System.out.println(opt.getText());
	
	}
	
	System.out.println(price.size());
		
	}
	
	
}
