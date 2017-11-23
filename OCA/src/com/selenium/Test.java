package com.selenium;

public class Test {
	 public static void main(String ...args){

		  LoginPageHelper helper = new LoginPageHelper();
		  FormDetails formdetails=new FormDetails();
		  helper.openBrowser();
		  
		 try {
			 int i=10;
		  formdetails.setName("badreelal");
		  formdetails.setLastName("patidar");
	      formdetails.setCountry("India");
	      formdetails.setMonth("9");
	      formdetails.setDay("5");
	      formdetails.setYear("1994");
	      formdetails.setPhone("919424222222");
	      formdetails.setUserName("blpatidar"+i);
	      formdetails.setEmail("githublive@gmail.com");
	      formdetails.setProfilePicture("C:\\Users\\Linux\\Desktop\\bldon1.jpg");
	      formdetails.setPassword("Demo@12345");
	      formdetails.setConfirmPassword("Demo@12345");
		  
		  helper.getDetails(formdetails);
		 
		}catch(Exception e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}
	 }
}
