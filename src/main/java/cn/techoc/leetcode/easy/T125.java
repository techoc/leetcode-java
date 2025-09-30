package cn.techoc.leetcode.easy;

public class T125 {
    /**
     * <a href="https://leetcode.cn/problems/valid-palindrome">125. 验证回文串</a>
     *
     * @param s 字符串
     * @return 是否是回文串
     */
    public boolean isPalindrome(String s) {
        int right = s.length() - 1;
        int left = 0;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
