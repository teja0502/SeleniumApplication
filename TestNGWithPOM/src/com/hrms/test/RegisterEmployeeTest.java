package com.hrms.test;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.base.Driver;
import com.nt.scripts.AddEmployee;
import com.nt.scripts.Frames;
import com.nt.scripts.Login;
import com.nt.scripts.Logout;

public class RegisterEmployeeTest {
	@Test
	public void registerEmployee() throws IOException {
		DOMConfigurator.configure("src/com/hrms/utility/log4j.xml");
		String filepath="E:\\Selenium Jars\\virat.jpeg";
		Driver.openApplication();
		Login.login("nareshit","nareshit");
		Frames.openFrame();
		AddEmployee.clickAdd();
		AddEmployee.registerEmployee("King", "Kohli", filepath);
		AddEmployee.clickBack();
		Frames.closeFrame();
		Logout.logout();
		Driver.closeApplication();
	}

}
