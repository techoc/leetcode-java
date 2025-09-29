package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 对 T6 类中的 convert 方法进行单元测试
 */
class T6Test {

    private final T6 t6 = new T6();

    /**
     * 测试基本Z字形变换 numRows=3
     */
    @Test
    void testConvertWithThreeRows() {
        String input = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";
        assertEquals(expected, t6.convert(input, numRows), "应正确处理三行Z字形");
    }

    /**
     * 测试四行Z字形变换
     */
    @Test
    void testConvertWithFourRows() {
        String input = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";
        assertEquals(expected, t6.convert(input, numRows), "应正确处理四行Z字形");
    }

    /**
     * 测试单字符且只有一行的情况
     */
    @Test
    void testSingleCharacterOneRow() {
        String input = "A";
        int numRows = 1;
        String expected = "A";
        assertEquals(expected, t6.convert(input, numRows), "单字符一行应该不变");
    }

    /**
     * 测试空字符串
     */
    @Test
    void testEmptyString() {
        String input = "";
        int numRows = 1;
        String expected = "";
        assertEquals(expected, t6.convert(input, numRows), "空字符串应保持为空");
    }

    /**
     * 测试行数为1时不改变顺序
     */
    @Test
    void testNumRowsIsOne() {
        String input = "AB";
        int numRows = 1;
        String expected = "AB";
        assertEquals(expected, t6.convert(input, numRows), "当行数为1时应原样返回");
    }

    /**
     * 测试两行但不足两个完整周期的情况
     */
    @Test
    void testTwoRowsIncompleteCycle() {
        String input = "ABC";
        int numRows = 2;
        String expected = "ACB";
        assertEquals(expected, t6.convert(input, numRows), "应能正确处理不足两轮的Z字形");
    }
}
