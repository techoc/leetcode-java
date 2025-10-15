package cn.techoc.leetcode.hard;

import java.util.Stack;

public class T224 {
    /**
     * <a href="https://leetcode.cn/problems/basic-calculator">224. 基本计算器</a>
     * 计算给定字符串表达式的值。
     *
     * @param s 字符串形式的数学表达式，支持加减乘除及括号
     * @return 表达式的计算结果
     */
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int sign = 1; // 1 表示正号，-1 表示负号

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                // 处理多位数字
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                // 回退一位，因为for循环会自动i++
                i--;
                result += sign * num;
            } else if (c == '+') {
                sign = 1;
            } else if (c == '-') {
                sign = -1;
            } else if (c == '(') {
                // 遇到左括号，保存当前状态
                stack.push(result);
                stack.push(sign);
                // 重置状态，开始计算括号内的表达式
                result = 0;
                sign = 1;
            } else if (c == ')') {
                // 遇到右括号，括号内计算完成
                // 弹出符号和之前的结果
                int prevSign = stack.pop();
                int prevResult = stack.pop();
                result = prevResult + prevSign * result;
            }
            // 忽略空格
        }
        return result;
    }
}
