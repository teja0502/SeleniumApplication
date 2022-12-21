package com.hrms.test;

import java.io.IOException;

import com.nt.scripts.HRMSPortalModules;

public class LoginTest {

	public static void main(String[] args) throws IOException {
		HRMSPortalModules hrms= new HRMSPortalModules();
		hrms.openHRMSPortal();
		hrms.login();
		hrms.logout();
		hrms.closeBrowser();
		
	}

}
