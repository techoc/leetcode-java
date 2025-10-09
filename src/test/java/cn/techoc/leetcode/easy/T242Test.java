package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * T242 类的单元测试
 * 测试 isAnagram 方法的功能正确性
 */
class T242Test {

    private final T242 t242 = new T242();

    @Test
    @DisplayName("测试两个字符串是异位词的情况")
    void testIsAnagram_WhenStringsAreAnagrams_ShouldReturnTrue() {
        // Given
        String s = "anagram";
        String t = "nagaram";

        // When
        boolean result = t242.isAnagram(s, t);

        // Then
        assertTrue(result, "期望 'anagram' 和 'nagaram' 是异位词");
    }

    @Test
    @DisplayName("测试两个字符串不是异位词的情况")
    void testIsAnagram_WhenStringsAreNotAnagrams_ShouldReturnFalse() {
        // Given
        String s = "rat";
        String t = "car";

        // When
        boolean result = t242.isAnagram(s, t);

        // Then
        assertFalse(result, "期望 'rat' 和 'car' 不是异位词");
    }

    @Test
    @DisplayName("测试两个空字符串的情况")
    void testIsAnagram_WhenBothStringsAreEmpty_ShouldReturnTrue() {
        // Given
        String s = "";
        String t = "";

        // When
        boolean result = t242.isAnagram(s, t);

        // Then
        assertTrue(result, "期望两个空字符串是异位词");
    }

    @Test
    @DisplayName("测试单个相同字符的情况")
    void testIsAnagram_WhenSingleSameCharacter_ShouldReturnTrue() {
        // Given
        String s = "a";
        String t = "a";

        // When
        boolean result = t242.isAnagram(s, t);

        // Then
        assertTrue(result, "期望 'a' 和 'a' 是异位词");
    }

    @Test
    @DisplayName("测试单个不同字符的情况")
    void testIsAnagram_WhenSingleDifferentCharacters_ShouldReturnFalse() {
        // Given
        String s = "a";
        String t = "b";

        // When
        boolean result = t242.isAnagram(s, t);

        // Then
        assertFalse(result, "期望 'a' 和 'b' 不是异位词");
    }

    @Test
    @DisplayName("测试长度不同的字符串")
    void testIsAnagram_WhenStringLengthsDiffer_ShouldReturnFalse() {
        // Given
        String s = "abc";
        String t = "ab";

        // When
        boolean result = t242.isAnagram(s, t);

        // Then
        assertFalse(result, "期望长度不同的字符串 'abc' 和 'ab' 不是异位词");
    }

    @Test
    @DisplayName("测试完全相同的字符串")
    void testIsAnagram_WhenStringsAreIdentical_ShouldReturnTrue() {
        // Given
        String s = "abc";
        String t = "abc";

        // When
        boolean result = t242.isAnagram(s, t);

        // Then
        assertTrue(result, "期望相同的字符串 'abc' 和 'abc' 是异位词");
    }

    @Test
    @DisplayName("测试包含重复字符的字符串")
    void testIsAnagram_WhenStringsContainDuplicateCharacters_ShouldReturnTrue() {
        // Given
        String s = "aabbcc";
        String t = "ccbbaa";

        // When
        boolean result = t242.isAnagram(s, t);

        // Then
        assertTrue(result, "期望 'aabbcc' 和 'ccbbaa' 是异位词");
    }
}
