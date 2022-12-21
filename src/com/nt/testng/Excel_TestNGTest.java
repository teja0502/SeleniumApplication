package com.nt.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_TestNGTest {
	
	private WebDriver driver;
	String username=null,password=null;
	@BeforeClass
	public void startHRMSPortal() throws BiffException, IOException {
		FileInputStream is= new FileInputStream("E:\\Selenium Jars\\Login.xls");
		Workbook wb= Workbook.getWorkbook(is);
		Sheet sheet =wb.getSheet(0);
		username=sheet.getCell(0,1).getContents();
		password = sheet.getCell(1,1).getContents();
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		String url="http://183.82.103.245/nareshit/login.php";
		driver.navigate().to(url);
		System.out.println("Application opened....................");
	}
	@Test(priority = 1)
	public void login() throws InterruptedException  {
		 System.out.println("Login application.................");
		 Reporter.log("Login application................");
		 //Username
		 driver.findElement(By.name("txtUserName")).sendKeys(username);
		 //password
		 driver.findElement(By.name("txtPassword")).sendKeys(password);
		 //submit ation
		 driver.findElement(By.name("Submit")).click();
		 Thread.sleep(5000);
	}
	@Test(priority = 2)
	public void logout() throws InterruptedException {
		//logoutting the application.
		 driver.findElement(By.linkText("Logout")).click();
		 Reporter.log("Logout completed...............");
		 Thread.sleep(5000);
	}
	@AfterClass
	public void closeHRMSPortal() {
		System.out.println("Closing the browser..................");
		driver.close();
	}
}
