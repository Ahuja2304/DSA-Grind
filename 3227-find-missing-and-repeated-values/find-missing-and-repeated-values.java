class Solution {
    public int[] findMissingAndRepeatedValues(int[][] nums) {
        int n = nums.length;
        int total = n*n;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=total;i++){
            map.put(i,0);
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map.put(nums[i][j],map.getOrDefault(nums[i][j],0)+1);
            }
        }
        int[] arr = new int[2];
        for(int i=1;i<=total;i++){
            if(map.get(i)==0){
                arr[1] = i;
            }
            else if(map.get(i)==2){
                arr[0] = i;
            }
        }
        return arr;
    }
}