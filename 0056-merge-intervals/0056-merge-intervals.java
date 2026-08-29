class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length ==1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        int[] prev = intervals[0];
        int i =1;
        while (i < intervals.length) {
            int[] curr = intervals[i];

            if(curr[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                result.add(prev);
                prev = curr;
            }
            if(i== intervals.length-1) result.add(prev);
            i++;
        }
        return result.toArray(new int[0][]);
    }
}