package com.nt.test;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_WEbDriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		String url="https://www.google.com/";
		driver.navigate().to(url);
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN );
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN );
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
	}

}
