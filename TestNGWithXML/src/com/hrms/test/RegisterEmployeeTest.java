package com.hrms.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nt.scripts.HRMSPortalModules;

public class RegisterEmployeeTest {
	@Test
	public  void register() throws IOException {
		HRMSPortalModules hrms= new HRMSPortalModules();
		hrms.openHRMSPortal();
		hrms.login();
		hrms.openFrame();
		hrms.clickAdd();
		hrms.registerEmployee();
		hrms.clickBack();
		hrms.closeFrame();
		hrms.logout();
		hrms.closeBrowser();

	}

}
