package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * T205 类的单元测试
 * 测试 isIsomorphic 方法的功能正确性
 */
class T205Test {

    private final T205 solution = new T205();

    @Test
    void testSameStrings() {
        // 测试相等字符串："aa" -> "aa"
        assertTrue(solution.isIsomorphic("aa", "aa"));
    }

    @Test
    void testIsomorphicStrings() {
        // 测试同构字符串："egg" -> "add"
        assertTrue(solution.isIsomorphic("egg", "add"));
    }

    @Test
    void testNonIsomorphicDueToConflictMapping() {
        // 测试非同构字符串："foo" -> "bar" （o 映射冲突）
        assertFalse(solution.isIsomorphic("foo", "bar"));
    }

    @Test
    void testDifferentLengths() {
        // 测试长度不同的字符串："ab" -> "abc"
        assertFalse(solution.isIsomorphic("ab", "abc"));
    }

    @Test
    void testMultipleToOneMapping() {
        // 测试多个字符映射到同一字符的情况："ab" -> "aa"
        assertFalse(solution.isIsomorphic("ab", "aa"));
    }

    @Test
    void testValidComplexCase() {
        // 测试复杂合法情况："paper" -> "title"
        assertTrue(solution.isIsomorphic("paper", "title"));
    }

    @Test
    void testValidNumberComplexCase() {
        // 测试复杂合法情况："13" -> "42"
        assertTrue(solution.isIsomorphic("13", "42"));
    }
}
