package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class T2300Test {

    @Test
    void successfulPairs() {
        T2300 t2300 = new T2300();
        assertArrayEquals(new int[]{4, 0, 3}, t2300.successfulPairs(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7));
        assertArrayEquals(new int[]{2, 0, 2}, t2300.successfulPairs(new int[]{3, 1, 2}, new int[]{8, 5, 8}, 16));
        assertArrayEquals(new int[]{0, 0, 0, 1, 3, 3, 4}, t2300.successfulPairs(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 2, 3, 4, 5, 6, 7}, 25));
    }
}