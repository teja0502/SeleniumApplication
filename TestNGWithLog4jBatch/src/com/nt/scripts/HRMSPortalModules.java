package com.nt.scripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class HRMSPortalModules extends HRMSPortalData {
	public void openHRMSPortal() throws IOException {
		try {
			System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.navigate().to(url);
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(By.name(name_submit)));
			Thread.sleep(10000);
			Reporter.log("Opening HRMS Porta");
			Log.info("Application Opened");
			System.out.println("Opening HRMS Porta");
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\openHRMSPortal.png"));
		}
	}//openHRMSPortal
	public void closeBrowser() {
		Reporter.log("Closing web browser.");
		Log.info("Web Browser is closing.");
		System.out.println("Web Browser is closing.");
		driver.quit();
	}//closeBrowser
	public void login() throws IOException {
		try {
			driver.findElement(By.name(name_username)).sendKeys(userName);
			driver.findElement(By.name(name_password)).sendKeys(password);
			driver.findElement(By.name(name_submit)).click();
			Reporter.log("Loging into HRMS Portal");
			Log.info("Loging into HRMS Portal.");
			System.out.println("Loging into HRMS Portal.");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(4000);
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\login.png"));
		}
	}//login
	public void logout() throws IOException {
		try {
			driver.findElement(By.linkText(linkTest_Logout)).click();
			Reporter.log("logout  HRMS Portal");
			Log.info("logout  HRMS Portal.");
			System.out.println("logout  HRMS Portal");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(4000);
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\logout.png"));
		}
	}//logout
	public void openFrame() throws IOException {
		try {
			driver.switchTo().frame(id_frame);
			Reporter.log("opening Frame");
			Log.info("opening Frame.");
			System.out.println("opening Frame");
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\openFrame.png"));
		}
	}//openFrame
	public void closeFrame()  {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(id_frame);
		Reporter.log("closing Frame");
		Log.info("closing Frame.");
		System.out.println("closing Frame");
	}//closeFrame
	public void clickAdd() throws IOException {
		try {
			driver.findElement(By.xpath(xpath_Add)).click();
			driver.switchTo().frame(id_frame);
			Reporter.log("Clicking on Add button");
			Log.info("Clicking on Add button.");
			System.out.println("Clicking on Add button");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\clickAdd.png"));
		}
	}//clickAdd
	public void registerEmployee() throws IOException {
		try {
			driver.findElement(By.name(name_fName)).sendKeys(fName);
			driver.findElement(By.name(name_lName)).sendKeys(lName);
			WebElement file = driver.findElement(By.name(name_file));
			file.sendKeys(filePath);
			driver.findElement(By.id(id_save)).click();
			Reporter.log("Register employee");
			Log.info("Register employee.");
			System.out.println("Register employee");
			Thread.sleep(5000);
			}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\clickAdd.png"));
		}
	}
	public void clickBack() throws IOException {
		try {
			driver.findElement(By.xpath(xpath_back)).click();
			Reporter.log("Click onBack button");
			Log.info("Click onBack button.");
			System.out.println("Click onBack button");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(4000);
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\clickBack.png"));
		}
	}//clickBack
	public void searchByEMPID() throws IOException {
		try {
			// Emplyee ID select in dropdown
			Select select = new Select(driver.findElement(By.name(name_searchBy)));
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
	public void searchFor() throws IOException {
		try {
			driver.findElement(By.name(name_SearchFor)).sendKeys(empId);
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
	public void clickSearchForEmployee() throws IOException {
		try {
			driver.findElement(By.xpath(xpath_Search)).click();
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
	public void selectCheckBox() throws IOException {
		try {
			driver.findElement(By.name(name_CheckBox)).click();
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
	public void deleteEmployee() throws IOException {
		try {
			driver.findElement(By.xpath(xpath_Delete)).click();
			Reporter.log("Click on delete employee");
			Log.info("Click on delete employee");
			System.out.println("Click on delete employee");
			Thread.sleep(4000);
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\deleteEmployee.png"));
		}
	}//deleteEmployee
	
	public void getTitleOfPage() {
		Log.info(driver.getTitle());
		System.out.println(driver.getTitle());
		Reporter.log(driver.getTitle());
	}//getTitleOfPage
}
