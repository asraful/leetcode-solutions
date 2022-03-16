package leetcode;

public class SolutionEvenNumberofDigits {

    public int findNumbers(int[] nums) {
        int count = 0;
        int evenCount = 0;
        for (int i = 0; i <= nums.length - 1; i++) {

            int temp = nums[i];
            while (temp != 0) {
                temp = temp / 10;
                ++count;
            }
            System.out.println(count);
            if (count % 2 == 0) {
                evenCount++;
            }
            count = 0;
        }
        return evenCount;
    }
}
