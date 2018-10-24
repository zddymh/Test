package com.test;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {
		public static void main(String[] args) {
			/*String url = "http://img13.360buyimg.com/n8/g8/M03/0E/06/rBEHaFCg5wQIAAAAAAGhG73oiLUAACxswH4MBwAAaEz619.jpg";
	        String path="c:/test/pic.jpg";
	        downloadPicture(url,path);
			String[] split = url.split("\\.");
			System.out.println(split[0]);*/
				
			
			File myPath = new File("c:\\1304");
			 if (!myPath.exists()){//若此目录不存在，则创建之// 这个东西只能简历一级文件夹，两级是无法建立的。。。。。
		           myPath.mkdir();
		           System.out.println("成功了");
			 }
			
			
		}
		private static void downloadPicture(String urlList,String path) {
	        URL url = null;
	        try {
	            url = new URL(urlList);
	            DataInputStream dataInputStream = new DataInputStream(url.openStream());
	 
	            FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
	            ByteArrayOutputStream output = new ByteArrayOutputStream();
	 
	            byte[] buffer = new byte[1024];
	            int length;
	 
	            while ((length = dataInputStream.read(buffer)) > 0) {
	                output.write(buffer, 0, length);
	            }
	            fileOutputStream.write(output.toByteArray());
	            dataInputStream.close();
	            fileOutputStream.close();
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	      }
		}