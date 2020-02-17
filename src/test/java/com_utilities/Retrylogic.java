package com_utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retrylogic implements IRetryAnalyzer {
	int count=0;
	int retry=3;

	public boolean retry(ITestResult arg0) {
		if(count<retry) {
			count++;
			return true;
		}
		return false;
		
	}

}
