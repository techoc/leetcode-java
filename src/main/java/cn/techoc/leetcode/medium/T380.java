package cn.techoc.leetcode.medium;

import java.util.*;

public class T380 {

    RandomizedSet randomizedSet;

    public T380() {
        randomizedSet = new RandomizedSet();
    }

    /**
     * <a href="https://leetcode.cn/problems/insert-delete-getrandom-o1">380. O(1) 时间插入、删除和获取随机元素</a>
     */
    static class RandomizedSet {

        List<Integer> nums;
        Map<Integer, Integer> indices;
        Random random;

        public RandomizedSet() {
            nums = new ArrayList<>();
            indices = new HashMap<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (indices.containsKey(val)) {
                return false;
            }
            int index = nums.size();
            nums.add(val);
            indices.put(val, index);
            return true;
        }

        public boolean remove(int val) {
            if (!indices.containsKey(val)) {
                return false;
            }
            int index = indices.get(val);
            int last = nums.get(nums.size() - 1);
            nums.set(index, last);
            indices.put(last, index);
            nums.remove(nums.size() - 1);
            indices.remove(val);
            return true;
        }

        public int getRandom() {
            int randomIndex = random.nextInt(nums.size());
            return nums.get(randomIndex);
        }
    }
}


