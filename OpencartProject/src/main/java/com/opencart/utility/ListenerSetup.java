package com.opencart.utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetup implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		UtilClass.getPageScreenshot(result.getName());
		System.out.println("Test Execution Started :- " + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		UtilClass.getPageScreenshot(result.getName());
		System.out.println("Test Execution Completed :- " + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Execution Failed :- " + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Execution Skipped :- " + result.getName());

	}

	
}
