package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T438Test {

    @Test
    void findAnagrams() {
        T438 t438 = new T438();
        List<Integer> res = t438.findAnagrams("cbaebabacd", "abc");
        assertEquals(2, res.size());
        assertEquals(0, res.get(0));
        assertEquals(6, res.get(1));
    }
}