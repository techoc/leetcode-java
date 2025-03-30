package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T2841Test {

    @Test
    void maxSum() {
        T2841 t2841 = new T2841();
        assertEquals(18, t2841.maxSum(List.of(2, 6, 7, 3, 1, 7), 3, 4));
        assertEquals(4, t2841.maxSum(List.of(1, 1, 1, 3), 2, 2));
    }
}