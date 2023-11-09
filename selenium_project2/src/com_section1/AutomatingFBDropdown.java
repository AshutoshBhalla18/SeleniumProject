package com_section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomatingFBDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		
		WebElement create = driver.findElement(By.xpath("//a[contains ( text(), 'Create new account' )]"));
		
		create.click();
		
		Thread.sleep(2000);
		
		WebElement dropdown1 = driver.findElement(By.name("birthday_day"));
		
		Select s1 = new Select(dropdown1);
		
		s1.selectByIndex(3);
		
		
		WebElement dropdown2 = driver.findElement(By.name("birthday_month"));
		
		Select s2 = new Select(dropdown2);
		
		s2.selectByVisibleText("Dec");
		
		
		WebElement dropdown3 = driver.findElement(By.name("birthday_year"));
		
		Select s3 = new Select(dropdown3);
		
		s3.selectByVisibleText("2001");
		
		
		
		
		
		
		
	}
	
}
