package com.inetbanking.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	
	    Properties prop;
	
     public Readconfig() {
		
		//read config properties
		prop=new Properties();
		try {
			FileInputStream ip = new FileInputStream("./Configuation/config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
     
    public String amazonurl() {
    	String url=prop.getProperty("url");
		return url;
    	
    }
    
    public String username() {
    	String uname=prop.getProperty("username");
    	return uname;
    }
    
    public String pwd() {
    	String pwd=prop.getProperty("password");
    	return pwd;
    }
    
    public String chromepath() {
    	String chromepath=prop.getProperty("chromepath");
    	return chromepath;
    }
    
    public String broswername() {
    	String browsername=prop.getProperty("browser");
    	return browsername;
    }
    
    

}
