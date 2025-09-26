package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * 测试类：T14
 * 方法：longestCommonPrefix
 */
class T14Test {

    private final T14 t14 = new T14();

    /**
     * 测试正常情况：多个字符串具有公共前缀
     */
    @Test
    void testLongestCommonPrefix_NormalCase() {
        String[] input = {"flower", "flow", "flight"};
        String expected = "fl";
        String result = t14.longestCommonPrefix(input);
        assertEquals(expected, result);
    }

    /**
     * 测试无公共前缀的情况
     */
    @Test
    void testLongestCommonPrefix_NoCommonPrefix() {
        String[] input = {"dog", "racecar", "car"};
        String expected = "";
        String result = t14.longestCommonPrefix(input);
        assertEquals(expected, result);
    }

    /**
     * 测试只有一个字符串的情况
     */
    @Test
    void testLongestCommonPrefix_SingleString() {
        String[] input = {"single"};
        String expected = "single";
        String result = t14.longestCommonPrefix(input);
        assertEquals(expected, result);
    }

    /**
     * 测试所有字符串都相同的情况
     */
    @Test
    void testLongestCommonPrefix_AllSameStrings() {
        String[] input = {"test", "test", "test"};
        String expected = "test";
        String result = t14.longestCommonPrefix(input);
        assertEquals(expected, result);
    }

    /**
     * 测试包含空字符串的情况
     */
    @Test
    void testLongestCommonPrefix_ContainsEmptyString() {
        String[] input = {"", "abc", "def"};
        String expected = "";
        String result = t14.longestCommonPrefix(input);
        assertEquals(expected, result);
    }

    /**
     * 测试输入为 null 的情况（虽然 Java 中不推荐传 null 数组，但为了健壮性考虑）
     * 注意：原函数未做 null 检查，这里会抛出 NullPointerException
     */
    @Test
    void testLongestCommonPrefix_NullInput() {
        assertThrows(NullPointerException.class, () -> t14.longestCommonPrefix(null));
    }

    /**
     * 测试输入为空数组的情况（原函数未处理，会抛出 ArrayIndexOutOfBoundsException）
     */
    @Test
    void testLongestCommonPrefix_EmptyArray() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> t14.longestCommonPrefix(new String[]{}));
    }
}
