class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m+n];
        int i = 0, j = 0;
        int index = 0 ;
        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                merged[index++] = nums1[i++];
            }
            else{
                merged[index++] = nums2[j++];
            }
        }
        while(i<m){
            merged[index++] = nums1[i++];
        }
        while(j<n){
            merged[index++] = nums2[j++];
        }
        for(int k=0;k<merged.length;k++){
            nums1[k] = merged[k];
        }
    }
}