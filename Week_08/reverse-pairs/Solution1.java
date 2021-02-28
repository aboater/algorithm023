class Solution1 {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        return mergeSort(nums, 0, nums.length - 1);
    }

    public int mergeSort(int[] nums, int start, int end) {
        if (start == end) {
            return 0;
        }
        int mid = (end - start) / 2 + start;
        int left = mergeSort(nums, start, mid);
        int right = mergeSort(nums, mid + 1, end);
        int mergeResult = merge(nums, start, mid + 1, end);
        return left + right + mergeResult;
    }

    public int merge(int[] nums, int start, int mid, int end) {
        int result = 0;
        int[] memory = new int[end - start + 1];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid) {
            while (j <= end && nums[j] < nums[i] / 2.0) {
                j++;
            }
            result += j - mid;
            i++;
        }

        i = start;
        j = mid;

        while (i < mid && j <= end) {
            if (nums[j] > nums[i]) {
                memory[k] = nums[i];
                i++;
            } else {
                memory[k] = nums[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            memory[k] = nums[i];
            k++;
            i++;
        }

        while (j <= end) {
            memory[k] = nums[j];
            k++;
            j++;
        }

        for (int w = 0; w < memory.length; w++) {
            nums[w + start] = memory[w];
        }
        return result;
    }
}