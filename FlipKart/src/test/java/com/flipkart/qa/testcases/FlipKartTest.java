package com.flipkart.qa.testcases;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.qa.base.BaseTest;
import com.flipkart.qa.pageObjects.HomePage;
import com.flipkart.qa.pageObjects.LandingPage;
import com.flipkart.qa.pageObjects.LoginPage;
import com.flipkart.qa.pageObjects.SearchResultPage;

public class FlipKartTest extends BaseTest {

	public FlipKartTest() {
		super();

	}
	
	public static WebDriverWait wait;

	public static LoginPage loginPage;
	public static LandingPage landingPage;
	public static HomePage homePage;
	public static SearchResultPage searchPage;

	@BeforeTest
	public void startApp() {
		initializeBrowser();
	
	}

	@Test
	public void FlipkartTest() {

		landingPage = new LandingPage();
		loginPage = new LoginPage();
		homePage = new HomePage();
		searchPage = new SearchResultPage();
		
		
		landingPage.closeAlert();		
		landingPage.loginlnk();
		loginPage.loginApp(prop.getProperty("username"), prop.getProperty("password"));
				
		homePage.searchitem1();		
		searchPage.selectItem1();
		loginPage.myCart();
		
	
		homePage.searchitem2();		
		searchPage.selectItem2();
		loginPage.myCart();
				
		homePage.searchitem3();		
		searchPage.selectItem3();
		loginPage.myCart();

		
		loginPage.logoutApp();

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
