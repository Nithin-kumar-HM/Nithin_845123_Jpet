$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/testcase1.feature");
formatter.feature({
  "line": 2,
  "name": "Jpet Website",
  "description": "",
  "id": "jpet-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Project_Jpets.feature"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Registration of the Jpet Application",
  "description": "",
  "id": "jpet-website;registration-of-the-jpet-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@tc_01_Registration"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User click on Sign In botton and click on Register Now!",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters User Id as \"\u003cuserId\u003e\" and  New password as \"\u003cpassword\u003e\" and Repeat password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters First name as \"\u003cfirstName\u003e\" and Last name as \"\u003clastName\u003e\" and Email as \"\u003cemail\u003e\" and Phone as \"\u003cphone\u003e\" and AddressOne as \"\u003caddressOne\u003e\" and AddressTwo as \"\u003caddressTwo\u003e\" and City as \"\u003ccity\u003e\" and State as \"\u003cstate\u003e\" and Zip as \"\u003czip\u003e\" and Country as \"\u003ccountry\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User selects Language Preference as English and Favourite Category as DOGS and Enable MyList and Enable MyBanner",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on \"\u003cRegister\u003e\"Save Account Information",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "jpet-website;registration-of-the-jpet-application;",
  "rows": [
    {
      "comments": [
        {
          "line": 15,
          "value": "#Change Registration Details for time running the code"
        }
      ],
      "cells": [
        "userId",
        "password",
        "firstName",
        "lastName",
        "email",
        "phone",
        "addressOne",
        "addressTwo",
        "city",
        "state",
        "zip",
        "country",
        "Register"
      ],
      "line": 16,
      "id": "jpet-website;registration-of-the-jpet-application;;1"
    },
    {
      "cells": [
        "123456678",
        "qwertyuiop",
        "Ramu",
        "Ragam",
        "aasdfghjkl@gmail.com",
        "9876543210",
        "Chinna gari colony",
        "Kotha Peta",
        "Kaikalur",
        "AP",
        "521333",
        "India",
        "Register1"
      ],
      "line": 17,
      "id": "jpet-website;registration-of-the-jpet-application;;2"
    },
    {
      "cells": [
        "123456789",
        "asdfghjkl",
        "Krishna",
        "katugga",
        "aasdfghjkl@gmail.com",
        "9876543211",
        "Chinna gari colony",
        "Kotha Peta",
        "Kaikalur",
        "AP",
        "521333",
        "India",
        "Register2"
      ],
      "line": 18,
      "id": "jpet-website;registration-of-the-jpet-application;;3"
    },
    {
      "cells": [
        "123456798",
        "zxcvbnmasd",
        "RajShekhar",
        "Borra",
        "aasdfghjkl@gmail.com",
        "9876543212",
        "Chinna gari colony",
        "Kotha Peta",
        "Kaikalur",
        "AP",
        "521333",
        "India",
        "Register3"
      ],
      "line": 19,
      "id": "jpet-website;registration-of-the-jpet-application;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Registration of the Jpet Application",
  "description": "",
  "id": "jpet-website;registration-of-the-jpet-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Project_Jpets.feature"
    },
    {
      "line": 5,
      "name": "@tc_01_Registration"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User click on Sign In botton and click on Register Now!",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters User Id as \"123456678\" and  New password as \"qwertyuiop\" and Repeat password as \"qwertyuiop\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters First name as \"Ramu\" and Last name as \"Ragam\" and Email as \"aasdfghjkl@gmail.com\" and Phone as \"9876543210\" and AddressOne as \"Chinna gari colony\" and AddressTwo as \"Kotha Peta\" and City as \"Kaikalur\" and State as \"AP\" and Zip as \"521333\" and Country as \"India\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User selects Language Preference as English and Favourite Category as DOGS and Enable MyList and Enable MyBanner",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on \"Register1\"Save Account Information",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Registration_test.user_click_on_Sign_In_botton_and_click_on_Register_Now()"
});
formatter.result({
  "duration": 18729019000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456678",
      "offset": 24
    },
    {
      "val": "qwertyuiop",
      "offset": 57
    },
    {
      "val": "qwertyuiop",
      "offset": 93
    }
  ],
  "location": "Registration_test.user_enters_User_Id_as_and_New_password_as_and_Repeat_password_as(String,String,String)"
});
formatter.result({
  "duration": 850293300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ramu",
      "offset": 27
    },
    {
      "val": "Ragam",
      "offset": 51
    },
    {
      "val": "aasdfghjkl@gmail.com",
      "offset": 72
    },
    {
      "val": "9876543210",
      "offset": 108
    },
    {
      "val": "Chinna gari colony",
      "offset": 139
    },
    {
      "val": "Kotha Peta",
      "offset": 178
    },
    {
      "val": "Kaikalur",
      "offset": 203
    },
    {
      "val": "AP",
      "offset": 227
    },
    {
      "val": "521333",
      "offset": 243
    },
    {
      "val": "India",
      "offset": 267
    }
  ],
  "location": "Registration_test.user_enters_First_name_as_and_Last_name_as_and_Email_as_and_Phone_as_and_AddressOne_as_and_AddressTwo_as_and_City_as_and_State_as_and_Zip_as_and_Country_as(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1945733200,
  "status": "passed"
});
formatter.match({
  "location": "Registration_test.user_selects_Language_Preference_as_English_and_Favourite_Category_as_DOGS_and_Enable_MyList_and_Enable_MyBanner()"
});
formatter.result({
  "duration": 725270900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register1",
      "offset": 15
    }
  ],
  "location": "Registration_test.user_click_on_Save_Account_Information(String)"
});
formatter.result({
  "duration": 3259829700,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Registration of the Jpet Application",
  "description": "",
  "id": "jpet-website;registration-of-the-jpet-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Project_Jpets.feature"
    },
    {
      "line": 5,
      "name": "@tc_01_Registration"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User click on Sign In botton and click on Register Now!",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters User Id as \"123456789\" and  New password as \"asdfghjkl\" and Repeat password as \"asdfghjkl\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters First name as \"Krishna\" and Last name as \"katugga\" and Email as \"aasdfghjkl@gmail.com\" and Phone as \"9876543211\" and AddressOne as \"Chinna gari colony\" and AddressTwo as \"Kotha Peta\" and City as \"Kaikalur\" and State as \"AP\" and Zip as \"521333\" and Country as \"India\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User selects Language Preference as English and Favourite Category as DOGS and Enable MyList and Enable MyBanner",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on \"Register2\"Save Account Information",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Registration_test.user_click_on_Sign_In_botton_and_click_on_Register_Now()"
});
formatter.result({
  "duration": 13847163600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456789",
      "offset": 24
    },
    {
      "val": "asdfghjkl",
      "offset": 57
    },
    {
      "val": "asdfghjkl",
      "offset": 92
    }
  ],
  "location": "Registration_test.user_enters_User_Id_as_and_New_password_as_and_Repeat_password_as(String,String,String)"
});
formatter.result({
  "duration": 800968800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Krishna",
      "offset": 27
    },
    {
      "val": "katugga",
      "offset": 54
    },
    {
      "val": "aasdfghjkl@gmail.com",
      "offset": 77
    },
    {
      "val": "9876543211",
      "offset": 113
    },
    {
      "val": "Chinna gari colony",
      "offset": 144
    },
    {
      "val": "Kotha Peta",
      "offset": 183
    },
    {
      "val": "Kaikalur",
      "offset": 208
    },
    {
      "val": "AP",
      "offset": 232
    },
    {
      "val": "521333",
      "offset": 248
    },
    {
      "val": "India",
      "offset": 272
    }
  ],
  "location": "Registration_test.user_enters_First_name_as_and_Last_name_as_and_Email_as_and_Phone_as_and_AddressOne_as_and_AddressTwo_as_and_City_as_and_State_as_and_Zip_as_and_Country_as(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2152457900,
  "status": "passed"
});
formatter.match({
  "location": "Registration_test.user_selects_Language_Preference_as_English_and_Favourite_Category_as_DOGS_and_Enable_MyList_and_Enable_MyBanner()"
});
formatter.result({
  "duration": 613728700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register2",
      "offset": 15
    }
  ],
  "location": "Registration_test.user_click_on_Save_Account_Information(String)"
});
formatter.result({
  "duration": 2770084100,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Registration of the Jpet Application",
  "description": "",
  "id": "jpet-website;registration-of-the-jpet-application;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Project_Jpets.feature"
    },
    {
      "line": 5,
      "name": "@tc_01_Registration"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User click on Sign In botton and click on Register Now!",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters User Id as \"123456798\" and  New password as \"zxcvbnmasd\" and Repeat password as \"zxcvbnmasd\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters First name as \"RajShekhar\" and Last name as \"Borra\" and Email as \"aasdfghjkl@gmail.com\" and Phone as \"9876543212\" and AddressOne as \"Chinna gari colony\" and AddressTwo as \"Kotha Peta\" and City as \"Kaikalur\" and State as \"AP\" and Zip as \"521333\" and Country as \"India\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User selects Language Preference as English and Favourite Category as DOGS and Enable MyList and Enable MyBanner",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on \"Register3\"Save Account Information",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Registration_test.user_click_on_Sign_In_botton_and_click_on_Register_Now()"
});
formatter.result({
  "duration": 14174688800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456798",
      "offset": 24
    },
    {
      "val": "zxcvbnmasd",
      "offset": 57
    },
    {
      "val": "zxcvbnmasd",
      "offset": 93
    }
  ],
  "location": "Registration_test.user_enters_User_Id_as_and_New_password_as_and_Repeat_password_as(String,String,String)"
});
formatter.result({
  "duration": 810138200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RajShekhar",
      "offset": 27
    },
    {
      "val": "Borra",
      "offset": 57
    },
    {
      "val": "aasdfghjkl@gmail.com",
      "offset": 78
    },
    {
      "val": "9876543212",
      "offset": 114
    },
    {
      "val": "Chinna gari colony",
      "offset": 145
    },
    {
      "val": "Kotha Peta",
      "offset": 184
    },
    {
      "val": "Kaikalur",
      "offset": 209
    },
    {
      "val": "AP",
      "offset": 233
    },
    {
      "val": "521333",
      "offset": 249
    },
    {
      "val": "India",
      "offset": 273
    }
  ],
  "location": "Registration_test.user_enters_First_name_as_and_Last_name_as_and_Email_as_and_Phone_as_and_AddressOne_as_and_AddressTwo_as_and_City_as_and_State_as_and_Zip_as_and_Country_as(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2272890800,
  "status": "passed"
});
formatter.match({
  "location": "Registration_test.user_selects_Language_Preference_as_English_and_Favourite_Category_as_DOGS_and_Enable_MyList_and_Enable_MyBanner()"
});
formatter.result({
  "duration": 585856800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register3",
      "offset": 15
    }
  ],
  "location": "Registration_test.user_click_on_Save_Account_Information(String)"
});
formatter.result({
  "duration": 2172190200,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Login to the Jpet store application",
  "description": "",
  "id": "jpet-website;login-to-the-jpet-store-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@tc02_Login"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "the user launches the website in chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "opens the login page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginmain_Test.the_user_launches_the_website_in_chrome_browser()"
});
formatter.result({
  "duration": 12653276200,
  "status": "passed"
});
formatter.match({
  "location": "Loginmain_Test.opens_the_login_page()"
});
formatter.result({
  "duration": 22780199200,
  "status": "passed"
});
formatter.match({
  "location": "Loginmain_Test.enter_username_and_password()"
});
formatter.result({
  "duration": 562269100,
  "status": "passed"
});
formatter.match({
  "location": "Loginmain_Test.click_on_login_button()"
});
formatter.result({
  "duration": 1940423900,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Seraching for the product",
  "description": "",
  "id": "jpet-website;seraching-for-the-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@tc03_homepage"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": ":Open the JPET website",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": ":click on image",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": ":click on Product Id",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": ":Close The Website",
  "keyword": "And "
});
formatter.match({
  "location": "Homepage_Test.open_the_JPET_website()"
});
formatter.result({
  "duration": 13073658700,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_Test.click_on_image()"
});
formatter.result({
  "duration": 3041194800,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_Test.click_on_Product_Id()"
});
formatter.result({
  "duration": 3220085300,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_Test.close_The_Website()"
});
formatter.result({
  "duration": 1891473800,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Search for the animal by entering animal name in textbox apllication",
  "description": "",
  "id": "jpet-website;search-for-the-animal-by-entering-animal-name-in-textbox-apllication",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@tc04_Searchmain"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "the search bar in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "search for the animal you are looking for",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "enter the product id and name in the search bar",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "click on the Search button",
  "keyword": "Then "
});
formatter.match({
  "location": "Valid_Search_Test.the_search_bar_in_the_login_page()"
});
formatter.result({
  "duration": 13487149600,
  "status": "passed"
});
formatter.match({
  "location": "Valid_Search_Test.search_for_the_animal_you_are_looking_for()"
});
formatter.result({
  "duration": 2410382500,
  "status": "passed"
});
formatter.match({
  "location": "Valid_Search_Test.enter_the_product_id_and_name_in_the_search_bar()"
});
formatter.result({
  "duration": 4799016000,
  "status": "passed"
});
formatter.match({
  "location": "Valid_Search_Test.click_on_the_Search_button()"
});
formatter.result({
  "duration": 3839578100,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Add to Cart and remove cart in the JPet Store application.",
  "description": "",
  "id": "jpet-website;add-to-cart-and-remove-cart-in-the-jpet-store-application.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@tc05_addtocart"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "open the url in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "the url is launched click on search and enter search content",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "click on search button",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "click on product id",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "click on Item ID",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "click on addtocart",
  "keyword": "And "
});
formatter.match({
  "location": "Addtocart_Test.open_the_url_in_browser()"
});
formatter.result({
  "duration": 12610753500,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_Test.the_url_is_launched_click_on_search_and_enter_search_content()"
});
formatter.result({
  "duration": 302450000,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_Test.click_on_search_button()"
});
formatter.result({
  "duration": 898742700,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_Test.click_on_product_id()"
});
formatter.result({
  "duration": 643508700,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_Test.click_on_Item_ID()"
});
formatter.result({
  "duration": 7023603900,
  "status": "passed"
});
formatter.match({
  "location": "Addtocart_Test.click_on_addtocart()"
});
formatter.result({
  "duration": 801947500,
  "status": "passed"
});
});