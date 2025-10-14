package cn.techoc.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class T155 {
    /**
     * <a href="https://leetcode.cn/problems/min-stack">155. 最小栈</a>
     */
    static class MinStack {

        private final List<Integer> stack;
        private final List<Integer> minStack; // 辅助栈存储最小值

        public MinStack() {
            stack = new ArrayList<>();
            minStack = new ArrayList<>();
            minStack.add(Integer.MAX_VALUE); // 初始化辅助栈
        }

        public void push(int val) {
            stack.add(val);
            // 将当前最小值压入辅助栈
            minStack.add(Math.min(val, minStack.get(minStack.size() - 1)));
        }

        public void pop() {
            stack.remove(stack.size() - 1);
            minStack.remove(minStack.size() - 1);
        }

        public int top() {
            return stack.get(stack.size() - 1);
        }

        public int getMin() {
            return minStack.get(minStack.size() - 1);
        }
    }
}
