package leetcode.easy;

public class _1071_Greatest_Common_Divisor_Of_Strings {
    // https://leetcode.com/problems/greatest-common-divisor-of-strings

    public String gcdOfStrings(String str1, String str2) {
        // if concatenation of both order results in same string
        // then only gcd string may exist
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        // fetch GCD index.
        int gcdLength=gcd(str1.length(),str2.length());

        // return substring
        return str1.substring(0,gcdLength);
    }

    //EUCLEDIAN ALGO FOR GCD
    private int gcd(int a, int b) {
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
