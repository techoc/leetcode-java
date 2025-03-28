package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T643Test {

    @Test
    void findMaxAverage() {
        T643 t643 = new T643();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = t643.findMaxAverage(nums, k);
        assertEquals(12.75, result);
    }
}