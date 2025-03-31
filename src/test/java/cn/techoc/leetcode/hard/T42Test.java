package cn.techoc.leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T42Test {

    @Test
    void trap() {
        T42 t42 = new T42();
        assertEquals(6, t42.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(9, t42.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }


    @Test
    void trap2() {
        T42 t42 = new T42();
        assertEquals(6, t42.trap2(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(9, t42.trap2(new int[]{4, 2, 0, 3, 2, 5}));
    }
}