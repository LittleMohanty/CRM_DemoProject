package com_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public static WebDriver driver;

	public Screenshot(WebDriver driver) {
		this.driver = driver;
	}

	public  static  void failedScreenShot(String testname) {
	try {
		TakesScreenshot srnShot = ((TakesScreenshot) driver);
		File srcFile = srnShot.getScreenshotAs(OutputType.FILE);
		File file=new File(System.getProperty("user.dir")+ "\\ScreenShot\\"+testname+".png");
		FileUtils.copyFile(srcFile, file);
	} catch (Exception e) {
		System.out.println(e.getMessage());
		
	}
	}

}
