class Solution {
    int solve(int[] nums,int index){
        if(index>=nums.length){
            return 0;
        }
        int include=nums[index]+solve(nums,index+2);
        int exclude=0+solve(nums,index+1);
        int finalAns=Math.max(include,exclude);
        return finalAns;
    }
    public int rob(int[] nums) {
        int index=0;
         int ans=solve(nums,index);
         return ans;
        
    }
}