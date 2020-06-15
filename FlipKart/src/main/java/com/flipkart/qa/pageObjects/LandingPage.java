package com.flipkart.qa.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.BaseTest;

public class LandingPage extends BaseTest{
	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}

	
	
	
	@FindBy(xpath="//div[@class='_3Njdz7']/button")
	WebElement closePopup;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement loginLink;
	
	public void closeAlert() {
		closePopup.click();
	}
	
	public LoginPage loginlnk() {
		loginLink.click();
		return new LoginPage();
	}
	
}
