package cn.techoc.leetcode.easy;

public class T58 {
    /**
     * <a href="https://leetcode.cn/problems/length-of-last-word">58. 最后一个单词的长度</a>
     *
     * @param s 字符串
     * @return 最后一个单词的长度
     */
    public int lengthOfLastWord(String s) {
        int right = s.length() - 1;
        while (right >= 0 && s.charAt(right) == ' ') {  // 跳过末尾空格 找到最后一个单词的末尾位置
            right--;
        }
        int left = right;
        while (left >= 0 && s.charAt(left) != ' ') {    // 找到最后一个单词的开始位置
            left--;
        }
        return right - left;
    }
}
