class Solution {
    public int find(int n,int[] dp){
        if(n==2) return 1;
        if(dp[n]!=-1) return dp[n];
        int max=0;
        for(int i=1;i<n;i++){
            max=Math.max(max,Math.max(i*(n-i),i*find(n-i,dp)));
        }
        dp[n]=max;
        return dp[n];
    }
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return find(n,dp);
    }
}