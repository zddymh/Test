package com.test;

public class TestForLambda {
			
		
		public static void main(String[] args) {
			
			LambdaTestInterface lmd =() -> {System.out.println("wtf");
			return null;};
			
			lmd.getList();
			Lambda3 add=(int x,int y)->x+y;
			Lambda3 add2=(int x,int y)->x-y;
			int num2 = add2.num(1, 4);
			System.out.println(num2);
			
			Lambda3 l3 = (int x,int y)->x*y;
			
			System.out.println(l3.num(6, 7));
		}
//*************************************************************************************************************
		public void say(){
			System.out.println("**************************");
		}
		
}
