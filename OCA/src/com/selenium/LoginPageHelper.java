package com.selenium;

public class LoginPageHelper {
	DriverUtil util = new DriverUtil();
	FormDetails formDetails;
    
	public void openBrowser(){
	 util.setupDriver();
	
	}  
	  void getDetails(FormDetails formDetails) {
	
	 util.type(Locators.name_3_firstname,formDetails.getName() );
	 util.type(Locators.name_3_lastname, formDetails.getLastName());
	 util.click(Locators.single);
	 util.click(Locators.Reading);
	 util.select(Locators.country,formDetails.getCountry());
	 util.select(Locators.month,formDetails.getMonth());
	 util.select(Locators.day,formDetails.getDay());
	 util.select(Locators.year,formDetails.getYear());
     util.type(Locators.phone, formDetails.getPhone());
	 util.type(Locators.usename, formDetails.getUserName());
	 util.type(Locators.email,formDetails.getEmail());
	 util.type(Locators.profilepicture,formDetails.getProfilePicture());
	 util.type(Locators.password,formDetails.getPassword());
	 util.type(Locators.confirmpassword,formDetails.getConfirmPassword());
	 util.click(Locators.submit);
	}
	}	

