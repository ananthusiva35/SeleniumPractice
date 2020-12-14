package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

        WebDriver ldriver;
		public LoginPage(WebDriver rdriver){
          
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
         }
		
		@FindBy(id="ap_email")
		@CacheLookup
		WebElement txtusername;
		
		@FindBy(id="continue")
		@CacheLookup
		WebElement cont;
		
		@FindBy(id="ap_password")
		@CacheLookup
		WebElement password;
		
		@FindBy(id="signInSubmit")
		@CacheLookup
		WebElement signin;
		
		public void setusername(String uname) {
			txtusername.sendKeys(uname);
		}
		
		public void validuser() {
			 cont.click();
		}
		
		public void setpassword(String pwd) {
			password.sendKeys(pwd);
		}
		public void signin() {
			signin.click();
		}

}
