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
        // 使用哈希表记录字符出现的次数
        HashMap<Character, Integer> map = new HashMap<>();
        // 滑动窗口的左右边界
        int left = 0, right = 0;
        // 记录最长子串的长度
        int res = 0;

        // 滑动窗口遍历整个字符串
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;    // 窗口右移
            map.put(c, map.getOrDefault(c, 0) + 1);

            // 当窗口中出现重复字符时，收缩左边界
            while (map.get(c) > 1) {    // 有重复字符
                char d = s.charAt(left);
                left++;    // 窗口左移
                map.put(d, map.get(d) - 1);
            }

            // 更新最长子串长度
            res = Math.max(res, right - left);    // 更新结果
        }
        return res;
    }
}
