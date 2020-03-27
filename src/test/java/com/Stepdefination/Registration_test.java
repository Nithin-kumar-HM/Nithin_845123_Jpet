package com.Stepdefination;

import org.openqa.selenium.WebDriver;

import com.pages.RegistrationMain_Page;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration_test {
	
public	WebDriver driver;
	RegistrationMain_Page reg = new RegistrationMain_Page(driver);
	
	

@When("^User click on Sign In botton and click on Register Now!$")
public void user_click_on_Sign_In_botton_and_click_on_Register_Now() throws Throwable {
    reg.url();
    reg.register();
    
}

@When("^User enters User Id as \"([^\"]*)\" and  New password as \"([^\"]*)\" and Repeat password as \"([^\"]*)\"$")
public void user_enters_User_Id_as_and_New_password_as_and_Repeat_password_as(String userId, String newPassword, String RepeatPassword) throws Throwable {
   
	reg.fillUserInformation(userId, newPassword, RepeatPassword);
}

@When("^User enters First name as \"([^\"]*)\" and Last name as \"([^\"]*)\" and Email as \"([^\"]*)\" and Phone as \"([^\"]*)\" and AddressOne as \"([^\"]*)\" and AddressTwo as \"([^\"]*)\" and City as \"([^\"]*)\" and State as \"([^\"]*)\" and Zip as \"([^\"]*)\" and Country as \"([^\"]*)\"$")
public void user_enters_First_name_as_and_Last_name_as_and_Email_as_and_Phone_as_and_AddressOne_as_and_AddressTwo_as_and_City_as_and_State_as_and_Zip_as_and_Country_as(String firstName, String lastName, String email, String phone, String addressOne, String addressTwo,
		String City, String state, String zip, String country) throws Throwable {
    
	reg.fillAccountInformation(firstName, lastName, email, phone, addressOne, addressTwo, City, state, zip,
			country);
}

@When("^User selects Language Preference as English and Favourite Category as DOGS and Enable MyList and Enable MyBanner$")
public void user_selects_Language_Preference_as_English_and_Favourite_Category_as_DOGS_and_Enable_MyList_and_Enable_MyBanner() throws Throwable {
	reg.fillPersonalInformation();
    
}

@When("^User click on \"([^\"]*)\"Save Account Information$")
public void user_click_on_Save_Account_Information(String source) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    reg.clickOnSaveAccountInformation(source);
}


}
