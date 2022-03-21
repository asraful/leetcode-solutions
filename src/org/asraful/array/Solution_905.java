package array;

public class Solution_905 {


    public int[] sortArrayByParity(int[] nums) {

        int size = nums.length - 1;
        int result[] = new int[nums.length];

        int k = 0;
        for (int i = 0; i <= size; i++) {
            if (nums[i] % 2 == 0) {
                result[k] = nums[i];
                k++;
            }
        }

        for (int i = 0; i <= size; i++) {
            if (nums[i] % 2 != 0) {
                result[k] = nums[i];
                k++;
            }
        }
        return result;
    }

    public int[] sortArrayByParity_SinglePass_One_Loop(int[] nums) {

        int size = nums.length - 1;
        int result[] = new int[nums.length];

        // two-pointer
        int k = 0;
        int z = size;

        for (int i = 0; i <= size; i++) {
            if (nums[i] % 2 == 0) {
                result[k++] = nums[i];  // insert in the front
            } else {
                result[z--] = nums[i]; // insert in the end
            }
        }
        return result;
    }


}
