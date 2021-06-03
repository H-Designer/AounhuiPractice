package com.zch.aounhuipractice.java_util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * 实现了Comparator接口之后，根据自己定义的情况进行重写conpare方法，然后然后集合的sort方法就可以按照定义的规则进行排序。
 *
 * compareTo方法是比较哪两个串在前，返回结果为int，>0说明前者在前，<0说明后者排序在前。
 */

public class ComparatorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aadsaf");
        list.add("dqwd");
        list.add("dqwfcsqc");
        list.add("xqsccaac");
        list.add("csfwffqaf");
        list.add("czxca");
        list.add("cas");
        list.add("casc");
        Comparator com1 = new ComparatorLength();
        list.sort(com1);
        System.out.println(list);

        String[] str = {"aadsaf","dqwd","dqwfcsqc","xqsccaac","csfwffqaf","czxca","cas","cacs","casc"};
        Comparator com2 = new ComparatorBefore();
        Arrays.sort(str, com2);
        System.out.println(Arrays.toString(str));
    }
}

/**
 * 按照长度比较
 */
class ComparatorLength implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length() > 0 ? 1 : -1;
    }
}

class ComparatorBefore implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}