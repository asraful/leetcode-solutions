package leetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Solution_128 {

    public int longestConsecutive(int[] nums) {


        //idea : check an item has previous neighbour
        if(nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);
        int longest = 0;
        int leangth = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                leangth = 1;
                while (set.contains(++nums[i])) {
                    leangth++;
                }
                longest = Math.max(leangth, longest);

            }
        }

        return longest;
    }
}

