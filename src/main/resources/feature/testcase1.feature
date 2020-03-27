@Training_Project_Jpets.feature
Feature: Jpet Website

 
@tc_01_Registration	
Scenario Outline: Registration of the Jpet Application 
	When User click on Sign In botton and click on Register Now! 
	And User enters User Id as "<userId>" and  New password as "<password>" and Repeat password as "<password>" 
	And User enters First name as "<firstName>" and Last name as "<lastName>" and Email as "<email>" and Phone as "<phone>" and AddressOne as "<addressOne>" and AddressTwo as "<addressTwo>" and City as "<city>" and State as "<state>" and Zip as "<zip>" and Country as "<country>" 
	And User selects Language Preference as English and Favourite Category as DOGS and Enable MyList and Enable MyBanner 
	And User click on "<Register>"Save Account Information 
	   
	
	Examples:
		#Change Registration Details for time running the code 
		| userId | password | firstName | lastName | email | phone | addressOne | addressTwo | city | state | zip | country |Register|
		| 1234567wer | qwertyuiop |Ramu|Ragam|aasdfghjkl@gmail.com|9876543210|Chinna gari colony|Kotha Peta|Kaikalur|AP|521333|India|Register1| 
		| 1234567bd45 | asdfghjkl |Krishna|katugga|aasdfghjkl@gmail.com|9876543211|Chinna gari colony|Kotha Peta|Kaikalur|AP|521333|India|Register2|
		| 1234567da89 | zxcvbnmasd |RajShekhar|Borra|aasdfghjkl@gmail.com|9876543212|Chinna gari colony|Kotha Peta|Kaikalur|AP|521333|India|Register3|
@tc02_Login
Scenario: Login to the Jpet store application

Given the user launches the website in chrome browser
When opens the login page
Then enter username and password
And click on login button


@tc03_homepage
Scenario: Seraching for the product
Given :Open the JPET website
When :click on image
Then :click on Product Id
And :Close The Website


@tc04_Searchmain
Scenario: Search for the animal by entering animal name in textbox apllication
  
 Given the search bar in the login page 
 When search for the animal you are looking for 
 Then enter the product id and name in the search bar
 Then click on the Search button
  
@tc05_addtocart
Scenario: Add the animals or bird to the cart and remove from cart

Given the details of the required animal or bird
When the product id and name of the animal is added to the cart
Then check the shopping cart
And contains the wish list and romove form cart
  
 