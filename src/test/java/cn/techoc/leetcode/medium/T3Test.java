package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T3Test {

    private final T3 t3 = new T3();

    /**
     * 测试空字符串
     */
    @Test
    public void testLengthOfLongestSubstring_EmptyString() {
        assertEquals(0, t3.lengthOfLongestSubstring(""), "空字符串应返回0");
    }

    /**
     * 测试单个字符
     */
    @Test
    public void testLengthOfLongestSubstring_SingleChar() {
        assertEquals(1, t3.lengthOfLongestSubstring("a"), "单字符应返回1");
    }

    /**
     * 测试经典案例："abcabcbb"
     */
    @Test
    public void testLengthOfLongestSubstring_ClassicCase() {
        assertEquals(3, t3.lengthOfLongestSubstring("abcabcbb"), "期望最长子串长度为3");
    }

    /**
     * 测试所有字符都相同的字符串："bbbbb"
     */
    @Test
    public void testLengthOfLongestSubstring_AllSameChars() {
        assertEquals(1, t3.lengthOfLongestSubstring("bbbbb"), "全部重复字符应返回1");
    }

    /**
     * 测试尾部非重复更优的情况："pwwkew"
     */
    @Test
    public void testLengthOfLongestSubstring_TailOptimal() {
        assertEquals(3, t3.lengthOfLongestSubstring("pwwkew"), "尾部最优子串长度为3");
    }

    /**
     * 测试完全无重复字符的情况："abcdef"
     */
    @Test
    public void testLengthOfLongestSubstring_NoRepeats() {
        assertEquals(6, t3.lengthOfLongestSubstring("abcdef"), "无重复字符应返回整个长度");
    }

    /**
     * 测试中间起始位置最优的情况："dvdf"
     */
    @Test
    public void testLengthOfLongestSubstring_MiddleStartOptimal() {
        assertEquals(3, t3.lengthOfLongestSubstring("dvdf"), "中间起始最优长度为3");
    }
}