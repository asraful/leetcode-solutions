package leetcode;

/*
    https://github.com/asraful
    LeetCode problem title : 704. Binary Search
    Iterative / Binary Search
 */

public class Solution_704 {
    public static void main(int[] arr) {
        //call and tst
    }

    public int search(int[] nums, int target) {
        int left, right, mid;
        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
