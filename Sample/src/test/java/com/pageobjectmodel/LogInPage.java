package com.pageobjectmodel;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInPage {
	@Given("^user able to go home page$")
	public void user_able_to_go_home_page() throws Throwable {
	   
	}

	@When("^user enter email$")
	public void user_enter_email() throws Throwable {
	    
	}

	@When("^user enter password$")
	public void user_enter_password() throws Throwable {
	    
	}   

	@When("^user able to click login$")
	public void user_able_to_click_login() throws Throwable {
	    
	    throw new PendingException();
	}

	@Then("^user login successfully$")
	public void user_login_successfully() throws Throwable {
	    
	    throw new PendingException();
	}



}
