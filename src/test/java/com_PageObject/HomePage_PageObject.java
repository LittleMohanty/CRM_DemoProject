package com_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_utilities.GenericMethods;

public class HomePage_PageObject extends GenericMethods {
	
	//WebDriver driver;
	@FindBy(xpath="//a[text()='Companies']")
	WebElement CompaniesButton;
	@FindBy(xpath="//a[@title='New Company']")
	WebElement newCompanyButton;
	@FindBy (xpath="//*[text()='Combined Form'][1]")
	WebElement combinedFormButton;
	@FindBy(xpath="//*[text()='Full Search Form'][1]")
	WebElement fullSearchForm;

	public HomePage_PageObject(WebDriver driver) {
		super(driver);
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getPageTitle() {
		return driver.getTitle();

	}
	public boolean companiesButtonIsDisplay() {
		driver.switchTo().frame("mainpanel");
		boolean result=CompaniesButton.isDisplayed();
		driver.switchTo().defaultContent();
		return result;
	}
	public boolean newCompanyButtonIsDisplay() {
		boolean result1=newCompanyButton.isDisplayed();
		return result1;
	}
	public boolean combinedFormButtonIsDisplay() {
		boolean result2=combinedFormButton.isDisplayed();
		return result2;
	}
	public boolean fullSearchFormButtonIsDisplay() {
		boolean result3=fullSearchForm.isDisplayed();
		return result3;
	}
	public void moveToCompaniesButton() {
		driver.switchTo().frame("mainpanel");
		this.HandleMouseOver(CompaniesButton);
		
	}
	public CombinedPage_PageObject clickCombinedButtonValidation() {
		combinedFormButton.click();
		return new CombinedPage_PageObject(this.driver);
		
	}
	

}
