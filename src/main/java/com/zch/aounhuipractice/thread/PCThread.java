package com.zch.aounhuipractice.thread;

//生产者消费者模型，利用缓冲区进行解决：管程法
public class PCThread {

    public static void main(String[] args) {
        SynContainer synContainer = new SynContainer();
        new Thread(new Productor(synContainer)).start();
        new Thread(new Consumer(synContainer)).start();
    }
}

class Productor implements Runnable{

    SynContainer synContainer;

    public Productor(SynContainer synContainer) {
        this.synContainer = synContainer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synContainer.push(new Chicken(i+1));
            System.out.println("生产了"+(i+1)+"只鸡");
        }
    }
}

class Consumer implements Runnable{
    SynContainer synContainer;

    public Consumer(SynContainer synContainer) {
        this.synContainer = synContainer;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了"+synContainer.pop().id+"只鸡");

        }
    }
}
class Chicken{
    int id;//产品编号

    public Chicken(int id) {
        this.id = id;
    }
}

class SynContainer{
    //容器大小
    Chicken[] chickens = new Chicken[10];
    //容器计数器
    int count = 0;
    //生产者放入产品
    public synchronized void push(Chicken chicken){
        //如果容器满了，等待消费
        if (count == chickens.length){
            //通知消费者消费，生产等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //放入容器
        chickens[count] = chicken;
        count ++ ;

        //通知消费者消费
        this.notifyAll();
    }

    public synchronized Chicken pop(){
        //判断消费
        if (count == 0){
            //等待生产者生产，消费者等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //消费
        count --;
        Chicken chicken = chickens[count];
        //消费完成，通知生产者生产
        this.notifyAll();
        return chicken;
    }
}