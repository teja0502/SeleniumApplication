package com.nt.scripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.hrms.base.Driver;
import com.hrms.utility.Log;

public class Frames extends Driver {
	public static String id_frame="rightMenu";
	public static void openFrame() throws IOException {
		try {
			driver.switchTo().frame(id_frame);
			Reporter.log("opening Frame");
			Log.info("opening Frame.");
			System.out.println("opening Frame");
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\Images\\openFrame.png"));
		}
	}//openFrame
	public static void closeFrame()  {
		driver.switchTo().defaultContent();
		Reporter.log("closing Frame");
		Log.info("closing Frame.");
		System.out.println("closing Frame");
	}//closeFrame

}
