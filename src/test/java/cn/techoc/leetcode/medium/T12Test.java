package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * T12 类的单元测试
 * 测试 intToRoman 方法在不同输入下的正确性
 */
class T12Test {

    private final T12 t12 = new T12();

    /**
     * 测试输入为 1 的情况
     * 预期输出: "I"
     */
    @Test
    void testIntToRomanWithOne() {
        assertEquals("I", t12.intToRoman(1));
    }

    /**
     * 测试输入为 4 的情况
     * 预期输出: "IV"
     */
    @Test
    void testIntToRomanWithFour() {
        assertEquals("IV", t12.intToRoman(4));
    }

    /**
     * 测试输入为 5 的情况
     * 预期输出: "V"
     */
    @Test
    void testIntToRomanWithFive() {
        assertEquals("V", t12.intToRoman(5));
    }

    /**
     * 测试输入为 9 的情况
     * 预期输出: "IX"
     */
    @Test
    void testIntToRomanWithNine() {
        assertEquals("IX", t12.intToRoman(9));
    }

    /**
     * 测试输入为 10 的情况
     * 预期输出: "X"
     */
    @Test
    void testIntToRomanWithTen() {
        assertEquals("X", t12.intToRoman(10));
    }

    /**
     * 测试输入为 27 的情况
     * 预期输出: "XXVII"
     */
    @Test
    void testIntToRomanWithTwentySeven() {
        assertEquals("XXVII", t12.intToRoman(27));
    }

    /**
     * 测试输入为 48 的情况
     * 预期输出: "XLVIII"
     */
    @Test
    void testIntToRomanWithFortyEight() {
        assertEquals("XLVIII", t12.intToRoman(48));
    }

    /**
     * 测试输入为 59 的情况
     * 预期输出: "LIX"
     */
    @Test
    void testIntToRomanWithFiftyNine() {
        assertEquals("LIX", t12.intToRoman(59));
    }

    /**
     * 测试输入为 93 的情况
     * 预期输出: "XCIII"
     */
    @Test
    void testIntToRomanWithNinetyThree() {
        assertEquals("XCIII", t12.intToRoman(93));
    }

    /**
     * 测试输入为 141 的情况
     * 预期输出: "CXLI"
     */
    @Test
    void testIntToRomanWithOneHundredFortyOne() {
        assertEquals("CXLI", t12.intToRoman(141));
    }

    /**
     * 测试输入为 163 的情况
     * 预期输出: "CLXIII"
     */
    @Test
    void testIntToRomanWithOneHundredSixtyThree() {
        assertEquals("CLXIII", t12.intToRoman(163));
    }

    /**
     * 测试输入为 402 的情况
     * 预期输出: "CDII"
     */
    @Test
    void testIntToRomanWithFourHundredTwo() {
        assertEquals("CDII", t12.intToRoman(402));
    }

    /**
     * 测试输入为 575 的情况
     * 预期输出: "DLXXV"
     */
    @Test
    void testIntToRomanWithFiveHundredSeventyFive() {
        assertEquals("DLXXV", t12.intToRoman(575));
    }

    /**
     * 测试输入为 911 的情况
     * 预期输出: "CMXI"
     */
    @Test
    void testIntToRomanWithNineHundredEleven() {
        assertEquals("CMXI", t12.intToRoman(911));
    }

    /**
     * 测试输入为 1024 的情况
     * 预期输出: "MXXIV"
     */
    @Test
    void testIntToRomanWithOneThousandTwentyFour() {
        assertEquals("MXXIV", t12.intToRoman(1024));
    }

    /**
     * 测试输入为 3000 的情况
     * 预期输出: "MMM"
     */
    @Test
    void testIntToRomanWithThreeThousand() {
        assertEquals("MMM", t12.intToRoman(3000));
    }

    /**
     * 测试输入为 3749 的情况
     * 预期输出: "MMMDCCXLIX"
     */
    @Test
    void testIntToRomanWithThreeThousandSevenHundredFortyNine() {
        assertEquals("MMMDCCXLIX", t12.intToRoman(3749));
    }
}
