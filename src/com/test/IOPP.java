package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IOPP {
		public static void main(String[] args) throws Exception {
			File file = new File("C:\\Users\\EDZ\\Desktop\\品牌.xlsx");
			InputStream fileInputStream = new FileInputStream(file);
			XSSFWorkbook excel = new XSSFWorkbook(fileInputStream);
			// 循环工作表Sheet
			for (int numSheet = 0; numSheet < excel.getNumberOfSheets(); numSheet++) {
				XSSFSheet sheet = excel.getSheetAt(numSheet);
				String sheetName = excel.getSheetName(numSheet);
				// System.out.println(sheetName);
				if ("品牌".equals(sheetName)) {
					// 获取每一行
					for (int rowNum = 1; rowNum < sheet.getLastRowNum(); rowNum++) {
						XSSFRow row = sheet.getRow(rowNum);
						// 获取品牌信息
						XSSFCell XSSFCellSchoolOrderNo = row.getCell(0);
						String BrandName = XSSFCellSchoolOrderNo.getStringCellValue();
						System.out.println(BrandName);
						
					}
				}
			}
	}
		
		
}
