import java.util.LinkedList;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.addLast(i);
            if (deque.peekFirst() <= i-k) {
                deque.pollFirst();
            }
            if (i >= k -1) {
                result[i] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}