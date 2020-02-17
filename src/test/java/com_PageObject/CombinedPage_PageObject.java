package com_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CombinedPage_PageObject {
	WebDriver driver;

	public CombinedPage_PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String pageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void backButtonClick() {
		driver.navigate().back();
	}
}
