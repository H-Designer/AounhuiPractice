package com.zch.aounhuipractice.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepThread2 {
    public static void main(String[] args) throws InterruptedException {
//        tenDown();
        getTime();
    }
    //倒计时
    public static void tenDown(){
        int num = 10;
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(num--);
            if (num<=0){
                break;
            }
        }
    }
    //获取当前时间
    public static void getTime() throws InterruptedException {
        int num = 10;
        while (true){
            Thread.sleep(1000);
            Date startTime = new Date(System.currentTimeMillis());
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
            if (num--<=0){
                break;
            }
        }
    }
}
