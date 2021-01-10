import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }
}

public class Solution1 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(new Solution().isAnagram(s, t));
        
    }
}
