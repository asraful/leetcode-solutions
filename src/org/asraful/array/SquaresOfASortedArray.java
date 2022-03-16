package array;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {

        int length = nums.length;
        int newHolder[] = new int[length];

        for (int i = 0; i <= nums.length - 1; i++) {
            newHolder[i] = nums[i] * nums[i];
        }
        return Arrays.stream(newHolder).sorted().toArray();
    }
}
