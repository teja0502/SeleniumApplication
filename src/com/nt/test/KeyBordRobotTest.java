package com.nt.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBordRobotTest {

	public static void main(String[] args) throws AWTException, InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		String url="http://183.82.103.245/nareshit/login.php";
		driver.navigate().to(url);
		System.out.println(driver.getTitle());
		
		System.out.println("Application Started.....................");
		 Thread.sleep(10000); 
		 System.out.println("Login application.................");
		 //Username
		 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		 //password
		 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		 
		 Robot r = new Robot();
		 //get the access to perform virtual operations
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_TAB);
		 Thread.sleep(10000); 
		 System.out.println(" Clicked TAB key......................");
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 System.out.println(" Clicked ENTER key......................");
		 Thread.sleep(10000); 
		 //logout the application
		 driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Application................");
		 
		 Thread.sleep(10000); 
		 System.out.println("Closed the browser.................");
		 driver.close();
		
	}

}
