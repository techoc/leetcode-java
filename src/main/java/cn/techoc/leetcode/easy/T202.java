package cn.techoc.leetcode.easy;

public class T202 {
    /**
     * 判断给定的整数n是否为快乐数。
     * 快乐数定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，
     * 然后重复这个过程直到这个数变为1，或者无限循环但不包括1。如果可以变为1，则是快乐数。
     *
     * @param n 待判断的整数
     * @return 如果n是快乐数则返回true，否则返回false
     */
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        } while (slow != fast);
        return slow == 1;
    }

    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}
