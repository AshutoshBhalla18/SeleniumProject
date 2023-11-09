package com_section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage_method {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/explore/home/chandigarh");
		
		/*Options man = driver.manage();
		
		Window win = man.window();
		
		win.maximize();*/
		
		
		// driver.manage().window().maximize(); // best approach for maximizing
		
		//driver.manage().window().fullscreen(); // best approach for full screening the web application
		
		//System.out.println(driver.manage().window().getSize());

		//System.out.println(driver.manage().window().getPosition());
		
		//Dimension dim = new Dimension(1000, 500); // used to set the values 
		
		//driver.manage().window().setSize(dim); // used to set the size of the page
		
		Point p = new Point(9, 10); // used to set the values for position
		
		driver.manage().window().setPosition(p); // used to set the position of the page
		
	}

}
