public class Solution1 {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        char[] sArray = s.toCharArray();
        if (sArray[0] == '0') {
            return 0;
        }
        dp[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (sArray[i] != '0') {
                dp[i] = dp[i - 1];
            }
            int num = 10 * (sArray[i - 1] - '0') + (sArray[i] - '0');
            if (num >= 10 && num <= 26) {
                if (i == 1) {
                    dp[i]++;
                } else {
                    dp[i] += dp[i - 2];
                }
            }
        }
        return dp[s.length() - 1];
    }
}