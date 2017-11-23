package com.selenium;

public class LoginPageHelper {
	DriverUtil util = new DriverUtil();

	public void openBrowser(){
	 util.setupDriver();
	
	}
   
	public void register(String name, String lastName){
	 util.type(Locators.name_3_firstname, name);
	 util.type(Locators.name_3_lastname, lastName);
	 util.click(Locators.single);
	 util.click(Locators.Reading);
	}
	public void dropDown(String country,String month,String day,String year) {
	 util.select(Locators.country,country);
	 util.select(Locators.month,month);
	 util.select(Locators.day,day);
	 util.select(Locators.year,year);
	}
	public void basicDetail(String phone,String username,String email,String profile) {
		util.type(Locators.phone, phone);
		util.type(Locators.usename, username);
		util.type(Locators.email, email);
		//util.click(Locators.profilepicture);
		util.type(Locators.profilepicture,profile);
	}
	public void loginDetail(String password,String confirmPassword) {
		util.type(Locators.password, password);
		util.type(Locators.confirmpassword, confirmPassword);
		util.click(Locators.submit);
	}
	}	

