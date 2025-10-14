package cn.techoc.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 对 T71 类中的 simplifyPath 方法进行单元测试
 */
class T71Test {

    /**
     * 测试基本路径：/home/
     */
    @Test
    void testSimplifyPath_homeDir() {
        T71 t71 = new T71();
        assertEquals("/home", t71.simplifyPath("/home/"));
    }

    /**
     * 测试回退超过根目录的情况：/../
     */
    @Test
    void testSimplifyPath_backBeyondRoot() {
        T71 t71 = new T71();
        assertEquals("/", t71.simplifyPath("/../"));
    }

    /**
     * 测试多个连续斜杠的情况：/home//foo/
     */
    @Test
    void testSimplifyPath_multipleSlashes() {
        T71 t71 = new T71();
        assertEquals("/home/foo", t71.simplifyPath("/home//foo/"));
    }

    /**
     * 测试包含 . 和 .. 的复杂路径：/a/./b/../../c/
     */
    @Test
    void testSimplifyPath_complexRelativePath() {
        T71 t71 = new T71();
        assertEquals("/c", t71.simplifyPath("/a/./b/../../c/"));
    }

    /**
     * 测试特殊目录名 ... ：视为普通目录
     */
    @Test
    void testSimplifyPath_tripleDotAsNormalDir() {
        T71 t71 = new T71();
        assertEquals("/...", t71.simplifyPath("/..."));
    }

    /**
     * 测试全是无效指令的情况：/.//../../../.
     */
    @Test
    void testSimplifyPath_allInvalidOperations() {
        T71 t71 = new T71();
        assertEquals("/", t71.simplifyPath("/./.././../../."));
    }

    /**
     * 测试空路径输入
     */
    @Test
    void testSimplifyPath_emptyInput() {
        T71 t71 = new T71();
        assertEquals("/", t71.simplifyPath(""));
    }

    /**
     * 测试只有根目录的情况
     */
    @Test
    void testSimplifyPath_onlyRoot() {
        T71 t71 = new T71();
        assertEquals("/", t71.simplifyPath("/"));
    }

    /**
     * 测试基本路径：/home/ -> /home
     */
    @Test
    void testBasicPath() {
        T71 t71 = new T71();
        assertEquals("/home", t71.simplifyPath("/home/"));
    }

    /**
     * 测试返回上级目录但无上级的情况：/../ -> /
     */
    @Test
    void testReturnToRoot() {
        T71 t71 = new T71();
        assertEquals("/", t71.simplifyPath("/../"));
    }

    /**
     * 测试多个连续斜杠合并：/home//foo/ -> /home/foo
     */
    @Test
    void testMultipleSlashes() {
        T71 t71 = new T71();
        assertEquals("/home/foo", t71.simplifyPath("/home//foo/"));
    }

    /**
     * 测试包含 . 和 .. 的复杂路径：/a/./b/../../c/ -> /c
     */
    @Test
    void testComplexPathWithDotAndDotDot() {
        T71 t71 = new T71();
        assertEquals("/c", t71.simplifyPath("/a/./b/../../c/"));
    }

    /**
     * 测试特殊目录名：/... -> /...
     */
    @Test
    void testSpecialDirectoryName() {
        T71 t71 = new T71();
        assertEquals("/...", t71.simplifyPath("/..."));
    }

    /**
     * 测试根目录：/ -> /
     */
    @Test
    void testRootPath() {
        T71 t71 = new T71();
        assertEquals("/", t71.simplifyPath("/"));
    }

    /**
     * 测试隐藏文件路径：/.hidden -> /.hidden
     */
    @Test
    void testHiddenFile() {
        T71 t71 = new T71();
        assertEquals("/.hidden", t71.simplifyPath("/.hidden"));
    }

    /**
     * 测试混合路径操作：/a/b/c/./../../g -> /a/g
     */
    @Test
    void testMixedPathOperations() {
        T71 t71 = new T71();
        assertEquals("/a/g", t71.simplifyPath("/a/b/c/./../../g"));
    }
}
