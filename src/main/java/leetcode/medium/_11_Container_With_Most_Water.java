package leetcode.medium;

public class _11_Container_With_Most_Water {
    public int maxArea(int[] height){
        // DECALRE MAX AREA, LEFT POINTER AND RIGHT POINTER
        int maxArea=0,leftPointer=0,rightPointer=height.length-1;

        // WHILE LEFT HAS NOT CROSSED RIGHT
        while(leftPointer<rightPointer){
            // the max height can be the minimum of the two number.
            int maxHeight = Math.min(height[leftPointer], height[rightPointer]);
            int width=rightPointer-leftPointer; // the weight will be dinstance between two pointers
            int area=maxHeight*width; // calculate area
            if(area>maxArea){
                maxArea=area; // if max area is smaller than current area then new area is max
            }
            if(height[leftPointer]<height[rightPointer]){
                leftPointer++; // if value of left pointer is smaller than move left
            } else if (height[leftPointer]>=height[rightPointer]) {
                rightPointer--; //else move right
            }
        }

        return maxArea; // return max area
    }
}
