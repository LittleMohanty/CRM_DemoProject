package com_TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com_PageObject.CombinedPage_PageObject;
import com_PageObject.HomePage_PageObject;
import com_PageObject.LoginPage_PageObject;

public class HomePage_TestCase extends BaseClass {
	
	HomePage_PageObject homePage;
	LoginPage_TestCase login=new LoginPage_TestCase();
	
	
	public void initiateObject() {
		homePage = new HomePage_PageObject(driver);
	}
	
	@Test(priority=1)
	public void companiesButtonPresentValidation() {
		this.launchURL();
		login.LoginValidation();
		this.initiateObject();
		SoftAssert softassert_hm=new SoftAssert();
		softassert_hm.assertTrue(homePage.companiesButtonIsDisplay(), "Button is not displayed");
		softassert_hm.assertAll();
		log.info("Companies button validation successful");
		
	}
	@Test(priority=2)
	public void buttonsPresentValidation() {
		this.initiateObject();
		homePage.moveToCompaniesButton();
		Assert.assertTrue(homePage.newCompanyButtonIsDisplay(), "New companies button is not present");
		Assert.assertTrue(homePage.combinedFormButtonIsDisplay(), "CombinedFrom button is not display");
		Assert.assertTrue(homePage.fullSearchFormButtonIsDisplay(), "full search button is not displayed");
		log.info("All buttons are persent in Webpage");
	
	}
	@Test(priority=3)
	public void CombinedButtonClickValidation() {
		this.initiateObject();
		CombinedPage_PageObject combined=homePage.clickCombinedButtonValidation();
		Assert.assertEquals(combined.pageTitle(), "CRMPRO");
		log.info("Combined button successfully click");
	}
	
}
