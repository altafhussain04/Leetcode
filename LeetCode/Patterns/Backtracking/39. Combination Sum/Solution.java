class Solution {
    void solve( int[] candidates, List<List<Integer>> ans,  List<Integer> output, int target, int index ){
        if(target==0){
            ans.add(new ArrayList<>(output));
            return;

        }
        if(target<0 || index>=candidates.length){
            return;
        }
        output.add(candidates[index]);

        solve(candidates, ans, output, target-candidates[index], index);

        output.remove(output.size()-1);

        solve(candidates, ans, output,target, index+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        solve(candidates,ans, output,  target, index);
        return ans;
        
    }
}