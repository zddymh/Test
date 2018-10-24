package com.test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test10_9 {
		public static void main(String[] args) {
			String a = "1,2,3,4,5,6,7,8,9,10";
			String collect = Arrays.stream(a.split(",")).map(x->"数字"+x+"***\n").collect(Collectors.joining());
			System.out.println(collect);
			
			
		}
}
