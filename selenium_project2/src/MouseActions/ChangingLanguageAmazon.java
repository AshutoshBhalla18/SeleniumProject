package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ChangingLanguageAmazon {

	
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement language = driver.findElement(By.className("icp-nav-link-inner"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(language).perform();
		
		Thread.sleep(2000);
		WebElement choose= driver.findElement(By.xpath("(//span[text() ='हिन्दी'])[1]"));
		
		act.moveToElement(choose).click().perform();
		
		
	}
}
