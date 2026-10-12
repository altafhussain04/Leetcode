class Solution {

    void dfs(int[][] image, int sr, int sc, int color, int oldcolor){

        int row=image.length;
        int col=image[0].length;

        image[sr][sc]=color;


        if(sr-1>=0 && image[sr-1][sc]==oldcolor){
            dfs(image, sr-1, sc, color, oldcolor);
        }
        if(sc-1>=0 && image[sr][sc-1]==oldcolor){
            dfs(image, sr, sc-1, color, oldcolor);
        }
        if(sr+1<row && image[sr+1][sc]==oldcolor){
            dfs(image, sr+1, sc, color, oldcolor);
        }
        if(sc+1<col && image[sr][sc+1]==oldcolor){
            dfs(image, sr, sc+1, color, oldcolor);
        }

        return ;
    }




    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int length=image.length;
        int oldcolor=image[sr][sc];

        if(image[sr][sc]==color){
            return image;
        }

        dfs(image, sr, sc, color, oldcolor);

        return image;




        
        
    }
}