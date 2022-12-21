package com.hrms.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nt.scripts.HRMSPortalModules;

public class LoginTest {
	@Test
	public  void login() throws IOException {
		HRMSPortalModules hrms= new HRMSPortalModules();
		hrms.openHRMSPortal();
		hrms.login();
		hrms.logout();
		hrms.closeBrowser();
		
	}

}
