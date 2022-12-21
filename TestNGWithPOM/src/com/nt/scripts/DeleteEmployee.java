package com.nt.scripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.base.Driver;
import com.hrms.utility.Log;

public class DeleteEmployee extends Driver {
	public static By name_searchBy=By.name("loc_code");
	public static By name_SearchFor=By.name("loc_name");
	public static By xpath_Search=By.xpath("//input[@value='Search']");
	public static By name_CheckBox=By.name("chkLocID[]");
	public static By xpath_Delete=By.xpath("//input[@value='Delete']");
	public static void searchByEMPID(String visibleText) throws IOException {
		try {
			// Emplyee ID select in dropdown
			Select select = new Select(driver.findElement(name_searchBy));
			Thread.sleep(2000);
			select.selectByVisibleText(visibleText);
			// select.selectByIndex(1);
			// select.selectByValue("0");
			Reporter.log("Search by empid");
			Log.info("Search by empid");
			System.out.println("Search by empid");
			Thread.sleep(2000);
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\searchByEMPID.png"));
		}
	}//searchByEMPID
	public static  void searchFor(String empId) throws IOException {
		try {
			driver.findElement(name_SearchFor).sendKeys(empId);
			Reporter.log("Search for employee");
			Log.info("Search for employee");
			System.out.println("Search for employee");
			Thread.sleep(2000);
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\searchFor.png"));
		}
	}//searchFor
	public static void clickSearchForEmployee() throws IOException {
		try {
			driver.findElement(xpath_Search).click();
			Reporter.log("click on Search for employee");
			Log.info("click on Search for employee");
			System.out.println("click on Search for employee");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\clickSearchForEmployee.png"));
		}

	}//clickSearchForEmployee
	public static void selectCheckBox() throws IOException {
		try {
			driver.findElement(name_CheckBox).click();
			Reporter.log("Select check box");
			Log.info("Select check box");
			System.out.println("Select check box");
			Thread.sleep(2000);
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\selectCheckBox.png"));
		}

}//selectCheckBox
	public static void deleteEmployee() throws IOException {
		try {
			driver.findElement(xpath_Delete).click();
			Reporter.log("Click on delete employee");
			Log.info("Click on delete employee");
			System.out.println("Click on delete employee");
			Thread.sleep(4000);
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\Images\\deleteEmployee.png"));
		}
	}//deleteEmployee
	
}
