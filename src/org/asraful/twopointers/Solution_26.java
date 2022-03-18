package twopointers;

import java.util.Arrays;

public class Solution_26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length - 1; j++) {
            if (j <= nums.length - 1 && nums[j] != nums[j + 1]) {
                nums[i + 1] = nums[j + 1];
                i++;
            }
        }
        return i + 1;
    }
}
