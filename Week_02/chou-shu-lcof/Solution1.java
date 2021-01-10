class Solution {
    public int nthUglyNumber(int n) {
        int[] nth = new int[n];
        int a = 0;
        int b = 0;
        int c = 0;
        nth[0] = 1;
        for (int i = 1; i < n; i++) {
            int nth2 = nth[a] * 2;
            int nth3 = nth[b] * 3;
            int nth5 = nth[c] * 5;
            int nthMin = Math.min(Math.min(nth2, nth3), nth5);
            nth[i] = nthMin;
            if (nth2 == nthMin) {
                a++;
            }
            if (nth3 == nthMin) {
                b++;
            }
            if (nth5 == nthMin) {
                c++;
            }
        }
        return nth[n-1];
    }
}

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(new Solution().nthUglyNumber(10));
    }
}
