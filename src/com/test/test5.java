package com.test;

import java.util.ArrayList;

public class test5 {
	
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("a");
		arr.add("b");
		arr.add("c");
		arr.add("d");
		arr.add("a");
		arr.add("f");
		arr.add("w");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
