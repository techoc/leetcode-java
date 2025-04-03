package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T275Test {

    @Test
    void hIndex() {
        T275 t275 = new T275();
        assertEquals(3, t275.hIndex(new int[]{0, 1, 3, 5, 6}));
    }
}