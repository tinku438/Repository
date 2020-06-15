package com.itpeople.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.itpeople.qa.base.BaseTest;

public class ReadExcelFile extends BaseTest {

	public static File file;
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;

	public static XSSFRow row;

	public ArrayList<String> getData(String sheetName, String testCase) throws IOException {

		ArrayList<String> al = new ArrayList<String>();

		int column = 0;

		File file = new File("C:\\Users\\Sagar Tinku\\Desktop\\Testing Tools\\Java\\WorkSpace\\BritishAirways\\src\\main\\java\\com\\itpeople\\qa\\testdata\\ITpeople_TestData.xlsx");

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheets = workbook.getNumberOfSheets();

		System.out.println(sheets);

		for (int i = 0; i < sheets; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {

				XSSFSheet sheet = workbook.getSheetAt(i);

				Iterator<Row> row = sheet.iterator();

				while (row.hasNext()) {

					Row r = row.next();

					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testCase)) {

						Iterator<Cell> cell = r.cellIterator();

						while (cell.hasNext()) {

							Cell cValue = cell.next();

							al.add(cValue.getStringCellValue());
						}
					}
				}
			}
		}

		return al;

	}

}
