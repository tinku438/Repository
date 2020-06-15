package com.flipkart.qa.pageObjects;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.flipkart.qa.base.BaseTest;

public class SearchResultPage extends BaseTest{
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//a[contains(text(),'Apple iPhone 7 Plus (Black, 32 GB)')]")
	WebElement selectiphone;
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement addCartbtn;
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")
	WebElement buynowBtn;
	
	
	
	@FindBy (xpath="//*[@class='_3wU53n'][contains(text(), 'Apple MacBook Air Core i5 5th Gen')]")
	WebElement selectMacBook;
	
	
	@FindBy(xpath="//*[@class='_3wU53n'][contains(text(), 'Apple Watch Series 3 GPS - 42 mm')]")
	WebElement SelectWatch;
	

	
	public HomePage selectItem1() {
		selectiphone.click();
		
		Set<String> Windows = driver.getWindowHandles();
		Iterator<String> i1= Windows.iterator();
		
		String pWindow = i1.next();
		String cWindow = i1.next();
		
	
			
			driver.switchTo().window(cWindow);
			addCartbtn.isDisplayed();
			addCartbtn.click();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			buynowBtn.isDisplayed();
			driver.switchTo().window(pWindow);
			
			driver.switchTo().window(cWindow);
			driver.close();
			driver.switchTo().window(pWindow);
		
		return new HomePage();
	
	}
	
	
	public HomePage selectItem2() {
		selectMacBook.click();
		
		Set<String> Windows = driver.getWindowHandles();
		Iterator<String> i2= Windows.iterator();
		
		String pWindow = i2.next();
		String cWindow = i2.next();
		
	
			
			driver.switchTo().window(cWindow);
			addCartbtn.isDisplayed();
			addCartbtn.click();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			buynowBtn.isDisplayed();
			driver.switchTo().window(pWindow);
			
			driver.switchTo().window(cWindow);
			driver.close();
			driver.switchTo().window(pWindow);
		
		return new HomePage();
	
	}
	
	public HomePage selectItem3() {
		SelectWatch.click();
		
		Set<String> Windows = driver.getWindowHandles();
		Iterator<String> i3= Windows.iterator();
		
		String pWindow = i3.next();
		String cWindow = i3.next();
		
	
			
			driver.switchTo().window(cWindow);
			addCartbtn.isDisplayed();
			addCartbtn.click();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			buynowBtn.isDisplayed();
			driver.switchTo().window(pWindow);
			
			driver.switchTo().window(cWindow);
			driver.close();
			driver.switchTo().window(pWindow);
		
		return new HomePage();
	
	}
	
	
	
	
}
