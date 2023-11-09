package com_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_title_method {
	
	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();  //Up casting making ChromeDriver(child) object and storing in webDriver(parent) type of varialbe
	
		
		/*driver.get("https://in.bookmyshow.com/explore/home/chandigarh");
		

		System.out.println(driver.getTitle());*/
		
		driver.get("https://www.instagram.com/");
		
		String s ="Instagram";
		
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals(s)) {
			
			System.out.println("Test Case Passed");
		}
		
		else {
			
			System.out.println("Test case failed");
		}
		
		
	}

}
