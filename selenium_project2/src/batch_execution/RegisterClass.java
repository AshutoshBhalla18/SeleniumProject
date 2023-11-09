package batch_execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterClass {

	@Test
	public void Register() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
		driver.findElement(By.xpath("(//input[@class='text-box single-line'])[1]")).sendKeys("Jatt",Keys.TAB,"Vaily",Keys.TAB,"jattvaily@gmail.com",Keys.TAB,"jattisjatt",Keys.TAB,"jattisjatt",Keys.TAB,Keys.ENTER);
		
		System.out.println("Register Test case passed");
		
	}
}
