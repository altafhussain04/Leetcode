class Solution {
     void solve( int[] candidates, List<List<Integer>> ans,  List<Integer> output, int target, int index ){
        if(target==0){
            ans.add(new ArrayList<>(output));
            return;

        }
        if(target<0 || index>=candidates.length){
            return;
        }
        int next=index+1;

        while(next<candidates.length && candidates[index]==candidates[next]){
            next++;
        }
        output.add(candidates[index]);

        solve(candidates, ans, output, target-candidates[index], index+1);

        output.remove(output.size()-1);

        solve(candidates, ans, output,target, next);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
         List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        solve(candidates,ans, output,  target, index);
        return ans;
        
    }
}