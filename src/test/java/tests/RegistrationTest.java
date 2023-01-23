package tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.GetStartedPage;
import pageobjects.HomePage;
import pageobjects.RegisterPage;
import resources.Base;


public class RegistrationTest extends Base {

	WebDriver driver;
	
	@BeforeMethod	
	public void initiateDriver() throws Throwable {

		driver= initializeDriver();
		System.out.println("Inside BeforeMethod");
	}

	@Test(dataProvider="registrationOptions")
	public void registration(String uname, String pwd1, String pwd2) throws Throwable {

		//WebDriver driver = initializeDriver();
		//driver.get("https://dsportalapp.herokuapp.com/");
		driver.get(prop.getProperty("siteURL"));
		Thread.sleep(3000);

		GetStartedPage getstartedpage = new GetStartedPage(driver);
		getstartedpage.GetStartedBtn().click();
		
		RegisterPage registerpage = new RegisterPage(driver);

		Thread.sleep(3000);
		HomePage homepage = new HomePage(driver);
		
		homepage.dropdownlink().click();
		//Thread.sleep(3000);
		
		Thread.sleep(2000);
		homepage.arraylink().click();
		homepage.dropdownlink().click();
		//Thread.sleep(3000);
		homepage.linkedlistlink().click();
		//Thread.sleep(3000);
		homepage.dropdownlink().click();
		//Thread.sleep(3000);
		homepage.stacklink().click();
		//Thread.sleep(3000);
		homepage.dropdownlink().click();
		//Thread.sleep(3000);
		homepage.queuelink().click();
		//Thread.sleep(3000);
		homepage.dropdownlink().click();
		//Thread.sleep(3000);
		homepage.treelink().click();
		//Thread.sleep(3000);
		homepage.dropdownlink().click();
		//Thread.sleep(3000);
		homepage.graphlink().click();
		//Thread.sleep(3000);
		homepage.registerlink().click();

		//registerpage.username().sendKeys(prop.getProperty("username"));
		registerpage.username().sendKeys(uname);
		Thread.sleep(2000);
		//registerpage.password().sendKeys(prop.getProperty("password"));
		registerpage.password().sendKeys(pwd1);
		Thread.sleep(2000);
		//registerpage.confirmpassword().sendKeys(prop.getProperty("confirmpassword"));
		registerpage.confirmpassword().sendKeys(pwd2);

		Thread.sleep(2000);
		try {
			registerpage.register().click();
			
		}catch(Exception e) {
			System.out.println("Exception Occured:" +e.getMessage());
		}

	}	

	@DataProvider
	public  Object[][] registrationOptions(){

		Object[][] options = {{"Ninja1","Rose@6543"," "},{"Ninja2","Rose@6543","Rose@65434"},{"Ninja4","Rose@6543","Rose@6543"} };
		return options;
	}

	@AfterMethod
	public void closeBrower() {
		System.out.println("Inside AfterMethod");
		driver.close();
		//driver.quit();

	}

}
