package com.nt.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTest {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		String url="http://183.82.103.245/nareshit/login.php";
		driver.navigate().to(url);
		//Verify Title
		//ActualResult      compare ExpectedTitle
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
		System.out.println("Title matched");        
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}
		
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(10000);
		//Verify Title
		//Actual Title      compare ExpectedTitle
		if(driver.getTitle().equals("OrangeHRM")) {
		System.out.println("Title Matched");        
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.close();
		}
	

}
