package com.hrms.test;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.nt.scripts.HRMSPortalModules;

public class RegisterEmployeeTest {
	@Test
	public  void register() throws IOException {
		DOMConfigurator.configure("src/com/hrms/utility/Log4j.xml");
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
