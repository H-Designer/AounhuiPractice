package com.zch.aounhuipractice.thread;
//守护线程
//上帝守护人类
public class DaemonThread {
    public static void main(String[] args) {
        God god = new God();
        People people = new People();
        Thread thread = new Thread(god);
        thread.setDaemon(true);
        thread.start();
        new Thread(people).start();
    }

}
//上帝
class God implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("上帝守护你");
        }
    }
}
//人类
class People implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("开心活着每一天，今天是"+i+"天");
        }
        System.out.println("goodbye! world");
    }
}
