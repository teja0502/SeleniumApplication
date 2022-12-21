package com.nt.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Drag_Drop {

	public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		try {
			String url="https://jqueryui.com/droppable/&quot";
			driver.navigate().to(url);
			//static method.
			Assert.	assertEquals(driver.getTitle(),"Page not found | jQuery UI");
			System.out.println("Title matched");
			//Enter into frame
			driver.switchTo().frame(0);
			Actions ac = new Actions(driver);
			ac.dragAndDrop(driver.findElement(By.id("draggable")),
			               driver.findElement(By.id("droppable"))).perform();
			System.out.println("DragDrop completed");
			Thread.sleep(3000);
			//Exit from frame
			driver.switchTo().defaultContent();
			driver.close();
			
		}
		catch (Exception e) {
			File f1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\\\Selenium Jars\\\\DrogandDrop.png" ));
		}
		Thread.sleep(3000);
		System.out.println("Closing the browser.......");
		driver.close();
	}

}
