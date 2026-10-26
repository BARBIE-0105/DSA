class Solution {
    public int f(int ind, int prevind, int[] arr, int[][] dp){
        if(ind == arr.length) return 0;
        if(dp[ind][prevind + 1] != -1)
           return dp[ind][prevind + 1];
        int pick = 0;
        if(prevind == -1 || arr[ind] > arr[prevind]){
            pick = 1 + f(ind + 1, ind, arr, dp);
        }
        int notpick = f(ind + 1, prevind, arr, dp);
        return dp[ind][prevind + 1] = Math.max(pick, notpick); 
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n + 1];
        for(int i = 0; i < n; i++)
            Arrays.fill(dp[i], -1);
        return f(0, -1, nums, dp);
    }
}