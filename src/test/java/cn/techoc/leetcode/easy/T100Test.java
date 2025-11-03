package cn.techoc.leetcode.easy;

import cn.techoc.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 对 T100.isSameTree 方法进行单元测试
 */
class T100Test {

    private final T100 t100 = new T100();

    /**
     * TC1: 两个空树 -> 应该返回 true
     */
    @Test
    void testIsSameTree_BothTreesAreNull_ShouldReturnTrue() {
        assertTrue(t100.isSameTree(null, null));
    }

    /**
     * TC2: 一个为空，另一个非空 -> 应该返回 false
     */
    @Test
    void testIsSameTree_OneIsNull_ShouldReturnFalse() {
        TreeNode node = new TreeNode(1);
        assertFalse(t100.isSameTree(node, null));
        assertFalse(t100.isSameTree(null, node));
    }

    /**
     * TC3: 两个节点值不同的树 -> 应该返回 false
     */
    @Test
    void testIsSameTree_DifferentRootValues_ShouldReturnFalse() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(2);
        assertFalse(t100.isSameTree(p, q));
    }

    /**
     * TC4: 完全相同的简单树 -> 应该返回 true
     */
    @Test
    void testIsSameTree_IdenticalSimpleTrees_ShouldReturnTrue() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertTrue(t100.isSameTree(p, q));
    }

    /**
     * TC5: 结构不同 -> 应该返回 false
     */
    @Test
    void testIsSameTree_StructureMismatch_ShouldReturnFalse() {
        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, null, new TreeNode(2));
        assertFalse(t100.isSameTree(p, q));
    }

    /**
     * TC6: 值不同但结构相同 -> 应该返回 false
     */
    @Test
    void testIsSameTree_SameStructureButDifferentValues_ShouldReturnFalse() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(4));
        assertFalse(t100.isSameTree(p, q));
    }

    /**
     * TC7: 更复杂的相同树 -> 应该返回 true
     */
    @Test
    void testIsSameTree_ComplexIdenticalTrees_ShouldReturnTrue() {
        TreeNode p = new TreeNode(
                1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3)
        );
        TreeNode q = new TreeNode(
                1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3)
        );
        assertTrue(t100.isSameTree(p, q));
    }

    /**
     * TC8: 复杂结构下部分差异 -> 应该返回 false
     */
    @Test
    void testIsSameTree_ComplexDifferentTrees_ShouldReturnFalse() {
        TreeNode p = new TreeNode(
                1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3)
        );
        TreeNode q = new TreeNode(
                1,
                new TreeNode(2, new TreeNode(5), new TreeNode(4)), // 左右交换了
                new TreeNode(3)
        );
        assertFalse(t100.isSameTree(p, q));
    }
}
