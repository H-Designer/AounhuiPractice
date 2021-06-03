package com.zch.aounhuipractice.leecode;
/*
*
* 给你一个字符串 s，找到 s 中最长的回文子串。



示例 1：

输入：s = "babad"
输出："bab"
解释："aba" 同样是符合题意的答案。

示例 2：

输入：s = "cbbd"
输出："bb"

示例 3：

输入：s = "a"
输出："a"

示例 4：

输入：s = "ac"
输出："a"



提示：

    1 <= s.length <= 1000
    s 仅由数字和英文字母（大写和/或小写）组成

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-palindromic-substring
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */
public class LeeCode005 {

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa"));
    }
    static class Solution {
        public String longestPalindrome(String s) {
            String longestStr = s.substring(0, 1);
            for (int left = 0; left < s.length() - 1; left++){
                for (int right = s.length(); right - 1 > left; right--){
                    String str = s.substring(left, right);
                    if (isPalindrome(str) && str.length() > longestStr.length()) longestStr = str;
                }
            }
            return longestStr;
        }
        public Boolean isPalindrome(String str){
            if (str.length()<=1) {
                return true;
            }
            else if (str.substring(0, 1).equals(str.substring(str.length() - 1, str.length()))){
                return isPalindrome(str.substring(1, str.length() - 1));
            }else {
                return false;
            }
        }
    }
}
