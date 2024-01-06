package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_15 {
    public List<List<Integer>> threeSum(int[] nums) {

        if (nums.length < 3)
            return new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    //avoid duplicate
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    //means , we have to increase the SUM , to reach 0 [shift left pointer to right , as array is sorted , right side has larger number ]
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    //means , we have to decrease the SUM , to reach 0
                    //[shift right pointer to left , as array is sorted , left side has smaller number ]
                    right--;
                }
            }
        }
        return result;
    }
}
