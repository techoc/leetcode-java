package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T3502Test {

    @Test
    void minCosts() {
        T3502 t3502 = new T3502();
        assertArrayEquals(new int[]{5, 3, 3, 1, 1, 1}, t3502.minCosts(new int[]{5, 3, 4, 1, 3, 2}));
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, t3502.minCosts(new int[]{1, 2, 4, 6, 7}));
    }
}