package com.itpeople.qa.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.itpeople.qa.base.BaseTest;

public class RegistrationPage extends BaseTest {
	
	
	
	public RegistrationPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailText;
	
	@FindBy(xpath="//input[@id='confirm-email']")
	WebElement cnfEmailText;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement passwordText;
	
	@FindBy(xpath="//select[@id='title']")
	WebElement sTitle;
	
	@FindBy(xpath="//input[@id='confirm-password']")
	WebElement cnfPasswordText;
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement firstNameText;
	
	@FindBy(xpath="//input[@id='family-name']")
	WebElement lastNameText;
	
	
	@FindBy(xpath="//input[@id='homeaddress1']")
	WebElement address1Text;
	
	@FindBy(xpath="//input[@id='homeaddress2']")
	WebElement address2Text;
	
	@FindBy(xpath="//input[@id='homeaddress3']")
	WebElement address3Text;
	
	@FindBy(xpath="//input[@id='homecity']")
	WebElement cityText;
	
	@FindBy(xpath="//input[@id='homestate']")
	WebElement countryText;
	
	@FindBy(xpath="//input[@id='homepostalcode']")
	WebElement pincodeText;
	
	@FindBy(xpath="//select[@id='homecountryname']")
	WebElement sCountry;
	
	@FindBy(xpath="//select[@id='mobilecountrycode']")
	WebElement sRegion;
	
	@FindBy(xpath="//input[@id='mobilephone']")
	WebElement mobileNumberText;
	
	
	@FindBy(xpath="//select[@id='birthday']")
	WebElement sDay;
	
	@FindBy(xpath="//select[@id='birthmonth']")
	WebElement sMonth;
	
	@FindBy(xpath="//select[@id='birthyear']")
	WebElement sYear;
	
	@FindBy(xpath="//span[contains(text(),'Male')]")
	WebElement radioMale;
	
	@FindBy(xpath="//span[contains(text(),'Female')]")
	WebElement radioFemale;
	
	@FindBy(xpath="//select[@id='pref_language']")
	WebElement sLanguage;
	
	@FindBy(xpath="//select[@id='flexPreferenceQuestionId20']")
	WebElement sDepartureCity;
	
	
	@FindBy(xpath="//strong[contains(text(), 'send me news')]")
	WebElement checkBox1;
	

	@FindBy(xpath="//strong[contains(text(), 'Share my information')]")
	WebElement checkBox2;
	
	@FindBy(xpath="//input[@id='CampaignCode']")
	WebElement codeEnterText;
	
	@FindBy(xpath="//span[contains(text(),' as notified on the website')]")
	WebElement checkBoxTerms;
	
	@FindBy(xpath="//input[@id='submitButton']")
	WebElement joinNowBtn;
	
	
	
	public void registration(String email, String cnfEmail, String password, String cnfPassword, String firstName, String lastName,
			String address1, String address2, String address3, String city, String state, String postalCode, String mobileNum, String promoCode) {
		
		
		emailText.sendKeys(email);
		cnfEmailText.sendKeys(cnfEmail);
		passwordText.sendKeys(password);
		cnfPasswordText.sendKeys(cnfPassword);
		
		Select s_Title = new Select(sTitle);
		s_Title.selectByVisibleText("Mr");
		
		firstNameText.sendKeys(firstName);
		lastNameText.sendKeys(lastName);
		
		
		address1Text.sendKeys(address1);
		address2Text.sendKeys(address2);
		address3Text.sendKeys(address3);
		cityText.sendKeys(city);
		countryText.sendKeys(state);
		pincodeText.sendKeys(postalCode);
		
		Select s_Country = new Select(sCountry);
		s_Country.selectByVisibleText("India");
		
		Select s_Region = new Select(sRegion);
		s_Region.selectByVisibleText("India");
		
		mobileNumberText.sendKeys(mobileNum);
		
		Select s_Day = new Select(sDay);
		s_Day.selectByValue("01");
		
		Select s_Month = new Select(sMonth);
		s_Month.selectByValue("01");
		
		Select s_Year = new Select(sYear);
		s_Year.selectByValue("1990");
		
		radioMale.click();
		
		Select s_Language = new Select(sLanguage);
		s_Language.selectByValue("EN");
		
		Select s_DepartureCity = new Select(sDepartureCity);
		s_DepartureCity.selectByValue("MSP");
		

		codeEnterText.sendKeys(promoCode);
		
		
	}
	
		public void OfferSelect() {
			
			checkBox1.click();		
			checkBox2.click();
		}
		
		
		
		public void joinNow() {
			joinNowBtn.click();
		}
		
	
	

}
