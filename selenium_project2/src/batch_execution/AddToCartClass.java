package batch_execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToCartClass {

	@Test
	public void addToCart() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("jattvaily@gmail.com",Keys.TAB,"jattisjatt",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("book",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[contains(@class,'button-2')]")).click();
	
		System.out.println("Add to Cart Test Case is passed");
		
	}
	
	
	
	
}
