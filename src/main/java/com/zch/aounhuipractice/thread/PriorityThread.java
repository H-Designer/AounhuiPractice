package com.zch.aounhuipractice.thread;
//线程优先级
public class PriorityThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "->" + Thread.currentThread().getPriority());

        MyPriority myPriority = new MyPriority();
        Thread thread = new Thread(myPriority);
        Thread thread2 = new Thread(myPriority);
        Thread thread3 = new Thread(myPriority);
        Thread thread4 = new Thread(myPriority);
        Thread thread5 = new Thread(myPriority);

        thread.setPriority(Thread.NORM_PRIORITY);
        thread.start();

        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.start();

        thread3.setPriority(Thread.NORM_PRIORITY);
        thread3.start();

        thread4.setPriority(3);
        thread4.start();

        thread5.setPriority(Thread.MAX_PRIORITY);
        thread5.start();

    }
}
class MyPriority implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "->" + Thread.currentThread().getPriority());
    }
}