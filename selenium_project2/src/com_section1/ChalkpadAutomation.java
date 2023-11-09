package com_section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChalkpadAutomation {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://punjab.chitkara.edu.in//Interface/index.php");
		
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("2010990137");
		
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys("Sameasabove@2718");
		
		WebElement login = driver.findElement(By.className("button_send"));
		
		login.click();
		
		
		
	}
}
