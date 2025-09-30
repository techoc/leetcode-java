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
        // 使用双指针法从两端向中间收缩，寻找最大面积
        while (left < right) {
            // 计算当前容器的面积：高度取两端较小值，宽度为两端距离
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            // 移动较短的一端指针，尝试寻找更高的高度
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
