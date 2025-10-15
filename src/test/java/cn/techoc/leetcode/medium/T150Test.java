package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 逆波兰表达式求值函数的单元测试类
 */
class T150Test {

    private final T150 t150 = new T150();

    /**
     * 测试用例 TC01: ["2","1","+","3","*"] => 9
     */
    @Test
    void testEvalRPN_AddAndMultiply() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = t150.evalRPN(tokens);
        assertEquals(9, result);
    }

    /**
     * 测试用例 TC02: ["4","13","5","/","+"] => 6
     */
    @Test
    void testEvalRPN_DivideAndAdd() {
        String[] tokens = {"4", "13", "5", "/", "+"};
        int result = t150.evalRPN(tokens);
        assertEquals(6, result);
    }

    /**
     * 测试用例 TC03: 复杂表达式 => 22
     */
    @Test
    void testEvalRPN_ComplexExpression() {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int result = t150.evalRPN(tokens);
        assertEquals(22, result);
    }

    /**
     * 测试用例 TC04: ["3","-4","+"] => -1
     */
    @Test
    void testEvalRPN_NegativeNumber() {
        String[] tokens = {"3", "-4", "+"};
        int result = t150.evalRPN(tokens);
        assertEquals(-1, result);
    }

    /**
     * 测试用例 TC05: ["0","3","/"] => 0
     */
    @Test
    void testEvalRPN_ZeroDivided() {
        String[] tokens = {"0", "3", "/"};
        int result = t150.evalRPN(tokens);
        assertEquals(0, result);
    }

    /**
     * 测试用例 TC06: ["1"] => 1
     */
    @Test
    void testEvalRPN_SingleNumber() {
        String[] tokens = {"1"};
        int result = t150.evalRPN(tokens);
        assertEquals(1, result);
    }

    /**
     * 测试用例 TC07: ["-1"] => -1
     */
    @Test
    void testEvalRPN_SingleNegativeNumber() {
        String[] tokens = {"-1"};
        int result = t150.evalRPN(tokens);
        assertEquals(-1, result);
    }
}
