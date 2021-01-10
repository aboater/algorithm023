import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequent = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            frequent.put(nums[i], frequent.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequent.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			//降序排序
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});

        int[] result = new int[k]; 
		for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(new Solution().topKFrequent(new int[]{1, 3, 1, 3, 4, 3, 3, 2}, 2));;
    }
}
