package com.nt.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstLoginTest {

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
		 //password
		 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		 //submit ation
		 driver.findElement(By.name("Submit")).click();
		 //Clearing the data
		 Thread.sleep(10000); 
		 //driver.findElement(By.name("clear")).click();
		// System.out.println("Clearing the username and password..........");
		 Thread.sleep(10000); 
		 //logout the application
		 driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Application................");
		 
		 Thread.sleep(10000); 
		 driver.close();
		 
	}

}
