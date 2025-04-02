package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T704Test {

    @Test
    void search() {
        T704 t704 = new T704();
        assertEquals(4, t704.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        assertEquals(-1, t704.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}