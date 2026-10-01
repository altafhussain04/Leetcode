class Solution {
    int  dfs(int[][] grid, int r, int c){
        int area=1;


        int row=grid.length;
        int col=grid[0].length;

        grid[r][c]=0;
        

        //up
        if(r-1>=0 && grid[r-1][c]==1){
            area+=dfs(grid, r-1, c);
        }
        //right
         if(c+1<col && grid[r][c+1]==1){
             area+=dfs(grid, r, c+1);
        }
        //douwn
         if(r+1<row && grid[r+1][c]==1){
             area+=dfs(grid, r+1, c);
        }
        
        //left
         if(c-1>=0 && grid[r][c-1]==1){
             area+=dfs(grid, r, c-1);
        }
        return area;

    }


    public int maxAreaOfIsland(int[][] grid) {
         int maxArea=0;

        if(grid.length==0){
          
            return maxArea;
        }
        int row=grid.length;
        int col=grid[0].length;
       
       

        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                 
                if(grid[r][c]==1){
                    int TotalArea=dfs(grid, r, c);
                    maxArea=Math.max(maxArea,TotalArea);
                }
            }
        }

        return maxArea;
        
    }
}