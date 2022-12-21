package com.hrms.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	public WebDriver driver;
	@Given("^Open Application$")
	public void openApplication() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		String url="https://www.google.com/";
		driver.navigate().to(url);
		System.out.println("Application is Opened.");
		Thread.sleep(4000);
	}
	@When("^Verify Title$")
	public void verifyTitle() {
		System.out.println(driver.getTitle());
	}
	@And("^Print Hello$")
	public void printHello() {
		System.out.println("Hello");
	}
	@Then("^Close Application$")
	public void closeApplication() {
		System.out.println("Closing Application");
		driver.close();
		
	}

}
