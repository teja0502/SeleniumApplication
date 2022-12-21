package com.hrms.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;



public class Driver {
	
	public static WebDriver driver;
	public static By name_Submit= By.name("Submit");
	public static String url="http://183.82.103.245/nareshit/login.php";
	public static void openApplication() throws IOException {
		try {
			System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.navigate().to(url);
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(name_Submit));
			Thread.sleep(10000);
			Reporter.log("Opening HRMS Porta");
			//Log.info("Application Opened");
			System.out.println("Opening HRMS Porta");
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\Images\\openHRMSPortal.png"));
		}
	}
	public static void closeApplication() {
		driver.close();
	}

}
