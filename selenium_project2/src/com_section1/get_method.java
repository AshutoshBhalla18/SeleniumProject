package com_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_method {
	
	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();  //Up casting making ChromeDriver(child) object and storing in webDriver(parent) type of varialbe
	
	
		driver.get("//www.seleniu/downloads/"); //wrong URL throws invalid argument exception
		
		//driver.get("https://in.bookmyshow.com/");
		
		}

}
