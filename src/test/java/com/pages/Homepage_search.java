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

public class Homepage_search {
	WebDriver driver;
	 //WebElements_Of_Homepage_Search
	By HomeText=By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img");
	By select =By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
	By item=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
	
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

				//Wait_For_50_Sec
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

				//Go_To_JPet_Website
				driver.get("https://petstore.octoperf.com/actions/Catalog.action");

				//To_Print_Title_of_WebPage
				System.out.println(driver.getTitle());
			}
 
   //Click_On_The_Homepage_Text
	 public void JpetSearch() throws InterruptedException {
		driver.findElement(HomeText).click();
		
		 Thread.sleep(2000);
		driver.findElement(select).click();
		 
	 }
	  //click_On_the_selected_Item
	  public void click() throws InterruptedException {
		  Thread.sleep(2000);
		 driver.findElement(item).click();
	 }
	  //Close_The_Browser
	 public void close() throws InterruptedException {
		 
		 Thread.sleep(1000);
		 driver.close();
	 }
	 //Take_The_Screenshot_Of_Product
	 public void screenshot() throws IOException
		{
			File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		String	path="src\\test\\resources\\Screenshot\\homepage.png";
			
			FileUtils.copyFile(f,new File(path));
		}

	}


