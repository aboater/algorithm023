public class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int p = 0;
        int q = 1;
        while(q < nums.length) {
            if (nums[p] != nums[q]) {
                p++;
                if (q - p > 0) {
                    nums[p] = nums[q];
                }
            }
            q++;
        }
        return p + 1;
    }
}
