package hello;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {

        double[][] twoDimentionltest = new double[5][2];

        for (int row = 0; row < twoDimentionltest.length; row++) {
            for (int col = 0; col < twoDimentionltest[row].length; col++) {
                twoDimentionltest[row][col] = Math.random();
            }
        }
        for (int row = 0; row < twoDimentionltest.length; row++) {
            System.out.println(Arrays.toString(twoDimentionltest[row]));
        }

        int source[] = {10, 50, 78, 10, 25, 2347, 154, 1, 2, 5, 8, 3, 4, 225, 99};

        System.out.println(linerSearch(source, 9999));

        System.out.println(searchCharacterInString("duckDuckDoe", 'L'));
    }

    // liner search fun
    static int linerSearch(int source[], int targetItem) {

        for (int i = 0; i < source.length; i++) {
            if (source[i] == targetItem) {
                return i;
            }
        }
        return -1;
    }

    static boolean searchCharacterInString(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
