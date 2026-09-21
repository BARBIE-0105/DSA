class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>ans=new ArrayList<>();
        solve(0,candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }
    public void solve(int index,int[]arr,int sum,int target,List<Integer>ds,List<List<Integer>>ans){
        if(index==arr.length){
        if(sum==target)ans.add(new ArrayList<>(ds));
        return;
    }
    if(sum+arr[index]<=target){
        ds.add(arr[index]);
        solve(index+1,arr,sum+arr[index],target,ds,ans);
        ds.remove(ds.size()-1);
    }
    int nextIndex=index+1;
    while(nextIndex<arr.length && arr[nextIndex]==arr[index]){
        nextIndex++;
    }
    solve(nextIndex,arr,sum,target,ds,ans);
}
}