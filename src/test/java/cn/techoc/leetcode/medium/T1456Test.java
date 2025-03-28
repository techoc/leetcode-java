package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1456Test {

    @Test
    void maxVowels() {
        T1456 t1456 = new T1456();
        assertEquals(3, t1456.maxVowels("abciiidef", 3));
        assertEquals(2, t1456.maxVowels("aeiou", 2));
        assertEquals(2, t1456.maxVowels("leetcode", 3));
    }
}