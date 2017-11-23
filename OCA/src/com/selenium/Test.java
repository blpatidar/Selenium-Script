package com.selenium;

public class Test {
	 public static void main(String ...args){

		  LoginPageHelper helper = new LoginPageHelper();
		  helper.openBrowser();
		  try {
		  helper.register("Badreelal", "Patidar");
		  helper.dropDown("India","9","5","1994");
		  helper.basicDetail("911234567890", "blpatidar", "githubDemo@gmail.com","C:\\Users\\Linux\\Desktop\\bldon1.jpg");
		  helper.loginDetail("Demo12345", "Demo12345");
		}catch(Exception e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}
	 }
}
