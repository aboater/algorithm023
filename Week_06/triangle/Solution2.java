class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        return dfs(triangle, 0, 0);
    }

    private int dfs(List<List<Integer>> triangle, int level, int i) {
        if (level == triangle.size() - 1) {
            return triangle.get(level).get(i);
        }

        int left = dfs(triangle, level + 1, i);
        int right = dfs(triangle, level + 1, i + 1);

        return Math.min(left, right) + triangle.get(level).get(i);
    }
}

public class Solution2 {
    
}
