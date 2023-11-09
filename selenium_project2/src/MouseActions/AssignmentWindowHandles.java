package MouseActions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWindowHandles {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click()	;
					
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
		
		driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();

		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click();
		
		
		Set<String> all_id = driver.getWindowHandles();
		
		
		for(String id: all_id) {
			
			driver.switchTo().window(id);
			
			if(driver.getTitle().contains("OrangeHRM | LinkedIn")) {
				
				
			}
			
			else {
				
				driver.close();
			}
		}
		
		
	}
	
	
}
