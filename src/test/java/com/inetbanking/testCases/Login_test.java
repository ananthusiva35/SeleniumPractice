package com.inetbanking.testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.inetbanking.pageObjects.LoginPage;

public class Login_test extends BaseClass {

	 @Test
	 public void test() throws IOException {
		 driver.get(baseURL);
		 
		 LoginPage lp = new LoginPage(driver);
		 
		 Logger logger =Logger.getLogger("inetbanking");
		 
		  lp.setusername(username);
		  logger.info("username entered successfully");
		  lp.validuser();
		  logger.info("clicked on continue button");
		  lp.setpassword(password);
		  logger.info("pwd set successfull");
		  lp.signin();
		  
		  String title = driver.getTitle();
		  
		  if(title.equals("flipkart")) {
			  Assert.assertTrue(true);
			  logger.info("title correct");
		  }
		  
		  else
			  captureScreen(driver, "logintest");
			  Assert.assertFalse(false);
			  logger.info("title is not correct");
	 }
	   
}
