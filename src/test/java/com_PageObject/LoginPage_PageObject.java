package com_PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class LoginPage_PageObject {

	WebDriver driver;

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//li[@class='active']")
	WebElement HomeButton;

	@FindBy(xpath = "//*[text()='Pricing']")
	WebElement PricingButton;

	@FindBy(xpath = "//*[text()='Features']")
	WebElement FeaturesButton;

	@FindBy(xpath = "//*[text()='Customers']")
	WebElement CustomersButton;

	@FindBy(xpath = "//*[text()='Contact']")
	WebElement ContactButton;

	@FindBy(xpath = "//input[contains(@value,'Login')]")
	WebElement LoginButton;

//	@FindBy(how = How.XPATH, using = "//ul[contains(@class,'nav')]/li/a")
//	List<WebElement> HomePageLinks;
//	
//	public boolean allHomePageLinkIsDisplayed() {
//		
//		for(WebElement temp:HomePageLinks) {
//			if(!temp.isDisplayed()) {
//				return false;
//			}
//		}
//		return true;
//	}

	public LoginPage_PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean homeButtonIsDisplayed() {
		boolean result = HomeButton.isDisplayed();
		
		return result;
		
	}

	public boolean pricingButtonIsDisplayed() {
		boolean result = PricingButton.isDisplayed();
		return result;
	}

	public boolean featuresButtonIsDisplayed() {
		boolean result = FeaturesButton.isDisplayed();
		return result;
	}

	public boolean customersButtonIsDisplayed() {
		boolean result = CustomersButton.isDisplayed();
		return result;
	}

	public boolean contactButtonIsDisplayed() {
		boolean result = CustomersButton.isDisplayed();
		return result;
	}

	public void setUserName(String user) {
		username.sendKeys(user);
	}

	public void setPassword(String pass) {
		password.sendKeys(pass);
	}

	public HomePage_PageObject clickLoginButton() {
		LoginButton.click();
		return new HomePage_PageObject(this.driver);
	}

}
