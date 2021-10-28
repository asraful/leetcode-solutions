package leetcode;

/*
    https://github.com/asraful
    LeetCode problem title : 852. Peak Index in a Mountain Array
 */

class Solution_recursive_852 {

    static int peakIndexInMountainArray(int arr[], int left, int right) {

        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid == 0 && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid == 0 && arr[mid] < arr[mid + 1]) {
                return mid + 1;
            }

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            }

            if (arr[mid] > arr[mid + 1]) {
                return peakIndexInMountainArray(arr, left, mid - 1);
            } else {
                return peakIndexInMountainArray(arr, mid + 1, right);
            }
        }
        return -1;
    }
}