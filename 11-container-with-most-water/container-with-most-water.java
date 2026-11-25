class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int rightptr = height.length-1;
        int leftptr = 0;
        while(leftptr<rightptr){
            int currArea = (rightptr-leftptr)*(Math.min(height[leftptr],height[rightptr]));
            maxArea = Math.max(currArea,maxArea);
            if(height[leftptr]<height[rightptr]){
                leftptr++;
            }
            else{
                rightptr--;
            }
        }
        return maxArea;
    }
}