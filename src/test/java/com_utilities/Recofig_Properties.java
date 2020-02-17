package com_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Recofig_Properties {
	Properties prop;

	public Recofig_Properties() {
		try {
			prop = new Properties();
			File file = new File("./Configurations//Cofig.properties");
			FileInputStream str = new FileInputStream(file);
			prop.load(str);
		} catch (Exception e) {
			System.out.println("error is" + e.getMessage());
		}
	}

	public String browerUrl() {
		String url = prop.getProperty("url");
		return url;
	}

	public String username() {
		String user = prop.getProperty("username");
		return user;
	}

	public String password() {
		String pass = prop.getProperty("password");
		return pass;
	}

	public String browser() {
		String browser = prop.getProperty("chrome");
		return browser;
	}

}
