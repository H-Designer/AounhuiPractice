package com.zch.aounhuipractice.thread;

public class SyncThreadBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket, "小赵").start();
        new Thread(buyTicket, "小张").start();
        new Thread(buyTicket, "黄牛党").start();
    }

}
class BuyTicket implements Runnable{
    boolean flag = true;
    private int ticket = 10;
    @Override
    public void run() {
        while (flag){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            buy();
        }
    }
    private synchronized void buy(){
        if (ticket <=0){
            flag = false;
            return;
        }
        System.out.println(Thread.currentThread().getName()+"-->"+ticket--);
    }
}
