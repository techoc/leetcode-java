package cn.techoc.leetcode.medium;

import java.util.HashMap;

public class T3 {
    /**
     * <a href="https://leetcode.cn/problems/longest-substring-without-repeating-characters/">3. 无重复字符的最长子串</a>
     *
     * @param s 字符串
     * @return 最长子串长度
     */
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int res = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;    // 窗口右移
            map.put(c, map.getOrDefault(c, 0) + 1);
            // 判断左侧窗口是否需要收缩
            while (map.get(c) > 1) {    // 有重复字符
                char d = s.charAt(left);
                left++;    // 窗口左移
                map.put(d, map.get(d) - 1);
            }
            res = Math.max(res, right - left);    // 更新结果
        }
        return res;
    }
}
