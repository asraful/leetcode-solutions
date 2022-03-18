package leetcode;

import array.DoubleExist;
import array.MergeSortedArray;
import array.RemoveDuplicatesfromSortedArray;
import array.RemoveElement;

public class SolutionTest {
    public static void main(String args[]) {
        int nums1[] = {-20, 8, -6, -14, 0, -19, 14, 4};


        boolean k = new DoubleExist().checkIfExist(nums1);
        System.out.println(k);


    }
}
