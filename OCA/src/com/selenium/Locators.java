package com.selenium;

import org.openqa.selenium.By;

public class Locators {
	
	public static By name_3_firstname = By.id("name_3_firstname");
	public static By name_3_lastname = By.id("name_3_lastname");
	public static By single=By.xpath("//*[@id=\"pie_register\"]/li[2]/div/div/input[1]");
	public static By Reading=By.xpath("id(\"pie_register\")/li[3]/div[1]/div[1]/input[2]");
	public static By country=By.id("dropdown_7");
	public static By month=By.xpath("//*[@id=\"mm_date_8\"]");
	public static By day=By.xpath("//*[@id=\"dd_date_8\"]");
	public static By year=By.xpath("//*[@id=\"yy_date_8\"]");
	public static By phone=By.id("phone_9");
	public static By usename=By.id("username");
	public static By email=By.id("email_1");
	public static By profilepicture=By.id("profile_pic_10");
	//public static By about=By.id("description");
	public static By password=By.id("password_2");
	public static By confirmpassword=By.id("confirm_password_password_2");
	public static By submit=By.xpath("//*[@id=\"pie_register\"]/li[14]/div/input");
}
