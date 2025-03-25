package cn.techoc.leetcode.hard;

import java.util.HashMap;

public class T76 {
    /**
     * <a href="https://leetcode.cn/problems/minimum-window-substring">76. 最小覆盖子串</a>
     *
     * @param s 字符串
     * @param t 子串
     * @return 最小覆盖子串
     */
    public String minWindow(String s, String t) {
        // 记录 window 中的字符出现次数
        HashMap<Character, Integer> window = new HashMap<>();
        // 记录所需的字符出现次数
        HashMap<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;    //  窗口指针
        int valid = 0;              //  窗口中满足 need 条件的字符个数
        // 记录最小覆盖子串的起始索引及长度
        int start = 0, len = Integer.MAX_VALUE;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;                // 扩大窗口
            if (need.containsKey(c)) {      // 进行窗口内数据的一系列更新
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {    // 字符 c 的出现次数符合要求
                    valid++;
                }
            }

            // 判断左侧窗口是否要收缩
            while (valid == need.size()) {  // valid == need.size() 时，说明窗口中已经包含了 t 中的所有字符
                // 在这里更新最小覆盖子串
                if (right - left < len) {    // 先更新最小覆盖子串的长度
                    start = left;
                    len = right - left;
                }
                // d 是将移出窗口的字符
                char d = s.charAt(left);
                // 缩小窗口
                left++;
                // 进行窗口内数据的一系列更新
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d)))
                        valid--;
                    window.put(d, window.get(d) - 1);        // 字符 d 出现次数减一
                }
            }
        }
        // 返回最小覆盖子串
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
