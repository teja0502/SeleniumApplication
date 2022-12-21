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

public class HRMSPortalModules extends HRMSPortalData {
	public void openHRMSPortal() throws IOException {
		try {
			System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.navigate().to(url);
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(By.name(name_submit)));
			Thread.sleep(10000);
			System.out.println("HRMSPortalModules.openHRMSPortal()");
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\openHRMSPortal.png"));
		}
	}//openHRMSPortal
	public void closeBrowser() {
		System.out.println("Closing web browser......................");
		driver.quit();
	}//closeBrowser
	public void login() throws IOException {
		try {
			driver.findElement(By.name(name_username)).sendKeys(userName);
			driver.findElement(By.name(name_password)).sendKeys(password);
			driver.findElement(By.name(name_submit)).click();
			System.out.println("HRMSPortalModules.login()");
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
			System.out.println("HRMSPortalModules.logout()");
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
			System.out.println("HRMSPortalModules.openFrame()");
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\openFrame.png"));
		}
	}//openFrame
	public void closeFrame()  {
		driver.switchTo().defaultContent();
		System.out.println("HRMSPortalModules.closeFrame()");
	}//closeFrame
	public void clickAdd() throws IOException {
		try {
			driver.findElement(By.xpath(xpath_Add)).click();
			System.out.println("HRMSPortalModules.clickAdd()");
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
			System.out.println("HRMSPortalModules.registerEmployee()");
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
			System.out.println("HRMSPortalModules.clickBack()");
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
			System.out.println("HRMSPortalModules.searchByEMPID()");
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
			System.out.println("HRMSPortalModules.searchFor()");
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
			System.out.println("HRMSPortalModules.clickSearchForEmployee()");
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
			System.out.println("HRMSPortalModules.selectCheckBox()");
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
			System.out.println("HRMSPortalModules.deleteEmployee()");
			Thread.sleep(4000);
		}
		catch (Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Selenium Jars\\deleteEmployee.png"));
		}
	}//deleteEmployee
	
	public void getTitleOfPage() {
		System.out.println("HRMSPortalModules.getTitleOfPage()");
		System.out.println(driver.getTitle());
	}//getTitleOfPage
}
