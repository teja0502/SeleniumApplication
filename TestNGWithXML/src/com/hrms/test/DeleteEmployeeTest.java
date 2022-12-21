package com.hrms.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nt.scripts.HRMSPortalModules;

public class DeleteEmployeeTest {
	@Test
	public  void delete() throws IOException {
		HRMSPortalModules hrms= new HRMSPortalModules();
		hrms.openHRMSPortal();
		hrms.getTitleOfPage();
		hrms.login();
		hrms.openFrame();
		hrms.searchByEMPID();
		hrms.searchFor();
		hrms.clickSearchForEmployee();
		hrms.selectCheckBox();
		hrms.deleteEmployee();
		hrms.closeFrame();
		hrms.logout();
		hrms.closeBrowser();

	}

	
}
