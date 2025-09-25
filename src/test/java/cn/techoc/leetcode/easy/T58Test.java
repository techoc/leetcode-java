package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * T58 单元测试类
 * 测试函数: lengthOfLastWord
 */
class T58Test {

    private final T58 t58 = new T58();

    /**
     * 测试正常情况：字符串包含多个单词
     * 输入: "Hello World"
     * 期望输出: 5 (最后一个单词 "World" 的长度)
     */
    @Test
    void testMultipleWords() {
        assertEquals(5, t58.lengthOfLastWord("Hello World"));
    }

    /**
     * 测试末尾有空格的情况
     * 输入: "Hello World   "
     * 期望输出: 5 (跳过末尾空格，最后一个单词 "World" 的长度)
     */
    @Test
    void testTrailingSpaces() {
        assertEquals(5, t58.lengthOfLastWord("Hello World   "));
    }

    /**
     * 测试单个单词的情况
     * 输入: "Hello"
     * 期望输出: 5
     */
    @Test
    void testSingleWord() {
        assertEquals(5, t58.lengthOfLastWord("Hello"));
    }

    /**
     * 测试单个字符的情况
     * 输入: "a"
     * 期望输出: 1
     */
    @Test
    void testSingleCharacter() {
        assertEquals(1, t58.lengthOfLastWord("a"));
    }

    /**
     * 测试空字符串的情况
     * 输入: ""
     * 期望输出: 0
     */
    @Test
    void testEmptyString() {
        assertEquals(0, t58.lengthOfLastWord(""));
    }

    /**
     * 测试仅包含空格的情况
     * 输入: "   "
     * 期望输出: 0
     */
    @Test
    void testOnlySpaces() {
        assertEquals(0, t58.lengthOfLastWord("   "));
    }

    /**
     * 测试多个空格分隔单词的情况
     * 输入: "   fly me   to   the moon  "
     * 期望输出: 4 (最后一个单词 "moon" 的长度)
     */
    @Test
    void testMultipleSpacesBetweenWords() {
        assertEquals(4, t58.lengthOfLastWord("   fly me   to   the moon  "));
    }
}
