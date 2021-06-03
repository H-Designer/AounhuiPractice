package com.zch.aounhuipractice.thread;
//模拟网络延时：放大问题的发生性
public class SleepThread implements Runnable{
    private  int ticketNum = 10;
    @Override
    public void run() {
        while (true){
            if (ticketNum <= 0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "==>拿到了第" + ticketNum +"票");
            ticketNum--;
        }
    }
    public static void main(String args[]){
        BuyTicketThread testThread = new BuyTicketThread();
        new Thread(testThread,"小明").start();
        new Thread(testThread,"小张").start();
        new Thread(testThread,"黄牛党").start();
    }
}
