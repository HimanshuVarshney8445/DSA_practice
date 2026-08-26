class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int ans=0;
        int p1 = events[0][0];
        int p2 = events[0][1];
        int index=p1,min=p2;
        for(int i=1;i<events.length;i++){
            int n1 = events[i][0];
            int n2 = events[i][1];
            if(n2-p2 > min || (n2-p2 == min && n1 < index)){
                min=n2-p2;
                index=n1;
            }
            p1=n1;
            p2=n2;
        }
        return index;
    }
}