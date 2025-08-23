package cn.techoc.leetcode.easy;

public class T88 {
    /**
     * <a href="https://leetcode.cn/problems/merge-sorted-array">88. 合并两个有序数组</a>
     * 将两个非递减顺序排列的整数数组合并为一个非递减顺序排列的数组
     * 合并结果存储在第一个数组nums1中
     *
     * @param nums1 第一个数组，长度为m+n，前m个元素为有效数据，后n个元素为0用于存放合并结果
     * @param m     nums1中有效元素的个数
     * @param nums2 第二个数组，包含n个非递减顺序排列的整数
     * @param n     nums2中元素的个数
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 双指针尾遍历法
        int p1 = m - 1, p2 = n - 1;
        int p = nums1.length - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        // 将nums2中剩余元素复制到nums1中
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }
    }
}
