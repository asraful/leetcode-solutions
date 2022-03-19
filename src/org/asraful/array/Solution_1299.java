package array;

public class Solution_1299 {
    public int[] replaceElements(int[] arr) {

        int size = arr.length;
        int maxRight = arr[size - 1];

        arr[size - 1] = -1;

        for (int i = size - 2; i >= 0; i--) {
            int currentElement = arr[i];
            arr[i] = maxRight;
            if (maxRight < currentElement) {
                maxRight = currentElement;
            }
        }
        return arr;
    }
}
