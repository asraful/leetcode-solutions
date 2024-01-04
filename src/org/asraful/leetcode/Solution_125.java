package leetcode;

public class Solution_125 {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();

        new StringBuilder(str).reverse().toString();

        if (s.isEmpty() || new StringBuilder(str).reverse().toString().equals(str))
            return true;

        return false;
    }

    //two pointer approach
    public boolean isPalindrome_(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l)))
                ++l;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r)))
                --r;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;
            ++l;
            --r;
        }

        return true;
    }
}
