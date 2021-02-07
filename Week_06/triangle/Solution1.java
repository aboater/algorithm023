class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            List<Integer> level = triangle.get(i);
            List<Integer> level2 = triangle.get(i + 1);
            for (int j = 0; j < level.size(); j++) {
                level.set(j, Math.min(level2.get(j), level2.get(j + 1)) + level.get(j));
            }
        }
        return triangle.get(0).get(0);
    }
}

public class Solution1 {
    public static void main(String[] args) {
        
    }
}