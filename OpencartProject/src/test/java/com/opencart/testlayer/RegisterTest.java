package com.opencart.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

//import com.opencart.pagelayer.Homepage;
//import com.opencart.pagelayer.RegisterPage;
//import com.opencart.utility.CommonComp;
import com.opencart.testbase.Testbase;

public class RegisterTest extends Testbase {
	
//	@Test
//	public void validateRegisteringAccountByProvidingValidAccountdetails()
//	{
//		String expected_result = "Your Account Has Been Created!";
//		Homepage homepage_obj = new Homepage(driver);
//		RegisterPage registerpage_obj = new RegisterPage(driver);
//		
//		homepage_obj.clickOnMyAccountLink();
//		homepage_obj.clickOnRegisterLink();
//		
//		registerpage_obj.enterFirstName("Sachin");
//		registerpage_obj.lastName("Tendulkar");
//		registerpage_obj.enterEmail("Sachin45@gmail.com");
//		registerpage_obj.enterTelephoneno("7899987678");
//		registerpage_obj.enterPassword("Sachin@123");
//		registerpage_obj.enterConfirmPassword("Sachin@123");
//		registerpage_obj.clickOnPrivacyPolicyCheckbox();
//		registerpage_obj.clickOnContinueButton();
//		
//		String actual_result = driver.getTitle();
//		System.out.println(actual_result);
//		
//		Assert.assertEquals(actual_result, expected_result);
//	}
	
	
	@Test
	public void validateRegisteringAccountByProvidingValidAccountdetails()
	{
		String expected_result = "Your Account Has Been Created!";
		
		homepage_obj.clickOnMyAccountLink();
		homepage_obj.clickOnRegisterLink();
		logger.info("on register page");
		
		int row = 5;
		
		registerpage_obj.enterFirstName(excel_obj.readData("RegisterData", row, 1));
		registerpage_obj.lastName(excel_obj.readData("RegisterData", row, 2));
		registerpage_obj.enterEmail(excel_obj.readData("RegisterData", row, 3));
		registerpage_obj.enterTelephoneno(excel_obj.readData("RegisterData", row, 4));
		registerpage_obj.enterPassword(excel_obj.readData("RegisterData", row, 5));
		registerpage_obj.enterConfirmPassword(excel_obj.readData("RegisterData", row, 6));
		registerpage_obj.clickOnPrivacyPolicyCheckbox();
		registerpage_obj.clickOnContinueButton();
		logger.info("account details entered");
		
		String actual_result = driver.getTitle();
		System.out.println(actual_result);
		
		Assert.assertEquals(actual_result, expected_result);
	}
	
	
	@Test
	public void validateRegisteringAccountByProvidingExistingAccountdetails()
	{
		String expected_result = "Warning: E-Mail Address is already registered!";
//		Homepage homepage_obj = new Homepage(driver);
//		RegisterPage registerpage_obj = new RegisterPage(driver);
//		CommonComp common_obj = new CommonComp(driver);
		
		homepage_obj.clickOnMyAccountLink();
		homepage_obj.clickOnRegisterLink();
		
		registerpage_obj.enterFirstName("Sachin");
		registerpage_obj.lastName("Tendulkar");
		registerpage_obj.enterEmail("Sachin45@gmail.com");
		registerpage_obj.enterTelephoneno("7899987678");
		registerpage_obj.enterPassword("Sachin@123");
		registerpage_obj.enterConfirmPassword("Sachin@123");
		registerpage_obj.clickOnPrivacyPolicyCheckbox();
		registerpage_obj.clickOnContinueButton();
		
		String actual_result = common_obj.getErrorMessage();
		System.out.println(actual_result);
		
		Assert.assertEquals(actual_result, expected_result);
	}
	

}
