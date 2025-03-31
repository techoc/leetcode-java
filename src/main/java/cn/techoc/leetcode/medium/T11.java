package cn.techoc.leetcode.medium;

public class T11 {
    /**
     * <a href="https://leetcode.cn/problems/container-with-most-water">11. 盛最多水的容器</a>
     *
     * @param height 高度数组
     * @return 最大面积
     */
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, maxArea = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
