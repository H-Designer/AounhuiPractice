package com.zch.aounhuipractice.leecode;

/**
 * 两数之和
 */

public class LeeCode001 {
    public static void main(String args[]){

    }
    public int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
        for (int i=0;i<nums.length;i++){
            int another = target - nums[i];
            for (int j=0;j<nums.length;j++){
                if (j!=i&&nums[j]==another){
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
        }
        return a;
    }
}
