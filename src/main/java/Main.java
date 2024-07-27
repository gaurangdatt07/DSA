import leetcode.medium.Medium;
import leetcode.medium.MediumImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Medium medium=new MediumImpl();
        int[] s= {1,2,3,4};
        System.out.println(Arrays.toString(medium.productExceptSelf(s)));
    }
}
