package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewUserActitime {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
		
		//Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("container_tasks"))));
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("container_tasks")).click();
		
		driver.findElement(By.className("addNewButton")).click();
		
		driver.findElement(By.className("createNewCustomer")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.className("newNameField")).sendKeys("Ashutosh");
		
		driver.findElement(By.className("commitButtonPlaceHolder")).click();
		
		
	}
	
}
