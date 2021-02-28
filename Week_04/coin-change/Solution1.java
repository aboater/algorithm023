import java.util.Arrays;

class Solution {
^        public int coinChange(int[] coins, int amount) {
^            Arrays.sort(coins);
^            for (int i = 0; i < coins.length / 2; i++) {
^                int tem = coins[i];
^                coins[i] = coins[coins.length - 1 - i];
^                coins[coins.length - 1 - i] = tem;
^            }
^            return findMin(coins, amount, 0);
^        }
^        private int findMin(int[] coins, int amount, int level) {
^            if (level >= coins.length) {
^                return -1;
^            }
^            if (amount % coins[level] == 0) {
^                return amount / coins[level];
^            }
^            for (int i = level; i < coins.length; i++) {
^                int levelMax = amount / coins[i];
^                int nextLevle = findMin(coins, amount % coins[i], level + 1);
^                if (nextLevle != -1) {
^                    return levelMax + nextLevle;
^                } else {
^                    int k = 1;
^                    while(levelMax > 0) {
^                        nextLevle = findMin(coins, amount % coins[i] + k * coins[i], level + 1 + k);
^                        k++;
^                    }
^                    if (nextLevle != -1) {
^                        return levelMax - k + nextLevle;
^                    }
^                }
^            }

^            return -1;
^        }
}

public class Solution1 {
^        public static void main(String[] args) {
^            System.out.println(new Solution().coinChange(new int[]{1,2,5}, 11));
^            // 运行超时
^        }
}
