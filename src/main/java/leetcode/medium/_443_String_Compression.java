package leetcode.medium;

public class _443_String_Compression {
    public int compress(char[] chars) {
        int index = 0;  // where we write in the array
        int i = 0;      // read pointer

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // count occurrences of the same character
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            // write the character
            chars[index++] = currentChar;

            // if count > 1, write each digit of the count
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index; // new length
    }
}
