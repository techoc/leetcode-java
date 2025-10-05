package cn.techoc.leetcode.hard;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * T30 单元测试类
 */
class T30Test {

    private final T30 t30 = new T30();

    /**
     * TC01: 正常匹配多个子串
     */
    @Test
    void testFindSubstring_NormalCase() {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> expected = Arrays.asList(0, 9);
        List<Integer> result = t30.findSubstring(s, words);
        assertEquals(expected, result);
    }

    /**
     * TC02: 无法完全匹配
     */
    @Test
    void testFindSubstring_NoMatch() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "word"};
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = t30.findSubstring(s, words);
        assertEquals(expected, result);
    }

    /**
     * TC03: 多个匹配项
     */
    @Test
    void testFindSubstring_MultipleMatches() {
        String s = "barfoobar";
        String[] words = {"foo", "bar"};
        List<Integer> expected = Arrays.asList(0, 3);
        List<Integer> result = t30.findSubstring(s, words);
        assertEquals(expected, result);
    }

    /**
     * TC04: 空字符串输入
     */
    @Test
    void testFindSubstring_EmptyString() {
        String s = "";
        String[] words = {"foo", "bar"};
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = t30.findSubstring(s, words);
        assertEquals(expected, result);
    }

    /**
     * TC05: 空单词数组
     */
    @Test
    void testFindSubstring_EmptyWords() {
        String s = "foobar";
        String[] words = {};
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = t30.findSubstring(s, words);
        assertEquals(expected, result);
    }

    /**
     * TC06: 单字符匹配
     */
    @Test
    void testFindSubstring_SingleChar() {
        String s = "a";
        String[] words = {"a"};
        List<Integer> expected = List.of(0);
        List<Integer> result = t30.findSubstring(s, words);
        assertEquals(expected, result);
    }

    /**
     * TC07: 重复单词无法匹配
     */
    @Test
    void testFindSubstring_DuplicateWords() {
        String s = "foobar";
        String[] words = {"foo", "bar", "foo"};
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = t30.findSubstring(s, words);
        assertEquals(expected, result);
    }
}
