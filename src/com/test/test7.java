package com.test;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class test7 {
			public static void main(String[] args) {
				String a = "http://imgservicesit.cnsuning.com/oss_xzsit_01/b2c/imagesit/PTObsMiBFEN-GyJ5pvJiIw==.jpg_800w_800h_4e";
				
				String[] split = a.split("/");
				String s1 = "";
				for (int j = 0; j < split.length; j++) {
					if(j==split.length-1){
						s1+=split[j];
					}
					
				}
				System.out.println(s1);
				s1="";
				System.out.println("s1"+s1);
				
				
				downloadPicture(a,"c:\\xixixixxi\\aaa.jpg");
				
				System.out.println("***************************************");
			}
			
	
	
			private static void downloadPicture(String urlList, String path) {
				URL url = null;
				try {
					url = new URL(urlList);
					DataInputStream dataInputStream = new DataInputStream(url.openStream());

					FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
					ByteArrayOutputStream output = new ByteArrayOutputStream();

					byte[] buffer = new byte[1024];
					int length;

					while ((length = dataInputStream.read(buffer)) != -1) {
						output.write(buffer, 0, length);
						
					}
					fileOutputStream.write(output.toByteArray());
					output.flush();
					dataInputStream.close();
					fileOutputStream.close();
				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	
}
