package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	//public=Access modifire,webDriver=selenium interface, driver=variable,Total=instance /
	//classlable /global vriable
	
   public WebDriver getDriver() {
	   //upline is a mathode because there are parantheses & curly bress present
	   System.setProperty("webdriver.crome.driver", "./Browser/chromedriver.exe");
	   //system.meaning =one class and then set mathod apply
	    driver=new ChromeDriver();
	    //new=java key word=we creat a object of a class
	   driver.get("https://www.facebook.com/");
	  
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   //sincronizetion mathode.
	return driver;
	   
   }
}
