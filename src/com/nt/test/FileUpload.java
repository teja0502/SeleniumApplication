package com.nt.test;
import java.net.SocketException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUpload {

	public static void main(String[] args) throws InterruptedException, SocketException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		String url="http://183.82.103.245/nareshit/login.php";
		driver.navigate().to(url);
		System.out.println(driver.getTitle());
		
		System.out.println("Application Started.....................");
		 Thread.sleep(5000); 
		 System.out.println("Login application.................");
		 //Username
		 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		 //password
		 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		 //submit ation
		 driver.findElement(By.name("Submit")).click();
		 System.out.println("Application is opened................");
		 Thread.sleep(5000);
		 //To Switch frames
		 driver.switchTo().frame("rightMenu");
		 //to find add option we are using xpath links.
		 driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		 System.out.println("Adding the Employee.................");
		 driver.findElement(By.name("txtEmpFirstName")).sendKeys("King");
		 driver.findElement(By.name("txtEmpLastName")).sendKeys("Kohli");
		 //Upload file
		 WebElement filePath=driver.findElement(By.name("photofile"));
		 filePath.sendKeys("E:\\Selenium Jars\\virat.jpeg");
		 Thread.sleep(5000);
		//Used to save  the employee details.
		 driver.findElement(By.id("btnEdit")).click();
		 System.out.println("Employee added............");
		 Thread.sleep(5000);
		//to find Back option we are using xpath links.
		 driver.findElement(By.xpath("//input[@value='Back']")).click();
		 System.out.println("Back to Main page...............");
		 //excite from frames
		 driver.switchTo().defaultContent();
		 Thread.sleep(5000);
		 //logoutting the application.
		 driver.findElement(By.linkText("Logout")).click();
		 System.out.println("Logout Application................");
		 Thread.sleep(2000); 
		 driver.close();
		 
	}

}
