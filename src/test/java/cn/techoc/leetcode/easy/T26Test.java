package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class T26Test {

    /**
     * 测试空数组的情况
     */
    @Test
    public void testRemoveDuplicatesWithEmptyArray() {
        T26 t26 = new T26();
        int[] nums = {};
        int newLength = t26.removeDuplicates(nums);
        Assertions.assertEquals(0, newLength);
    }

    /**
     * 测试只有一个元素的数组
     */
    @Test
    public void testRemoveDuplicatesWithSingleElement() {
        T26 t26 = new T26();
        int[] nums = {1};
        int newLength = t26.removeDuplicates(nums);
        Assertions.assertEquals(1, newLength);
        Assertions.assertArrayEquals(new int[]{1}, java.util.Arrays.copyOf(nums, newLength));
    }

    /**
     * 测试所有元素都相同的数组
     */
    @Test
    public void testRemoveDuplicatesWithAllSameElements() {
        T26 t26 = new T26();
        int[] nums = {2, 2, 2, 2};
        int newLength = t26.removeDuplicates(nums);
        Assertions.assertEquals(1, newLength);
        Assertions.assertArrayEquals(new int[]{2}, java.util.Arrays.copyOf(nums, newLength));
    }

    /**
     * 测试没有重复元素的数组
     */
    @Test
    public void testRemoveDuplicatesWithNoDuplicates() {
        T26 t26 = new T26();
        int[] nums = {1, 2, 3, 4};
        int newLength = t26.removeDuplicates(nums);
        Assertions.assertEquals(4, newLength);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4}, java.util.Arrays.copyOf(nums, newLength));
    }

    /**
     * 测试部分重复的数组（LeetCode 示例）
     */
    @Test
    public void testRemoveDuplicatesWithSomeDuplicates() {
        T26 t26 = new T26();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength = t26.removeDuplicates(nums);
        Assertions.assertEquals(5, newLength);
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, java.util.Arrays.copyOf(nums, newLength));
    }
}
