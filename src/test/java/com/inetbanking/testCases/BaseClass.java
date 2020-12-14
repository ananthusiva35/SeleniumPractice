package com.inetbanking.testCases;


import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.Readconfig;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;


public class BaseClass {

	    Readconfig readconfig= new Readconfig();
	
		public String baseURL = readconfig.amazonurl();
	    public String username=readconfig.username();
	    public String password=readconfig.pwd();
	    public static WebDriver driver;
	    public static Logger logger;
	   
	    @Parameters("browser")
	    @BeforeClass
	    public void setup(String br) 
	    {
	    	Logger logger=Logger.getLogger(BaseClass.class);
	    	PropertyConfigurator.configure("Log4j.properties");
	    	
	    	if(br.equals("chrome")) {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\I322911\\eclipse-workspace\\SeleniumMavenProject1\\Driver1\\chromedriver.exe");
	    	driver=new ChromeDriver();
	    	}else if(br.equals("IE")) {
	    		System.setProperty("webdriver.ie.driver", "C:\\Users\\I322911\\eclipse-workspace\\SeleniumMavenProject1\\Driver1\\IEDriverServer.exe");
		    	driver=new InternetExplorerDriver();
	    	}
	    	
	    	
	    	
	    }
	    
	    @AfterClass
	    public void tearDown()
	    {
	    	driver.quit();
	    }
	    
	    public void captureScreen(WebDriver driver, String tname) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
			FileUtils.copyFile(source, target);
			System.out.println("Screenshot taken");
		}
	    
	
	}

