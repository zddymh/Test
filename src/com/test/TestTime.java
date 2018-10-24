package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTime {
		public static void main(String[] args) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			Date date = new Date();
			String date1 = sdf.format(date);
			System.out.println(date1);
		}
}
