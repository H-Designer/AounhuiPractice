package com.zch.aounhuipractice.thread;

//线程插队
public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        Join join = new Join();
        Thread thread = new Thread(join);
        thread.start();

        for (int i = 0; i < 500; i++) {
            if (i == 200){
                //线程来插入
                thread.join();
            }
            System.out.println("main"+i);
        }
    }
}
class Join implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("vip" + i);
        }
    }
}
