class Solution {
    private int find(int i,int rem,int[] nums,int[][] dp){
        if(i==nums.length){
            if(rem==0) return 0;
            return Integer.MIN_VALUE;
        }
        if(dp[i][rem]!=-1) return dp[i][rem];
        int not = find(i+1,rem,nums,dp);
        int newRem = (rem + nums[i]) % 3;
        int take = nums[i]+find(i+1,newRem,nums,dp);
        return dp[i][rem]=Math.max(not,take);
    }
    public int maxSumDivThree(int[] nums) {
        int[][] dp = new int[nums.length][3];
        for(int[] temp:dp) Arrays.fill(temp,-1);
        return find(0,0,nums,dp);
    }
}