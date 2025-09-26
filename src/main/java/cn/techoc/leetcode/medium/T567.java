package cn.techoc.leetcode.medium;

import java.util.Arrays;

public class T567 {
    /**
     * <a href="https://leetcode.cn/problems/permutation-in-string">567. 字符串的排列</a>
     * 使用滑动窗口算法检查 s2 是否包含 s1 的某个排列作为子串
     *
     * @param s1 s1 是一个小写字母的字符串
     * @param s2 s2 是一个小写字母的字符串
     * @return 如果 s2 包含 s1 的排列之一，则返回 true ，否则返回 false
     */
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        // 如果 s1 比 s2 长，则不可能存在排列子串
        if (m > s2.length()) {
            return false;
        }

        // 统计 s1 中每个字符的出现次数
        int[] cntS1 = new int[26];
        for (char c : s1.toCharArray()) {
            cntS1[c - 'a']++;
        }

        char[] s = s2.toCharArray();
        // 滑动窗口中字符的计数数组
        int[] cntT = new int[26];

        // 使用滑动窗口遍历 s2
        for (int i = 0; i < s.length; i++) {
            // 1. 将当前字符加入窗口右侧
            cntT[s[i] - 'a']++;

            // 2. 如果窗口大小还未达到 m，继续扩展窗口
            if (i < m - 1) {
                continue;
            }

            // 3. 当窗口大小等于 m 时，检查是否匹配
            if (Arrays.equals(cntS1, cntT)) {
                return true;
            }

            // 4. 移除窗口左侧的字符，为下一次迭代准备
            cntT[s[i - m + 1] - 'a']--;
        }
        return false;
    }
}
