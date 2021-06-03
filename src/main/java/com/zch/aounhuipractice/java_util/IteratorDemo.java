package com.zch.aounhuipractice.java_util;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("111");
        strings.add("112");
        strings.add("113");
        strings.add("114");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }

    }
}
