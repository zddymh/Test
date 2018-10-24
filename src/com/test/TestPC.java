package com.test;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

public class TestPC {
		public static void main(String[] args) throws IOException {
			wtf("","");
		}
		
		
		@SuppressWarnings("null")
		public static void wtf(String jdurl,String brandName) throws IOException {
			 jdurl="https://s.taobao.com/search?spm=a230r.1.14.102.7d9b5921fpY2Ke&type=samestyle&app=i2i&rec_type=1&uniqpid=-1625884826&nid=576656835664";
			URL u = new URL(jdurl);
			URLConnection a = u.openConnection();
			String string = a.getInputStream().toString();
			System.out.println(string);
		}
}
