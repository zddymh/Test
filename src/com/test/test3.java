package com.test;

import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask{
	int i = 0;
    @Override
    public void run() {
    	i++;
        System.out.println("hello world"+"定时任务第——————"+i);
    }
}
public class test3 {
    public static void main(String[] args) {
        //创建定时器对象
        Timer t=new Timer();
        //在3秒后执行MyTask类中的run方法,后面每10秒跑一次
        t.schedule(new MyTask(), 3000,1000);

    }
}