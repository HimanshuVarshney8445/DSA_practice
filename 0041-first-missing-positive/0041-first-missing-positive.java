class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=0 || nums[i]>=(n+1)) nums[i]=n+1;
        }
        for(int i=0;i<n;i++){
            int ele = Math.abs(nums[i]);
            if(ele==n+1) continue;
            int temp = ele-1;
            if(nums[temp]>0) nums[temp]= -nums[temp];
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0) return i+1;
        }
        return n+1;
    }
}
