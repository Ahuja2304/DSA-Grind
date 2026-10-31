class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ele = nums[0];
        int vote = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele){
                vote++;
            }
            else if(vote==0){
                ele = nums[i];
            }
            else{
                vote--;
            }
        }
        return ele;
    }
}