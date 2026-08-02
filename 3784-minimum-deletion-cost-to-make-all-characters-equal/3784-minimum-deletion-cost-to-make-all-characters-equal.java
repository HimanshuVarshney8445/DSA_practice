class Solution {
    public long minCost(String s, int[] cost) {
        long sum=0;
        long[] temp = new long[26];
        for(int i=0;i<cost.length;i++){
            sum+=cost[i];
            temp[s.charAt(i)-'a']+=cost[i];
        }
        long ans = Long.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(temp[i]>0){
                ans=Math.min(ans,sum-temp[i]);
            }
        }
        return ans;
    }
}