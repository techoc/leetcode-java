package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T3Test {

    @Test
    void lengthOfLongestSubstring() {
        T3 t3 = new T3();
        assertEquals(3, t3.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, t3.lengthOfLongestSubstring("bbbbb"));
    }
}