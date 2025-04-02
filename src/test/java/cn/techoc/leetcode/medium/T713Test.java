package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T713Test {

    @Test
    void numSubarrayProductLessThanK() {
        T713 t713 = new T713();
        assertEquals(8, t713.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
    }
}