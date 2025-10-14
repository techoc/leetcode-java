package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 对T20类中isValid方法进行单元测试
 */
public class T20Test {

    private final T20 t20 = new T20();

    /**
     * 测试用例TC01: 输入"()"，期望返回true（基本正确匹配）
     */
    @Test
    public void testIsValid_WithBasicValidParentheses_ShouldReturnTrue() {
        assertTrue(t20.isValid("()"), "基本有效括号 () 应该返回 true");
    }

    /**
     * 测试用例TC02: 输入"()[]{}"，期望返回true（多种括号混合正确匹配）
     */
    @Test
    public void testIsValid_WithMultipleValidBrackets_ShouldReturnTrue() {
        assertTrue(t20.isValid("()[]{}"), "多种括号混合 ()[]{} 应该返回 true");
    }

    /**
     * 测试用例TC03: 输入"(]"，期望返回false（错误顺序闭合）
     */
    @Test
    public void testIsValid_WithMismatchedOrder_ShouldReturnFalse() {
        assertFalse(t20.isValid("(]"), "错误顺序 (] 应该返回 false");
    }

    /**
     * 测试用例TC04: 输入"((("，期望返回false（只有左括号未闭合）
     */
    @Test
    public void testIsValid_WithUnmatchedLeftOnly_ShouldReturnFalse() {
        assertFalse(t20.isValid("((("), "仅有左括号 (( 应该返回 false");
    }

    /**
     * 测试用例TC05: 输入"("，期望返回false（字符串长度为奇数）
     */
    @Test
    public void testIsValid_WithOddLengthString_ShouldReturnFalse() {
        assertFalse(t20.isValid("("), "奇数长度字符串 ( 应该返回 false");
    }

    /**
     * 测试用例TC06: 输入""，期望返回true（空字符串）
     */
    @Test
    public void testIsValid_WithEmptyString_ShouldReturnTrue() {
        assertTrue(t20.isValid(""), "空字符串应该返回 true");
    }

    /**
     * 测试用例TC07: 输入"{[()]}"，期望返回true（复杂嵌套结构）
     */
    @Test
    public void testIsValid_WithNestedValidBrackets_ShouldReturnTrue() {
        assertTrue(t20.isValid("{[()]}"), "复杂嵌套结构 {[()]} 应该返回 true");
    }

    /**
     * 测试用例TC08: 输入"{[(])}"，期望返回false（非法嵌套结构）
     */
    @Test
    public void testIsValid_WithInvalidNestedBrackets_ShouldReturnFalse() {
        assertFalse(t20.isValid("{[(])}"), "非法嵌套结构 {[(])} 应该返回 false");
    }

    /**
     * 测试用例TC09: 输入"(()"，期望返回false（两个左括号未闭合）
     */
    @Test
    public void testIsValid_WithTwoUnmatchedLeftParentheses_ShouldReturnFalse() {
        assertFalse(t20.isValid("(("), "两个未闭合的左括号 (() 应该返回 false");
    }

}
