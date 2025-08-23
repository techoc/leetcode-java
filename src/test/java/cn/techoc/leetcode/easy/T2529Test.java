package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T2529Test {

    @Test
    void maximumCount() {
        T2529 t2529 = new T2529();
        assertEquals(3, t2529.maximumCount(new int[]{-2, -1, -1, 1, 2, 3}));
        assertEquals(3, t2529.maximumCount(new int[]{-3, -2, -1, 0, 0, 1, 2}));
        assertEquals(4, t2529.maximumCount(new int[]{5, 20, 66, 1314}));
    }
}