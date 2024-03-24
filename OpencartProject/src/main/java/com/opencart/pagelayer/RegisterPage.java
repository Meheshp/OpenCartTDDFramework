package com.opencart.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	
	private WebDriver driver;
	
	public RegisterPage(WebDriver d)
	{
		driver = d ;
	}
	
	//----------- Obj repo --------------------
	private By firstname_txtbox = By.xpath("//input[@id='input-firstname']");
	private By lastname_txtbox = By.xpath("//input[@id='input-lastname']");
	private By email_txtbox = By.xpath("//input[@id='input-email']");
	private By telephone_txtbox = By.xpath("//input[@id='input-telephone']");
	private By password_txtbox = By.xpath("//input[@id='input-password']");
	private By confirm_password_txtbox = By.xpath("//input[@id='input-confirm']");
	private By privacy_policy_checkbox = By.xpath("//input[@name='agree']");
	private By continue_btn = By.xpath("//input[@value='Continue']");


	//--------- Action methods ----------------
	
	public void enterFirstName(String firstname) 
	{
		driver.findElement(firstname_txtbox).sendKeys(firstname);
	}
	public void lastName(String lastName) 
	{
		driver.findElement(lastname_txtbox).sendKeys(lastName);
	}
	public void enterEmail(String email) 
	{
		driver.findElement(email_txtbox).sendKeys(email);
	}
	public void enterTelephoneno(String telephoneno) 
	{
		driver.findElement(telephone_txtbox).sendKeys(telephoneno);
	}
	public void enterPassword(String password) 
	{
		driver.findElement(password_txtbox).sendKeys(password);
	}
	public void enterConfirmPassword(String confirmpassword) 
	{
		driver.findElement(confirm_password_txtbox).sendKeys(confirmpassword);
	}
	public void clickOnPrivacyPolicyCheckbox( ) 
	{
		WebElement checkbox = driver.findElement(privacy_policy_checkbox);
			checkbox.click();
	}
	public void clickOnContinueButton( ) 
	{
		driver.findElement(continue_btn).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
