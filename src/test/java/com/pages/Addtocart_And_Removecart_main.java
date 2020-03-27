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

public class Addtocart_And_Removecart_main {
	WebDriver driver;
	
	//Web_Elements_Of_Add_To_Cart_Page_And_Remove
	By animalimage = By.xpath("//*[@id=\"MainImageContent\"]/map/area[3]");
	By select = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
	By animalid=By.xpath("/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[3]/td[5]/a[1]");
    By addtocart=By.xpath("//a[@class='Button']");
	By remove = By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a");
	
	//Launch_The_Chrome_Browser
		public void url() 
		{
			System.setProperty("webdriver.chrome.driver","src\\test\\resources\\driver\\chromedriver.exe");
			driver = new ChromeDriver();

			//Maximize_The_Browser_Window
			driver.manage().window().maximize();

			//Wait_For_50_Sec
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			//Go_To_JPet_Website
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");

			//To_Print_Title_of_WebPage
			System.out.println(driver.getTitle());
		}
		
		//Select_Animal_and_clicking_The_Animal_Id
	public void jpet_cart() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.findElement(animalimage).click();
			driver.findElement(select).click();
			driver.findElement(animalid).click();
			
				
		}
        
	   //Click_On_Add_To_Cart_And_Remove_The_Animal_From_Cart
		public void add() throws InterruptedException 
		{
			Thread.sleep(3000);
			driver.findElement(addtocart).click();
			 driver.findElement(remove).click();
		}
        
		//_Close_The_Browser
		public void removecart() throws InterruptedException 
		{
		
		  Thread.sleep(2000);
		 
			driver.close();
			
		}
        
		//Taking_The_Screenshot_Of_Removed_Cart_page
		public void screenshot() throws IOException
		{
			File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		String	path="src\\test\\resources\\Screenshot\\Addtocart.png";
			
			FileUtils.copyFile(f,new File(path));
		}

}
