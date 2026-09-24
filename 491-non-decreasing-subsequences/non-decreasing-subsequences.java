class Solution {
    public void solve(int index,int[]arr,List<Integer>ds,List<List<Integer>>ans) {
        if(ds.size()>=2){
            ans.add(new ArrayList<>(ds));
        }
        if(index==arr.length){
            return;
        }
        Set<Integer>set=new HashSet<>();
        for(int i=index;i<arr.length;i++){
            if(set.contains(arr[i])){
                continue;
            }
            if(ds.isEmpty()||arr[i]>=ds.get(ds.size()-1)){
                set.add(arr[i]);
                ds.add(arr[i]);
                solve(i+1,arr,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<Integer>>findSubsequences(int[]nums){
        List<List<Integer>>ans=new ArrayList<>();
        solve(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}