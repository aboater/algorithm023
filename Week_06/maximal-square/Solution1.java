import java.util.*;

class Solution {
    public int maximalSquare(char[][] matrix) {    
        int row = matrix.length;
        if (row == 0) {
            return 0;
        }
        int column = matrix[0].length;
        int[][] result = new int[row][column];

        int maxSquare = 0;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        result[i][j] = 1;
                    } else {
                        result[i][j] = Math.min(result[i - 1][j - 1], Math.min(result[i - 1][j], result[i][j - 1])) + 1;
                    }
                    if (result[i][j] > maxSquare) {
                        maxSquare= result[i][j];
                    }
                }
                
            }
        }
        return maxSquare * maxSquare;
    }
}


public class Solution1 {
    
}
