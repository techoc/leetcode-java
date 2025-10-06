package cn.techoc.leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * T76 单元测试类
 * 测试 minWindow 方法的正确性
 */
class T76Test {

    private final T76 t76 = new T76();

    /**
     * 测试用例：正常情况，存在最小覆盖子串
     * 输入：s = "ADOBECODEBANC", t = "ABC"
     * 期望输出："BANC"
     */
    @Test
    void testMinWindow_NormalCase() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = t76.minWindow(s, t);
        assertEquals("BANC", result);
    }

    /**
     * 测试用例：不存在覆盖子串
     * 输入：s = "a", t = "aa"
     * 期望输出：""
     */
    @Test
    void testMinWindow_NoValidWindow() {
        String s = "a";
        String t = "aa";
        String result = t76.minWindow(s, t);
        assertEquals("", result);
    }

    /**
     * 测试用例：s 与 t 完全一致
     * 输入：s = "abc", t = "abc"
     * 期望输出："abc"
     */
    @Test
    void testMinWindow_IdenticalStrings() {
        String s = "abc";
        String t = "abc";
        String result = t76.minWindow(s, t);
        assertEquals("abc", result);
    }

    /**
     * 测试用例：多个满足条件的子串，取最短
     * 输入：s = "abbc", t = "bc"
     * 期望输出："bc"
     */
    @Test
    void testMinWindow_MultipleMatches() {
        String s = "abbc";
        String t = "bc";
        String result = t76.minWindow(s, t);
        assertEquals("bc", result);
    }

    /**
     * 测试用例：s 为空字符串
     * 输入：s = "", t = "a"
     * 期望输出：""
     */
    @Test
    void testMinWindow_EmptyStringS() {
        String s = "";
        String t = "a";
        String result = t76.minWindow(s, t);
        assertEquals("", result);
    }

    /**
     * 测试用例：t 为空字符串
     * 输入：s = "a", t = ""
     * 期望输出：""
     */
    @Test
    void testMinWindow_EmptyStringT() {
        String s = "a";
        String t = "";
        String result = t76.minWindow(s, t);
        assertEquals("", result);
    }

    /**
     * 测试用例：单字符匹配
     * 输入：s = "a", t = "a"
     * 期望输出："a"
     */
    @Test
    void testMinWindow_SingleCharMatch() {
        String s = "a";
        String t = "a";
        String result = t76.minWindow(s, t);
        assertEquals("a", result);
    }
}
