package com.flipkart.qa.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.flipkart.qa.base.BaseTest;

public class HomePage extends BaseTest{
	
	public static WebDriverWait wait;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='LM6RPg'][@name='q']")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@class='vh79eN']")
	WebElement searchBtn;
	
	@FindBy(xpath="//img[@class='_1e_EAo']")
	WebElement logoflipKart;
	
	
	
	public void verifyTitle() {
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!");
	}
	
	
	
	public void searchitem1() {

		wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeSelected(logoflipKart));
		Boolean flag  = logoflipKart.isDisplayed();
		Assert.assertTrue(flag);
		logoflipKart.click();
		
		searchBox.click();
		searchBox.clear();
		searchBox.sendKeys(prop.getProperty("item1"));
		
		searchBtn.click();
	}
	
	
	
	public void searchitem2() {
		searchBox.click();
		searchBox.clear();
		searchBox.sendKeys(prop.getProperty("item2"));
		
		searchBtn.click();
	}
	
	
	
	
	public void searchitem3() {
		searchBox.click();
		searchBox.clear();
		searchBox.sendKeys(prop.getProperty("item3"));
		
		searchBtn.click();
	}
	
	
	
	
	
	
	
	
	

}
