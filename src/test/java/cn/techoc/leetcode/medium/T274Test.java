package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * T274 类的单元测试
 */
public class T274Test {

    private final T274 t274 = new T274();

    /**
     * 测试正常情况：[3, 0, 6, 1, 5] -> 期望 H 指数为 3
     */
    @Test
    public void testHIndex_NormalCase() {
        int[] citations = {3, 0, 6, 1, 5};
        int expected = 3;
        int actual = t274.hIndex(citations);
        assertEquals(expected, actual);
    }

    /**
     * 测试边界情况：所有引用次数为 0 -> 期望 H 指数为 0
     */
    @Test
    public void testHIndex_AllZero() {
        int[] citations = {0, 0, 0};
        int expected = 0;
        int actual = t274.hIndex(citations);
        assertEquals(expected, actual);
    }

    /**
     * 测试边界情况：所有引用次数 >= 论文总数 -> 期望 H 指数为数组长度
     */
    @Test
    public void testHIndex_AllHighCitations() {
        int[] citations = {4, 4, 4};
        int expected = 3;
        int actual = t274.hIndex(citations);
        assertEquals(expected, actual);
    }

    /**
     * 测试边界情况：空数组 -> 期望 H 指数为 0
     */
    @Test
    public void testHIndex_EmptyArray() {
        int[] citations = {};
        int expected = 0;
        int actual = t274.hIndex(citations);
        assertEquals(expected, actual);
    }

    /**
     * 测试边界情况：单个元素 -> 期望 H 指数为 1
     */
    @Test
    public void testHIndex_SingleElement() {
        int[] citations = {1};
        int expected = 1;
        int actual = t274.hIndex(citations);
        assertEquals(expected, actual);
    }

    /**
     * 测试边界情况：所有元素相同且不为 0 -> 期望 H 指数为元素值与数组长度的较小者
     */
    @Test
    public void testHIndex_SameElements() {
        int[] citations = {2, 2, 2};
        int expected = 2;
        int actual = t274.hIndex(citations);
        assertEquals(expected, actual);
    }
}
