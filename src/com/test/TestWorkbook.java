package com.test;

import java.io.IOException;
import java.io.OutputStream;


import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class TestWorkbook {
		public static void main(String[] args) throws IOException {
			
			HSSFWorkbook w = new HSSFWorkbook();
			HSSFSheet s1 = w.createSheet();
			HSSFRow c1 = s1.createRow(0);
			
			c1.createCell(0).setCellValue("鹅鹅鹅");
			String filename = "eee.xls";
			
			OutputStream os = new OutputStream() {
				
				@Override
				public void write(int b) throws IOException {
					// TODO Auto-generated method stub
					
				}
			};
			
			w.write(os);
	
			os.close();
		}
}
