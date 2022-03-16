package array;

public class ConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int result = 0;
        int dataSize = nums.length;
        for (int i = 0; i <= dataSize - 1; i++) {
            if (nums[i] == 0) {
                counter = 0;
            } else {
                counter++;
                result = Math.max(result, counter);
            }
        }
        return result;
    }
}
