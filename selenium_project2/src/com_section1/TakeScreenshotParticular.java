package com_section1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotParticular {
	
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement logo = driver.findElement(By.className("_16ZfEv"));
		
		 File src = logo.getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("./Screenshot/image1.Png");
		 
		 FileHandler.copy(src, dest);
		
		
	}
	

}
