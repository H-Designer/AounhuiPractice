package com.zch.aounhuipractice.java_util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        String number[] = new String[]{"1","2","4","3","9","0","6","5"};
        /**
         * 1:copyOf(数组，长度)，拷贝数组，得到新的数组
         */
        String numberCopy[] = Arrays.copyOf(number,11);
        List<String> list = new ArrayList<>(Arrays.asList(numberCopy));
        System.out.println("Arrays.copyOf ==> " + list);

        /**
         * 2:sort(数组)对数组的数据进行快拍排序
         */
        Arrays.sort(number);
        System.out.println("Arrays.sort ==> " + Arrays.asList(number));

        /**
         * 3:binarySearch 对int类型的数组进行二分查找法查找元素
         * 注：数组必须是有序的，int类型。
         */
        int[] numberInt = new int[]{0,1,2,3,4,5,6,7};
        int subscript = Arrays.binarySearch(numberInt, 4);
        System.out.println("Arrays.binarySearch ==> " + subscript);

        /**
         * 4:fill 将数组的内容进行赋值,可以指定起始范围
         */
        Arrays.fill(number, "fill");
        System.out.println("Arrays.fill ==> " + Arrays.asList(number));
        Arrays.fill(number, 1, 3, "fillFromTo");
        System.out.println("Arrays.fillFromTo ==> " + Arrays.asList(number));

        /**
         * 5:toString int类型的数组转化成String
         */
        int[] toStringStr = new int[]{0,1,2,3,4,5,6};
        System.out.println(Arrays.toString(toStringStr));
    }
}
