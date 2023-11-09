package testScript;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class SeleniumIframeAssignment {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
		
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		
		driver.switchTo().frame("iframe_a");
		
		driver.findElement(By.xpath("(//a[text()='Free Mock Tests'])[2]")).click();
		
		
		Set<String> all_id = driver.getWindowHandles();
		
		for(String id: all_id) {
			
			driver.switchTo().window(id);
			
			if(driver.getTitle().contains("\n"
					+ "     FreshersNow Test Series | 100% Free Mock Tests\n"
					+ "    ")) {
				
				break;
			}
		}
		
		Actions act = new Actions(driver);
		
		WebElement allExams = driver.findElement(By.xpath("//a[text()='All Exams ']"));
		
		act.moveToElement(allExams).perform();
		
		driver.findElement(By.xpath("(//a[text()='SSC'])[1]")).click();
		
		driver.findElement(By.xpath("(//a[text()='SSC CHSL'])[1]")).click();
		
		WebElement logo = driver.findElement(By.xpath("//h1['SSC CHSL Mock Test Series 2023 | Free Online Test Series in English and Hindi']"));
		
		 File src = logo.getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("./Screenshot/image4.Png");
		 
		 FileHandler.copy(src, dest);
		
	}
	
	
}
