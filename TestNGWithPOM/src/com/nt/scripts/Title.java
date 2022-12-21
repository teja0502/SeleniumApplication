package com.nt.scripts;


import org.testng.Reporter;

import com.hrms.base.Driver;
import com.hrms.utility.Log;

public class Title extends Driver {
	
	public static void GetTitle() {
		Reporter.log(driver.getTitle());
		Log.info(driver.getTitle());
		System.out.println(driver.getTitle());
	}

}
