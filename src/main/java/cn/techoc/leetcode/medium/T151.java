package cn.techoc.leetcode.medium;

public class T151 {
    /**
     * <a href="https://leetcode.cn/problems/reverse-words-in-a-string">151. 反转字符串中的单词</a>
     *
     * @param s 字符串
     * @return 反转后的字符串
     */
    public String reverseWords(String s) {
        // 将字符串转换为字符数组 假设输入的是字符数组
        // 进行原地修改 以满足 O(1) 的空间复杂度
        char[] chars = s.toCharArray();

        // 第一步：移除多余空格（原地操作）
        int len = removeExtraSpaces(chars);

        // 第二步：反转整个字符串
        reverse(chars, 0, len - 1);

        // 第三步：反转每个单词
        reverseEachWord(chars, len);

        // 返回结果
        return new String(chars, 0, len);
    }

    // 移除多余空格，返回处理后字符串的实际长度
    private int removeExtraSpaces(char[] chars) {
        int slow = 0;
        int fast = 0;

        // 跳过前导空格
        while (fast < chars.length && chars[fast] == ' ') {
            fast++;
        }

        // 处理中间部分
        while (fast < chars.length) {
            // 如果不是空格，直接复制
            if (chars[fast] != ' ') {
                chars[slow++] = chars[fast++];
            }
            // 如果是空格，只保留一个，并跳过后续连续空格
            else {
                // 添加一个空格
                chars[slow++] = ' ';
                // 跳过所有连续空格
                while (fast < chars.length && chars[fast] == ' ') {
                    fast++;
                }
            }
        }

        // 处理尾随空格：如果最后一个是空格，则长度减1
        if (slow > 0 && chars[slow - 1] == ' ') {
            slow--;
        }

        return slow;
    }

    // 反转指定范围内的字符
    private void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }

    // 反转每个单词
    private void reverseEachWord(char[] chars, int len) {
        int start = 0;
        int end = 0;

        while (start < len) {
            // 找到单词的结束位置
            while (end < len && chars[end] != ' ') {
                end++;
            }

            // 反转这个单词
            reverse(chars, start, end - 1);

            // 移动到下一个单词的开始位置
            start = end + 1;
            end = start;
        }
    }
}
