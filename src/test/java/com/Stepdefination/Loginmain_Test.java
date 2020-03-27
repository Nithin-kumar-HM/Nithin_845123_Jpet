package com.Stepdefination;

import com.pages.Login_main;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginmain_Test {

	Login_main log = new Login_main();
	
	@Given("^the user launches the website in chrome browser$")
	public void the_user_launches_the_website_in_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    log.url();
	}

	@When("^opens the login page$")
	public void opens_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 for(int i=0;i<2;i++)
		    {
			 log.homepage();
			 log.Jpet_username(i);
			log.Jpet_password(i);
			Thread.sleep(2000);
			//log.screenshot();
			Thread.sleep(1000);
		 log.Login_click();
			Thread.sleep(2000);
		
		    }
	    
	}

	@Then("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		System.out.println("login is done successfully");
		log.screenshot();
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		//log.screenshot();
		Thread.sleep(1000);
	    log.close();
	}

	
}
