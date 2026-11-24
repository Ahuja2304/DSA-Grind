class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<n;i++){
            if(currSum<0){
                currSum = 0;
            }
            currSum+=nums[i];
            if(currSum>maxSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}