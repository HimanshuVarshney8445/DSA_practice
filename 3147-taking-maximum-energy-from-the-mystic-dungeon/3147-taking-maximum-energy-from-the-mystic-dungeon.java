class Solution {
    public int find(int idx,int k,int[] energy,int[] dp){
        if(idx>=energy.length) return 0;
        if(dp[idx]!=Integer.MIN_VALUE) return dp[idx];
        return dp[idx]=energy[idx]+find(idx+k,k,energy,dp);
    }
    public int maximumEnergy(int[] energy, int k) {
        int max=Integer.MIN_VALUE;
        int[] dp = new int[energy.length];
        Arrays.fill(dp,Integer.MIN_VALUE);
        for(int i=0;i<energy.length;i++){
            max=Math.max(max,find(i,k,energy,dp));
        }
        return max;
    }
}