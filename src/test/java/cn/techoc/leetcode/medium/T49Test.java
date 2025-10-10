package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * T49 单元测试类
 */
class T49Test {

    private final T49 t49 = new T49();

    @Test
    @DisplayName("TC01: 输入为 null，应返回空列表")
    void testGroupAnagrams_NullInput_ReturnsEmptyList() {
        String[] input = null;
        List<List<String>> result = t49.groupAnagrams(input);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName("TC02: 输入为空数组，应返回空列表")
    void testGroupAnagrams_EmptyArray_ReturnsEmptyList() {
        String[] input = {};
        List<List<String>> result = t49.groupAnagrams(input);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName("TC03: 输入单个字符串，应返回包含该字符串的一组")
    void testGroupAnagrams_SingleString_ReturnsOneGroup() {
        String[] input = {"a"};
        List<List<String>> expected = List.of(List.of("a"));
        List<List<String>> result = t49.groupAnagrams(input);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("TC04: LeetCode 示例输入")
    void testGroupAnagrams_LeetCodeExample_ReturnsCorrectGroups() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = t49.groupAnagrams(input);

        // 由于顺序可能不同，使用 contains 来判断
        assertEquals(3, result.size());
        assertTrue(result.contains(List.of("eat", "tea", "ate")));
        assertTrue(result.contains(List.of("tan", "nat")));
        assertTrue(result.contains(List.of("bat")));
    }

    @Test
    @DisplayName("TC05: 多组异位词")
    void testGroupAnagrams_MultipleGroups_ReturnsCorrectGroups() {
        String[] input = {"abc", "bca", "cab", "xyz"};
        List<List<String>> result = t49.groupAnagrams(input);

        assertEquals(2, result.size());
        assertTrue(result.contains(List.of("abc", "bca", "cab")));
        assertTrue(result.contains(List.of("xyz")));
    }

    @Test
    @DisplayName("TC06: 无异位词")
    void testGroupAnagrams_NoAnagrams_ReturnsEachInOwnGroup() {
        String[] input = {"abc", "def", "ghi"};
        List<List<String>> result = t49.groupAnagrams(input);

        assertEquals(3, result.size());
        assertTrue(result.contains(List.of("abc")));
        assertTrue(result.contains(List.of("def")));
        assertTrue(result.contains(List.of("ghi")));
    }

    @Test
    @DisplayName("TC07: 空字符串")
    void testGroupAnagrams_EmptyStrings_ReturnsGroupWithEmptyStrings() {
        String[] input = {"", ""};
        List<List<String>> expected = List.of(List.of("", ""));
        List<List<String>> result = t49.groupAnagrams(input);
        assertEquals(expected, result);
    }
}
