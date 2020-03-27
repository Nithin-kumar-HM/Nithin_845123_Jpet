package com.Stepdefination;

import com.pages.Homepage_search;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homepage_Test {
	Homepage_search h = new Homepage_search();
	
	@Given("^:Open the JPET website$")
	public void open_the_JPET_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    h.url();
	}

	@When("^:click on image$")
	public void click_on_image() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   h.JpetSearch();
	}

	@Then("^:click on Product Id$")
	public void click_on_Product_Id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   h.click();
	}

	@Then("^:Close The Website$")
	public void close_The_Website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		h.screenshot();
	    h.close();
	}



}
