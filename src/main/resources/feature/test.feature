@Training_Project_Jpets
Feature: TestCases 
	
	
Scenario Outline: Registration of the Jpet Application 
	When User click on Sign In botton and click on Register Now! 
	And User enters User Id as "<userId>" and  New password as "<password>" and Repeat password as "<password>" 
	And User enters First name as "<firstName>" and Last name as "<lastName>" and Email as "<email>" and Phone as "<phone>" and AddressOne as "<addressOne>" and AddressTwo as "<addressTwo>" and City as "<city>" and State as "<state>" and Zip as "<zip>" and Country as "<country>" 
	And User selects Language Preference as English and Favourite Category as DOGS and Enable MyList and Enable MyBanner 
	And User click on "<Register>"Save Account Information 
	 
	   
	
	Examples:
		#Change Registration Details for time running the code 
		| userId | password | firstName | lastName | email | phone | addressOne | addressTwo | city | state | zip | country |Register|
		| 1234567bbqq | qwertyuiop |Ramu|Ragam|aasdfghjkl@gmail.com|9876543210|Chinna gari colony|Kotha Peta|Kaikalur|AP|521333|India|Register1| 
		| 1234567bdee | asdfghjkl |Krishna|katugga|aasdfghjkl@gmail.com|9876543211|Chinna gari colony|Kotha Peta|Kaikalur|AP|521333|India|Register2|
		| 1234567datt | zxcvbnmasd |RajShekhar|Borra|aasdfghjkl@gmail.com|9876543212|Chinna gari colony|Kotha Peta|Kaikalur|AP|521333|India|Register3|