package com.test;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;





public class httpTest {
			public static void main(String[] args) throws Exception {
				
				
				String a = " https://s.taobao.com/search?q=%E8%A1%AC%E8%A1%A3&imgfile=&commend=all&ssid=s5-e&search_type=item&sourceId=tb.index&spm=a21bo.2017.201856-taobao-item.1&ie=utf8&initiative_id=tbindexz_20170306";
				
				URL b = new URL(a);
				
				URLConnection c = b.openConnection();
				c.setRequestProperty("accept", "*/*");
				c.setRequestProperty("connection", "Keep-Alive");
				c.setRequestProperty("user-agent",
	                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
				c.setRequestProperty("Cookie", "5075cab8-e4d3-4fba-b59a-2596cfa0dab9");
				c.connect();
			 	Map<String, List<String>> map = c.getHeaderFields();
			 	for (String key : map.keySet()) {
	                System.out.println(key + "--->" + map.get(key));
	            }	  
			 	
			 	CloseableHttpClient h = null;
			 	
			}
}
