class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1,end=0;
        for(int i:nums) end=Math.max(end,i);
        int ans=end;
        while(start<=end){
            int mid = start+(end-start)/2;
            int sum=0;
            for(int i:nums){
                sum+=(i+mid-1)/mid;
            }
            if(sum<=threshold){
                ans=mid;
                end=mid-1;
            }else start=mid+1;
        }
        return ans;
    }
}