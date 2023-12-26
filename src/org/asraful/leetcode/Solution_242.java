package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution_242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if (Arrays.equals(chars1, chars2))
            return true;
        else
            return false;
    }
}


