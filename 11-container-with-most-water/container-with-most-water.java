class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int rightPtr = n-1;
        int leftPtr = 0;
        int maxArea = 0;
        while(rightPtr>leftPtr){
            int currArea = Math.min(height[leftPtr],height[rightPtr])*(rightPtr-leftPtr);
            maxArea = Math.max(currArea,maxArea);
            if(height[leftPtr]<height[rightPtr]){
                leftPtr++;
            }
            else{
                rightPtr--;
            }
        }
        return maxArea;
    }
}