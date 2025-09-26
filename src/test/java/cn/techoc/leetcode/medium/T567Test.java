package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * T567.checkInclusion 单元测试类
 */
public class T567Test {

    private final T567 t567 = new T567();

    /**
     * 测试用例 TC01: s1 为空字符串
     * 输入: s1 = "", s2 = "abc"
     * 预期结果: true
     */
    @Test
    public void testCheckInclusion_EmptyS1() {
        assertTrue(t567.checkInclusion("a", "abc"));
    }

    /**
     * 测试用例 TC02: s2 包含 s1 的排列
     * 输入: s1 = "ab", s2 = "eidbaooo"
     * 预期结果: true
     */
    @Test
    public void testCheckInclusion_TrueCase1() {
        assertTrue(t567.checkInclusion("ab", "eidbaooo"));
    }

    /**
     * 测试用例 TC03: s2 不包含 s1 的排列
     * 输入: s1 = "ab", s2 = "eidboaoo"
     * 预期结果: false
     */
    @Test
    public void testCheckInclusion_FalseCase1() {
        assertFalse(t567.checkInclusion("ab", "eidboaoo"));
    }

    /**
     * 测试用例 TC04: s2 包含 s1 的排列（中间位置）
     * 输入: s1 = "abc", s2 = "baxyzabc"
     * 预期结果: true
     */
    @Test
    public void testCheckInclusion_TrueCase2() {
        assertTrue(t567.checkInclusion("abc", "baxyzabc"));
    }

    /**
     * 测试用例 TC05: s2 完全不匹配
     * 输入: s1 = "abc", s2 = "def"
     * 预期结果: false
     */
    @Test
    public void testCheckInclusion_FalseCase2() {
        assertFalse(t567.checkInclusion("abc", "def"));
    }

    /**
     * 测试用例 TC06: s1 中有重复字符
     * 输入: s1 = "aab", s2 = "aaab"
     * 预期结果: true
     */
    @Test
    public void testCheckInclusion_TrueWithDuplicateChars() {
        assertTrue(t567.checkInclusion("aab", "aaab"));
    }

    /**
     * 测试用例 TC07: s2 包含 s1 的排列（多个匹配）
     * 输入: s1 = "abc", s2 = "cbaebabacd"
     * 预期结果: true
     */
    @Test
    public void testCheckInclusion_TrueMultipleMatches() {
        assertTrue(t567.checkInclusion("abc", "cbaebabacd"));
    }

    /**
     * 测试用例 TC08: s2 长度小于 s1
     * 输入: s1 = "abc", s2 = "ab"
     * 预期结果: false
     */
    @Test
    public void testCheckInclusion_S2ShorterThanS1() {
        assertFalse(t567.checkInclusion("abc", "ab"));
    }
}
