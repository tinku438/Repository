package com.itpeople.qa.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.itpeople.qa.base.BaseTest;

public class LandingPage extends BaseTest{
	
	
	public LandingPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Log in')]")
	WebElement  loginLink;
	
	@FindBy(xpath="//input[@id='loginid']")
	WebElement loginidText;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement passwordText;
	
	@FindBy(xpath="//div[@class='password-login']/div[2]/button")
	WebElement loginButton;
	
	
	
	public LoginPage AppLogin() {
		
		loginLink.click();
		
		return new LoginPage();
	}
	
	
	
	public void loginApp(String loginid, String password) {
		 loginidText.sendKeys(loginid);
		 passwordText.sendKeys(password);
		 loginButton.click();
		
	}

}
