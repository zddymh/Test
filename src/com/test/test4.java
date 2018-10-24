package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test4{
					
    public static void main(String[] args){
    Date d=new Date();
    SimpleDateFormat s=new SimpleDateFormat("yyyy年MM月dd日");
    System.out.println(s.format(d));
    while(s.format(d).equals("2018年08月22日")){
    System.out.print("国庆快乐");
    break;
  }
  }
    
  
    
    
}