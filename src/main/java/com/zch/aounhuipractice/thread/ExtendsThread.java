package com.zch.aounhuipractice.thread;

//继承Thread类，重写run方法，然后start执行
//线程开启不一定立即执行，由CPU调动
public class ExtendsThread extends Thread{
    @Override
    public void run() {
        try {
            //线程等待
            System.out.println("创建的新线程等待片刻");
            sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("创建新线程执行结束");
    }

    public static void main(String[] args) {
        //main方法，主线程

        //创建线程对象
        ExtendsThread extendsThread = new ExtendsThread();
        //调用start方法，开机线程
        extendsThread.start();
        System.out.println("主线程执行");
    }
}
