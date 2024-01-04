package leetcode;

public class Solution_125 {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();

        new StringBuilder(str).reverse().toString();

        if (s.isEmpty() || new StringBuilder(str).reverse().toString().equals(str))
            return true;

        return false;
    }
}
