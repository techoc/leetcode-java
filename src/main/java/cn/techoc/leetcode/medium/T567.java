package cn.techoc.leetcode.medium;

import java.util.HashMap;

public class T567 {
    /**
     * <a href="https://leetcode.cn/problems/permutation-in-string">567. 字符串的排列</a>
     *
     * @param s1 s1 是一个小写字母的字符串
     * @param s2 s2 是一个小写字母的字符串
     * @return 如果 s2 包含 s1 的排列之一，则返回 true ，否则返回 false
     */
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (char c : s1.toCharArray()) {    // 初始化 need
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        // 初始化窗口指针
        int left = 0, right = 0, valid = 0;
        while (right < s2.length()) {
            char c = s2.charAt(right);
            right++;    // 扩大窗口
            if (need.containsKey(c)) {  // 更新窗口数据
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            while (right - left >= s1.length()) {    // 缩小窗口
                if (valid == need.size()) {
                    return true;    // 找到满足条件的子串 --> true
                }
                // ...
            }
        }
        return false;   // 未找到满足条件的子串 --> false
    }
}