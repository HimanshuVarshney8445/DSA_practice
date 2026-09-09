class Solution {
    private boolean isPal(int i,int j,String s,int[][] dp){
        if(i>=j) return true;
        if(dp[i][j]!=-1) return dp[i][j]==1;
        if(s.charAt(i) != s.charAt(j)){
            dp[i][j] = 0;
            return false;
        }
        boolean ans = isPal(i+1,j-1,s,dp);
        dp[i][j] = ans ? 1 : 0;
        return ans;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int max=0,start=0;
        int[][] dp = new int[n][n];
        for(int[] temp:dp) Arrays.fill(temp,-1);
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPal(i,j,s,dp)){
                    if(j-i+1 > max){
                        max = j-i+1;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start,start+max);
    }
}