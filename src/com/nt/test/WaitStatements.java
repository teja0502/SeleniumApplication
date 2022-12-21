package com.nt.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatements {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		String url="http://183.82.103.245/nareshit/login.php";
		driver.navigate().to(url);
		System.out.println(driver.getTitle());
		System.out.println("Application Started.....................");
		 //Username
		 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		 //password
		 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		 //Explecitwait to wait until given conditional to be loaded.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
		 //submit ation
		 driver.findElement(By.name("Submit")).click();
		 System.out.println("Login application.................");
		 //implecitwait to be wait till page to be loaded.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		 //logout from application
		 driver.findElement(By.linkText("Logout")).click();
		 System.out.println("Application is Logouted.......................");
		 Thread.sleep(3000);
		 System.out.println("Browser is closed.........................");
		 //closeing the browser.
		 driver.close();
		 
	}

}
