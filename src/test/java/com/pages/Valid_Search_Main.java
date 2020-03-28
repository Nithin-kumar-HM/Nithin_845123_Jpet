package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Valid_Search_Main {
	WebDriver driver;
	
	//WebElements_Of_validSearch
	By searchbar=By.xpath("//*[@id=\"SearchContent\"]/form/input[1]");
	By senddata=By.xpath("//*[@id=\"SearchContent\"]/form/input[1]");
	By sclick=By.xpath("//*[@id=\"SearchContent\"]/form/input[2]");
	By animalid=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[2]/b/a/font");
	
	//Launch_The_Browsers
    public void url(String browserName) { 
		
        //Launch_the ChromeDriver
		if(browserName.equals("chrome")){

			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
         //Launch_the_Firefox
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		//Maximize_The_Browser_Window
		driver.manage().window().maximize();
		
		//DeleteAllcookies_From_Browser
		driver.manage().deleteAllCookies();

		//Maximize_The_Browser_Window
		driver.manage().window().maximize();

		//Wait_For_50_Sec
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		//Go_To_JPet_Website
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");

		//To_Print_Title_of_WebPage
		System.out.println(driver.getTitle());
	}
       //Insert_Text_In_Search_Box
		public void jpet_search() throws InterruptedException
		{
			driver.findElement(searchbar).click();
			driver.findElement(senddata).clear();
			
			Thread.sleep(2000);
			driver.findElement(senddata).sendKeys("bulldog");
					
		}

		//Click_On_The_Search_And_Select_The_animal
		public void senddata() throws InterruptedException 
		{
			Thread.sleep(3000);
			driver.findElement(sclick).click();	
			
			driver.findElement(animalid).click();
			
		 
		}

		//Close_The_Browser
		public void clickbutton() throws InterruptedException
		{
		
			
			Thread.sleep(3000);
			driver.close();

		}
		//Take_The_Screenshot_of_Selected_animal
		public void screenshot() throws IOException
		{
			File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		String	path="src\\test\\resources\\Screenshot\\Searchmain.png";
			
			FileUtils.copyFile(f,new File(path));
		}

}
