import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<List<Integer>> result = new  ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        generator(n, k, 1, new ArrayList<>());
        return result;
    }

    private void generator(int n, int k, int start, List<Integer> list) {
        if (k == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i <= k; i++) {
            list.add(i);
            generator(n, k - 1, i, list);
            list.remove(list.size() - 1);
        }
    }

}

public class Solution1 {
    
}
