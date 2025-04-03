package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T875Test {

    @Test
    void minEatingSpeed() {
        T875 t875 = new T875();
        assertEquals(4, t875.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
        assertEquals(30, t875.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
        assertEquals(23, t875.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }
}