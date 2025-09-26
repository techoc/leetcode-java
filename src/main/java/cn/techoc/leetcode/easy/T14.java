package cn.techoc.leetcode.easy;

public class T14 {
    /**
     * <a href="https://leetcode.cn/problems/longest-common-prefix">14. 最长公共前缀</a>
     *
     * @param strs 字符串数组
     * @return 最长公共前缀
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        // 初始化答案为第一个字符串
        String ans = strs[0];

        // 遍历剩余的字符串，逐步缩小公共前缀的范围
        for (int i = 1; i < strs.length; i++) {
            // 当当前字符串不以ans开头时，不断缩短ans直到找到公共前缀
            while (strs[i].indexOf(ans) != 0) {
                ans = ans.substring(0, ans.length() - 1);
            }
        }
        return ans;
    }

}
