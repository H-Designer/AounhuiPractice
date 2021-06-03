package com.zch.aounhuipractice.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 *
 *
 * 示例 1：
 *
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 *
 * 输入：n = 1
 * 输出：["()"]
 *
 *
 * 提示：
 *
 * 1 <= n <= 8
 * 通过次数280,866提交次数363,951
 */
public class LeeCode22 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(4));
    }
    static class Solution {
        List<String> res = new ArrayList<>();
        public List<String> generateParenthesis(int n) {
            dfs(n, n, "");
            return res;
        }

        private void dfs(int left, int right, String curStr) {
            if (left == 0 && right == 0) { // 左右括号都不剩余了，递归终止
                res.add(curStr);
                return;
            }
            if (left > 0) { // 如果左括号还剩余的话，可以拼接左括号
                System.out.println("left > 0   "+left+"   "+right+"    "+curStr+ "(");
                dfs(left - 1, right, curStr + "(");
            }
            if (right > left) { // 如果右括号剩余多于左括号剩余的话，可以拼接右括号
                System.out.println("right > left    "+left+"   "+right+"    "+curStr+ ")");
                dfs(left, right - 1, curStr + ")");
            }
        }

    }
}
