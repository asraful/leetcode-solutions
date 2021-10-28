package algo;

/*
 https://github.com/asraful
*/

public class BinarySearch {
    public static void main(String args[]) {
        //Call and test
    }

    //iterative implementation,sort order agnostic

    static int binarySearch(int sortedArray[], int numberOfElements, int searchedItem) {
        boolean isAscending = false;

        if (sortedArray[0] < sortedArray[sortedArray.length - 1]) {
            isAscending = true;
        }

        int left, right, mid;
        left = 0;
        right = numberOfElements - 1;

        if (isAscending) {
            while (left <= right) {
                mid = left + (right - left) / 2;

                if (sortedArray[mid] == searchedItem) {
                    return mid;
                }

                if (sortedArray[mid] > searchedItem) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return -1;
        } else {
            while (left <= right) {
                mid = left + (right - left) / 2;

                if (sortedArray[mid] == searchedItem) {

                    return mid;
                }
                if (sortedArray[mid] > searchedItem) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }
    }

    //recursive implementation

    static int binarySearchRecursive(int sortedArray[], int left, int right, int targetValue) {

        boolean isAscending = false;

        if (sortedArray[0] < sortedArray[sortedArray.length - 1]) {
            isAscending = true;
        }

        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (sortedArray[mid] == targetValue) {
                return mid;
            }

            if (isAscending) {
                if (sortedArray[mid] > targetValue) {
                    return binarySearchRecursive(sortedArray, left, mid - 1, targetValue);
                } else {
                    return binarySearchRecursive(sortedArray, mid + 1, right, targetValue);
                }
            } else {
                if (sortedArray[mid] > targetValue) {
                    return binarySearchRecursive(sortedArray, mid - 1, right, targetValue);
                } else {
                    return binarySearchRecursive(sortedArray, left, mid - 1, targetValue);
                }
            }
        }
        return -1;
    }

    static int countOccurrence(int sortedArray[], int targetValue) {
        int index = binarySearch(sortedArray, sortedArray.length, targetValue);
        int count = 1;

        int left = index - 1;
        while (left >= 0 && sortedArray[left] == targetValue) {
            count++;
            left--;
        }

        int right = index + 1;
        while (right <= sortedArray.length - 1 && sortedArray[right] == targetValue) {
            count++;
            right++;
        }
        return count;
    }
}
