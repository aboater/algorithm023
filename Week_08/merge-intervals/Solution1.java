class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][2];
        }

        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int l = intervals[i][0];
            int r = intervals[i][1];
            if (result.size() == 0 || result.get(result.size() - 1)[1] < l) {
                result.add(new int[]{l, r});
            } else {
                result.get(result.size() - 1)[1] = Math.max(r, result.get(result.size() - 1)[1]); 
            }
        }
        
        return result.toArray(new int[result.size()][2]);
    }
}

public class Solution1 {
    
}
