package MouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotClassUse {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[contains(@class,'_42')])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Ashutosh");
		
		Robot r = new Robot();
		
		// for selecting
		r.keyPress(KeyEvent.VK_META);
		r.delay(2000);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_META);
		r.keyRelease(KeyEvent.VK_A);
		
		
		// for copying
		r.keyPress(KeyEvent.VK_META);
		r.delay(2000);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_META);
		r.keyRelease(KeyEvent.VK_C);
		
		
		// for changing field
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		//for pasting
		r.keyPress(KeyEvent.VK_META);
		r.delay(2000);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_META);
		r.keyRelease(KeyEvent.VK_V);
		
		}
	
}
