class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int preSum=0,maxLen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                preSum--;
            }
            else{
                preSum++;
            }
            if(map.containsKey(preSum)){
                maxLen=Math.max(maxLen,i-map.get(preSum));
            }
            else{
                map.put(preSum,i);
            }
        }
        return maxLen;
    }
}