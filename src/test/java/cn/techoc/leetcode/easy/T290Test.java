package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * T290 单词规律 测试类
 */
public class T290Test {

    private final T290 t290 = new T290();

    /**
     * 测试用例1: 正常匹配
     * pattern = "abba", s = "dog cat cat dog"
     * 预期: true
     */
    @Test
    public void testWordPattern_NormalMatch() {
        assertTrue(t290.wordPattern("abba", "dog cat cat dog"));
    }

    /**
     * 测试用例2: 字符与单词映射冲突
     * pattern = "abba", s = "dog cat cat fish"
     * 预期: false
     */
    @Test
    public void testWordPattern_CharToWordConflict() {
        assertFalse(t290.wordPattern("abba", "dog cat cat fish"));
    }

    /**
     * 测试用例3: 单词与字符映射冲突
     * pattern = "aaaa", s = "dog cat cat dog"
     * 预期: false
     */
    @Test
    public void testWordPattern_WordToCharConflict() {
        assertFalse(t290.wordPattern("aaaa", "dog cat cat dog"));
    }

    /**
     * 测试用例4: 单词重复但字符不同
     * pattern = "abba", s = "dog dog dog dog"
     * 预期: false
     */
    @Test
    public void testWordPattern_AllSameWords() {
        assertFalse(t290.wordPattern("abba", "dog dog dog dog"));
    }

    /**
     * 测试用例5: 长度不一致
     * pattern = "abc", s = "dog cat"
     * 预期: false
     */
    @Test
    public void testWordPattern_LengthMismatch() {
        assertFalse(t290.wordPattern("abc", "dog cat"));
    }

    /**
     * 测试用例7: 单字符单单词匹配
     * pattern = "a", s = "dog"
     * 预期: true
     */
    @Test
    public void testWordPattern_SingleCharWord() {
        assertTrue(t290.wordPattern("a", "dog"));
    }

    /**
     * 测试用例8: 单词相同但字符不同
     * pattern = "ab", s = "dog dog"
     * 预期: false
     */
    @Test
    public void testWordPattern_DifferentCharsSameWords() {
        assertFalse(t290.wordPattern("ab", "dog dog"));
    }
}
