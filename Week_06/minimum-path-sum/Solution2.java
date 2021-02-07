class Solution {

    public int minPathSum(int[][] grid) {
        int[][] result = new int[grid.length][grid[0].length];
        int rowEnd = grid.length - 1;
        int columnEnd = grid[0].length - 1;
        result[rowEnd][columnEnd] = grid[rowEnd][columnEnd];

        for (int i = rowEnd - 1; i >= 0; i--) {
            result[i][columnEnd] = result[i + 1][columnEnd] + grid[i][columnEnd];
        }
        for (int i = columnEnd - 1; i >= 0; i--) {
            result[rowEnd][i] = result[rowEnd][i + 1] + grid[rowEnd][i];
        }

        for (int i = rowEnd - 1; i >= 0; i--) {
            for (int j = columnEnd - 1; j >=0; j--) {
                result[i][j] = Math.min(result[i + 1][j], result[i][j + 1]) + grid[i][j];
            }
        }
        return result[0][0];
    }
}


public class Solution2 {
    
}
