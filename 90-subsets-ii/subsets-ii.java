class Solution {
    public void solve(int index,int[]arr,List<Integer>ds, List<List<Integer> >ans){
          if(index == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[index]);
        solve(index+1,arr,ds,ans);
        ds.remove(ds.size() - 1);
        int nextIndex=index+1;
        while(nextIndex<arr.length && arr[nextIndex]==arr[index]){
            nextIndex++;
        }
        solve(nextIndex,arr,ds,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        solve(0 , nums , new ArrayList<>() , ans);
        return ans;
    }
}