package com_section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDeselectByIndex {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='ide']"));
		
		Select s = new Select(dropdown);
		
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		s.selectByIndex(3);
		
		Thread.sleep(2000);
		
		//s.deselectByIndex(2);	// for deselcting single option
		
		s.deselectAll(); // for deselcting all options
		 
	}

}
