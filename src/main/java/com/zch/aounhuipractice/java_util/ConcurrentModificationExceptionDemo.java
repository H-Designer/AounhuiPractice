package com.zch.aounhuipractice.java_util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ConcurrentModificationException
 * 在ArrayList和Hashmap在进行迭代的时候，如果进行操作，例如remove会抛出异常
 */
public class ConcurrentModificationExceptionDemo {
    public static void main(String[] args) {
        String[] str = new String[]{"11","22","33","44"};
        List<String> list = new ArrayList<>(Arrays.asList(str));
        for (String o : list) {
            list.remove("11");
        }
    }
}
