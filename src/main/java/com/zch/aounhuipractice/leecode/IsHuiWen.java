package com.zch.aounhuipractice.leecode;

/**
 * 回文数，主要是利用StringBuffer的reverse倒置函数
 */
public class IsHuiWen {
    public static void main(String args[]){
        int num = 12345;
        System.out.println(isPalindrome(num));
        System.out.println(new StringBuilder("asdf").reverse());
    }
    public static boolean isPalindrome(int x) {
        String reversedStr = (new StringBuilder(x + "")).reverse().toString();
        return (x + "").equals(reversedStr);
    }
}
