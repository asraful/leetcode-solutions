package leetcode;
/*
    https://github.com/asraful
    LeetCode problem title : 682. Baseball Game
 */

import java.util.Stack;

public class Solution_682 {
    public int main(String[] arr) {
        return calPoints(arr);
    }

    public static int calPoints(String[] ops) {

        int result = 0;

        Stack<Integer> remember = new Stack<>();

        for (String item : ops) {

            if (item.equalsIgnoreCase("D")) {
                int temp = remember.peek();
                remember.push(temp * 2);
            } else if (item.equalsIgnoreCase("C")) {
                remember.pop();
            } else if (item.equalsIgnoreCase("+")) {

                int temp1 = remember.pop();
                int temp2 = remember.pop();

                remember.push(temp2);
                remember.push(temp1);
                remember.push(temp1 + temp2);
            } else {
                remember.push(Integer.parseInt(item));
            }
        }

        for (Integer point : remember) {
            result += point;
        }
        return result;
    }
}
