package leetcode;

import java.util.HashSet;

public class Solution_36 {

    public boolean isValidSudoku(char[][] board) {

        HashSet<String> checked = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentValue = board[i][j];
                if (currentValue != '.') {
                    if (!checked.add(currentValue + "found in row " + i)
                            || !checked.add(currentValue + "found in column " + j)
                            || !checked.add(currentValue + "found in box " + i / 3 + "-" + j / 3)) return false;
                }
            }
        }
        return true;
    }
}
