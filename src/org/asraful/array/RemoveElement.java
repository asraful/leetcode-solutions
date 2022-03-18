package array;

import java.util.Arrays;

public class RemoveElement {

    // hint : don't look for match, look for not matched value and add in the array
    public int removeElement(int[] nums, int val) {

            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                }
            }
            return i;

    }
}
