package com_utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GenericMethods {
	public WebDriver driver;

	public GenericMethods(WebDriver driver) {
		this.driver = driver;
	}

	public void HandleMouseOver(WebElement element) {
		Actions action = new Actions(driver);
		Action mouseOver = action.moveToElement(element).build();
		mouseOver.perform();
	}

}
