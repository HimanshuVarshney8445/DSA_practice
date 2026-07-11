class Solution {
    public int find(int idx,int[] dp,int[] costs){
        if(idx==0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=3;i++){
            int temp = idx-i;
            if(temp>=0){
                min=Math.min(min,find(temp,dp,costs)+costs[idx-1]+i*i);
            }
        }
        dp[idx]=min;
        return dp[idx];
    }
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return find(n,dp,costs);
    }
}