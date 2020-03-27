package com.Stepdefination;

import com.pages.Addtocart_And_Removecart_main;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addcart_Test {
	
	Addtocart_And_Removecart_main ac = new Addtocart_And_Removecart_main();
	
	@Given("^the details of the required animal or bird$")
	public void the_details_of_the_required_animal_or_bird() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    ac.url();
	}

	@When("^the product id and name of the animal is added to the cart$")
	public void the_product_id_and_name_of_the_animal_is_added_to_the_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    ac.jpet_cart();
	}

	@Then("^check the shopping cart$")
	public void check_the_shopping_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    ac.add();
	}

	@And("^contains the wish list and romove form cart$")
	public void contains_the_wish_list_and_romove_form_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ac.screenshot();
	    ac.removecart();
	}


	
}
//contains the wish list and romove form cart