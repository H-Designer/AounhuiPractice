package com.zch.aounhuipractice.leecode;

public class LeeCode66 {

    class Solution {
        public int[] plusOne(int[] digits) {
            int carry = 1;
            for (int i = digits.length-1; i >= 0; i--){
                int number = digits[i] + carry;
                carry = number / 10;
                digits[i] = number % 10;
                if (carry == 0){
                    return digits;
                }
            }
            digits = new int[digits.length+1];
            digits[0] =1;
            return digits;
        }
    }



}
