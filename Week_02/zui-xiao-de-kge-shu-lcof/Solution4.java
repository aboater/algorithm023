import java.util.Arrays;

class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        quickSearch(arr, 0, arr.length - 1, k - 1);
        return Arrays.copyOfRange(arr, 0, k);
    }

    private void quickSearch(int[] arr, int left, int right, int k) {
        if (left == right) {
            return;
        }
        int povit = arr[left];
        int i = left;
        int j = right;
        while (i <= j) {
            while (i <= j && arr[i] < povit) {
                i++;
            }
            while (i <= j && arr[i] > povit) {
                j++;
            }
            if (i <= j) {
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
                i++;
                j--;
            }
        }

        if (left <= k && k <= j) {
            quickSearch(arr, left, j, k);
        } else if (right >= k && k >= i) {
            quickSearch(arr, i, right, k);
        }
    }
}
public class Solution4 {
    
}
