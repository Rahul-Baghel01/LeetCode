class Solution{
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    private void backtrack(int[] nums,int i,List<Integer> cur,List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        backtrack(nums,i+1,cur,ans);
        cur.add(nums[i]);
        backtrack(nums,i+1,cur,ans);
        cur.remove(cur.size()-1);
    }
}