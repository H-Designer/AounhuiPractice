package com.zch.aounhuipractice.leecode;

import java.util.*;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 *
 *
 *  
 *
 * 示例 1：
 *
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 示例 2：
 *
 * 输入：digits = ""
 * 输出：[]
 * 示例 3：
 *
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 *  
 *
 * 提示：
 *
 * 0 <= digits.length <= 4
 * digits[i] 是范围 ['2', '9'] 的一个数字。
 * 通过次数264,073提交次数466,780
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */
public class LeeCode17 {

    public static void main(String args[]){
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23"));
    }

    static class Solution {
        Map<String, String[]> digitMap = new HashMap<>();
        public List<String> letterCombinations(String digits) {
            digitMap.put("2",new String[]{"a", "b", "c"});
            digitMap.put("3",new String[]{"d", "e", "f"});
            digitMap.put("4",new String[]{"g", "h", "i"});
            digitMap.put("5",new String[]{"j", "k", "l"});
            digitMap.put("6",new String[]{"m", "n", "o"});
            digitMap.put("7",new String[]{"p", "q", "r", "s"});
            digitMap.put("8",new String[]{"t", "u", "v"});
            digitMap.put("9",new String[]{"w", "x", "y", "z"});
            List<String> contents = new ArrayList<>();
            return helper(digits, contents);
        }
        public List<String> helper(String digits, List<String> contents){
            if (digits.length()==0)return contents;
            String [] digitContent = digitMap.get(digits.substring(0,1));
            List<String> returnContents = new ArrayList<>();
            for (int i = 0; i < digitContent.length; i++){
                if (contents.size() != 0){
                    for (String content : contents){
                        returnContents.add(content + digitContent[i]);
                    }
                }else {
                    returnContents = Arrays.asList(digitContent);
                    break;
                }
            }
            return helper(digits.substring(1), returnContents);
        }
    }
}
