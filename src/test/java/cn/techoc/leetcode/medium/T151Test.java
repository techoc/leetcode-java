package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 对 T151 类中的 reverseWords 方法进行单元测试
 */
public class T151Test {

    private final T151 t151 = new T151();

    @Test
    public void testNormalCase() {
        // 输入："the sky is blue"
        // 输出："blue is sky the"
        assertEquals("blue is sky the", t151.reverseWords("the sky is blue"));
    }

    @Test
    public void testWithLeadingAndTrailingSpaces() {
        // 输入："  hello world  "
        // 输出："world hello"
        assertEquals("world hello", t151.reverseWords("  hello world  "));
    }

    @Test
    public void testMultipleSpacesBetweenWords() {
        // 输入："a good   example"
        // 输出："example good a"
        assertEquals("example good a", t151.reverseWords("a good   example"));
    }

    @Test
    public void testAllSpaces() {
        // 输入："    "
        // 输出：""
        assertEquals("", t151.reverseWords("    "));
    }

    @Test
    public void testSingleWord() {
        // 输入："hello"
        // 输出："hello"
        assertEquals("hello", t151.reverseWords("hello"));
    }

    @Test
    public void testEmptyString() {
        // 输入：""
        // 输出：""
        assertEquals("", t151.reverseWords(""));
    }

    @Test
    public void testSingleCharacter() {
        // 输入："a"
        // 输出："a"
        assertEquals("a", t151.reverseWords("a"));
    }

    @Test
    public void testSingleSpace() {
        // 输入：" "
        // 输出：""
        assertEquals("", t151.reverseWords(" "));
    }
}
