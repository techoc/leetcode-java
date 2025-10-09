package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * T383 赎金信函数单元测试
 */
class T383Test {

    private final T383 t383 = new T383();

    /**
     * 测试用例1: ransomNote为空字符串
     * 预期结果: true
     */
    @Test
    void testCanConstructWithEmptyRansomNote() {
        assertTrue(t383.canConstruct("", "abc"));
    }

    /**
     * 测试用例2: magazine为空字符串，ransomNote不为空
     * 预期结果: false
     */
    @Test
    void testCanConstructWithEmptyMagazine() {
        assertFalse(t383.canConstruct("a", ""));
    }

    /**
     * 测试用例3: ransomNote长度大于magazine
     * 预期结果: false
     */
    @Test
    void testCanConstructWhenRansomNoteLongerThanMagazine() {
        assertFalse(t383.canConstruct("aa", "a"));
    }

    /**
     * 测试用例4: 可以构造的情况 - 相同字符串
     * 预期结果: true
     */
    @Test
    void testCanConstructWithSameStrings() {
        assertTrue(t383.canConstruct("abc", "abc"));
    }

    /**
     * 测试用例5: 可以构造的情况 - magazine包含足够字符
     * 预期结果: true
     */
    @Test
    void testCanConstructWhenMagazineHasSufficientCharacters() {
        assertTrue(t383.canConstruct("aa", "aab"));
    }

    /**
     * 测试用例6: 不可以构造的情况 - 字符数量不足
     * 预期结果: false
     */
    @Test
    void testCanConstructWhenInsufficientCharacters() {
        assertTrue(t383.canConstruct("aab", "baa"));
    }

    /**
     * 测试用例7: 不可以构造的情况 - 完全不同的字符
     * 预期结果: false
     */
    @Test
    void testCanConstructWithDifferentCharacters() {
        assertFalse(t383.canConstruct("abc", "def"));
    }

    /**
     * 测试用例8: 复杂情况 - 可以构造
     * 预期结果: true
     */
    @Test
    void testCanConstructComplexCaseSuccess() {
        assertTrue(t383.canConstruct("aab", "baac"));
    }

    /**
     * 测试用例9: 复杂情况 - 不可以构造
     * 预期结果: false
     */
    @Test
    void testCanConstructComplexCaseFailure() {
        assertFalse(t383.canConstruct("aab", "bac"));
    }

    /**
     * 测试用例10: ransomNote和magazine都为空
     * 预期结果: true
     */
    @Test
    void testCanConstructBothEmpty() {
        assertTrue(t383.canConstruct("", ""));
    }
}
