package com.zch.aounhuipractice.leecode;

import java.util.HashSet;

/**
 * 无重复最长子串
 */
public class LeeCode003 {
    public static void main(String args[]){
        String chars = " ";
        System.out.println(lengthOfLongestSubstring(chars));
    }
    public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        int index = 0;
        for (int i=1;i<s.length();i++){
            String sonchar = s.substring(index,i);
            if (isUniqueChars(sonchar)){
                length = sonchar.length();
            }else {
                while (!isUniqueChars(sonchar)){
                    if (index+1<=s.length()&&index+1<=i){
                        index ++ ;
                    }
                    sonchar = s.substring(index,i);
                }
            }
        }
        return length;
    }
    public static boolean isUniqueChars(String str){
        HashSet hashSet = new HashSet();
        for (int i=0;i<str.length();i++){
            hashSet.add(str.substring(i,i+1));
        }
        if (hashSet.size()==str.length()){
            return true;
        }else {
            return false;
        }
    }
}
