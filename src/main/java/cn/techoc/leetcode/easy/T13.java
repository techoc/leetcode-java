package cn.techoc.leetcode.easy;

import java.util.Map;

public class T13 {

    // 单个罗马数字到整数的映射
    private static final Map<Character, Integer> ROMAN = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    /**
     * <a href="https://leetcode.cn/problems/roman-to-integer">13. 罗马数字转整数</a>
     *
     * @param s 罗马数字
     * @return 整数
     */
    public int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int x = ROMAN.get(s.charAt(i));
            int y = ROMAN.get(s.charAt(i + 1));
            if (x < y) {    // 如果当前数字小于下一个数字，则减去当前数字
                ans -= x;
            } else {
                ans += x;
            }
        }
        return ans + ROMAN.get(s.charAt(s.length() - 1));   // 加上最后一个数字
    }
}
