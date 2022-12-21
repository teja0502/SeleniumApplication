package com.nt.scripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.hrms.base.Driver;
import com.hrms.utility.Log;


public class Login extends Driver {
	
	public static By name_username =By.name("txtUserName");
	public static By name_password =By.name("txtPassword");
	public static void login(String userName, String password ) throws IOException {
		try {
			driver.findElement(name_username).sendKeys(userName);
			driver.findElement(name_password).sendKeys(password);
			driver.findElement(name_Submit).click();
			Reporter.log("Loging into HRMS Portal");
			Log.info("Loging into HRMS Portal.");
			System.out.println("Loging into HRMS Portal.");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(4000);
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\Images\\login.png"));
		}
	}//login

}
