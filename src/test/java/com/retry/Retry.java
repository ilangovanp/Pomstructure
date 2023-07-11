package com.retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	  private int counter =0;
	  private int maxtry=2;
	
	public boolean retry(ITestResult result) {
		
		if(counter<maxtry) {
			counter++;
			return true;
			
		}
		
		return false;
	}

}
