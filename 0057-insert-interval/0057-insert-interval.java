class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int newStart = newInterval[0];
        int newEnd = newInterval[1];
        boolean insert=false;
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(end<newStart){
                lst.add(new ArrayList<>(Arrays.asList(start, end)));
            }else if(start>newEnd){
                if(!insert){
                    lst.add(new ArrayList<>(Arrays.asList(newStart, newEnd)));
                    insert=true;
                }
                lst.add(new ArrayList<>(Arrays.asList(start, end)));
            }else{
                newStart=Math.min(start,newStart);
                newEnd=Math.max(end,newEnd);
            }
        }
        if(!insert){
            lst.add(new ArrayList<>(Arrays.asList(newStart, newEnd)));
        }
        int[][] temp = new int[lst.size()][2];
        for(int i=0;i<lst.size();i++){
            int n1 = lst.get(i).get(0);
            int n2 = lst.get(i).get(1);
            temp[i][0]=n1;
            temp[i][1]=n2;
        }
        return temp;
    }
}