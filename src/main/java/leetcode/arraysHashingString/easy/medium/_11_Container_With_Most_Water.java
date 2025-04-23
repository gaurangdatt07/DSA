package leetcode.arraysHashingString.easy.medium;

public class _11_Container_With_Most_Water {
    // https://leetcode.com/problems/container-with-most-water/
    public int maxArea(int[] height) {
        int maxArea=0;
        int leftPtr= 0;
        int rightPtr= height.length-1;

        while(leftPtr<rightPtr){
            int length = Math.min(height[leftPtr],height[rightPtr]);
            int width = rightPtr-leftPtr;
            int area = length*width;
            maxArea= Math.max(area, maxArea);

            if(height[leftPtr]<height[rightPtr]){
                leftPtr++;
            }else{
                rightPtr--;
            }
        }

        return maxArea;
    }
}
