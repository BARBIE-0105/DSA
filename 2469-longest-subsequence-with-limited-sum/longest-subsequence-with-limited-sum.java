class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] prefix = new int[n];
        // Prefix sum
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int[] ans = new int[queries.length];
        // Binary Search for every query
        for (int i = 0; i < queries.length; i++) {
            int low = 0;
            int high = n - 1;
            int count = 0;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (prefix[mid] <= queries[i]) {
                    count = mid + 1;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}