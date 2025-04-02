package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class T34Test {

    @Test
    void searchRange() {
        T34 t34 = new T34();
        assertArrayEquals(new int[]{3, 4}, t34.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
        assertArrayEquals(new int[]{-1, -1}, t34.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
    }
}