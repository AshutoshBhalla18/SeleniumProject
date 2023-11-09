package batch_execution;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class LogoutClass extends LoginClass {

	@Test
	public void logout() {
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
		System.out.println("Logout Test Case is passed");
		
	}
	
	
	
	
}
