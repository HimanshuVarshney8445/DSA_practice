class Solution {
    public int find(int idx,int amount,int[][] dp,int[] coins){
        if(idx==coins.length){
            return amount==0 ? 1:0;
        }
        if(dp[idx][amount]!=-1) return dp[idx][amount];
        int not = find(idx+1,amount,dp,coins);
        int pick=0;
        if(coins[idx]<=amount){
            pick=find(idx,amount-coins[idx],dp,coins);
        }
        return dp[idx][amount]=pick+not;
    }
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] temp:dp) Arrays.fill(temp,-1);
        return find(0,amount,dp,coins);
    }
}