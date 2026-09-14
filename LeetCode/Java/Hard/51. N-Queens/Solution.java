class Solution {
    boolean check(char[][] board, int Rowindex, int colindex, int n){
        int row=Rowindex;
        int col=colindex;
        while(col>=0){
            if(board[row][col]=='Q'){
                return false;
               
            }
             col--;

        }
         row=Rowindex;
         col=colindex;
        while(row>=0 && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }

            row--;
            col--;

        }
         row=Rowindex;
         col=colindex;
        while(row<n && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row++;
            col--;
        }
        return true;
    }

    


    void solve(char[][] board, int colindex,  List<List<String>> ans, int n){
        if(colindex>=n){

            List<String> temp=new ArrayList<>();
            for(int i=0; i<n; i++){
                temp.add(new String(board[i]));

            }
            ans.add(temp);
            return;

        }

        for(int i=0; i<n; i++){
            if(check(board, i, colindex, n)){
                board[i][colindex]='Q';
                solve(board, colindex+1, ans, n);

                board[i][colindex]='.';


                
            }
        }
    }



    public List<List<String>> solveNQueens(int n) {

        char[][] board=new char[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(board[i],'.');

        }
        int colindex=0;
         List<List<String>> ans=new ArrayList<>();
         solve(board, colindex, ans, n);
         return ans;


        
    }
}