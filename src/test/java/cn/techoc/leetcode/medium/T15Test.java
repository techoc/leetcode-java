package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T15Test {

    @Test
    void threeSum() {
        T15 t15 = new T15();
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(-1, -1, 2));
        list.add(Arrays.asList(-1, 0, 1));
        assertEquals(list, t15.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}