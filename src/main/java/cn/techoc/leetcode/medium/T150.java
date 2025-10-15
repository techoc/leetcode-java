package cn.techoc.leetcode.medium;

import java.util.Stack;

public class T150 {
    /**
     * <a href="https://leetcode.cn/problems/evaluate-reverse-polish-notation">150. 逆波兰表达式求值</a>
     * 计算逆波兰表达式的值。
     *
     * @param tokens 字符串数组，表示一个逆波兰表达式，其中每个元素要么是一个整数，要么是加、减、乘、除中的一个运算符。
     * @return 返回逆波兰表达式的计算结果。
     */
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int res;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    res = stack.pop() + stack.pop();
                    stack.push(res);
                    break;
                case "-":
                    res = -stack.pop() + stack.pop();
                    stack.push(res);
                    break;
                case "*":
                    res = stack.pop() * stack.pop();
                    stack.push(res);
                    break;
                case "/":
                    res = stack.pop();
                    res = stack.pop() / res;
                    stack.push(res);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }
        return stack.pop();
    }
}
