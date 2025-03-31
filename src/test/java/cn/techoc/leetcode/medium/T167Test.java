package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T167Test {

    @Test
    void twoSum() {
        T167 t167 = new T167();
        assertArrayEquals(new int[]{1, 2}, t167.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 3}, t167.twoSum(new int[]{2, 3, 4}, 6));
        assertArrayEquals(new int[]{1, 2}, t167.twoSum(new int[]{-1, 0}, -1));
    }
}