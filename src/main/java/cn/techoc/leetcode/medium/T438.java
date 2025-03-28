package cn.techoc.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class T438 {
    /**
     * <a href="https://leetcode.cn/problems/find-all-anagrams-in-a-string/">438. 找到字符串中所有字母异位词</a>
     *
     * @param s 字符串
     * @param p 字符串
     * @return 字符串中所有字母异位词的起始索引
     */
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (char c : p.toCharArray()) {    // 初始化need
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int left = 0, right = 0;
        int valid = 0;
        List<Integer> res = new ArrayList<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;    // 窗口右移
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            if (valid == need.size()) { // 当窗口中的字符数等于p的长度时，判断是否为异位词
                res.add(left);
            }
            while (right - left >= p.length()) {
                char d = s.charAt(left);
                left++;    // 窗口左移
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return res;
    }
}
