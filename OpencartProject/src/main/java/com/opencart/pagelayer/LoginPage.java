package com.opencart.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver d)
	{
		driver =d;
	}
	
	
	//______________Obj report_________________________
	
	
	private By email_textbox =By.xpath("//input[@id='input-email']");
	private By password_textbox = By.xpath("//input[@id='input-password']");
	private By login_button = By.xpath("//input[@value='Login']");
	

	//_____________ Action methods_____________________________
	
	public void enterEmailAdress(String email)
	{
		driver.findElement(email_textbox).sendKeys(email);
	}
	public void enterPassword(String password)
	{
		driver.findElement(password_textbox).sendKeys(password);
	}
	public void clickOnLoginButton()
	{
		driver.findElement(login_button).click();
	}
}
