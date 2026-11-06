class Solution {
    public void merge(int[] nums1, int n, int[] nums2, int m) {
        int ptr1 = n-1;
        int ptr2 = m-1;
        int placer = m+n-1;
        while(ptr1>=0 && ptr2>=0){
            if(nums1[ptr1]>=nums2[ptr2]){
                nums1[placer] = nums1[ptr1];
                ptr1--;
                placer--;
            }
            else if(nums2[ptr2]>nums1[ptr1]){
                nums1[placer] = nums2[ptr2];
                ptr2--;
                placer--;
            }
        }

        while(ptr2>=0){
            nums1[placer] = nums2[ptr2];
            placer--;
            ptr2--;
        }
    }
}