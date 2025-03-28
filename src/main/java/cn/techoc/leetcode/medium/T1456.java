package cn.techoc.leetcode.medium;

public class T1456 {

    /**
     * <a href="https://leetcode.cn/problems/maximum-number-of-vowels-in-a-substring-of-given-length">1456. 定长子串中元音的最大数目</a>
     *
     * @param s 字符串
     * @param k 子串长度
     * @return 最大元音数
     */
    public int maxVowels(String s, int k) {
        int left = 0, right = 0, max = 0, count = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;    // 右指针右移
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { // 是元音
                count++;
            }
            while (right - left == k) {  // 窗口大小等于k
                max = Math.max(max, count);  // 更新最大元音数
                char d = s.charAt(left);
                left++;    // 左指针右移
                if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') { // 是元音
                    count--;
                }
            }
        }
        return max;
    }
}
