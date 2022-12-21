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


public class Logout extends Driver {
	public static By linkTest_Logout =By.linkText("Logout");
	public static void logout() throws IOException {
		try {
			driver.findElement(linkTest_Logout).click();
			Reporter.log("logout  HRMS Portal");
			Log.info("logout  HRMS Portal.");
			System.out.println("logout  HRMS Portal");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(4000);
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\Images\\logout.png"));
		}
	}

}
