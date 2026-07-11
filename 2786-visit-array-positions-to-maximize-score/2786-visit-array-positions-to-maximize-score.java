class Solution {
    public int isOdd(int n){
        return ((n&1) == 1) ? 1 : 0;
    } 
    public long find(int idx,int prev,int x,long[][] dp,int[] nums){
        if(idx==nums.length) return 0;
        if(dp[idx][prev]!=-1) return dp[idx][prev];
        long take = nums[idx]+find(idx+1,isOdd(nums[idx]),x,dp,nums)-(prev==isOdd(nums[idx]) ? 0 : x);
        long not = find(idx+1,prev,x,dp,nums);
        dp[idx][prev]=Math.max(take,not);
        return dp[idx][prev];
    }
    public long maxScore(int[] nums, int x) {
        int n=nums.length;
        long[][] dp = new long[n][2];
        for(long[] temp:dp) Arrays.fill(temp,-1);
        return nums[0]+find(1,isOdd(nums[0]),x,dp,nums);
    }
}