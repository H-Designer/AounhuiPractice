package com.zch.aounhuipractice.leecode;

import java.util.*;

/**
 * 面试题 16.10. 生存人数
 * 给定 N 个人的出生年份和死亡年份，第 i 个人的出生年份为 birth[i]，死亡年份为 death[i]，实现一个方法以计算生存人数最多的年份。
 *
 * 你可以假设所有人都出生于 1900 年至 2000 年（含 1900 和 2000 ）之间。如果一个人在某一年的任意时期处于生存状态，那么他应该被纳入那一年的统计中。例如，生于 1908 年、死于 1909 年的人应当被列入 1908 年和 1909 年的计数。
 *
 * 如果有多个年份生存人数相同且均为最大值，输出其中最小的年份。
 *
 *
 *
 * 示例：
 *
 * 输入：
 * birth = {1900, 1901, 1950}
 * death = {1948, 1951, 2000}
 * 输出： 1901
 *
 *
 * 提示：
 *
 * 0 < birth.length == death.length <= 10000
 * birth[i] <= death[i]
 * 通过次数8,126提交次数11,870
 * */
public class Interview1610 {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(1);
        A.add(1);
        System.out.println(A.removeAll(A));
    }
    class Solution {
        public int maxAliveYear(int[] birth, int[] death) {
            if (birth.length==1){
                return birth[0];
            }
            Map<Integer, Integer> yearOfNumber = new HashMap<>();
            int maxNumber = Integer.MIN_VALUE;
            List<Integer> years = new ArrayList<>();
            //将每个年份存活人数存入map
            for (int i = 0; i < birth.length; i++) {
                for (int start = birth[i]; start <= death[i]; start ++){
                    int number = 1;
                    if (yearOfNumber.containsKey(start)){
                        number = yearOfNumber.get(start) + number;
                    }
                    yearOfNumber.put(start, number);
                }
            }
            //对map进行遍历，查找value最大的年份
            for (Integer year : yearOfNumber.keySet()) {
                int maxNumberCopy = maxNumber;
                maxNumber = Math.max(maxNumber, yearOfNumber.get(year));
                if (maxNumber != maxNumberCopy){
                    years.removeAll(years);
                    years.add(year);
                }
            }
            //判断最大人数的年份是不是有多个，多个找出最小
            if (years.size() != 1){
                int minYear = Integer.MAX_VALUE;
                for (Integer year : years) {
                    minYear = Math.min(minYear, year);
                }
                return minYear;
            }
            return years.get(0);
        }
    }
}
