class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        for(int i=0;i<n;i++){
            int diff = target-nums[i];
            for(int j=i+1;j<n;j++){
                if(nums[j]==diff){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}