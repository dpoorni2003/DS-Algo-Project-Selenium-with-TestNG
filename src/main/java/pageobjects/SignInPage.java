package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	WebDriver driver;

	public SignInPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver,this);

	}

	@FindBy(id="id_username")
	//@FIndby(xpath=//input[@id="id_username"])
	WebElement username;

	@FindBy(id="id_password")
	WebElement password;


	@FindBy( xpath="//input[@value='Login']")
	WebElement login;

	
	
	public WebElement username() {

		return username;
	}

	public WebElement password() {

		return password;
	}


	public WebElement login() {
		return login;
	}



}
