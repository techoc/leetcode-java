package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 字符串元音游戏单元测试类
 */
public class T3227Test {

    private final T3227 t3227 = new T3227();

    /**
     * 测试无元音字母的情况
     */
    @Test
    public void testDoesAliceWin_NoVowels() {
        String input = "bcdfg";
        boolean result = t3227.doesAliceWin(input);
        assertFalse(result, "字符串中无元音字母时，Alice 不应获胜");
    }

    /**
     * 测试奇数个元音字母的情况
     */
    @Test
    public void testDoesAliceWin_OddVowels() {
        String input = "abc"; // 元音字母: a (1个)
        boolean result = t3227.doesAliceWin(input);
        assertTrue(result, "奇数个元音字母时，Alice 应获胜");
    }

    /**
     * 测试偶数个元音字母的情况
     */
    @Test
    public void testDoesAliceWin_EvenVowels() {
        String input = "ae"; // 元音字母: a, e (2个)
        boolean result = t3227.doesAliceWin(input);
        assertTrue(result, "偶数个元音字母时，Alice 应获胜");
    }

    /**
     * 测试多个奇数个元音字母的情况
     */
    @Test
    public void testDoesAliceWin_MultipleOddVowels() {
        String input = "aeiou"; // 元音字母: a, e, i, o, u (5个)
        boolean result = t3227.doesAliceWin(input);
        assertTrue(result, "奇数个元音字母时，Alice 应获胜");
    }

    /**
     * 测试多个偶数个元音字母的情况
     */
    @Test
    public void testDoesAliceWin_MultipleEvenVowels() {
        String input = "aeio"; // 元音字母: a, e, i, o (4个)
        boolean result = t3227.doesAliceWin(input);
        assertTrue(result, "偶数个元音字母时，Alice 应获胜");
    }

    /**
     * 测试空字符串的情况
     */
    @Test
    public void testDoesAliceWin_EmptyString() {
        String input = "";
        boolean result = t3227.doesAliceWin(input);
        assertFalse(result, "空字符串时，Alice 不应获胜");
    }
}
