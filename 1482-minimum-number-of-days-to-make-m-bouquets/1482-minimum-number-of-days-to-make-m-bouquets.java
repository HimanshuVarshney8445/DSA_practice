class Solution {
    public int[] range(int[] bloom){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<bloom.length;i++){
            min=Math.min(min,bloom[i]);
            max=Math.max(max,bloom[i]);
        }
        return new int[]{min,max};
    }
    public boolean possible(int min,int m,int k,int[] bloom){
        int total=0,count=0;
        for(int i=0;i<bloom.length;i++){
            if(bloom[i]<=min){
                count++;
            }else count=0;
            if(count==k){
                total++;
                count=0;
            }
            if(total>=m) return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length) return -1;
        int[] temp = range(bloomDay);
        int start=temp[0],end=temp[1];
        int ans=0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(possible(mid,m,k,bloomDay)){
                ans=mid;
                end=mid-1;
            }else start=mid+1;
        }
        return ans;
    }
}