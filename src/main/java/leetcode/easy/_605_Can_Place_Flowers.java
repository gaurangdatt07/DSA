package leetcode.easy;

public class _605_Can_Place_Flowers {
    // https://leetcode.com/problems/can-place-flowers
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowerBedLength=flowerbed.length;

        for(int i = 0 ; i < flowerBedLength;i++){
            // if flowerbed == 0
            if(flowerbed[i]==0){
                // check if left pot is empty
                boolean leftPot = i==0 || flowerbed[i-1]==0;

                // check if rightpot is empty
                boolean rightPot=  i==flowerBedLength-1||flowerbed[i+1]==0;
                //if both are empty fill the pot
                if(rightPot&&leftPot){
                    flowerbed[i]=1;
                    n--;
                }
                if(n==0) return true;

            }
        }

        return n<=0;
    }
}
