package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * MinStack 的单元测试类
 */
class T155Test {

    private T155.MinStack minStack;

    @BeforeEach
    void setUp() {
        // 创建 MinStack 实例用于每个测试方法
        minStack = new T155.MinStack();
    }

    /**
     * 测试 push 方法的基本功能
     * 场景：依次压入若干元素，验证主栈和辅助栈的行为
     */
    @Test
    void testPush() {
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        // 验证主栈内容 [-2, 0, -3]
        assertEquals(-3, minStack.top(), "主栈顶部应为 -3");

        // 验证辅助栈维护的最小值为 -3
        assertEquals(-3, minStack.getMin(), "当前最小值应为 -3");
    }

    /**
     * 测试 pop 方法的功能
     * 场景：压入多个元素后再弹出，验证主栈和辅助栈同步变化
     */
    @Test
    void testPop() {
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        // 当前最小值为 -3
        assertEquals(-3, minStack.getMin());

        minStack.pop(); // 弹出 -3

        // 最小值应回到 -2
        assertEquals(-2, minStack.getMin(), "弹出后最小值应为 -2");
        assertEquals(0, minStack.top(), "主栈顶部应为 0");
    }

    /**
     * 测试 top 方法的功能
     * 场景：压入多个元素后获取顶部元素
     */
    @Test
    void testTop() {
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);

        assertEquals(3, minStack.top(), "主栈顶部应为 3");
    }

    /**
     * 测试 getMin 方法的功能
     * 场景：多种数据组合下的最小值获取
     */
    @Test
    void testGetMin() {
        minStack.push(5);
        assertEquals(5, minStack.getMin(), "初始最小值应为 5");

        minStack.push(2);
        assertEquals(2, minStack.getMin(), "加入 2 后最小值应为 2");

        minStack.push(7);
        assertEquals(2, minStack.getMin(), "加入 7 后最小值仍为 2");

        minStack.push(-1);
        assertEquals(-1, minStack.getMin(), "加入 -1 后最小值变为 -1");

        minStack.pop(); // 弹出 -1
        assertEquals(2, minStack.getMin(), "弹出 -1 后最小值恢复为 2");
    }
}
