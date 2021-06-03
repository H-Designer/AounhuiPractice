package com.zch.aounhuipractice.thread;

//创建线程方式2：实现Runnable接口，重写run方法，执行线程需要丢入runnable接口实现类，调用start方法
public class ImplementRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("创建新线程执行");
    }
    public static void main(String args[]){
        System.out.println("主线程执行");
        ImplementRunnable implementRunnable = new ImplementRunnable();
        new Thread(implementRunnable).start();
        System.out.println("主线程执行结束");
    }
}
