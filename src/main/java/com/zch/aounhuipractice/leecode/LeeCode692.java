package com.zch.aounhuipractice.leecode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 692. 前K个高频单词
 * 给一非空的单词列表，返回前 k 个出现次数最多的单词。
 *
 * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
 *
 * 示例 1：
 *
 * 输入: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
 * 输出: ["i", "love"]
 * 解析: "i" 和 "love" 为出现次数最多的两个单词，均为2次。
 *     注意，按字母顺序 "i" 在 "love" 之前。
 *
 *
 * 示例 2：
 *
 * 输入: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
 * 输出: ["the", "is", "sunny", "day"]
 * 解析: "the", "is", "sunny" 和 "day" 是出现次数最多的四个单词，
 *     出现次数依次为 4, 3, 2 和 1 次。
 *
 *
 * 注意：
 *
 * 假定 k 总为有效值， 1 ≤ k ≤ 集合元素数。
 * 输入的单词均由小写字母组成。
 *
 *
 * 扩展练习：
 *
 * 尝试以 O(n log k) 时间复杂度和 O(n) 空间复杂度解决。
 * 通过次数32,312提交次数60,531
 */
public class LeeCode692 {
    public static void main(String[] args) {
        Solution.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2);
    }
    static class Solution {
        public static List<String> topKFrequent(String[] words, int k) {
            List<String> wordsList = new ArrayList<>(Arrays.asList(words));
            TreeMap<Integer, List<String>> integerListTreeMap = new TreeMap<Integer, List<String>>(new Comparator<Integer>(){
                public int compare(Integer a,Integer b){
                    return b.compareTo(a);
                }
            });
            while (wordsList.size() != 0){
                int originSize = wordsList.size();
                String originWord = wordsList.get(0);
                wordsList.removeAll(Collections.singleton(originWord));
                int key = originSize - wordsList.size();
                List<String> values = new ArrayList<>();
                if (integerListTreeMap.containsKey(key)) {
                    values = integerListTreeMap.get(key);
                }
                values.add(originWord);
                Collections.sort(values);
                integerListTreeMap.put(key, values);
            }
            ArrayList<String> returnList = new ArrayList<>();
            while (returnList.size() < k){
                for (Integer key : integerListTreeMap.keySet()) {
                    List<String> value = integerListTreeMap.get(key);
                    for (String s : value) {
                        returnList.add(s);
                        if (returnList.size() == k){
                            break;
                        }
                    }
                    if (returnList.size() == k){
                        break;
                    }
                }
            }
            return returnList;
        }

        public static List<String> topKFrequent2(String[] words, int k) {
            return Arrays.stream(words)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .sorted((o1, o2) -> {
                        if (o1.getValue().equals(o2.getValue())) {
                            return o1.getKey().compareTo(o2.getKey());
                        } else {
                            return o2.getValue().compareTo(o1.getValue());
                        }
                    })
                    .map(Map.Entry::getKey)
                    .limit(k)
                    .collect(Collectors.toList());
        }
    }
}
