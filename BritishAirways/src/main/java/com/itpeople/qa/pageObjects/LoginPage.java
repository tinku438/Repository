package com.itpeople.qa.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.itpeople.qa.base.BaseTest;

public class LoginPage extends BaseTest{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Join the Executive Club')]")
	WebElement jointheClubLink;
	
	
	
	
	public RegistrationPage register() {
		
		jointheClubLink.click();
		
		return new RegistrationPage();
	}

}
