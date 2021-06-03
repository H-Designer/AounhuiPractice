package com.zch.aounhuipractice.java_util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) throws InterruptedException {
        List<Object> objects = Collections.synchronizedList(new ArrayList<>());
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                objects.add("1");
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(objects.size());
        List<String> vector = new Vector<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                vector.add("1");
            }).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(vector.size());
    }
}
