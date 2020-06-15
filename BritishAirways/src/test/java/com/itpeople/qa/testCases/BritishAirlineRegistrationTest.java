package com.itpeople.qa.testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itpeople.qa.base.BaseTest;
import com.itpeople.qa.pageObjects.LandingPage;
import com.itpeople.qa.pageObjects.LoginPage;
import com.itpeople.qa.pageObjects.RegistrationPage;
import com.itpeople.qa.utility.ReadExcelFile;
import com.itpeople.qa.utility.TestUtil;

public class BritishAirlineRegistrationTest extends BaseTest {

	public static LandingPage landingPage;
	public static LoginPage loginPage;
	public static RegistrationPage regPage;

	public BritishAirlineRegistrationTest() {
		super();
	}

	@BeforeMethod
	public void launchApp() {

		initializeBrowser();

	}

	
	@Test
	public void regiTest() throws IOException {
		
		landingPage = new LandingPage();
		loginPage = new LoginPage();
		regPage = new RegistrationPage();
		
		
		landingPage.AppLogin();
		loginPage.register();
		
		ReadExcelFile testData = new ReadExcelFile();
		
		ArrayList<String> data = testData.getData("BritishAirways", "TestCase1");
		
		regPage.registration(data.get(1), data.get(2),data.get(3), data.get(4),data.get(5), data.get(6),data.get(7), data.get(8),
				data.get(9), data.get(10),data.get(11), data.get(12),data.get(13), data.get(14));
		
	}
	
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}



}
