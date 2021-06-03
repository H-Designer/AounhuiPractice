package com.zch.aounhuipractice.juc;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArr {
    public static void main(String[] args) {
        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
              copyOnWriteArrayList.add("111");
            }).start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(copyOnWriteArrayList.size());
    }
}
