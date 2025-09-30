package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * {@link T28#strStr(String, String)} 的单元测试类
 */
class T28Test {

    private final T28 t28 = new T28();

    // 测试用例1: needle为空字符串 -> 应返回0
    @Test
    void testNeedleIsEmpty() {
        assertEquals(0, t28.strStr("hello", ""));
    }

    // 测试用例2: needle比haystack长 -> 应返回-1
    @Test
    void testNeedleLongerThanHaystack() {
        assertEquals(-1, t28.strStr("hi", "hello"));
    }

    // 测试用例3: needle不存在于haystack中 -> 应返回-1
    @Test
    void testNeedleNotFound() {
        assertEquals(-1, t28.strStr("abcdef", "xyz"));
    }

    // 测试用例4: needle出现在haystack开头 -> 应返回0
    @Test
    void testNeedleAtStart() {
        assertEquals(0, t28.strStr("hello world", "hello"));
    }

    // 测试用例5: needle出现在haystack末尾 -> 应返回对应索引
    @Test
    void testNeedleAtEnd() {
        assertEquals(6, t28.strStr("hello world", "world"));
    }

    // 测试用例6: needle出现在haystack中间 -> 应返回首次出现的索引
    @Test
    void testNeedleInMiddle() {
        assertEquals(3, t28.strStr("abcdefghijk", "def"));
    }

    // 测试用例7: 匹配过程中有部分重叠但最终失败的情况 -> 应返回-1
    @Test
    void testPartialMatchFailure() {
        // 注意：由于原始算法存在bug，此测试可能失败
        // 示例："mississippi" 查找 "issip"
        assertEquals(4, t28.strStr("mississippi", "issip"));
    }

    // 测试用例8: 完全匹配成功 -> 返回起始索引
    @Test
    void testFullMatchSuccess() {
        assertEquals(2, t28.strStr("ababcabc", "abc"));
    }

    @Test
    void testFullMatchSuccess1() {
        assertEquals(3, t28.strStr("ississipissip", "issip"));
    }

    @Test
    void testMatchSuccess() {
        assertEquals(5, t28.strStr("babbbbbabb", "bbab"));
    }

    // 测试用例9: haystack和needle都只有一个字符且相同 -> 返回0
    @Test
    void testSingleCharSame() {
        assertEquals(0, t28.strStr("a", "a"));
    }

    // 测试用例10: haystack和needle都只有一个字符但不同 -> 返回-1
    @Test
    void testSingleCharDifferent() {
        assertEquals(-1, t28.strStr("a", "b"));
    }
}
