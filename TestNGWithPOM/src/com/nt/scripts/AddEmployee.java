package com.nt.scripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.hrms.base.Driver;
import com.hrms.utility.Log;


public class AddEmployee extends Driver {
	
	public static By xpath_Add=By.xpath("//input[@value='Add']");
	public static By name_fName=By.name("txtEmpFirstName");
	public static By name_lName=By.name("txtEmpLastName");
	public static By name_file=By.name("photofile");
	public static By id_save=By.id("btnEdit");
	public static By xpath_back=By.xpath("//input[@value='Back']");
	//Object
	public static void clickAdd() throws IOException {
		try {
			driver.findElement(xpath_Add).click();
			Reporter.log("Clicking on Add button");
			Log.info("Clicking on Add button.");
			System.out.println("Clicking on Add button");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\Images\\clickAdd.png"));
		}
	}//clickAdd
	
	
	public static void registerEmployee(String fName,String lName,String filePath) throws IOException {
		try {
			driver.findElement(name_fName).sendKeys(fName);
			driver.findElement(name_lName).sendKeys(lName);
			WebElement file = driver.findElement(name_file);
			file.sendKeys(filePath);
			driver.findElement(id_save).click();
			Reporter.log("Register employee");
			Log.info("Register employee.");
			System.out.println("Register employee");
			Thread.sleep(5000);
			}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\Images\\clickAdd.png"));
		}
	}
	public static void clickBack() throws IOException {
		try {
			driver.findElement(xpath_back).click();
			Reporter.log("Click onBack button");
			Log.info("Click onBack button.");
			System.out.println("Click onBack button");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(4000);
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\Images\\clickBack.png"));
		}
	}//clickBack

}
