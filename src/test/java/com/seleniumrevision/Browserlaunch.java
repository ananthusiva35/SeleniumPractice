package com.seleniumrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\I322911\\eclipse-workspace\\SeleniumMavenProject1\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	    driver.findElement(By.id("ap_email")).sendKeys("9894828234");
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.id("ap_password")).sendKeys("274041A*");
	    driver.findElement(By.id("signInSubmit")).click();
	
	
	}
	
	

}
