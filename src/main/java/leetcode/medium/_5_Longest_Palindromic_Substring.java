package leetcode.medium;

public class _5_Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        String resString = "";
        int resLength = 0;

        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes (centered at i)
            String oddPalindrome = checkPalindrome(s, i, i);
            if (oddPalindrome.length() > resLength) {
                resString = oddPalindrome;
                resLength = oddPalindrome.length();
            }

            // Check for even-length palindromes (centered between i and i+1)
            String evenPalindrome = checkPalindrome(s, i, i + 1);
            if (evenPalindrome.length() > resLength) {
                resString = evenPalindrome;
                resLength = evenPalindrome.length();
            }
        }
        return resString;
    }

    private String checkPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the valid palindrome found between left+1 and right-1
        return s.substring(left + 1, right);
    }

}
