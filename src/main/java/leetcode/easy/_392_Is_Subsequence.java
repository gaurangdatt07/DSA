package leetcode.easy;

public class _392_Is_Subsequence {
    // https://leetcode.com/problems/is-subsequence/
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            // if character are same move s index;
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            //  move t index
            j++;
        }

        // i should be equal to s length
        return i == s.length();
    }
}
