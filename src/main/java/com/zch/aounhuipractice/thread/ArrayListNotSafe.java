package com.zch.aounhuipractice.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList线程不安全，当多个线程同时访问一个list，多个线程都add的时候，可能就写在了同一个位置，导致最后的size会比预想的要小
 *
 * 高并发不建议使用Vector、HashTable、synchronizedXXXX(list、map、、、)在高并发的时候，会锁着整个资源，导致大量的阻塞
 * 这时候就有了ConcurrentHashMap和CopyOnWriteArrayList
 */
public class ArrayListNotSafe {
    public static void main(String[] args) throws InterruptedException {
        List<String> arrayList = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
//                synchronized (arrayList){
                    arrayList.add("1");
//                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(arrayList.size());
    }
}
