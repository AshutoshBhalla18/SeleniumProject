package dataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDataFetchWithExcel {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream fis = new FileInputStream("/Users/ashutoshbhalla/Downloads/FBDataFetch.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sheet = book.getSheet("sheet1");
		
		Row row = sheet.getRow(0);
		
		Cell cell = row.getCell(0);
		
		String c = cell.getStringCellValue();
		
		String fname = sheet.getRow(0).getCell(1).toString();
		
		String sname = sheet.getRow(0).getCell(2).toString();
		
		String email = sheet.getRow(0).getCell(3).toString();
		
		String email1 = sheet.getRow(0).getCell(4).toString();
		
		String pwd = sheet.getRow(0).getCell(5).toString();
		
		String birthdate = sheet.getRow(0).getCell(6).toString();
		
		System.out.println(birthdate);
		
		String birthmonth = sheet.getRow(0).getCell(7).toString();
		
		String birthyear = sheet.getRow(0).getCell(8).toString();	
		
		driver.get(c);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname,Keys.TAB,sname,Keys.TAB,email,Keys.TAB,pwd);
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(email1);
		
		WebElement bday = driver.findElement(By.name("birthday_day"));
		
		Select s1 = new Select(bday);
		
		s1.selectByVisibleText(birthdate);
		
		
		WebElement bdaymonth = driver.findElement(By.name("birthday_month"));
		
		Select s2 = new Select(bdaymonth);
		
		s2.selectByVisibleText(birthmonth);
		
		WebElement bdayyear = driver.findElement(By.name("birthday_year"));
		
		Select s3 = new Select(bdayyear);
		
		s3.selectByVisibleText(birthyear);
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		
		}
	
	
}
