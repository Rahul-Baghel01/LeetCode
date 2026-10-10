class Solution{
    public List<List<Integer>> combinationSum(int[] candidates,int target){
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
    private void backtrack(int[] candidates,int target,int index,List<Integer> cur,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(cur));
            return;
        }
        if(index==candidates.length) return;
        if(candidates[index]<=target){
            cur.add(candidates[index]);
            backtrack(candidates,target-candidates[index],index,cur,ans);
            cur.remove(cur.size()-1);
        }
        backtrack(candidates,target,index+1,cur,ans);
    }
}