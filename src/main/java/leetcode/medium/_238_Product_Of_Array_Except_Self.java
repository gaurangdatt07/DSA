package leetcode.medium;

public class _238_Product_Of_Array_Except_Self {
    // https://leetcode.com/problems/product-of-array-except-self

    public int[] productExceptSelf(int[] nums) {
        //Use two passes:
        int length = nums.length;
        int[] results = new int[length];
        //Left pass – create an array where each element at index i
        // contains the product of all elements to the left of i.
        results[0]=1;
        for(int i = 1 ; i < length;i++){
            results[i]=results[i-1]*nums[i-1];
        }

        //Right pass – multiply each element in the result
        // by the product of all elements to the right of i.
        int rightProduct=1;
        for(int i = length-1;i>=0;i--){
            results[i]=results[i]*rightProduct;
            rightProduct*=nums[i];
        }
        return results;

    }
}
