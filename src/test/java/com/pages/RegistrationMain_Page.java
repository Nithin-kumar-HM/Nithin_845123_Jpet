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
import org.openqa.selenium.support.ui.Select;

public class RegistrationMain_Page 
{
	private WebDriver driver;
	
	private	By signin=By.xpath("//*[@id=\"MenuContent\"]/a[2]");
	private	By register=By.linkText("Register Now!");
	
	private By userIdLoc = By.name("username");
	private By newPasswordLoc = By.name("password");
	private By repeatPasswordLoc = By.name("repeatedPassword");
	private By firstNameLoc = By.name("account.firstName");
	private By lastNameLoc = By.name("account.lastName");
	private By emailLoc = By.name("account.email");
	private By phoneLoc = By.name("account.phone");
	private By addressOneLoc = By.name("account.address1");
	private By addressTwoLoc = By.name("account.address2");
	private By cityLoc = By.name("account.city");
	private By stateLoc = By.name("account.state");
	private By zipLoc = By.name("account.zip");
	private By countryLoc = By.name("account.country");
	private By languagePreferenceLoc = By.name("account.languagePreference");
	private By favouriteCategoryIdLoc = By.name("account.favouriteCategoryId");
	private By listOptionLoc = By.name("account.listOption");
	private By bannerOptionLoc = By.name("account.bannerOption");
	private By saveAccountInformationLoc = By.name("newAccount");
	
	
	  public RegistrationMain_Page(WebDriver driver) 
	  { 
		  this.driver = driver; 
		  }
	  
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

		//Move_To_Registeration_Page
		public void register()
		{
			driver.findElement(signin).click();
			driver.findElement(register).click();

		}

	 
	public void fillUserInformation(String userId, String newPassword, String RepeatPassword)
	{
		driver.findElement(userIdLoc).sendKeys(userId);
		driver.findElement(newPasswordLoc).sendKeys(newPassword);
		driver.findElement(repeatPasswordLoc).sendKeys(RepeatPassword);
	}
	

	
	
	
	
	public void fillAccountInformation(String firstName, String lastName, String email, String phone, String addressOne, String addressTwo,
			String City, String state, String zip, String country)
	{
		driver.findElement(firstNameLoc).sendKeys(firstName);
		driver.findElement(lastNameLoc).sendKeys(lastName);
		driver.findElement(emailLoc).sendKeys(email);
		driver.findElement(phoneLoc).sendKeys(phone);
		driver.findElement(addressOneLoc).sendKeys(addressOne);
		driver.findElement(addressTwoLoc).sendKeys(addressTwo);
		driver.findElement(cityLoc).sendKeys(City);
		driver.findElement(stateLoc).sendKeys(state);
		driver.findElement(zipLoc).sendKeys(zip);
		driver.findElement(countryLoc).sendKeys(country);
	}
	
	public void fillPersonalInformation()
	{
		Select language = new Select(driver.findElement(languagePreferenceLoc));
		language.selectByVisibleText("english");
		Select category = new Select(driver.findElement(favouriteCategoryIdLoc));
		category.selectByVisibleText("DOGS");
		driver.findElement(listOptionLoc).click();
		driver.findElement(bannerOptionLoc).click();
	}
	
	public void clickOnSaveAccountInformation(String source) throws IOException
	{
		//take_The_Screenshot_of_Jpet_Registration_Page
		
			File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			String	path="src\\test\\resources\\Screenshot\\"+source+".png";

			FileUtils.copyFile(f,new File(path));
		


		driver.findElement(saveAccountInformationLoc).click();
		
		driver.close();
		
		
		
	}
}
