package com.zch.aounhuipractice.thread;

//线程状态
public class StateThread {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("...");
        });
        //观察状态

        Thread.State state = thread.getState();
        System.out.println(thread.getState());
        thread.start();
        state = thread.getState();
        while (thread.getState() != Thread.State.TERMINATED){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            state = thread.getState();
            System.out.println(state);
        }
    }
}
