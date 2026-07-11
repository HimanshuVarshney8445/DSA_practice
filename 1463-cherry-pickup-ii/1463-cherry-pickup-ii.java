class Solution {
    public int find(int i,int j1,int j2,int[][][] dp,int[][] g){
        if(j1<0 || j1>=g[0].length || j2<0 || j2>=g[0].length) return (int)-1e8;
        if(i==g.length-1){
            if(j1==j2) return g[i][j1];
            else return g[i][j1]+g[i][j2];
        }
        if(dp[i][j1][j2]!=-1) return dp[i][j1][j2];
        int max=Integer.MIN_VALUE;
        for(int d1=-1;d1<=1;d1++){
            for(int d2=-1;d2<=1;d2++){
                int temp=0;
                if(j1==j2) temp=g[i][j1];
                else temp=g[i][j1]+g[i][j2];
                temp+=find(i+1,j1+d1,j2+d2,dp,g);
                max=Math.max(max,temp);
            }
        }
        return dp[i][j1][j2]=max;
    }
    public int cherryPickup(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int[][][] dp = new int[r][c][c];
        for(int[][] t1:dp){
            for(int[] temp:t1){
                Arrays.fill(temp,-1);
            }
        }
        return find(0,0,c-1,dp,grid);
    }
}