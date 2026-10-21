class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    ArrayList<Integer> list2 = new ArrayList<>();
                    list2.add(nums[i]);
                    list2.add(nums[left]);
                    list2.add(nums[right]);
                    set.add(list2);
                    left++;
                    right--;
                }
                else if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}