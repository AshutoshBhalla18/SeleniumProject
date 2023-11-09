package com_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_current_url {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/explore/home/chandigarh");
		
		System.out.println(driver.getCurrentUrl()); //used to get current URL
		
		//System.out.println(driver.getPageSource()); // used to get page source
		
	}

}
