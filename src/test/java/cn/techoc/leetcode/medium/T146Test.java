package cn.techoc.leetcode.medium;

import cn.techoc.leetcode.medium.T146.LRUCache;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * LRU缓存单元测试类
 */
class T146Test {

    private LRUCache lruCache;

    @BeforeEach
    void setUp() {
        // 初始化LRU缓存，容量设置为2
        lruCache = new LRUCache(2);
    }

    /**
     * 测试get方法 - 获取存在的键
     */
    @Test
    void testGet_ExistingKey_ReturnsValue() {
        // Given: 向缓存中添加键值对
        lruCache.put(1, 100);
        lruCache.put(2, 200);

        // When: 获取存在的键
        int result1 = lruCache.get(1);
        int result2 = lruCache.get(2);

        // Then: 返回正确的值
        assertEquals(100, result1);
        assertEquals(200, result2);
    }

    /**
     * 测试get方法 - 获取不存在的键
     */
    @Test
    void testGet_NonExistingKey_ReturnsMinusOne() {
        // Given: 空缓存

        // When: 获取不存在的键
        int result = lruCache.get(1);

        // Then: 返回-1
        assertEquals(-1, result);
    }

    /**
     * 测试get方法 - 获取已删除的键（由于容量限制）
     */
    @Test
    void testGet_KeyRemovedDueToCapacity_ReturnsMinusOne() {
        // Given: 向缓存中添加超过容量的键值对
        lruCache.put(1, 100);
        lruCache.put(2, 200);
        lruCache.put(3, 300); // 此时键1应该被删除

        // When: 获取已被删除的键
        int result = lruCache.get(1);

        // Then: 返回-1
        assertEquals(-1, result);
    }

    /**
     * 测试put方法 - 添加键值对到未满的缓存
     */
    @Test
    void testPut_CacheNotFull_AddsKeyValue() {
        // Given: 缓存未满

        // When: 添加键值对
        lruCache.put(1, 100);
        lruCache.put(2, 200);

        // Then: 键值对被正确存储
        assertEquals(100, lruCache.get(1));
        assertEquals(200, lruCache.get(2));
    }

    /**
     * 测试put方法 - 添加键值对到已满的缓存
     */
    @Test
    void testPut_CacheFull_AddsNewAndRemovesLeastUsed() {
        // Given: 缓存已满，并访问了某个键使其变为最近使用
        lruCache.put(1, 100);
        lruCache.put(2, 200);
        lruCache.get(1); // 访问键1，使其变为最近使用
        // 此时最久未使用的应该是键2

        // When: 添加新的键值对
        lruCache.put(3, 300);

        // Then: 新键值对被添加，最久未使用的键值对被删除
        assertEquals(100, lruCache.get(1)); // 键1仍然存在
        assertEquals(-1, lruCache.get(2));  // 键2被删除
        assertEquals(300, lruCache.get(3)); // 键3被添加
    }

    /**
     * 测试put方法 - 更新已存在键的值
     */
    @Test
    void testPut_UpdateExistingKey_UpdatesValue() {
        // Given: 向缓存中添加键值对
        lruCache.put(1, 100);
        lruCache.put(2, 200);

        // When: 更新已存在键的值
        lruCache.put(1, 1000);

        // Then: 值被正确更新
        assertEquals(1000, lruCache.get(1));
        assertEquals(200, lruCache.get(2));
    }
}
