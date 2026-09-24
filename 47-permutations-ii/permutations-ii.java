class Solution {
    public void solve(int[]nums,List<Integer>ds,boolean[]freq,List<List<Integer>>ans){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]&&!freq[i-1]){
                continue;
            }
            if(freq[i]){
                continue;
            }
                ds.add(nums[i]);
                freq[i]=true;
                solve(nums,ds,freq,ans);
                freq[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    public List<List<Integer>> permuteUnique(int[] nums) {
     List<List<Integer>>ans=new ArrayList<>();
     Arrays.sort(nums);
     boolean []freq=new boolean[nums.length];   
     solve(nums,new ArrayList<>(),freq,ans);
     return ans;
    }
}