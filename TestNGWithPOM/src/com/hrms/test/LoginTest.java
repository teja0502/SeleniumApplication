package com.hrms.test;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.base.Driver;
import com.nt.scripts.Login;
import com.nt.scripts.Logout;

public class LoginTest {
	@Test
	public void login() throws IOException {
		DOMConfigurator.configure("src/com/hrms/utility/log4j.xml");
		Driver.openApplication();
		Login.login("nareshit","nareshit");
		Logout.logout();
		Driver.closeApplication();
	}

}
