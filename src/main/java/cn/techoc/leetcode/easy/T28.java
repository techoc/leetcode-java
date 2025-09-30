package cn.techoc.leetcode.easy;

public class T28 {
    /**
     * <a href="https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string">28. 找出字符串中第一个匹配项的下标</a>
     *
     * @param haystack 字符串
     * @param needle   子串
     * @return 子串在字符串中首次出现的位置，如果没有匹配项，则返回 -1
     */
    public int strStr(String haystack, String needle) {
        // 边界情况处理
        if (needle == null || needle.isEmpty()) {
            return 0;
        }
        if (haystack == null || haystack.isEmpty() ||
                needle.length() > haystack.length()) {
            return -1;
        }

        // 构建next数组
        int[] next = buildNext(needle);

        int i = 0; // haystack指针
        int j = 0; // needle指针

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                if (j > 0) {
                    j = next[j - 1]; // 利用next数组跳转
                } else {
                    i++; // j=0时，只能移动i
                }
            }

            // 找到完整匹配
            if (j == needle.length()) {
                return i - j; // 返回起始位置
            }
        }

        return -1;
    }

    /**
     * 构建KMP算法的next数组
     * next[i] 表示 needle[0...i] 的最长相等前后缀的长度
     */
    private int[] buildNext(String needle) {
        int n = needle.length();
        int[] next = new int[n];
        next[0] = 0; // 第一个字符的next值为0

        int j = 0; // j指向当前最长前缀的下一个位置

        for (int i = 1; i < n; i++) {
            // 当前字符不匹配时，回退j到next[j-1]
            while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                j = next[j - 1];
            }

            // 如果匹配，j向前移动
            if (needle.charAt(i) == needle.charAt(j)) {
                j++;
            }

            next[i] = j;
        }

        return next;
    }
}
