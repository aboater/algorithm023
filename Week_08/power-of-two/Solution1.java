public class Solution1 {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        return (n & (- n)) == n;
    }
}
