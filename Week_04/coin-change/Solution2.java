import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
^        private int minCount = Integer.MAX_VALUE;

^        private void coinChange(int[] coins, int amount, int curIndex, int count) {
^            if (amount == 0) {
^                minCount = Math.min(minCount, count);
^                return;
^            }
^            if (curIndex < 0) {
^                return;
^            }
^            int n = amount / coins[curIndex];
^            for (int i = n; i >= 0 && count < minCount; i--) {
^                coinChange(coins, amount - i * coins[curIndex], curIndex - 1, count + i);
^            }
^        }
^        public int coinChange(int[] coins, int amount) {
^            if (amount <= 0) {
^                return 0;
^            }
^            Arrays.sort(coins);
^            coinChange(coins, amount, coins.length - 1, 0);
^            return minCount == Integer.MAX_VALUE ? -1 : minCount;
^        }
}

public class Solution2 {
^        
}
