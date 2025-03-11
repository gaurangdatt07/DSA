package leetcode.easy;


/**
 * https://leetcode.com/problems/valid-palindrome/
 */
public class _125_Valid_Palindrome {

    public boolean isPalindrome(String s) {
        // convert the string to char array
        char[] charArray = s.toCharArray();

        // create two pointers left and right
        int left=0,right=s.length()-1;

        //traverse the array
        while (left<right){
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
