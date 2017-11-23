package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DriverUtil {
	 private WebDriver driver ;

		public void setupDriver(){

		System.setProperty("webdriver.chrome.driver","D:\\Programming\\chromedriver.exe");
		driver = new ChromeDriver();
		 openURL("http://demoqa.com/registration");
		}

		public  void click(By locater) {
			driver.findElement(locater).click();
		}
		public void type(By locator, String text){
			driver.findElement(locator).sendKeys(text);
		}
		public void select(By locator,String visibleText) {
			Select select=new Select(driver.findElement(locator));
				   select.selectByVisibleText(visibleText);
			
		}
		public void openURL(String url){
		        driver.get(url);
		}
			
}
