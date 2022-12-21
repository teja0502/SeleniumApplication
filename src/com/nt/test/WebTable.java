package com.nt.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		String url= "file:///E:/Selenium%20Jars/WebTable.html";
		//first window
		//Thread.sleep(3000);
		driver.get(url);
		// columns and rows size.
		int row=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
		System.out.println(row);
		int col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
		System.out.println(col);
		int col_row = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
		System.out.println(col_row);
		//Data
		String data=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[1]")).getText();
		System.out.println(data);
		String data1=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]")).getText();
		System.out.println(data1);
		System.out.println("All Table Records...........................");
		for(int i=1;i<=row;i++) {
			String allData=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
			System.out.println(allData);
			Thread.sleep(3000);
		}
		driver.close();

	}

}
