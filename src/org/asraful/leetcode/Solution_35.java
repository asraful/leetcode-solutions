package leetcode;

/*
    https://github.com/asraful
    LeetCode problem title : 35. Search Insert Position
 */
public class Solution_35 {
    public static int searchInsert(int[] nums, int target) {

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
        return left;
    }
}
