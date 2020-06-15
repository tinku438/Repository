package com.itpeople.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.itpeople.qa.utility.TestUtil;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseTest() {
		super();
	}
	
	
	public void initializeBrowser() {
		
		try {
			
			File file = new File ("C:\\Users\\Sagar Tinku\\Desktop\\Testing Tools\\Java\\WorkSpace\\BritishAirways\\src\\main\\java\\com\\itpeople\\qa\\properties\\config.properties");
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
			
		} catch (FileNotFoundException e ) {
			
			e.printStackTrace();
		} catch (IOException e ) {
			e.printStackTrace();
		}
		
		String browserName  = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sagar Tinku\\Desktop\\Testing Tools\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
		} else if (browserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sagar Tinku\\Desktop\\Testing Tools\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);	
		
		driver.get(prop.getProperty("url"));
		
	}

}
