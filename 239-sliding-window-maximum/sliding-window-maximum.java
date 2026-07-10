class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0, j = 0;
        Deque<Integer>dq=new LinkedList<>();
        int[] ans = new int[nums.length - k + 1];
        int index = 0;
        while (j < nums.length) {
           while(!dq.isEmpty() && dq.peekLast()<nums[j]){
            dq.pollLast();
           }
           dq.addLast(nums[j]);
            if (j - i + 1 < k) j++;
            else{
                ans[index++] = dq.peekFirst();
            if(dq.peekFirst()==nums[i]){
                dq.pollFirst();
            }
         i++; j++;
            }
    }
    return ans;
}
}