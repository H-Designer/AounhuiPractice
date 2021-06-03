package com.zch.aounhuipractice.thread;

//礼让不一定成功
public class YieldThread {
    public static void main(String[] args) {
        Yield yield = new Yield();
        new Thread(yield,"线程1").start();
        new Thread(yield,"线程2").start();

    }

}
class Yield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程结束");
    }
}
