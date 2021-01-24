import java.util.HashMap;
import java.util.Map;

class Solution {
    private boolean change(Map<Integer, Integer> map, int bill) {
        if (bill == 20) {
            if (map.getOrDefault(10, 0) >= 1 && map.getOrDefault(5, 0) >= 1) {
                map.put(10, map.get(10) - 1);
                map.put(5, map.get(5) - 1);
                return true;
            } else if (map.get(5) >= 3) {
                map.put(5, map.get(5) - 3);
                return true;
            }
        } else if (bill == 10) {
            if (map.getOrDefault(5, 0) >= 1) {
                map.put(5, map.get(5) - 1);
                return true;
            }
        }
        return false;
    }
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int bill : bills) {
            if (bill == 5) {
                map.put(bill, map.getOrDefault(bill, 0) + 1);
            } else if (bill == 10) {
                if (map.isEmpty() || !change(map, bill)) {
                    return false;
                }
                map.put(10, map.getOrDefault(10, 0) + 1);
            } else if (bill == 20) {
                if (map.isEmpty() || !change(map, bill)) {
                    return false;
                }
                map.put(20, map.getOrDefault(20, 0) + 1);
            }
        }
        return true;
    }
}

public class Sollution1 {
    public static void main(String[] args) {
        new Solution().lemonadeChange(new int[]{5,5,5,10,20});
    }
}
