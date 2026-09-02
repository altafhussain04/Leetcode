class Solution {
    int solve(int amount, int[] coins, int index){

        if(amount==0){
            return 1;
        }
        if(amount<0){
            return 0;
        }
        if(index>=coins.length){
            return 0;
        }
        int include=solve(amount-coins[index], coins ,index);
        int exclude=solve(amount, coins, index+1 );

        int finalAns=include+exclude;
        return finalAns;
    }
    public int change(int amount, int[] coins) {

        int index=0;
        int ans=solve(amount, coins, index);
        return ans;
        
    }
}