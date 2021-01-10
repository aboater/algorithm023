import java.util.Arrays;

class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || arr.length <= 0) {
            return null;
        }

        Arrays.sort(arr);
        
        return Arrays.copyOfRange(arr, 0, k);
    }
}

// 作者：leetcoder-youzg
// 链接：https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/solution/java-wu-nao-diao-yong-apijian-dan-shi-xi-yox3/
// 来源：力扣（LeetCode）
// 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

public class Solution2 {
    
}
