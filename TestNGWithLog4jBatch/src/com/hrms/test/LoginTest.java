package com.hrms.test;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.nt.scripts.HRMSPortalModules;

public class LoginTest {
	@Test
	public  void login() throws IOException {
		DOMConfigurator.configure("src/com/hrms/utility/log4j.xml");
		HRMSPortalModules hrms= new HRMSPortalModules();
		hrms.openHRMSPortal();
		hrms.login();
		hrms.logout();
		hrms.closeBrowser();
		
	}

}
