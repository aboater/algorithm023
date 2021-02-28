import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
class Solution {
^        public int minMutation(String start, String end, String[] bank) {
^            List<String> list = Arrays.asList(bank);
^            HashSet<String> visited = new HashSet<>();
^            Deque<String> deque = new LinkedList<>();
^            deque.add(start);
^            int count = 0;
^            while (!deque.isEmpty()) {
^                count++;
^                int n = deque.size();
^                for (int i = 0; i < n; i++) {
^                    String next = deque.pollFirst();
^                    for (String b : bank) {
^                        if (isNext(next, b)) {
^                            if (b.equals(end)) {
^                                return count;
^                            }
^                            if (!visited.contains(b)) {
^                                deque.add(b);
^                                visited.add(b);
^                            }
^                        }
^                    }
^                }
^            }
^            return -1;
^        }

^        private boolean isNext(String start, String end) {
^            char[] starts = start.toCharArray();
^            char[] ends = end.toCharArray();
^            int count = 0;
^            for (int i = 0; i < 8; i++) {
^                if (starts[i] != ends[i]) {
^                    count++;
^                }
^            }
^            if (count == 1) {
^                return true;
^            }
^            return false;
^        }
}

public class Solution1 {
^        
^        public static void main(String[] args) {
^            
^        }
}
