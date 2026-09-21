class Solution {
    public void solve(int index,int[]arr,int sum,int target,List<Integer> ds,List<List<Integer>>ans){
        if(index==arr.length){
            if(sum==target)ans.add(new ArrayList<>(ds));
            return;
        }
        if(sum+arr[index]<=target){
            ds.add(arr[index]);
            solve(index,arr,sum+arr[index],target,ds,ans);
            ds.remove(ds.size()-1);
        }
        solve(index+1,arr,sum,target,ds,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        solve(0,candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }
}