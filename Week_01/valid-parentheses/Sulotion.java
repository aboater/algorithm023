import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("(", ")");
        hashMap.put("[", "]");
        hashMap.put("{", "}");
        Stack<String> stack = new Stack<>();
        for(int i=0; i < s.length(); i++){
            
            if (stack.isEmpty() || hashMap.containsKey(s.substring(i, i+1))) {
                stack.push(s.substring(i, i+1));
                continue;
            }
            boolean pair = s.substring(i, i+1).equals(hashMap.get(stack.peek()));
            if(pair) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
        }
        public static void main(String[] args) {
            new Solution().isValid("([)]");
        }
}
