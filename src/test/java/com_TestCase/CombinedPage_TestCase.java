package com_TestCase;

import org.testng.annotations.Test;

import com_PageObject.CombinedPage_PageObject;

public class CombinedPage_TestCase extends BaseClass {
	CombinedPage_PageObject combined;
	HomePage_TestCase home = new HomePage_TestCase();

	public void initcombinedElement() {
		combined = new CombinedPage_PageObject(driver);
	}

	@Test
	public void backButtonValidation() {
		home.companiesButtonPresentValidation();
		home.buttonsPresentValidation();
		home.CombinedButtonClickValidation();
		this.initcombinedElement();
		combined.backButtonClick();
		log.info("Back button click successfully");
	}
}
