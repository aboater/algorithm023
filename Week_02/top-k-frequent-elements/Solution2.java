import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequent = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            frequent.put(nums[i], frequent.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] list = new ArrayList[nums.length + 1];
        
        for (int key : frequent.keySet()) {
            int i = frequent.get(key);
            if (list[i] == null) {
                list[i] = new ArrayList<>();
            }
            list[i].add(key);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = nums.length; i > 0 && result.size() < k; i--) {
            if (list[i] != null) {
                result.addAll(list[i]);
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}

public class Solution2 {
    public static void main(String[] args) {
        System.out.println(new Solution().topKFrequent(new int[]{1, 3, 1, 3, 4, 3, 3, 2}, 2));;
    }
}

