package leetcode;

public class _441_ARRANGING_COINS {
    // URL: https://leetcode.com/problems/arranging-coins/
    public int guessNumber(int n) {
        // using gauss law
        // n/2.(n+1)
        int left = 1;int right=n;
        int max=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            long gaussNumber=(long)mid*(mid+1)/2;
            if(gaussNumber==n)return mid;
            if(gaussNumber>n){
                right=mid-1;
            }else {
                max=Math.max(max,mid);
                left=mid+1;
            }
        }
        return max;
    }
}
