package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class T2090Test {

    @Test
    void getAverages() {
        T2090 t2090 = new T2090();
        int[] nums = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;
        int[] expected = {-1, -1, -1, 5, 4, 4, -1, -1, -1};
        assertArrayEquals(expected, t2090.getAverages(nums, k));
    }
}