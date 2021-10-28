/*
    852. Peak Index in a Mountain Array
    Iterative / Binary Search
 */

class Solution_iterative_852 {
    public int main(int[] arr) {
        return peakIndexInMountainArray(arr, 0, arr.length - 1);
    }

    static int peakIndexInMountainArray(int arr[], int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            }
            if ((arr[mid] > arr[mid + 1]) && (arr[mid] < arr[mid - 1])) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}