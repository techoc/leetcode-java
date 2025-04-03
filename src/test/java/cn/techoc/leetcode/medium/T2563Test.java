package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T2563Test {

    @Test
    void countFairPairs() {
        T2563 t2563 = new T2563();
        assertEquals(6, t2563.countFairPairs(new int[]{0, 1, 7, 4, 4, 5}, 3, 6));
        assertEquals(1, t2563.countFairPairs(new int[]{1, 7, 9, 2, 5}, 11, 11));
    }
}