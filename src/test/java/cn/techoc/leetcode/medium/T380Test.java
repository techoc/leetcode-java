package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * T380 类的单元测试（不使用 mock）
 */
public class T380Test {

    private T380.RandomizedSet randomizedSet;

    @BeforeEach
    public void setUp() {
        randomizedSet = new T380().randomizedSet;
    }

    // 测试 insert 方法插入新元素
    @Test
    public void testInsertNewElement() {
        assertTrue(randomizedSet.insert(1), "插入新元素应返回 true");
        assertTrue(randomizedSet.insert(2), "再次插入新元素应返回 true");

        // 验证集合中包含这些元素（通过 getRandom 间接验证）
        assertTrue(containsElement(1), "集合应包含元素 1");
        assertTrue(containsElement(2), "集合应包含元素 2");
    }

    // 测试 insert 方法插入已存在的元素
    @Test
    public void testInsertExistingElement() {
        randomizedSet.insert(1);
        assertFalse(randomizedSet.insert(1), "插入已存在的元素应返回 false");
        assertEquals(1, getRandomElement(), "集合大小应为 1");
    }

    // 测试 remove 方法删除存在的元素
    @Test
    public void testRemoveExistingElement() {
        randomizedSet.insert(1);
        randomizedSet.insert(2);

        assertTrue(randomizedSet.remove(1), "删除存在的元素应返回 true");
        assertFalse(containsElement(1), "集合中不应再包含元素 1");
        assertTrue(containsElement(2), "集合中应仍包含元素 2");
    }

    // 测试 remove 方法删除不存在的元素
    @Test
    public void testRemoveNonExistingElement() {
        assertFalse(randomizedSet.remove(1), "删除不存在的元素应返回 false");
    }

    // 测试 getRandom 方法
    @Test
    public void testGetRandom() {
        randomizedSet.insert(10);
        randomizedSet.insert(20);
        randomizedSet.insert(30);

        int randomVal = randomizedSet.getRandom();
        assertTrue(randomVal == 10 || randomVal == 20 || randomVal == 30, "getRandom 应返回集合中的元素");
    }

    /**
     * 辅助方法：判断集合中是否包含某个元素（通过多次调用 getRandom）
     */
    private boolean containsElement(int val) {
        for (int i = 0; i < 100; i++) {
            if (getRandomElement() == val) {
                return true;
            }
        }
        return false;
    }

    /**
     * 辅助方法：调用 getRandom 并返回结果
     */
    private int getRandomElement() {
        return randomizedSet.getRandom();
    }
}
