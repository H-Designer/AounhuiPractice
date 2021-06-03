package com.zch.aounhuipractice.thread;

//终止线程，建议线程正常停止，，设置一个标志位，
public class StopThread implements Runnable{
    //1设置一个标志位
    private boolean flag = true;
    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println("run ... Thread"+ i++);
        }
    }
    //2、设置一个公开的方法停止线爱称，转换标志位
    public void stop(){
        this.flag = false;
    }
    public static void main(String[] args) {
        StopThread stopThread = new StopThread();
        new Thread(stopThread).start();
        for (int i= 0; i < 1000; i++){
            System.out.println("mainThread" + i);
            if (i == 900){
                //stop
                stopThread.stop();
                System.out.println("stop thread");
            }

        }
    }
}
