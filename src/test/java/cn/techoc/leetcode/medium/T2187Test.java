package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T2187Test {

    @Test
    void minimumTime() {
        T2187 t2187 = new T2187();
        assertEquals(3, t2187.minimumTime(new int[]{1, 2, 3}, 5));
        assertEquals(2, t2187.minimumTime(new int[]{2}, 1));
    }
}