package cn.techoc.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class T290 {
    /**
     * <a href="https://leetcode.cn/problems/word-pattern">290. 单词规律</a>
     *
     * @param pattern 模式字符串
     * @param s       字符串
     * @return 模式字符串和字符串是否符合规则
     */
    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");
        if (s1.length != pattern.length()) {
            return false;
        }
        Map<Character, String> p2s = new HashMap<>();
        Map<String, Character> s2p = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = s1[i];
            if (p2s.containsKey(c) && !p2s.get(c).equals(w)) {
                return false;
            }
            if (s2p.containsKey(w) && !s2p.get(w).equals(c)) {
                return false;
            }
            p2s.put(c, w);
            s2p.put(w, c);
        }
        return true;
    }
}
