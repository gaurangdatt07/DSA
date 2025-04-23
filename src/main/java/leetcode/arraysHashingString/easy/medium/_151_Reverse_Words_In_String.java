package leetcode.arraysHashingString.easy.medium;

public class _151_Reverse_Words_In_String {
    // https://leetcode.com/problems/reverse-words-in-a-string

    public String reverseWords(String s) {

        // Split by spaces, removing extra spaces
        String[] s1 = s.trim().split("\\s+");
        int left = 0, right = s1.length - 1;
        StringBuilder sb = new StringBuilder();

        while (left <= right) {
            sb.append(s1[right--]).append(" ");
        }

        // Remove trailing space and return the result
        return sb.toString().trim();
    }
}
