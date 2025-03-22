package cn.techoc.leetcode.easy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class T2643Test {
    @Test
    public void test1() {
        int[][] mat = {{0, 1}, {1, 0}};
        T2643 t2643 = new T2643();
        int[] res = t2643.rowAndMaximumOnes(mat);
        Assertions.assertArrayEquals(new int[]{0, 1}, res);
    }

    @Test
    public void test2() {
        int[][] mat = {{0, 0, 0}, {0, 1, 1}};
        T2643 t2643 = new T2643();
        int[] res = t2643.rowAndMaximumOnes(mat);
        Assertions.assertArrayEquals(new int[]{1, 2}, res);
    }

    @Test
    public void test3() {
        int[][] mat = {{0, 0}, {1, 1}, {0, 0}};
        T2643 t2643 = new T2643();
        int[] res = t2643.rowAndMaximumOnes(mat);
        Assertions.assertArrayEquals(new int[]{1, 2}, res);
    }
}
