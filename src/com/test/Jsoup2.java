package com.test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Jsoup2 {
		public static void main(String[] args) throws ScriptException, MalformedURLException, IOException {
			String url = "https://s.taobao.com/search?spm=a230r.1.14.102.7d9b5921fpY2Ke&type=samestyle&app=i2i&rec_type=1&uniqpid=-1625884826&nid=576656835664";
			Document doc = Jsoup.parse(new URL(url), 30000);
			System.out.println(doc);
			// 取得所有的script tag
			Elements eles = doc.getElementsByTag("script");
			for (Element ele : eles) {

				// 檢查是否有detailInfoObject字串
				String script = ele.toString();
				if (script.indexOf("detailInfoObject") > -1) {

					// 只取得script的內容
					script = ele.childNode(0).toString();

					// 使用ScriptEngine來parse
					ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
					engine.eval(script);

					// 取得你要的變數
					Object obj = engine.get("detailInfoObject");
					System.out.println("detailInfoObject = " + obj);

					// 將obj轉成Json物件
					JSONObject json = JSONObject.fromObject(obj);
					System.out.println("json = " + json);

					// 取得欄位
					System.out.println("destInfo = " + json.get("destInfo"));

					// 取得欄位(array type)
					JSONArray scans = json.getJSONArray("scans");
					for (int i = 0, max = scans.size(); i < max; i++) {
						JSONObject child = (JSONObject) scans.get(i);
						System.out.println("scans[" + i + "] = " + child);
					}

				}
			}
		}
}
