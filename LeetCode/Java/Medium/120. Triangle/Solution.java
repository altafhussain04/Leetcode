class Solution {
    int solve(List<List<Integer>> triangle, int row, int col){
        if(row==triangle.size()-1){
            return triangle.get(row).get(col);
        }
        int down=solve(triangle, row+1, col);
        int diagonal=solve(triangle, row+1, col+1);
        int totalAns=triangle.get(row).get(col)+Math.min(down,diagonal);
        return totalAns;
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int row=0;
        int col=0;
        int ans=solve(triangle, row, col);
        return ans;
        
    }
}