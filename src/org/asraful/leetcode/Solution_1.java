package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_1 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[]{complementIndex, i};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }
    //other option : two pointer

    /*public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (nums[j - i] + nums[j] == target) {
                    return new int[]{j, j - i};
                }
            }
        }
        return null;
    }*/

}
