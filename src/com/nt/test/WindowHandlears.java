package com.nt.test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlears {

	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		
				WebDriver driver= new ChromeDriver();
				String url= "E:\\Selenium Jars\\multiplewindows.html";
				//first window
				Thread.sleep(3000);
				driver.get(url);
				//second window
				Thread.sleep(3000);
				driver.findElement(By.id("btn2")).click();
				System.out.println("Second Tab.......................");
				//third window
				Thread.sleep(3000);
				driver.findElement(By.id("btn3")).click();
				System.out.println("Third tab............");
				Thread.sleep(3000);
				//Used to store browser list.
				ArrayList<String> windows = new ArrayList<String>();
				windows.addAll(driver.getWindowHandles());
				//swith to first window
				System.out.println(windows.toString());
				driver.switchTo().window( windows.get(0));
				System.out.println("First Tab..........................");
				Thread.sleep(3000);
				//Close method is used to close current tab
				driver.close();
				//	//Quit method is used to close all tab or browser.
				driver.quit();
	}

}
