package com.zch.aounhuipractice.thread;

// 模拟龟兔赛跑
public class Race implements Runnable {
    private static String winner;
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++){
            if ("兔子".equals(Thread.currentThread().getName()) && i%100 == 0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            Boolean flag = gameOver(i);
            if (flag){
                break;
            }
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
        }
    }

    private Boolean gameOver(int steps){
        if (winner != null){
            return true;
        }else if (steps >= 100){
            winner = Thread.currentThread().getName();
            System.out.println(winner + "获胜");
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race, "兔子").start();
        new Thread(race, "乌龟").start();
    }
}
