package cn.techoc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T2379Test {

    @Test
    void minimumRecolors() {
        T2379 t2379 = new T2379();
        assertEquals(3, t2379.minimumRecolors("WBBWWBBWBW", 7));
        assertEquals(0, t2379.minimumRecolors("WBWBBBW", 2));
    }
}