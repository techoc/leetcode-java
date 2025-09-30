package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * T125 类的单元测试
 * 测试 isPalindrome 方法的各种情况
 */
class T125Test {

    private final T125 t125 = new T125();

    /**
     * 测试正常回文串
     * 输入: "A man, a plan, a canal: Panama"
     * 期望: true
     */
    @Test
    void testIsPalindrome_NormalPalindrome() {
        String input = "A man, a plan, a canal: Panama";
        assertTrue(t125.isPalindrome(input));
    }

    /**
     * 测试非回文串
     * 输入: "race a car"
     * 期望: false
     */
    @Test
    void testIsPalindrome_NotPalindrome() {
        String input = "race a car";
        assertFalse(t125.isPalindrome(input));
    }

    /**
     * 测试空字符串
     * 输入: ""
     * 期望: true
     */
    @Test
    void testIsPalindrome_EmptyString() {
        String input = "";
        assertTrue(t125.isPalindrome(input));
    }

    /**
     * 测试仅含非字母数字字符的字符串
     * 输入: "!!!"
     * 期望: true
     */
    @Test
    void testIsPalindrome_OnlyNonAlphanumeric() {
        String input = "!!!";
        assertTrue(t125.isPalindrome(input));
    }

    /**
     * 测试单个字符
     * 输入: "a"
     * 期望: true
     */
    @Test
    void testIsPalindrome_SingleCharacter() {
        String input = "a";
        assertTrue(t125.isPalindrome(input));
    }

    /**
     * 测试大小写混合的回文串
     * 输入: "Madam"
     * 期望: true
     */
    @Test
    void testIsPalindrome_MixedCasePalindrome() {
        String input = "Madam";
        assertTrue(t125.isPalindrome(input));
    }

    /**
     * 测试奇数长度回文串
     * 输入: "abcba"
     * 期望: true
     */
    @Test
    void testIsPalindrome_OddLengthPalindrome() {
        String input = "abcba";
        assertTrue(t125.isPalindrome(input));
    }

    /**
     * 测试偶数长度回文串
     * 输入: "abccba"
     * 期望: true
     */
    @Test
    void testIsPalindrome_EvenLengthPalindrome() {
        String input = "abccba";
        assertTrue(t125.isPalindrome(input));
    }
}
