package testScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriScript{

	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='What is your name?']")).sendKeys("Ashutosh Bhalla",Keys.TAB,"ashutoshbhalla06@gmail.com",Keys.TAB,"Sameasabove@1",Keys.TAB,"9877960737");
		
		driver.findElement(By.xpath("(//h2[@class='main-3'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id='currentCity']")).sendKeys("Chandigarh");
		
		driver.findElement(By.xpath("(//span[text()='Chandigarh'])[2]")).click();
		
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		//By using robot class
		Thread.sleep(2000);
		
		StringSelection path = new StringSelection("C:\\Users\\Dell\\Documents\\AshutoshQARes.docx");
		
		Clipboard cp = Toolkit.getDefaultToolkit().getSystemClipboard();
		
		cp.setContents(path, null);
		
		Robot r = new Robot();
		//pasting
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		//entering
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		driver.findElement(By.xpath("//button[text()='Register now']")).click();
		
	}
	
	
}