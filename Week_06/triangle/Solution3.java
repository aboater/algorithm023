class Solution {
    private Integer[][] memory;
    public int minimumTotal(List<List<Integer>> triangle) {
        memory = new Integer[triangle.size()][triangle.size()];
        return dfs(triangle, 0, 0);
    }

    private int dfs(List<List<Integer>> triangle, int level, int i) {
        if (level == triangle.size() - 1) {
            return triangle.get(level).get(i);
        }

        if (memory[level][i] != null) {
            return memory[level][i];
        }

        int left = dfs(triangle, level + 1, i);
        int right = dfs(triangle, level + 1, i + 1);

        int minValue = Math.min(left, right) + triangle.get(level).get(i);
        memory[level][i] = minValue;
        return minValue;
    }
}


public class Solution3 {
    
}
