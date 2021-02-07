class Solution {

    public int minPathSum(int[][] grid) {
        Integer[][] result = new Integer[grid.length][grid[0].length];
        return bfs(grid, 0, 0, result);
    }

    public int bfs(int[][] grid, int row, int column, Integer[][] result) {
        if (result[row][column] != null) {
            return result[row][column];
        }

        if (row == grid.length - 1 && column == grid[0].length - 1) {
            return grid[row][column];
        }

        if (row == grid.length - 1) {
            return bfs(grid, row, column + 1, result) + grid[row][column];
        }

        if (column == grid[0].length - 1) {
            return bfs(grid, row + 1, column, result) + grid[row][column];
        }

        int right = bfs(grid, row, column + 1, result);
        int blow = bfs(grid, row + 1, column, result);
        int minPath = Math.min(right, blow) + grid[row][column];
        
        result[row][column] = minPath;

        return minPath;
    }
}


public class Solution1 {
    
}
