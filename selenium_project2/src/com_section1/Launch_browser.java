package com_section1;

import java.util.Scanner;

import org.bouncycastle.asn1.microsoft.MicrosoftObjectIdentifiers;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_browser {
	
	public static void main(String[] args) {
		
	//ChromeDriver driver = new ChromeDriver();
   
   Scanner sc = new Scanner(System.in);
   
   int input;
   
   System.out.println("Enter your input");
   
   input = sc.nextInt();
   
   
   switch(input)
   {
   
   case 1:
	   
	   ChromeDriver driver1 = new ChromeDriver();
	   
	   break;
   
   case 2:
	   
	   FirefoxDriver driver2 = new FirefoxDriver();
	   break;
	   
   case 3:
	   
	   EdgeDriver driver3 = new EdgeDriver();
	   break;
	   
	default:
		
		System.out.println("Invalid Input");
   
   }
		
	}

	
}
