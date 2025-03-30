package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T2461Test {

    @Test
    void maximumSubarraySum() {
        T2461 t2461 = new T2461();
        assertEquals(15, t2461.maximumSubarraySum(new int[]{1, 5, 4, 2, 9, 9, 9}, 3));
        assertEquals(12, t2461.maximumSubarraySum(new int[]{9, 9, 9, 1, 2, 3}, 3));
    }
}