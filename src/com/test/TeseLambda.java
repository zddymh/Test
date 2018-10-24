package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TeseLambda {

	public static void test(){
		
		Properties pro = new Properties();
		
		InputStream resourceAsStream = TeseLambda.class.getResourceAsStream("suNing.properties");
		
		try {
			pro.load(resourceAsStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(pro.getProperty("appKey"));
		
	}
	
	public static void main(String[] args) {
			test();
	}
	
}
