package com.test;

public class Test2 {
		public static void main(String[] args) {
			for (int a = 0; a < args.length; a++) {
			try {
				System.out.println("dddd");
				int i = 0;
				System.out.println(i);
				for (int j = 0; j < args.length; j++) {
					System.out.println(j);
					System.out.println(5/i);
					System.out.println(j);
				}
			} catch (Exception e) {
				System.out.println("dddddddddddddd");
			}
		}
}
}