package com.nt.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAndCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
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
		 
		 //Open frames
		 driver.switchTo().frame("rightMenu");
		 //select is used to selet the dropdown list.
		 Select select = new Select (driver.findElement(By.name("loc_code")));
		 // Emplyee ID select in dropdown
		 select.selectByVisibleText("Emp. ID");
		 select.selectByIndex(1);
		 select.selectByValue("0");
		 System.out.println(" Emplyee ID select in dropdown................");
		 Thread.sleep(3000);
		 //enter the employee details.
		 driver.findElement(By.name("loc_name")).sendKeys("10000");
		 System.out.println("Employee id is entered..............");
		 Thread.sleep(3000);
		 //click on search button.
		 driver.findElement(By.xpath("//input[@type='button']")).click();
		 System.out.println("Employee detatils opened.....................");
		 Thread.sleep(3000);
		 //select the check box
		 driver.findElement(By.name("chkLocID[]")).click();
		 System.out.println("Slected check box.......................");
		 Thread.sleep(3000);
		 System.out.println("Employee deleted...................");
		 //click on delete button to delete employee
		 driver.findElement(By.xpath("//input[@value='Delete']")).click();
		 //out from frames.
		 driver.switchTo().defaultContent();
		 Thread.sleep(3000);
		 //logout from application
		 driver.findElement(By.linkText("Logout")).click();
		 System.out.println("Application is Logouted.......................");
		 Thread.sleep(3000);
		 System.out.println("Browser is closed.........................");
		 //closeing the browser.
		 driver.close();
		 

	}

}
