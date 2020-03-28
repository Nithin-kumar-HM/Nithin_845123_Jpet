package com.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		//Path_Of_Feature_File
		features ="src\\main\\resources\\feature\\testcase1.feature",


		//cucumber_html_Report
		plugin = {"pretty","html:reports/cucumber-html-report","json:reports/cucumber-json-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/cucumber-Extentreport-report//report.html"},

							
		
		//Test_Cases_To_Be_Executed*********************************************    
		tags= {"@tc_01_Registration,@tc02_Login,@tc03_homepage,@tc04_Searchmain,@tc05_addtocart"},

		//Package_Name_Containing_Step_Definition_Files*********
		glue= {"com.Stepdefination"},
		monochrome=true

		)



public class TestRunner {


} 
 