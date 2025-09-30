package cn.techoc.leetcode.easy;

public class T392 {
    /**
     * <a href="https://leetcode.cn/problems/is-subsequence">392. 判断子序列</a>
     *
     * @param s 子序列
     * @param t 字符串
     * @return 是否是子序列
     */
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for (int i = 0; i < t.length(); i++) {
            if (index == s.length()) {
                return true;
            }
            if (s.charAt(index) == t.charAt(i)) {
                index++;
            }
        }
        return index == s.length();
    }
}
