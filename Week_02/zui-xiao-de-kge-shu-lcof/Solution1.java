import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] result = new int[k];
        if (k == 0) {
            return result;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o2 - o1;
            }
        });

        for (int i=0; i < arr.length; i++) {
            if (i < k) {
                priorityQueue.offer(arr[i]);
            } else {
                if (arr[i] < priorityQueue.peek()) {
                    priorityQueue.poll();
                    priorityQueue.offer(arr[i]);
                }
            }
        }
        
        for (int i=0; i < k; i++) {
            result[i] = priorityQueue.poll();
        }
        return result;
    }
}

public class Solution1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 0, 2};
        int[] result = new Solution().getLeastNumbers(arr, 3);
        for (int i : result) {
            System.out.print("=>");
            System.out.print(i);
        }
    }
}
