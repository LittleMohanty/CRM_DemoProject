package com_TestCase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com_utilities.GenericMethods;
import com_utilities.Recofig_Properties;
import com_utilities.Screenshot;

public class BaseClass {
	
	Recofig_Properties read = new Recofig_Properties();
	public static Logger log;
	
	public static WebDriver driver;
	private String url = read.browerUrl();

	@BeforeClass
	public void Setup() throws Exception {
		String browser = System.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}else {
			throw new Exception("Invalid Browser.. Please enter chrome");
		}
		log=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
		
		

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public void launchURL() {
		driver.get(url);
		log.info("closing the browser");
		

	}
	
	

}
