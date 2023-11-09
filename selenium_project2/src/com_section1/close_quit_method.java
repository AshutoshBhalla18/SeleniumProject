package com_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_quit_method {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/explore/home/chandigarh");
		
		driver.manage().window().fullscreen();
		
		driver.quit(); // it will close the window and server will be stopped
		
		
		//driver.close(); // it will close the window only
		
		
		
		
	}
	
	
}
