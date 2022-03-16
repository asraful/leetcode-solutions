package array;

//https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {

        int lastIndex = arr.length - 1;
        int lastIndexUnchanhed = arr.length - 1;

        int i = 0;
        int k = 0;

        for (i = 0; i <= lastIndexUnchanhed; i++) {
            if (arr[i] == 0) {


                while (lastIndex != i) {
                    arr[lastIndex] = arr[lastIndex - 1];
                    lastIndex--;
                }
                i++;
                lastIndex = lastIndexUnchanhed;

            }

        }
    }
}
