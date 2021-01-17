import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutes = new LinkedList<>();
        int n = nums.length;
        int depth = 0;
        boolean[] used = new boolean[n];
        dfs(nums, new ArrayList<>(), depth, n, used, permutes);
        return permutes;
    }

    private void dfs(int[] nums, List<Integer> result, int depth, int n, boolean[] used, List<List<Integer>> permutes) {
        if (depth == n) {
            permutes.add(new ArrayList<>(result));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (used[i]) {
                continue;
            }
            result.add(nums[i]);
            used[i] = true;
            dfs(nums, result, depth + 1, n, used, permutes);
            result.remove(result.size() - 1);
            used[i] = false;
        }
    }
}

public class Solution1 {
    
}
