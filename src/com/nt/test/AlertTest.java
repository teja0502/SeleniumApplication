package com.nt.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
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
		 //submit ation
		 driver.findElement(By.name("Submit")).click();
		 //create alert obj to get alert responce from web browser.
		 Alert a= driver.switchTo().alert();
		 System.out.println(a.getText());
		 Thread.sleep(10000); 
		 a.accept();
		 
		 //password
		 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		 //submit ation
		 driver.findElement(By.name("Submit")).click();
		 System.out.println("Logined into application.............");
		  Thread.sleep(10000); 
		 //logout the application
		 driver.findElement(By.linkText("Logout")).click();
		 System.out.println("Logout Application................");
		 
		 Thread.sleep(10000); 
		 driver.close();

	}

}
