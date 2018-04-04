package com.scp.Demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S1 {
	       
		    static WebDriver driver;
			public static void main(String[] args) {
		       
				System.setProperty("webdriver.gecko.driver","Resources/geckodriver.exe");
				driver = new FirefoxDriver();
				//driver.get("http://opensource.demo.orangehrmlive.com/");
				//System.out.println( driver.getCurrentUrl());
				//  System.out.println(currentURL);
				//driver.close();
				//driver.quit();
			    
				
			}
	}

