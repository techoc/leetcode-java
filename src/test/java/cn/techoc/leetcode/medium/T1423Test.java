package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1423Test {

    @Test
    void maxScore() {
        T1423 t1423 = new T1423();
        assertEquals(12, t1423.maxScore(new int[]{1, 2, 3, 4, 5, 6, 1}, 3));
        assertEquals(55, t1423.maxScore(new int[]{9, 7, 7, 9, 7, 7, 9}, 7));
    }
}