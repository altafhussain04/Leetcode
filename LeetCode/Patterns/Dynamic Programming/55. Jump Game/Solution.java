class Solution {
    boolean solve(int[] nums, int index){
        if(index==nums.length-1){
            return true;
        }
        if(nums[index]==0){
            return false;
        }
        int totaljump=nums[index];
         
         boolean overallAns=false;
         for(int jump=1; jump<=totaljump; jump++){
            boolean recAns=solve(nums, index+jump);
            overallAns=overallAns||recAns;


         }
         return overallAns;
    }
    
    public boolean canJump(int[] nums) {
        int index=0;
        boolean ans=solve(nums, index);
        return ans;
        
    }
}