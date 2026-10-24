import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {

        int n = grid.length;
        if (grid[0][0] == 1 || grid[n-1][n-1] == 1) {
            return -1;
        }
        if (n == 1 && grid[0][0] == 0) {
            return 1;
        }
        
        // 1. Fixed Variable Case: 'Q' -> 'q'
        Queue<int[]> q = new ArrayDeque<>();

        q.add(new int[]{0, 0, 1});
        grid[0][0] = 1;
        
        while (!q.isEmpty()) {

            int r = q.peek()[0];
            int c = q.peek()[1];
            int d = q.peek()[2];
            
            // 2. Fixed Equality Check: '=' -> '=='
            if (r == n-1 && c == n-1) {
                return d;
            }
            q.poll();
            

            // up
            if (r-1 >= 0 && grid[r-1][c] == 0) {
                grid[r-1][c] = 1; // 3. Fixed Assignment: '==' -> '='
                q.add(new int[]{r-1, c, d+1});
            }
            // leftupDiogonal
            if (r-1 >= 0 && c-1 >= 0 && grid[r-1][c-1] == 0) {
                grid[r-1][c-1] = 1; // Fixed '==' -> '='
                q.add(new int[]{r-1, c-1, d+1});
            }
            // left
            if (c-1 >= 0 && grid[r][c-1] == 0) {
                grid[r][c-1] = 1; // Fixed '==' -> '='
                q.add(new int[]{r, c-1, d+1});
            }
            // leftdowndiogonal
            if (r+1 < n && c-1 >= 0 && grid[r+1][c-1] == 0) {
                grid[r+1][c-1] = 1; // Fixed '==' -> '='
                q.add(new int[]{r+1, c-1, d+1});
            }
            // down
            if (r+1 < n && grid[r+1][c] == 0) {
                grid[r+1][c] = 1; // Fixed '==' -> '='
                q.add(new int[]{r+1, c, d+1});
            }
            // rightdowndiagonal
            if (r+1 < n && c+1 < n && grid[r+1][c+1] == 0) {
                grid[r+1][c+1] = 1; // Fixed '==' -> '='
                q.add(new int[]{r+1, c+1, d+1});
            }
            // right
            // 4. Fixed Typo: grid[r-1][c] -> grid[r][c+1]
            if (c+1 < n && grid[r][c+1] == 0) { 
                grid[r][c+1] = 1; // Fixed '==' -> '='
                q.add(new int[]{r, c+1, d+1});
            }
            // rightupdiagonal
            if (r-1 >= 0 && c+1 < n && grid[r-1][c+1] == 0) {
                grid[r-1][c+1] = 1; // Fixed '==' -> '='
                q.add(new int[]{r-1, c+1, d+1});
            }

        }
        
        // 5. Fixed Scope Error: Pehle return 'd' tha jo loop ke bahar invalid tha
        return -1; 
        
    }
}