package com.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTwo {
public WebDriver driver;

public  WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://yahoo.com");
	
	return driver;
	
	
}
}
