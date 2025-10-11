package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 对T202类中isHappy方法进行单元测试
 */
public class T202Test {

    private final T202 t202 = new T202();

    /**
     * 测试用例TC01: 输入19，期望返回true（典型快乐数）
     */
    @Test
    public void testIsHappy_WithTypicalHappyNumber_ShouldReturnTrue() {
        assertTrue(t202.isHappy(19), "19 应该是一个快乐数");
    }

    /**
     * 测试用例TC02: 输入2，期望返回false（非快乐数）
     */
    @Test
    public void testIsHappy_WithNonHappyNumber_ShouldReturnFalse() {
        assertFalse(t202.isHappy(2), "2 不应该是一个快乐数");
    }

    /**
     * 测试用例TC03: 输入1，期望返回true（最小的快乐数）
     */
    @Test
    public void testIsHappy_WithOne_ShouldReturnTrue() {
        assertTrue(t202.isHappy(1), "1 是最简单的快乐数");
    }

    /**
     * 测试用例TC04: 输入7，期望返回true（小于10的快乐数之一）
     */
    @Test
    public void testIsHappy_WithSeven_ShouldReturnTrue() {
        assertTrue(t202.isHappy(7), "7 是一个小于10的快乐数");
    }

    /**
     * 测试用例TC05: 输入10，期望返回true（平方和为1）
     */
    @Test
    public void testIsHappy_WithTen_ShouldReturnTrue() {
        assertTrue(t202.isHappy(10), "10 的各位平方和为1，应为快乐数");
    }
}
