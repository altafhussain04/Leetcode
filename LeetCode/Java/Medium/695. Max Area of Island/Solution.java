class Solution {
    void dfs(int[][] grid, int r, int c){


        int row=grid.length;
        int col=grid[0].length;

        grid[r][c]=0;

        //up
        if(r-1>0 && grid[r-1][c]==1){
            dfs(grid, r-1, c);
        }
        //right
         if(c+1<col && grid[r][c+1]==1){
            dfs(grid, r, c+1);
        }
        //douwn
         if(r+1<row && grid[r+1][c]==1){
            dfs(grid, r+1, c);
        }
        
        //left
         if(c-1>0 && grid[r][c-1]==1){
            dfs(grid, r, c-1);
        }

    }


    public int maxAreaOfIsland(int[][] grid) {

        if(grid.length==0){
            return 0;
        }
        int row=grid.length;
        int col=grid[0].length;
        int count=0;

        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                if(grid[r][c]==1){
                    dfs(grid, r, c);
                    count++;
                }
            }
        }

        return count;
        
    }
}