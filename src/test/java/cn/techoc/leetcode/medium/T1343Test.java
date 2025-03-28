package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1343Test {

    @Test
    void numOfSubarrays() {
        T1343 t1343 = new T1343();
        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;
        int result = t1343.numOfSubarrays(arr, k, threshold);
        assertEquals(3, result);

        int[] arr2 = {11, 13, 17, 23, 29, 31, 7, 5, 2, 3};
        int k2 = 3;
        int threshold2 = 5;
        int result2 = t1343.numOfSubarrays(arr2, k2, threshold2);
        assertEquals(6, result2);
    }
}