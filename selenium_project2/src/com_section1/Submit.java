package com_section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.name("q"));
		
		//search.sendKeys("iphone");
		
		//search.submit();
		
		//search.clear();
		
		//search.sendKeys("laptop");
		
		String tag =search.getTagName();
		
		System.out.println(tag);
		
	
	}
}
