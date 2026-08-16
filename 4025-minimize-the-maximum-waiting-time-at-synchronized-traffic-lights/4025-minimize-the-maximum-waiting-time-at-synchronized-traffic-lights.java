class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int max=0,ans=0;
        for(int i:lights) max=Math.max(max,i);
        for(int time:arrivalTime){
            int r=time%period;
            int temp=0;
            if(r<max) temp=0;
            else temp=period-r;
            ans=Math.max(ans,temp);
        }
        return ans;
    }
}