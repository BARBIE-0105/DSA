class Solution {
    public void solve(int index, int[] arr, List<Integer> ds, List<List<Integer>> ans){
        if(index == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[index]);
        solve(index + 1 , arr , ds , ans);
        ds.remove(ds.size() - 1);
        solve(index + 1 , arr , ds , ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0 , nums , new ArrayList<>() , ans);
        return ans;
    }
}