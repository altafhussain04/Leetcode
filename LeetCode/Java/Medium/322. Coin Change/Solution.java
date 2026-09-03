class Solution {
    int solve(int[] coins, int amount){
        if(amount==0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
int mini=Integer.MAX_VALUE;

         for (int coin : coins) {
            int valueAns = solve(coins, amount - coin);

            if(valueAns!=Integer.MAX_VALUE){
               int totalvalue=valueAns+1;
                 mini=Math.min(mini,totalvalue);
            }
        }
        return mini;
    }

    
    

    public int coinChange(int[] coins, int amount) {
        int ans=solve(coins, amount);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }

        return ans;


       
    }
}