package com.zch.aounhuipractice.thread;

import java.util.concurrent.locks.ReentrantLock;

//使用lock ReenTrantLock进行锁和解锁，显式锁
public class LockThread {
    public static void main(String[] args) {
        Buy buy = new Buy();
        new Thread(buy,"1").start();
        new Thread(buy,"2").start();
        new Thread(buy,"3").start();
    }
}

class Buy implements Runnable{
    private int ticket = 10;
    private boolean flag = true;
    private final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (flag){
            try {
                lock.lock();
                if (ticket<=0){
                    flag = false;
                    return;
                }
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+"->"+ticket);
                ticket --;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
