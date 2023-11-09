package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text() ='✕']")).click();
		
		WebElement fashion = driver.findElement(By.xpath("//span[text() = 'Fashion']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(fashion).perform();
		
		//driver.findElement(By.linkText("Men's T-Shirts")).click(); // using click method directly
		
		WebElement men = driver.findElement(By.linkText("Men's T-Shirts"));
		
		act.moveToElement(men).click().perform(); // using click method from actions class
	}
	
}
