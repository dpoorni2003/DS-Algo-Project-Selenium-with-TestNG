package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.GetStartedPage;
import pageobjects.HomePage;
import pageobjects.RegisterPage;
import pageobjects.SignInPage;
import resources.Base;

public class SignInTest extends Base {
	
	WebDriver driver;

	@BeforeMethod	
	public void initiateDriver() throws Throwable {

		driver= initializeDriver();
		System.out.println("Inside BeforeMethod");
	}
	
	@Test
	public void signin() throws Throwable {

		//WebDriver driver = initializeDriver();
		//driver.get("https://dsportalapp.herokuapp.com/");
		driver.get(prop.getProperty("siteURL"));
		Thread.sleep(3000);

		GetStartedPage getstartedpage = new GetStartedPage(driver);
		getstartedpage.GetStartedBtn().click();
		Thread.sleep(2000);
		HomePage homepage = new HomePage(driver);
		homepage.signinlink().click();

		SignInPage signinpage = new SignInPage(driver);
		
		signinpage.username().sendKeys(prop.getProperty("username"));
		Thread.sleep(2000);
		signinpage.password().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		Thread.sleep(2000);
		try {
			signinpage.login().click();
			Thread.sleep(2000);
			
		}catch(Exception e) {
			System.out.println("Exception Occured:" +e.getMessage());
		}
		homepage.dsintro().click();
		Thread.sleep(2000);

	}	
	
	@AfterMethod
	public void closeBrower() {
		System.out.println("Inside AfterMethod");
		driver.close();
		//driver.quit();

	}


}
