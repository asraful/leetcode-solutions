package leetcode;

import java.util.Arrays;

public class Solution_238 {


    public int[] productExceptSelf(int[] nums) {


        int n = nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];

        pre[0] = 1;
        suff[n - 1] = 1;

        int productExceptSelf[] = new int[nums.length];

        //prefix
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }

        //suffix
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }

        // final = prefix * suffix
        for (int i = 0; i < n; i++) {
            productExceptSelf[i] = pre[i] * suff[i];
        }

        return productExceptSelf;
    }

    public int[] productExceptSelf_OptimizeSpace(int[] nums) {

        int n = nums.length;
        int productExceptSelf[] = new int[n];
        Arrays.fill(productExceptSelf, 1);

        int temp = 1;
        for (int i = 0; i < n; i++) {
            productExceptSelf[i] *= temp;
            temp *= nums[i];
        }

        //reset
        temp = 1;
        for (int i = n - 1; i >= 0; i--) {
            productExceptSelf[i] *= temp;
            temp *= nums[i];
        }
        return productExceptSelf;
    }
}
