public class Solution1 {
    int maxLength = 0;
    String maxValue = "";

    public String longestPalindrome(String s) {
        
        char[] ss = s.toCharArray();
        int end = ss.length;
        int x1, x2;
        for (int i = 0; i < ss.length; i++) {
            x1 = i;
            x2 = i;
            compair(ss, x1, x2, end, s);

            x1 = i;
            x2 = i + 1;
            compair(ss, x1, x2, end, s);
        }
        return maxValue;
    }

    private void compair(char[] ss, int x1, int x2, int end, String s) {
            while (x1 >= 0 && x2 < end && ss[x1] == ss[x2]) {
                if (x2 - x1 + 1 > maxLength) {
                    maxValue = s.substring(x1, x2 + 1);
                    maxLength = x2 - x1 + 1;
                }
                x1--;
                x2++;
            }
    }

}