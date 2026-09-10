class Solution {
     void solve( int[] candidates, List<List<Integer>> ans,  List<Integer> output, int n, int index, int k, int count ){
        if(n==0 && count==k){
            ans.add(new ArrayList<>(output));
            return;

        }
        if(n<0 || index>=candidates.length){
            return;
        }
        output.add(candidates[index]);

        solve(candidates, ans, output, n-candidates[index], index+1, k, count+1);

        output.remove(output.size()-1);

        solve(candidates, ans, output,n, index+1, k, count);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int[] candidates={1,2,3,4,5,6,7,8,9};
        int index=0;
        int count=0;
        solve(candidates,ans, output,  n, index, k, count);
        return ans;
        
    }
}