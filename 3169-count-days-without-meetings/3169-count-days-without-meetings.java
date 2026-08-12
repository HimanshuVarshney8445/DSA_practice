class Solution {
    public int countDays(int days, int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> list = new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            if(nextStart<=end){
                end=Math.max(end,nextEnd);
            }else{
                list.add(new int[]{start,end});
                start=nextStart;
                end=nextEnd;
            }
        }
        list.add(new int[]{start,end});
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=(list.get(i)[1]-list.get(i)[0]+1);
        }
        return days-sum;
    }
}