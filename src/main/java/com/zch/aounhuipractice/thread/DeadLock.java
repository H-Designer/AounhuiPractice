package com.zch.aounhuipractice.thread;

//死锁，多个线程互相需要对方需要的资源，形成僵持
//一个线程因请求资源而阻塞，对其他线程需要的资源保持不放

public class DeadLock {

}
class Lipstick{

}
class Mirror{

}
class Makeup implements Runnable {

    public static void main(String[] args) {
        Makeup girl1 = new Makeup(0, "灰菇凉");
        Makeup girl2 = new Makeup(1, "白雪公主");
        new Thread(girl1).start();
        new Thread(girl2).start();
    }

    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice;
    String girlName;
    public Makeup(int choice,String girlName){
        this.choice = choice;
        this.girlName = girlName;

    }
    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //化妆,互相持有对方的资源
    private void makeup() throws InterruptedException {
        if(choice == 0){
            synchronized (lipstick){
                System.out.println(this.girlName+"获得口红锁");
                Thread.sleep(1000);
            }
            synchronized (mirror){
                System.out.println(this.girlName+"获得镜子锁");
            }
        }else {
            synchronized (mirror){
                System.out.println(this.girlName+"获得镜子锁");
                Thread.sleep(2000);
            }
            synchronized (lipstick){
                System.out.println(this.girlName+"获得口红锁");
            }
        }
    }
}