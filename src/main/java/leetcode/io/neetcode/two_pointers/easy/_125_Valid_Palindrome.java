package leetcode.io.neetcode.two_pointers.easy;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 */
public class _125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        // convert the string to char array
        char[] charArray = s.toCharArray();

        // create two pointers left and right
        int left=0,right=s.length()-1;

        //traverse the array
        while (left<right){
            // while instance of letter or number is not reached keep moving the index
            while (left<right&&!Character.isLetterOrDigit(charArray[left])){
                left++;
            }while(left<right&&!Character.isLetterOrDigit(charArray[right])){
                right--;
            }

            // if character at left is not equal to right return false
            // not palindrome
            if(Character.toLowerCase(charArray[left])!=Character.toLowerCase(charArray[right])){return false;}
            // traverse index to left and right respectively.
            left++;right--;
        }

        return true;
    }
}
