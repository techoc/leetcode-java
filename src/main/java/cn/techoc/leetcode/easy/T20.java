package cn.techoc.leetcode.easy;

public class T20 {
    /**
     * <a href="https://leetcode.cn/problems/valid-parentheses">20. 有效的括号</a>
     * 检查给定的字符串是否有效。
     *
     * @param s 需要验证的字符串
     * @return 如果字符串有效则返回true，否则返回false
     */
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        // 创建一个栈
        char[] stack = new char[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {  // 左括号入栈
                stack[index++] = ch;
            } else {    // 右括号出栈
                if (index == 0) {   // 栈为空
                    return false;
                }
                char top = stack[--index];  // 栈顶元素
                if (ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        return index == 0;
    }
}
