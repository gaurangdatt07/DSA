package leetcode.medium;

public class _1143_Longest_Common_Subsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        // Create a 2D dp array to store the lengths of common subsequences
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        // Fill the dp table from the bottom-right to the top-left
        for (int i = text1.length() - 1; i >= 0; i--) {
            for (int j = text2.length() - 1; j >= 0; j--) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];  // Match: add 1 to the result from next diagonal
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);  // No match: take max of right or down
                }
            }
        }

        // The answer is stored at dp[0][0], which is the LCS length for the entire strings
        return dp[0][0];
    }

}
