package com.hrms.test;

import java.io.IOException;

import com.nt.scripts.HRMSPortalModules;

public class DeleteEmployeeTest {

	public static void main(String[] args) throws IOException {
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
