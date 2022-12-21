package com.nt.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

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
		Thread.sleep(5000);
		//Verify Title
		//Actual Title      compare ExpectedTitle
		if(driver.getTitle().equals("OrangeHRM")) {
		System.out.println("Title Matched");        
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}
		//mouseover
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("mouseover completed (PIM)");
		Thread.sleep(5000);
		//click on submenu
				driver.findElement(By.linkText("Add Employee")).click();
				System.out.println("clicked on submenu");
				Thread.sleep(5000);
				driver.switchTo().frame("rightMenu");
				//to find Back option we are using xpath links.
				 driver.findElement(By.xpath("//input[@value='Back']")).click();
				 System.out.println("Back to Main page...............");
				 driver.switchTo().defaultContent();
				 Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Leave"))).perform();
		System.out.println("mouseover Completed(LEAVE)");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Define Leave Types")).click();
		System.out.println("Clicked on submenu");
		Thread.sleep(10000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		Thread.sleep(5000);
		driver.close();
		}
	

}
