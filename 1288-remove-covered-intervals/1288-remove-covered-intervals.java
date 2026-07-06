class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> {
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        int start = intervals[0][0];
        int end = intervals[0][1];
        int count=1;
        for(int i=1;i<intervals.length;i++){
            int n1 = intervals[i][0];
            int n2 = intervals[i][1];
            if(start<=n1 && n2<=end){
                continue;
            }else{
                count++;
                start=n1;
                end=n2;
            }
        }
        return count;
    }
}