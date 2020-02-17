package com_TestCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com_PageObject.HomePage_PageObject;
import com_PageObject.LoginPage_PageObject;



public class LoginPage_TestCase extends BaseClass {
	static LoginPage_PageObject obj;

	public String url = read.browerUrl();
	public String Username = read.username();
	public String password = read.password();

//	@BeforeMethod
	public void initiateObject() {
		obj = new LoginPage_PageObject(driver);
	}

	@Test(priority = 1)
	public void loginPageTitleValidation() {
		this.initiateObject();
		this.launchURL();
		SoftAssert softassert = new SoftAssert();
		
		String Exptitle = "CRMPRO - CRM software for customer relationship management, sales, and support.";
		String actualTitle = driver.getTitle();

		softassert.assertEquals(Exptitle, actualTitle, "title Matched Tc passed");
		softassert.assertAll();
		log.info("Login page title validation successful");
	}

	@Test(priority = 2)
	public void LoginPageUIValidation() {
		this.initiateObject();
		SoftAssert softassert1 =  new SoftAssert();
		softassert1.assertTrue(obj.homeButtonIsDisplayed(), "Home button is not present");
		softassert1.assertTrue(obj.pricingButtonIsDisplayed(), "pricing button is not present");
		softassert1.assertTrue(obj.featuresButtonIsDisplayed(), "Features button is not present");
		softassert1.assertTrue(obj.customersButtonIsDisplayed(), "Customers button is not present");
		softassert1.assertTrue(obj.contactButtonIsDisplayed(), "contact button is not present");
		softassert1.assertAll();
		// Assert.assertTrue(obj.allHomePageLinkIsDisplayed());
		log.info("Login page UI validation successful");
	}

	@Test(priority = 3)
	public void LoginValidation() {
		this.initiateObject();
		
		SoftAssert softassert2 = new SoftAssert();

		obj.setUserName(Username);
		obj.setPassword(password);
		HomePage_PageObject homePage = obj.clickLoginButton();
		softassert2.assertEquals(homePage.getPageTitle(), "CRMPRO");
		softassert2.assertAll();
		log.info("Login  successful");
	

	}
}
