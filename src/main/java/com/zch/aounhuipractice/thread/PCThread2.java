package com.zch.aounhuipractice.thread;

//线程间通信，信号灯法
public class PCThread2 {
    public static void main(String[] args) {
        TV tv = new TV();
        new Thread(new Player(tv)).start();
        new Thread(new Watcher(tv)).start();
    }
}

class Player implements Runnable{
    TV tv;
    public Player(TV tv){
        this.tv = tv;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                try {
                    this.tv.play("快乐大本营");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                try {
                    this.tv.play("斗音");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class Watcher implements Runnable{
    TV tv;
    public Watcher(TV tv){
        this.tv = tv;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            tv.watch();
        }
    }
}

class TV{
    String show;
    boolean flag = true;

    public synchronized void play(String show) throws InterruptedException {
        if (!flag){
            this.wait();
        }
        System.out.println("演员表演"+show);
        //通知观众
        this.notifyAll();//通知唤醒
        this.show = show;
        this.flag = !this.flag;
    }

    public synchronized void watch(){
        if (flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("观看了"+show);
        //通知演员表演
        this.notifyAll();
        this.flag = !this.flag;
    }
}