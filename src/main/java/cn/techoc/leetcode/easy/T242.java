package cn.techoc.leetcode.easy;

public class T242 {
    /**
     * <a href="https://leetcode.cn/problems/valid-anagram">242. 有效的字母异位词</a>
     *
     * @param s 字符串s
     * @param t 字符串t
     * @return 如果s和t是同构的返回true，否则返回false
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int j : count) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
