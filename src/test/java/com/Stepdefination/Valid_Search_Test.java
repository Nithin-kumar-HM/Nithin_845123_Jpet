package com.Stepdefination;

import com.pages.Valid_Search_Main;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Valid_Search_Test {
	Valid_Search_Main val_Search= new Valid_Search_Main();

	@Given("^the search bar in the login page$")
	public void the_search_bar_in_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		val_Search.url();
	    
	}

	@When("^search for the animal you are looking for$")
	public void search_for_the_animal_you_are_looking_for() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		val_Search.jpet_search();
	}

	@Then("^enter the product id and name in the search bar$")
	public void enter_the_product_id_and_name_in_the_search_bar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		val_Search.senddata();
	}

	@Then("^click on the Search button$")
	public void click_on_the_Search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		val_Search.screenshot();
		val_Search.clickbutton();
	}
}
