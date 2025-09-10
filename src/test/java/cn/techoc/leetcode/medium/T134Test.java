package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * T134 的单元测试类
 */
class T134Test {

    /**
     * 测试可以完成一圈的情况
     */
    @Test
    void testCanCompleteCircuit_Success() {
        T134 t134 = new T134();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int result = t134.canCompleteCircuit(gas, cost);
        assertEquals(3, result); // 起点为索引 3
    }

    /**
     * 测试无法完成一圈的情况
     */
    @Test
    void testCanCompleteCircuit_Failure() {
        T134 t134 = new T134();
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};
        int result = t134.canCompleteCircuit(gas, cost);
        assertEquals(-1, result); // 无法完成一圈
    }

    /**
     * 测试起点在末尾的情况
     */
    @Test
    void testCanCompleteCircuit_StartAtEnd() {
        T134 t134 = new T134();
        int[] gas = {5, 1, 2, 3, 4};
        int[] cost = {4, 4, 1, 5, 1};
        int result = t134.canCompleteCircuit(gas, cost);
        assertEquals(4, result); // 起点为索引 4
    }

    /**
     * 测试单个站点刚好完成的情况
     */
    @Test
    void testCanCompleteCircuit_SingleStation_Success() {
        T134 t134 = new T134();
        int[] gas = {1};
        int[] cost = {1};
        int result = t134.canCompleteCircuit(gas, cost);
        assertEquals(0, result); // 起点为索引 0
    }

    /**
     * 测试单个站点无法完成的情况
     */
    @Test
    void testCanCompleteCircuit_SingleStation_Failure() {
        T134 t134 = new T134();
        int[] gas = {2};
        int[] cost = {3};
        int result = t134.canCompleteCircuit(gas, cost);
        assertEquals(-1, result); // 无法完成
    }
}
