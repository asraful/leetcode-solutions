package leetcode;

/*
    https://github.com/asraful
    LeetCode problem title : 258. Add Digits
 */

public class Solution_258 {

    // Solution 1, running time 2ms
    public int addDigits(int num) {
        int result = digitSum(num);
        while (result > 9) {
            result = digitSum(result);
        }
        return result;
    }


    static int digitSum(int value) {
        int digitSum = 0;
        while (value > 0) {
            int digit = value % 10;
            value = value / 10;
            digitSum += digit;
        }
        return digitSum;
    }

    //one line solution , running time 3 ms
    static int addDigitsOneLiner(int num) {
        return (int) (num - (9 * (Math.floor((num - 1) / 9))));
    }
}
