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


import excelutility.com.Read_excelsheet_login;

public class Login_main {
		
		WebDriver driver;
		
		//Web_Elements_Of_Login_Page
		
		By signin=By.xpath("//*[@id=\"MenuContent\"]/a[2]");
		By username=By.name("username");
		By password=By.name("password");
        By login=By.xpath("//*[@id=\"Catalog\"]/form/input");
		By logout=By.xpath("//*[@id=\"MenuContent\"]/a[2]");
		
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
		
		    //Go_To_Login_Page 
			public void homepage()
			{
				driver.findElement(signin).click();		
			}
			
			//Read_UserName_From_Excel_File_And_Insert_In_Username_Box
			public void Jpet_username(int i) throws IOException
			{
			
				Read_excelsheet_login read=new Read_excelsheet_login();
				driver.findElement(username).sendKeys(read.Excel_Username(i));
			}

			//Read_Password_From_Excel_File_And_Insert_In_Pasword_Box
			public void Jpet_password(int i) throws IOException 
			{

				Read_excelsheet_login read=new Read_excelsheet_login();
				
				driver.findElement(password).clear();
				driver.findElement(password).sendKeys(read. Excel_password(i));	
			}
             
			//Click_The_Submit_Button
			public void Login_click() throws InterruptedException
			{
				driver.findElement(login).click();
				Thread.sleep(2000);
				
				driver.findElement(logout).click();
				
			}
			
			//Close_The_Browser
			public void close()
			{
				driver.close();
			}
			
           //take_The_Screenshot_of_Jpet_Homepage 
			public void screenshot() throws IOException
			{
				File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
			String	path="src\\test\\resources\\Screenshot\\login.png";
				
				FileUtils.copyFile(f,new File(path));
			}

}
