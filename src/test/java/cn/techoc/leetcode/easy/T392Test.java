package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * T392 类的单元测试
 */
class T392Test {

    private final T392 t392 = new T392();

    /**
     * 测试正常情况下 s 是 t 的子序列
     */
    @Test
    void testIsSubsequence_NormalCase_True() {
        assertTrue(t392.isSubsequence("abc", "aebdc"));
    }

    /**
     * 测试正常情况下 s 不是 t 的子序列
     */
    @Test
    void testIsSubsequence_NormalCase_False() {
        assertFalse(t392.isSubsequence("abc", "aecb"));
    }

    /**
     * 测试 s 为空字符串的情况
     */
    @Test
    void testIsSubsequence_EmptyS_True() {
        assertTrue(t392.isSubsequence("", "aebdc"));
    }

    /**
     * 测试 t 为空字符串但 s 非空的情况
     */
    @Test
    void testIsSubsequence_EmptyT_False() {
        assertFalse(t392.isSubsequence("a", ""));
    }

    /**
     * 测试 s 和 t 都为空字符串的情况
     */
    @Test
    void testIsSubsequence_BothEmpty_True() {
        assertTrue(t392.isSubsequence("", ""));
    }

    /**
     * 测试 s 长度大于 t 的情况
     */
    @Test
    void testIsSubsequence_SLongerThanT_False() {
        assertFalse(t392.isSubsequence("abcd", "abc"));
    }

    /**
     * 测试 s 与 t 完全相同的情况
     */
    @Test
    void testIsSubsequence_SameStrings_True() {
        assertTrue(t392.isSubsequence("abc", "abc"));
    }

    /**
     * 测试 s 中存在重复字符的情况
     */
    @Test
    void testIsSubsequence_DuplicateCharsInS_True() {
        assertTrue(t392.isSubsequence("aaa", "abaaac"));
    }

    /**
     * 测试 t 中存在重复字符的情况
     */
    @Test
    void testIsSubsequence_DuplicateCharsInT_True() {
        assertTrue(t392.isSubsequence("abc", "aaabbbccc"));
    }

    /**
     * 测试 s 中存在重复字符且不是子序列的情况
     */
    @Test
    void testIsSubsequence_DuplicateCharsInS_False() {
        assertFalse(t392.isSubsequence("aaa", "abac"));
    }
}
