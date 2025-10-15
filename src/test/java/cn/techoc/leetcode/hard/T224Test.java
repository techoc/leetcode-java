package cn.techoc.leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * T224 类的单元测试
 * 测试 calculate 方法的各种情况
 */
class T224Test {

    private final T224 calculator = new T224();

    @Test
    void testBasicAddition() {
        // TC01: 基本加法
        assertEquals(2, calculator.calculate("1 + 1"));
    }

    @Test
    void testMixedAddSubtract() {
        // TC02: 加减混合
        assertEquals(3, calculator.calculate("2-1 + 2"));
    }

    @Test
    void testNestedParentheses() {
        // TC03: 多层括号嵌套
        assertEquals(23, calculator.calculate("(1+(4+5+2)-3)+(6+8)"));
    }

    @Test
    void testNegativeStart() {
        // TC04: 负数开头
        assertEquals(0, calculator.calculate(" -1 + 1"));
    }

    @Test
    void testNegativeParentheses() {
        // TC05: 括号前为负号
        assertEquals(-3, calculator.calculate("-(1+2)"));
    }

    @Test
    void testParenthesesWithNegative() {
        // TC06: 括号内为负数
        assertEquals(2, calculator.calculate("1 - (-1)"));
    }

    @Test
    void testSingleNumber() {
        // TC07: 单个数字
        assertEquals(1, calculator.calculate("1"));
    }

    @Test
    void testMultipleParentheses() {
        // TC08: 多重括号
        assertEquals(3, calculator.calculate("((1+2))"));
    }
}
