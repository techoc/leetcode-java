package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class T27Test {

    @Test
    public void testRemoveElement() {
        T27 t27 = new T27();

        // 测试用例 1：正常情况，数组中有多个要移除的元素
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int expected1 = 2;
        int actual1 = t27.removeElement(nums1, val1);
        assertArrayEquals(new int[]{2, 2, 2, 3}, nums1);
        assertEquals(expected1, actual1);
    }
}