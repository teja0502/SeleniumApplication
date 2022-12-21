package com.nt.scripts;

import org.openqa.selenium.WebDriver;

public class HRMSPortalData {
	
	//Data
	WebDriver driver;
	public String url="http://183.82.103.245/nareshit/login.php";
	public String userName="nareshit";
	public String password="nareshit";
	public String fName="King";
	public String lName="Kohli";
	public String filePath="E:\\Selenium Jars\\virat.jpeg";
	public String empId="10000";
	//Objects or Elements.
	public String name_username="txtUserName";
	public String name_password="txtPassword";
	public String name_submit="Submit";
	public String id_frame="rightMenu";
	public String xpath_Add="//input[@value='Add']";
	public String name_fName="txtEmpFirstName";
	public String name_lName="txtEmpLastName";
	public String name_file="photofile";
	public String id_save="btnEdit";
	public String xpath_back="//input[@value='Back']";
	public String linkTest_Logout="Logout";
	public String name_searchBy="loc_code";
	public String visibleText="Emp. ID";
	public String name_SearchFor="loc_name";
	public String xpath_Search="//input[@value='Search']";
	public String name_CheckBox="chkLocID[]";
	public String xpath_Delete="//input[@value='Delete']";
	
	
}
