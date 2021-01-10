import java.util.Arrays;

class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length == 0 || k <= 0) {
            return new int[0];
        }

        return quickSearch(arr, 0, arr.length - 1, k - 1);
    }

    private int[] quickSearch(int[] arr, int left, int right, int k) {
        int j = partition(arr, left, right);
        if (j == k) {
            return Arrays.copyOf(arr, k + 1);
        }
        return j > k ? quickSearch(arr, left, j - 1, k) : quickSearch(arr, j + 1, right, k);
    }

    private int partition(int[] arr, int left, int right) {
        int pointValue = arr[left];
        int i = left;
        int j = right + 1;
        while (true) {
            while (++i < right && arr[i] < pointValue);
            while (--j > left && arr[j] > pointValue);
            if (i >= j) {
                break;
            }
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
        }
        arr[left] = arr[j];
        arr[j] = pointValue;
        return j;
    }
}

public class Solution3 {

    public static void main(String[] args) {
        int[] arr = {1, 4, 0, 2};
        int[] result = new Solution().getLeastNumbers(arr, 3);
        for (int i : result) {
            System.out.print("=>");
            System.out.print(i);
        }
    }
}
