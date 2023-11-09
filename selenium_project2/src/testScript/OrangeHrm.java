package testScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrm {

	public static void main(String[] args) throws AWTException, IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//input[@name ='username']")).sendKeys("Admin", Keys.TAB, "admin123", Keys.TAB,
				Keys.ENTER);

		driver.findElement(By.xpath("//span[text() ='Admin']")).click();

		driver.findElement(By.xpath("(//button[contains(@class,'oxd-button')])[3]")).click();

		driver.findElement(By.xpath("(//div[text() ='-- Select --'])[1]")).click();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("niana Haq", Keys.TAB);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//input[contains(@class,'oxd-input--active')])[2]")).sendKeys("Aaliyah voka", Keys.TAB,
				"Sameasabove@1", Keys.TAB, "Sameasabove@1");
		
		driver.findElement(By.xpath("//button[text() =' Save ']")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Screenshot/image.Png");
				
		FileHandler.copy(src, dest);
		
		driver.findElement(By.xpath("//p[text()='23424325 Collingsghftyg']")).click();
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		
	}

}