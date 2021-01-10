import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();
        for (int i=0; i < strs.length; i++) {
            String sortedStr = sortString(strs[i]);
            List<String> strList = hashMap.getOrDefault(sortedStr, new LinkedList<>());
            strList.add(strs[i]);
            hashMap.put(sortedStr, strList);
        }
        List<List<String>> group = new LinkedList<>();
        for (String str : hashMap.keySet()) {
            group.add(hashMap.get(str));
        }
        return group;
    }

    public String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}

public class Solution1 {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(new Solution().groupAnagrams(strs));
    }
}
