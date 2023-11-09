package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysEnumFacebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[contains(@class,'_42')])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Ashutosh",Keys.TAB,"Bhalla",Keys.TAB,"ashutosh.zipanier@gmail.com",Keys.TAB,"bhallajatt",Keys.TAB);
		
		}
	
}
