package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	

	public HomePage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	

	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']")
	WebElement dropdownlink;

	@FindBy( xpath="//a[text()='Arrays']")
	WebElement arraylink;

	@FindBy( xpath="//a[text()='Linked List']")
	WebElement linkedlistlink;

	@FindBy( xpath="//a[text()='Stack']")
	WebElement stacklink;
	
	@FindBy( xpath="//a[text()='Queue']")
	WebElement queuelink;

	@FindBy( xpath="//a[text()='Tree']")
	WebElement treelink;

	@FindBy( xpath="//a[text()='Graph']")
	WebElement graphlink;
	
	@FindBy(partialLinkText="Register")
	WebElement registerlink;
	
	@FindBy(partialLinkText = "Sign in")
	WebElement signinlink;
	
	@FindBy(xpath="//a[@href='array']")
	WebElement dsintro;

	public WebElement dropdownlink() {

		return dropdownlink;
	}


	public WebElement arraylink() {
			
		return arraylink;
	}


	public WebElement linkedlistlink() {
		return linkedlistlink;
	}

	public WebElement stacklink() {
		return stacklink;
	}
	
	public WebElement queuelink() {
		return queuelink;
	}
	
	public WebElement treelink() {
		return treelink;
	}
	
	public WebElement graphlink() {
		return graphlink;
	}
	
	public WebElement registerlink() {
		return registerlink;
	}
	
	public WebElement signinlink() {
		return signinlink;
	}
	
	public WebElement dsintro() {
		return dsintro;
	}
}



