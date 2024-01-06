package leetcode;

public class Solution_167 {

    // two pointer approach
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while(numbers[left] + numbers[right] != target) {
            if(numbers[left] + numbers[right] < target) {
                left++;
            }else {
                right--;
            }
        }
        //Given a 1-indexed array of integers numbers  , so // +1
        // constant extra space
        return new int[] {left + 1, right + 1};
    }
}
