package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * T13 罗马数字转整数 的单元测试类
 */
class T13Test {

    private final T13 t13 = new T13();

    @Test
    void testRomanToInt_III() {
        assertEquals(3, t13.romanToInt("III")); // III = 1 + 1 + 1
    }

    @Test
    void testRomanToInt_IV() {
        assertEquals(4, t13.romanToInt("IV")); // IV = 5 - 1
    }

    @Test
    void testRomanToInt_IX() {
        assertEquals(9, t13.romanToInt("IX")); // IX = 10 - 1
    }

    @Test
    void testRomanToInt_LVIII() {
        assertEquals(58, t13.romanToInt("LVIII")); // L = 50, V = 5, III = 3
    }

    @Test
    void testRomanToInt_MCMXC() {
        assertEquals(1990, t13.romanToInt("MCMXC")); // M = 1000, CM = 900, XC = 90
    }

    @Test
    void testRomanToInt_MMCDXLIV() {
        assertEquals(2444, t13.romanToInt("MMCDXLIV")); // MM = 2000, CD = 400, XL = 40, IV = 4
    }

    @Test
    void testRomanToInt_SingleChar() {
        assertEquals(1, t13.romanToInt("I"));
        assertEquals(5, t13.romanToInt("V"));
        assertEquals(10, t13.romanToInt("X"));
        assertEquals(50, t13.romanToInt("L"));
        assertEquals(100, t13.romanToInt("C"));
        assertEquals(500, t13.romanToInt("D"));
        assertEquals(1000, t13.romanToInt("M"));
    }

    @Test
    void testRomanToInt_MaxValue() {
        assertEquals(3999, t13.romanToInt("MMMCMXCIX")); // 最大合法罗马数字
    }
}
