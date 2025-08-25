package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * T189类rotate方法的单元测试
 */
public class T189Test {

    private final T189 t189 = new T189();

    @Test
    @DisplayName("测试正常数组向右旋转")
    public void testRotateNormalCase() {
        // Given: 准备测试数据
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expected = {5, 6, 7, 1, 2, 3, 4};

        // When: 执行被测方法
        t189.rotate(nums, k);

        // Then: 验证结果
        assertArrayEquals(expected, nums, "数组应该向右旋转3个位置");
    }

    @Test
    @DisplayName("测试null数组输入")
    public void testRotateWithNullArray() {
        // Given: 准备null数组
        int[] nums = null;

        // When & Then: 执行方法应该不抛异常
        assertDoesNotThrow(() -> t189.rotate(nums, 1), "处理null数组时不应该抛出异常");
    }

    @Test
    @DisplayName("测试空数组输入")
    public void testRotateWithEmptyArray() {
        // Given: 准备空数组
        int[] nums = {};

        // When & Then: 执行方法应该不抛异常
        assertDoesNotThrow(() -> t189.rotate(nums, 1), "处理空数组时不应该抛出异常");
    }

    @Test
    @DisplayName("测试k为0的情况")
    public void testRotateWithZeroK() {
        // Given: 准备测试数据
        int[] nums = {1, 2, 3, 4, 5};
        int k = 0;
        int[] expected = {1, 2, 3, 4, 5};

        // When: 执行被测方法
        t189.rotate(nums, k);

        // Then: 验证结果
        assertArrayEquals(expected, nums, "k为0时数组应该保持不变");
    }

    @Test
    @DisplayName("测试k大于数组长度的情况")
    public void testRotateWithKGreaterThanLength() {
        // Given: 准备测试数据
        int[] nums = {1, 2};
        int k = 3; // k大于数组长度
        int[] expected = {2, 1}; // 实际应该旋转k % nums.length = 1次

        // When: 执行被测方法
        t189.rotate(nums, k);

        // Then: 验证结果
        assertArrayEquals(expected, nums, "当k大于数组长度时应该等效于旋转k % length次");
    }

    @Test
    @DisplayName("测试k等于数组长度的情况")
    public void testRotateWithKEqualsLength() {
        // Given: 准备测试数据
        int[] nums = {1, 2, 3};
        int k = 3; // k等于数组长度
        int[] expected = {1, 2, 3}; // 旋转完整周期后应该不变

        // When: 执行被测方法
        t189.rotate(nums, k);

        // Then: 验证结果
        assertArrayEquals(expected, nums, "当k等于数组长度时数组应该保持不变");
    }

    @Test
    @DisplayName("测试单元素数组")
    public void testRotateWithSingleElement() {
        // Given: 准备单元素数组
        int[] nums = {1};
        int k = 2;
        int[] expected = {1};

        // When: 执行被测方法
        t189.rotate(nums, k);

        // Then: 验证结果
        assertArrayEquals(expected, nums, "单元素数组旋转后应该保持不变");
    }

    @Test
    @DisplayName("测试负数数组元素")
    public void testRotateWithNegativeNumbers() {
        // Given: 准备包含负数的数组
        int[] nums = {-1, -2, -3, -4, -5, -6, -7};
        int k = 3;
        int[] expected = {-5, -6, -7, -1, -2, -3, -4};

        // When: 执行被测方法
        t189.rotate(nums, k);

        // Then: 验证结果
        assertArrayEquals(expected, nums, "包含负数的数组应该正确旋转");
    }
}
