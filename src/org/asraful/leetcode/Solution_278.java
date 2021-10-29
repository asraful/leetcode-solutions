package leetcode;

public class Solution_278 {

    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;

        while (l < r) {
            //find medium
            int m = l + (r - l) / 2;
            //uncomment it before submitting in leetcode
            /*if (isBadVersion(m)) {
                r = m;
            } else {
                l = m + 1;
            } */
        }
        return l;
    }
}
