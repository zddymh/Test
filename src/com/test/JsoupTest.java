package com.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class JsoupTest {
			
	
			public static void main(String[] args) {
				
				
				try
				{
					Document document = Jsoup.connect("https://s.taobao.com/search?spm=a230r.1.14.102.7d9b5921fpY2Ke&type=samestyle&app=i2i&rec_type=1&uniqpid=-1625884826&nid=576656835664").get();
					System.out.println(document.toString());
//					String wtf = SpliderUtil.giveReptiles("https://s.taobao.com/search?spm=a230r.1.14.102.7d9b5921fpY2Ke&type=samestyle&app=i2i&rec_type=1&uniqpid=-1625884826&nid=576656835664");
//					String[] split = wtf.split("<a>");
//					System.out.println(split[0]);
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
//*************************************************************************************************************************************			
}
