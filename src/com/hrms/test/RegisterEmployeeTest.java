package com.hrms.test;

import java.io.IOException;

import com.nt.scripts.HRMSPortalModules;

public class RegisterEmployeeTest {

	public static void main(String[] args) throws IOException {
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
