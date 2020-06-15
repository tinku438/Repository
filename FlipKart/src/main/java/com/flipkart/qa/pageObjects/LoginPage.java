package com.flipkart.qa.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.flipkart.qa.base.BaseTest;

public class LoginPage extends BaseTest{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	WebElement emailText;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	WebElement pwordText;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement loginBtn;
	
	
	@FindBy(xpath="//*[@class='_14jSvk']")
	WebElement myprofileLink;
	
	@FindBy(linkText="Logout")  //xpath="//*[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[10]/a")
	WebElement logoutLink;
	
	@FindBy(linkText="Cart")   //xpath="//body/div/div/div/div/div[2]/div[5]")
	WebElement myCartLink;
	
	
	public HomePage loginApp(String email, String password) {
		
		emailText.sendKeys(email);
		pwordText.sendKeys(password);
		loginBtn.click();
		
		return new HomePage();
	}
	
	public void logoutApp() {
		
		Actions action = new Actions(driver);
		
		action.moveToElement(myprofileLink);
		action.click().perform();
		//myprofileLink.click();
		
		logoutLink.click();
	}
	
	public void myCart() {
		Boolean flag = myCartLink.isDisplayed();
		Assert.assertTrue(flag);
		myCartLink.click();
	}
	

}
