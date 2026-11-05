class Solution {
    public int find(int cap,int[] weight){
        int day=1,load=0;
        for(int i:weight){
            if(load+i > cap){
                day++;
                load=i;
            }else load+=i;
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int start=0,end=0;
        for(int i:weights){
            start=Math.max(start,i);
            end+=i;
        }
        int ans=end;
        while(start<=end){
            int mid = start+(end-start)/2;
            int minDays = find(mid,weights);
            if(minDays<=days){
                ans=mid;
                end=mid-1;
            }else start=mid+1;
        }
        return ans;
    }
}