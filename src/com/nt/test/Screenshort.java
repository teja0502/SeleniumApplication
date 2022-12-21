package com.nt.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.io.FileUtils;

public class Screenshort {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		try {
			String url="http://183.82.103.245/nareshit/login.php";
			driver.navigate().to(url);
			System.out.println(driver.getTitle());
			
			System.out.println("Application Started.....................");
			 Thread.sleep(3000); 
			 System.out.println("Login application.................");
			 //Username
			 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			 //password
			 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			 //submit ation
			 Thread.sleep(3000); 
			 driver.findElement(By.name("Submit")).click();
			 System.out.println("Application is opened................");
			 Thread.sleep(3000);
			 
			 
			 Actions action = new Actions(driver);
			 action.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
			 Thread.sleep(3000);
			 driver.findElement(By.linkText("Add Employee")).click();
			 System.out.println(" Clicked on sub menu...............");
			 Thread.sleep(6000);
			 driver.findElement(By.linkText("Logout")).click();
			 Thread.sleep(3000);
			System.out.println("Logout is completed..................");
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\TestResults.png"));
		}
		System.out.println(" Closing browser......................");
		driver.close();

	}

}
