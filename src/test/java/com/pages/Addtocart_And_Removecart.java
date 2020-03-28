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

public class Addtocart_And_Removecart 
{
	WebDriver driver;

	//Web_Elements_Of_Add_To_Cart_Page_And_Remove
	By search = By.xpath("//*[@id=\"SearchContent\"]/form/input[1]");
	By searchbutton = By.xpath("//*[@id=\"SearchContent\"]/form/input[2]");
	By productID = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[2]/b/a/font");
	By ItemID = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a");
	By addtocart = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a");
	By remove = By.className("Button");

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

	//Inserting_the _Fish_Search_Textbox
	public void search()
	{
		driver.findElement(search).sendKeys("fish");
	}
	//Click_On_the_Searchbutton
	public void searchbutton()
	{
		driver.findElement(searchbutton).click();
	}
	//Click_On_The_ProductID
	public void productID()
	{
		driver.findElement(productID).click();
	}
	//Click_On_Item_And_Add_to_Cart
	public void ItemID() throws InterruptedException
	{
		driver.findElement(ItemID).click();
		Thread.sleep(2000);
		driver.findElement(addtocart).click();
		Thread.sleep(2000);

	}
	
	//Remove_The_Cart
	public void remove() throws InterruptedException
	{
		driver.findElement(remove).click();

	}


	//Close_The_Browser
	public void Exit() throws InterruptedException
	{

		driver.close();
	}


	//take_The_Screenshot_of_Jpet_invalid_Page
	public void screenshot(String path) throws IOException
	{
		File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);



		FileUtils.copyFile(f,new File(path));
	}



}


