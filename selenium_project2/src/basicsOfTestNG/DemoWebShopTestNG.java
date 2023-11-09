package basicsOfTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebShopTestNG {

	
	@Test(enabled=false)
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
	
	
	@Test(priority=2)
	public void Login()
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("jattvaily@gmail.com",Keys.TAB,"jattisjatt",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
		
		System.out.println("Login Test Case is passed");
		
	}
	
	@Test(priority=3,invocationCount = 3)
	public void addToCart() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("jattvaily@gmail.com",Keys.TAB,"jattisjatt",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("book",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[contains(@class,'button-2')]")).click();
	
		System.out.println("Add to Cart Test Case is passed");
		
	}
	
	@Test(priority=4)
	public void logout() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("jattvaily@gmail.com",Keys.TAB,"jattisjatt",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
		System.out.println("Logout Test Case is passed");
		
	}
	
}
