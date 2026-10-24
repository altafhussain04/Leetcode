import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        // Base checks
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }

        // Standard Queue holding [row, col, distance]
        Queue<int[]> q = new ArrayDeque<>();

        // Start BFS from top-left (0, 0) with distance 1
        q.add(new int[]{0, 0, 1});
        grid[0][0] = 1; // Mark as visited

        // All 8 possible movement directions (rowOffset, colOffset)
        int[][] directions = {
            {-1, 0},  // up
            {-1, -1}, // top-left
            {0, -1},  // left
            {1, -1},  // bottom-left
            {1, 0},   // down
            {1, 1},   // bottom-right
            {0, 1},   // right
            {-1, 1}   // top-right
        };

        while (!q.isEmpty()) {
            int[] curr = q.poll(); // Retrieve and remove top array
            int r = curr[0];
            int c = curr[1];
            int d = curr[2];

            // Reached destination
            if (r == n - 1 && c == n - 1) {
                return d;
            }

            // Explore all 8 directions
            for (int[] dir : directions) {
                int newR = r + dir[0];
                int newC = c + dir[1];

                // Check bounds and if cell is unvisited (0)
                if (newR >= 0 && newR < n && newC >= 0 && newC < n && grid[newR][newC] == 0) {
                    grid[newR][newC] = 1; // Mark visited immediately
                    q.add(new int[]{newR, newC, d + 1});
                }
            }
        }

        // Path not found
        return -1;
    }
}