package leetcode;

/*
    https://github.com/asraful
    LeetCode problem title : 162
 */

class Solution_162 {
    public int findPeakElement(int[] arr) {
        return peakIndexInMountainArray(arr, 0, arr.length - 1);
    }


    static int peakIndexInMountainArray(int arr[], int l, int r) {
        while (l < r) {
            //find medium
            int m = l + (r - l) / 2;

            if (arr[m] > arr[m + 1]) {// decreasing slope
                r = m;
            } else if (arr[m] < arr[m + 1]) { //increasing slope
                l = m + 1;
            }
        }
        return l;
    }
}