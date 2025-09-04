package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * T55 跳跃游戏单元测试
 *
 * @author techoc
 * @since 2023
 */
@DisplayName("55. 跳跃游戏测试")
class T55Test {

    private final T55 t55 = new T55();

    @Test
    @DisplayName("测试能够跳跃到最后一个位置的情况")
    void testCanJumpSuccess() {
        // Given: 数组中存在位置i满足 n-1-i == nums[i]
        // 对于数组[2,3,1,1,4]，长度为5，索引1时: 5-1-1=3 == nums[1]=3
        int[] nums = {2, 3, 1, 1, 4};

        // When
        boolean result = t55.canJump(nums);

        // Then
        assertTrue(result, "应该能够跳跃到最后一个位置");
    }

    @Test
    @DisplayName("测试不能跳跃到最后一个位置的情况")
    void testCanJumpFail() {
        // Given: 数组中不存在位置i满足 n-1-i == nums[i]
        // 对于数组[3,2,1,0,4]，长度为5
        // 索引0: 5-1-0=4 != nums[0]=3
        // 索引1: 5-1-1=3 != nums[1]=2
        // 索引2: 5-1-2=2 != nums[2]=1
        // 索引3: 5-1-3=1 != nums[3]=0
        // 索引4: 5-1-4=0 != nums[4]=4
        int[] nums = {3, 2, 1, 0, 4};

        // When
        boolean result = t55.canJump(nums);

        // Then
        assertFalse(result, "不应该能够跳跃到最后一个位置");
    }

    @Test
    @DisplayName("测试只有一个元素的数组")
    void testSingleElementArray() {
        // Given: 只有一个元素的数组
        // 对于数组[0]，长度为1，索引0时: 1-1-0=0 == nums[0]=0
        int[] nums = {0};

        // When
        boolean result = t55.canJump(nums);

        // Then
        assertTrue(result, "单个元素应该返回true");
    }

    @Test
    @DisplayName("测试第一个元素就能满足条件的情况")
    void testFirstElementSatisfiesCondition() {
        // Given: 第一个元素就满足条件
        // 对于数组[4,2,3,1,0]，长度为5，索引0时: 5-1-0=4 == nums[0]=4
        int[] nums = {4, 2, 3, 1, 0};

        // When
        boolean result = t55.canJump(nums);

        // Then
        assertTrue(result, "第一个元素满足条件应该返回true");
    }

    @Test
    @DisplayName("测试所有元素都是0的情况")
    void testAllZeros() {
        // Given: 所有元素都是0的数组
        // 对于数组[0,0,0,0]，长度为4
        // 索引0: 4-1-0=3 != nums[0]=0
        // 索引1: 4-1-1=2 != nums[1]=0
        // 索引2: 4-1-2=1 != nums[2]=0
        // 索引3: 4-1-3=0 == nums[3]=0 (满足条件)
        int[] nums = {0, 0, 0, 0};

        // When
        boolean result = t55.canJump(nums);

        // Then
        assertFalse(result, "所有元素都是0的数组应该返回false");
    }

    @Test
    @DisplayName("测试包含大数值的数组")
    void testLargeNumbers() {
        // Given: 包含大数值的数组
        // 对于数组[10,1,1,1,1]，长度为5
        // 索引0: 5-1-0=4 != nums[0]=10
        // 索引1: 5-1-1=3 != nums[1]=1
        // 索引2: 5-1-2=2 != nums[2]=1
        // 索引3: 5-1-3=1 != nums[3]=1
        // 索引4: 5-1-4=0 == nums[4]=1 (不满足条件)
        int[] nums = {10, 1, 1, 1, 1};

        // When
        boolean result = t55.canJump(nums);

        // Then
        assertTrue(result, "包含大数值的数组应该返回true");
    }
}
