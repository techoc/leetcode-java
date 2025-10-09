package cn.techoc.leetcode.easy;

public class T205 {
    /**
     * <a href="https://leetcode.cn/problems/isomorphic-strings">205. 同构字符串</a>
     * 判断两个字符串是否是同构的。
     * 两个字符串 s 和 t 同构，当且仅当 s 中的字符可以被替换得到 t 。
     * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，
     * 但字符可以映射自己本身。
     *
     * @param s 字符串s
     * @param t 字符串t
     * @return 如果s和t是同构的返回true，否则返回false
     */
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] s2t = new int[256];
        int[] t2s = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (s2t[c1] != 0 && s2t[c1] != c2 + 1) {  // 判断映射关系是否一致
                return false;
            }
            if (t2s[c2] != 0 && t2s[c2] != c1 + 1) {
                return false;
            }
            s2t[c1] = c2 + 1;
            t2s[c2] = c1 + 1;
        }
        return true;
    }
}
