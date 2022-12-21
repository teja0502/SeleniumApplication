package com.hrms.test;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.base.Driver;
import com.nt.scripts.AddEmployee;
import com.nt.scripts.DeleteEmployee;
import com.nt.scripts.Frames;
import com.nt.scripts.Login;
import com.nt.scripts.Logout;

public class DeleteEmployeeTest {
	@Test
	public void registerEmployee() throws IOException {
		DOMConfigurator.configure("src/com/hrms/utility/log4j.xml");
		Driver.openApplication();
		Login.login("nareshit","nareshit");
		Frames.openFrame();
		DeleteEmployee.searchByEMPID("Emp. ID");
		DeleteEmployee.searchFor("10000");
		DeleteEmployee.clickSearchForEmployee();
		DeleteEmployee.selectCheckBox();
		DeleteEmployee.deleteEmployee();
		Frames.closeFrame();
		Logout.logout();
		Driver.closeApplication();
	}

}
