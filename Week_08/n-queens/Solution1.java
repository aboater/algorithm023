import java.util.ArrayList;
import java.util.List;


public class Solution1 {
    List<List<String>> result = new ArrayList<>();
    StringBuffer p = new StringBuffer();

    public List<List<String>> solveNQueens(int n) {
        List<StringBuffer> midResult = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            p.append('.');
        }
        for (int i = 0; i < n; i++) {
            midResult.add(new StringBuffer(p.toString()));
        }       
        dfs(n, 0, midResult);
        return result;
    }

    private void dfs(int n, int row, List<StringBuffer> midResult) {
        if (row == n) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(midResult.get(i).toString());
            }
            result.add(list);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isRight(midResult, n, row, i)) {
                midResult.set(row, new StringBuffer(p.toString()));
                midResult.get(row).setCharAt(i, 'Q');
                dfs(n, row + 1, midResult);
            }
        }
        midResult.set(row, new StringBuffer(p.toString()));
        
    }

    private boolean isRight(List<StringBuffer> midResult, int n, int row, int col) {

        for (int i = 0; i < row; i++) {
            if (midResult.get(i).charAt(col) == 'Q') {
                return false;
            }
        }

        int i = row - 1;
        int j = col - 1;
        while (i >= 0 && j >= 0) {
            if (midResult.get(i).charAt(j) == 'Q') {
                return false;
            }
            i--;
            j--;
        }

        i = row - 1;
        j = col + 1;
        while (i >=0 && j < n) {
            if (midResult.get(i).charAt(j) == 'Q') {
                return false;
            }
            i--;
            j++;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution1().solveNQueens(4));
    }
}
