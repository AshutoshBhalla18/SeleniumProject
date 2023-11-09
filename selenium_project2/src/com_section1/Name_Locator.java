package com_section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.name("pwd"));
		
		password.sendKeys("manager");
		
		
		WebElement login = driver.findElement(By.id("loginButton"));
		
		login.click();
				
		
		
	}
	
	
}
