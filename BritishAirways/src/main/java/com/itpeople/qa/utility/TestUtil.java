package com.itpeople.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.itpeople.qa.base.BaseTest;

public class TestUtil extends BaseTest {

	public static long PAGE_LOAD_WAIT = 20;
	public static long IMPLICIT_WAIT = 20;

	public TestUtil() {
		super();
		PageFactory.initElements(driver, this);
	}

	public static File file;
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	public static XSSFRow row;

	public ArrayList<String> excelReader(String path, String sheetName) throws IOException {

		file = new File(path);

		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);

		return null;
	}

	public String getData(String sheetName, int rowNum, int colNum) {

		
		  /*int rowCount = sheet.getLastRowNum(); 
		  int cellCount = sheet.getRow(0).getLastCellNum();*/
		 
		sheet = workbook.getSheet(sheetName);

		cell = sheet.getRow(rowNum).getCell(colNum);

		return null;

	}

	

	public void screenShot() throws IOException {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("");
		FileUtils.copyFile(source, dest);

	}

}
