package com.Stepdefination;

import com.pages.Addtocart_And_Removecart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addtocart_Test {
	
	Addtocart_And_Removecart addcart = new Addtocart_And_Removecart();
	
	@Given("^open the url in browser$")
	public void open_the_url_in_browser() throws Throwable {
	    
	   addcart.url("chrome");
	}

	@When("^the url is launched click on search and enter search content$")
	public void the_url_is_launched_click_on_search_and_enter_search_content() throws Throwable {
	    addcart.search();
		
	    
	}

	@Then("^click on search button$")
	public void click_on_search_button() throws Throwable {
	   
	    addcart.searchbutton();
	}

	@Then("^click on product id$")
	public void click_on_product_id() throws Throwable {
	    
	    addcart.productID();
	}

	@Then("^click on Item ID$")
	public void click_on_Item_ID() throws Throwable {
	    
	    addcart.ItemID();
	   
		addcart.screenshot("src\\test\\resources\\Screenshot\\Addcart.png");
		
		addcart.remove();
		addcart.screenshot("src\\test\\resources\\Screenshot\\removecart.png");
	    
	}

	@Then("^click on addtocart$")
	public void click_on_addtocart() throws Throwable {
	    
		addcart.Exit();
	}


	
	

}
