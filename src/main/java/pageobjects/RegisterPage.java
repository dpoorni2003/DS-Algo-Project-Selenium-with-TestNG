package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;

	public RegisterPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver,this);

	}

	//@FindBy(xpath="//a[@class='nav-link dropdown-toggle']")

	@FindBy(id="id_username")
	//@FIndby(xpath=//input[@id="id_username"])
	WebElement username;

	@FindBy(id="id_password1")
	WebElement password;

	@FindBy(id="id_password2")
	WebElement confirmpassword;

	@FindBy( xpath="//input[@value='Register']")
	WebElement register;

	public WebElement username() {

		return username;
	}



	public WebElement password() {

		return password;
	}

	public WebElement confirmpassword() {
		return confirmpassword;
	}



	public WebElement register() {
		return register;
	}

}
