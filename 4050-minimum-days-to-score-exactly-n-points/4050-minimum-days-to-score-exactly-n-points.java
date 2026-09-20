class Solution {
    public int find(int sc,int st,int n,int[][] dp){
        if(sc==n) return 0;
        if(sc>n) return Integer.MAX_VALUE/2;
        if(dp[sc][st]!=Integer.MAX_VALUE/2) return dp[sc][st];
        int take = 1+find(sc+st+1,st+1,n,dp);
        int not = Integer.MAX_VALUE/2;
        if(st>0){
            not=1+find(sc,0,n,dp);
        }
        return dp[sc][st]=Math.min(not,take);
    }
    public int minDays(int n) {
        int maxStreak = (int) Math.sqrt(2L * n) + 2;
        int[][] dp = new int[n+1][maxStreak];
        for(int[] temp:dp) Arrays.fill(temp,Integer.MAX_VALUE/2);
        return find(0,0,n,dp);
    }
}